import java.util.ArrayList;

public class Venda {
    private int notaFiscal;
    private String nomeCliente;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Venda(){}

    public int getNotaFiscal() {
        return this.notaFiscal;
    }
    public void setNotaFiscal(int notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
    public String getNomeCliente() {
        return this.nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public ArrayList<Produto> getProdutos() {
        return this.produtos;
    }
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public String toString(){
        return "Venda: \nNota fiscal: " + this.notaFiscal + "\nCliente: " + this.nomeCliente + "\nProdutos: " + produtos;
    }

}
