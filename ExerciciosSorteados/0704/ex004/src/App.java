/* Foi feita uma pesquisa entre os habitantes de uma cidade. Foram coletados os dados de idade, gênero (M/F) e renda. Faça uma aplicação em Java Orientada a Objetos contenha um menu onde seja possível registrar, os dados de cada habitante e, ainda consultar as seguintes informações:

1. A média de salário do grupo;
2. Maior e menor idade do grupo;
3. Quantidade de habitantes do gênero masculino com salário até R$ 1000,00;
4. Quantidade de habitantes do gênero feminino;*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pesquisa pesquisa = new Pesquisa();
        int opc;

        
        do{
            System.out.println("1 - Registrar Habitante\n2 - Consultar Relatório\n0 - Sair");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                System.out.println("Informe a idade: ");
                int idade = sc.nextInt();
                System.out.println("Informe o salário: ");
                double salario = sc.nextDouble();
                System.out.println("Informe o genêro com 'M' para masculino e 'F' para feminino: ");
                String genero = sc.next();

                Habitante h1 = new Habitante(idade, salario, genero);
                pesquisa.registrarHabitante(h1);
                    break;
                case 2:
                pesquisa.mostrarRelatorio();
                    break;
                case 0:
                System.out.println("Saindo...");
                    break;
                default:
                System.out.println("Opção inválida!");
                break;
            }
        }while(opc != 0);
        sc.close();
    }
}
