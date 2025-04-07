/* Foi feita uma pesquisa entre os habitantes de uma cidade. Foram coletados os dados de idade, gênero (M/F) e renda. Faça uma aplicação em Java Orientada a Objetos contenha um menu onde seja possível registrar, os dados de cada habitante e, ainda consultar as seguintes informações:

1. A média de salário do grupo;
2. Maior e menor idade do grupo;
3. Quantidade de habitantes do gênero masculino com salário até R$ 1000,00;
4. Quantidade de habitantes do gênero feminino;*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("1. A média de salário do grupo;\r\n2. Maior e menor idade do grupo;\r\n3. Quantidade de habitantes do gênero masculino com salário até R$ 1000,00;\r\n4. Quantidade de habitantes do gênero feminino;\r\nDigite 0 para sair");
        opc = sc.nextInt();

        do{
            switch (opc) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opção inválida, saindo...");
            }
        }while(opc != 0);
    }
}