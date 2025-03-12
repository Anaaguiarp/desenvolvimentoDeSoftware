
import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codAluno = 0;
        float media = 0;
        do{ 
            for(int i = 0; i <= 3; i++){
                System.out.println("Digite a nota "+i+" do aluno");
                media+=scanner.nextFloat();
            }
            //System.out.println("Digite o código do aluno");
            String texto = JOptionPane.showInputDialog("Digite o código do aluno: ");
            codAluno = Integer.parseInt(texto);
            System.out.println("A media do aluno é: "+ (media/3));
        }while(codAluno != 0);
        scanner.close(); //encerra o scanner
    }
}

