import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tipo do carro");
        String tipo = scan.next();
        System.out.println("Digite a placa");
        String placa = scan.next();
        System.out.println("Digite a cor");
        String cor = scan.next();
        System.out.println("Digite o número de portas");
        int num_portas = scan.nextInt();

        Carro c2 = new Carro(tipo, placa, cor, num_portas);
        System.out.println(c2.toString()); //Imprime o estado do objeto
        
        Carro c3 = new Carro();
        System.out.println(c3.toString());
    }
}