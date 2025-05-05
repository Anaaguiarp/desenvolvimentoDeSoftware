public class Alimento extends Produto{
    private boolean perecivel;
    private String validade;

    public boolean isPerecivel() {
        return this.perecivel;
    }
    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }
    public String getValidade() {
        return this.validade;
    }
    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String toString(){
        return super.toString() + "\nPerecível? " + this.perecivel + "\nValidade: " + this.validade;
    }
}
