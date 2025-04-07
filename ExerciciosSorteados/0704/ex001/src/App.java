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
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        controleFinanceiro controle = new controleFinanceiro();

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastro de vendas");
            System.out.println("2 - Consulta de imposto a pagar no mês");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor da venda: ");
                    double valor = sc.nextDouble();
                    System.out.print("Digite o dia da venda: ");
                    int dia = sc.nextInt();
                    System.out.print("Digite o mês da venda: ");
                    int mes = sc.nextInt();
                    System.out.print("Digite o ano da venda: ");
                    int ano = sc.nextInt();

                    controle.cadastrarVenda(valor, dia, mes, ano);
                    break;

                case 2:
                    System.out.print("Digite o mês para consulta: ");
                    int mesConsulta = sc.nextInt();
                    System.out.print("Digite o ano para consulta: ");
                    int anoConsulta = sc.nextInt();

                    controle.consultarMulta(mesConsulta, anoConsulta);
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}