import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calc1 = new Calculadora();
        String digitado = JOptionPane.showInputDialog("Digite o primeiro número: ");
        calc1.setNum1(Integer.parseInt(digitado));

        digitado = null; // Limpa variável
        digitado = JOptionPane.showInputDialog("Digite o segundo número: ");
        calc1.setNum2(Integer.parseInt(digitado));

        JOptionPane.showMessageDialog(null, "---------- Cálculos ----------\n" +
        "Números digitados: " + calc1.getNum1() + " e " + calc1.getNum2() + "\n" + 
        calc1.getNum1() + " + " + calc1.getNum2() + " = " + calc1.soma() + "\n" + 
        calc1.getNum1() + " - " + calc1.getNum2() + " = " + calc1.subtracao() + "\n" + 
        calc1.getNum1() + " / " + calc1.getNum2() + " = " + calc1.divisao() + "\n" + 
        calc1.getNum1() + " X " + calc1.getNum2() + " = " + calc1.multiplicacao() + "\n");
    }
}