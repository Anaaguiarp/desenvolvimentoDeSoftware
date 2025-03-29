import java.util.Scanner;

public class App { /* Terminar */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Retangulo ret1 = new Retangulo();
        System.out.println("Digite o valor do 1 lado");
        ret1.setLado1(scan.nextFloat());
        System.out.println("Digite o valor do 2 lado");
        ret1.setLado2(scan.nextFloat());

        System.out.println("A área do retângulo é: "+ ret1.calculaArea());
        System.out.println("O perímetro do retângulo é: "+ ret1.calculaPerimetro());
    }
}