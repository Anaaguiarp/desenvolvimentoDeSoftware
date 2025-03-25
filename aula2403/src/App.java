import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        Carro c1 = new Carro(); //declaração e instanciação do objeto c1 que pertence a classe carro
        //Editando atributos usando SET
        //c1.tipo = "Gol";
        c1.setTipo("Gol");
        //c1.cor = "Preto";
        c1.setCor("Preto");
        //c1.placa = "OBP4J41";
        c1.setPlaca("OBP4J41");
        //c1.num_portas = 5;
        c1.setNum_portas(5);
        //Método
        c1.ligar();

        Carro c2 = new Carro();
        //c2.tipo = JOptionPane.showInputDialog("Digite o nome do modelo do carro");
        c2.setTipo(JOptionPane.showInputDialog("Digite o nome do modelo do carro"));
        //c2.cor = JOptionPane.showInputDialog("Digite a cor do carro");
        c2.setCor(JOptionPane.showInputDialog("Digite a cor do carro"));
        //c2.placa = JOptionPane.showInputDialog("Digite a placa do carro");
        c2.setPlaca(JOptionPane.showInputDialog("Digite a placa do carro"));
        //c2.num_portas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de portas"));
        c2.setNum_portas(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de portas")));
        JOptionPane.showMessageDialog(null, "------------ Carro -----------\n"+"Tipo: " + c2.getTipo() + "\nCor: " + c2.getCor() + "\nPlaca: " + c2.getPlaca() + "\nNúmero de Portas: " + c2.getNum_portas());
    }
}