/* Escreva em Java uma classe Contador, que encapsule um valor usado para
contagem de itens ou eventos (ou seja, possui um atributo do tipo inteiro que
será responsável pela contagem). A classe deve possuir os métodos de
acesso (get e set) e os seguintes métodos:
• Zerar(): atribui zero ao atributo da classe;
• Incrementar(): adiciona 1 ao atributo da classe;
• Decrementar(): subtrai um do atributo da classe;
• Somar (valor): adiciona o valor passado por parâmetro ao atributo da
classe;
• Subtrair (valor): subtrai o valor passado por parâmetro do atributo da
classe.
16/44 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contador c1 = new Contador();
        System.out.println("Informe o número: ");
        int digitado = sc.nextInt();
        int opc;
        do{
            System.out.println("\n1 - Zerar\n2- Incrementar\n3 - Decrementar\n4 - Somar\n5 - Subtrair\n0 - Sair");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    c1.zerar();
                    break;
                case 2:
                    c1.incrementar();
                    break;
                case 3:
                    c1.decrementar();
                    break;
                case 4:
                    System.out.println("Informe o valor que deseja somar: ");
                    int valorSoma = sc.nextInt();
                    c1.somar(valorSoma);
                    break;
                case 5: 
                    System.out.println("Informe o valor que deseja subtrair: ");
                    int valorSubtracao = sc.nextInt();
                    c1.subtrair(valorSubtracao);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }
        }while(opc != 0);
        sc.close();
    }
}