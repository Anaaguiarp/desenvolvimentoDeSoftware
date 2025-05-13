public abstract class Forma2D {
    private double altura;
    private double largura;
    private String nome;
    
    //Método abstrato
    public abstract double calculaArea();

    //Construtor vazio
    public Forma2D(){
      this.largura = this.altura = 0.0;
      this.nome = "Nada";
    }

    //Construtor com parâmetro
    public Forma2D(double altura, double largura, String nome){
      this.altura = altura;
      this.largura = largura;
      this.nome = nome;
    }

    public double getAltura() {
      return this.altura;
    }

    public void setAltura(double altura) {
      this.altura = altura;
    }

    public double getLargura() {
      return this.largura;
    }

    public void setLargura(double largura) {
      this.largura = largura;
    }

    public String getNome() {
      return this.nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public String toString(){
      return "Forma 2D\nNome: "+ this.nome+"\nAltura: "+ this.altura+"\nLargura: "+ this.largura;
    } 
}