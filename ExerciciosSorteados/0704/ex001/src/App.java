/* Um trabalhador autônomo deseja controlar suas finanças, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
•Toda vez que ele vende um valor maior que o estabelecido pelo regulamento de MEI do estado onde vive (500,00 R$ dia) deve pagar um multa de R$ 0,10 a cada Real excedente.
• Este trabalhador precisa que você faça um programa em Java que leia o valor de todas as vendas do mês e verifique se há excesso (vendeu mais de 500,00 por dia).
• Se houver excesso, gravar na variável E (Excesso) e na variável M o valor da multa que o Trabalhador deverá pagar.
• Caso contrário mostrar tais variáveis com o conteúdo ZERO. Desenvolva uma aplicação Java Orientada a Objetos e as classes necessárias para resolver o problema.
O sistema deve conter um menu com no mínimo as seguintes opções
1 - cadastro de vendas
2 - consulta de imposto a pagar no mês (com base no mês e no ano das vendas).
0 - Sair. */

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        controleFinanceiro controle = new controleFinanceiro();
        int opc;
        
        do{
            System.out.println("1 - Cadastro de Vendas\n2 - Consulta de Imposto a pagar no mês\n0 - Sair");
            opc = sc.nextInt();
        switch (opc) {   
            case 1:
                System.out.println("Informe o valor da venda: ");
                double valor = sc.nextDouble();
                System.out.println("Informe o dia da venda: ");
                int dia = sc.nextInt();
                System.out.println("Informe o mês da venda: ");
                int mes = sc.nextInt();
                System.out.println("Informe o ano da venda: ");
                int ano = sc.nextInt();

                controle.cadastrarVenda(valor, dia, mes, ano);
                break;
            case 2:
                System.out.println("Informe o mês que deseja consultar: ");
                int mesConsulta = sc.nextInt();
                System.out.println("Informe o ano que deseja consultar: ");
                int anoConsulta = sc.nextInt();

                controle.consultaImposto(mesConsulta, anoConsulta);
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        } while(opc != 0);
        sc.close();
    }   
}
