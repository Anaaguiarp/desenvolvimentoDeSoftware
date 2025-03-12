import java.util.Scanner;
public class ExemploConcatenacao {
    public static void main(String[] args) {
        String texto1 = ">> O operador de concatenação (+) ";
        String texto2 = "é muito prático ";
        String texto3 = texto1 + texto2 + "!";
        System.out.println(texto3 + "<<");
        System.out.println(">> 2 + 5 = " + 2 + 5); //incorreto
        System.out.println(">> 2 + 5 = " + (2 + 5)); //correto

        //operador binário
        int nt = 6;
        System.out.println(nt >= 7 ? "Aprovado" : "Reprovado \u263A");

        //swtich
        Scanner scan = new Scanner(System.in); // Cria leitor de input padrão (teclado)
        int option = 0;
        System.out.println("Digite sua opção: \n 1, 2 ou 3");
        option = scan.nextInt(); //Ler inteiro digitado

        switch(option) {
            case 1:
                System.out.println("1- bom dia");
                break;

            case 2:
                System.out.println("2- boa tarde");
                break;

            case 3:
                System.out.println("3- boa noite");
                break;
        
            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }
}