public class Circulo extends Forma2D{
    private double raio;

    public Circulo(){
        super();
    }

    @Override
    public double calculaArea(){
        return Math.PI * Math.pow(this.raio, 2);
    }

    public Circulo(double altura, double largura, String nome){
        super(altura, largura, nome);
        this.raio = largura/2;
    }

    public String toString(){
        return super.toString() + "Raio: " + this.raio;
    }
}