public class Caminhao implements Veiculo {
    private double capacidadeCarga;

    public Caminhao(){}
    public Caminhao(double capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    }

    public void acelerar(){

    }
    
    public void frear(){

    }

    public double getCapacidadeCarga(){
        return this.capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public String obterTipo(){
        return "Caminhão - Capacidade de Carga: "+this.capacidadeCarga+" /km";
    };
}
