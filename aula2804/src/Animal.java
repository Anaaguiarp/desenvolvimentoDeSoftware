public class Animal {
    private String nome;
    private double peso;
    private double tamanho;
    private int patas;
    private double velocidade;
    private double localizacao;

    public Animal(String nome, double velocidade, double localizacao){
        this.nome = nome;
        this.velocidade = velocidade;
        this.localizacao = localizacao;
    }

    public Animal(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(double localizacao) {
        this.localizacao = localizacao;
    }

    public void mover(){
        System.out.println(" > > > ");
        this.localizacao += this.velocidade;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", peso=" + peso + ", tamanho=" + tamanho + ", patas=" + patas + ", velocidade="
                + velocidade + ", localizacao=" + localizacao + "]";
    }

    
}
