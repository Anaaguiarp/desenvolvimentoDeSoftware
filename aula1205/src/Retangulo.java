public class Retangulo extends Forma2D{
    public Retangulo(){
        super();
    }

    public Retangulo(double altura, double largura, String nome){
        super(altura, largura, nome);
    }

    @Override
    public double calculaArea(){
        return super.getAltura() * super.getLargura();
    }
}