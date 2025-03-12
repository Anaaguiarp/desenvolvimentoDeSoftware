import java.security.SecureRandom;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int tamanho = 10;
        String nomes []; //declaração
        nomes = new String[tamanho]; //instanciação
        for(int i=0; i<tamanho; i++){
            nomes[i] = JOptionPane.showInputDialog("Digite o nome "+(i+1));
            JOptionPane.showMessageDialog(null, nomes[i]);
        }
        SecureRandom random = new SecureRandom();
        int sorteio = random.nextInt((tamanho-1));
        JOptionPane.showMessageDialog(null, "O nome sorteado é: "+ nomes[sorteio]);
    }
}