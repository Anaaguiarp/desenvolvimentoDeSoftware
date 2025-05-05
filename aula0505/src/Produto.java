public class Produto {
    private int codigo;
    private String descricao;
    private int estoque;

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String toString(){
        return "Código: " + this.codigo + "\nDescrição: " + this.descricao + "\nEstoque: " + this.estoque;
    }
}
