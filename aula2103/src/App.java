import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        Carro c1 = new Carro(); //declaração e instanciação do objeto c1 que pertence a classe carro
        c1.tipo = "Gol";
        c1.cor = "Preto";
        c1.placa = "OBP4J41";
        c1.num_portas = 5;
        c1.ligar();

        Carro c2 = new Carro();
        c2.tipo = JOptionPane.showInputDialog("Digite o nome do modelo do carro");
        c2.cor = JOptionPane.showInputDialog("Digite a cor do carro");
        c2.placa = JOptionPane.showInputDialog("Digite a placa do carro");
        c2.num_portas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de portas"));
        JOptionPane.showMessageDialog(null, "------------ Carro -----------\n"+"Tipo: " + c2.tipo + "\nCor: " + c2.cor + "\nPlaca: " + c2.placa + "\nNúmero de Portas: " + c2.num_portas);
    }
}