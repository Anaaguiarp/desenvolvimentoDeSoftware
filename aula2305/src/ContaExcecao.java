import java.io.IOException;

public class ContaExcecao extends Exception {
    public void SaldoInsuficiente() throws IOException{
        throw new IOException("Saldo Insuficiente");
    }
}
