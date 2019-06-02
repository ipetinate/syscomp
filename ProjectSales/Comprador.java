/*
** Esta classe é referente ao Comprador (cliente)
** Este ator acessa o sistema para comprar produtos 
** e analisar/verificar suas compras e sua carteira
*/

package ProjectSales;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Comprador
{
    public void menuComprador()
    {
        Scanner entrada = new Scanner (System.in);
        int opcao = 0;

        System.out.println("__________________________________");
        System.out.println();
        System.out.println("O que deseja? \n");

        System.out.print("[1] Comprar Produto\n");
        System.out.print("[2] Consultar Vendas \n");
        System.out.print("[3] Sair             \n");

        System.out.print("Digite o Número da Opção Escolhida: ");
        opcao = entrada.nextInt();

        switch (opcao)
        {
            case 1:
                comprarProduto();
            case 2:
                consultarVendas();
            case 3:
                break;
        }

        entrada.close();
	}

    public void comprarProduto() {

        listarProdutos();
        
        int valor = 1000;

        double preco = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do produto: "));
        double qtd   = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:       "));

        double resultado = preco * qtd;
        double divida = valor - resultado;

        JOptionPane.showMessageDialog(null, "Valor Gasto: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Saldo Restante: " + divida, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private void consultarVendas() {
    }
    private void listarProdutos() {
    }
}
