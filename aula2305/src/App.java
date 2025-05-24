import java.io.IOException;

public class App {
    public void m() throws IOException{
        throw new IOException("Erro de dispositivo");
    }
    public static void main(String[] args) throws Exception {
        /*try{
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Algo deu errado. \n" + e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("O 'try-catch' acabou. ");
        }*//*
        try{
            App obj = new App();
            obj.m();
        } catch (Exception e) {
            System.out.println("Exceção tratada");
        }*/

        /* Suponha que o método "saca" da classe Conta vai ser rescrito de forma a lançar uma exceção criada por você, cuja classe é ContaExcecao (extends Exception). 
        A exceção é lançada sempre que o saldo da conta for inferior ao valor sacado. Implemente a classe ContaExcecao. 
        Implemente o método saca que lança a exceção. E rescreva o código da caixa com o devido tratamento da exceção. */

        Conta c1 = new Conta();
        c1.sacar(200);

        
    }
}