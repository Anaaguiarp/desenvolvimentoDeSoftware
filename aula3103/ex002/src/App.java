import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ope = 0;
        Calculadora c1 = new Calculadora();
        System.out.println("Informe a operação desejada:\n1 - Soma\n2 - Subtração\n3 - Divisão\n4 - Multiplicação");
        ope+=scan.nextInt();
        System.out.println("Informe o primeiro número");
        c1.setNum1(scan.nextInt());
        System.out.println("Informe o segundo número");
        c1.setNum2(scan.nextInt());

        switch (ope) {
            case 1:
                System.out.println("O resultado é: " + c1.soma());
                break;
            case 2:
                System.out.println("O resultado é: " + c1.subtracao());
                break;
            case 3:
                System.out.println("O resultado é: " + c1.divisao());   
                break;
            case 4:
                System.out.println("O resultado é: " + c1.multiplicacao());
                break;
            default:
                System.out.println("Opção INVÁLIDA, MELHORE!");
                break;
        }

        scan.close();
    }
}