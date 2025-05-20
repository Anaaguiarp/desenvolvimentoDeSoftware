public class Carro implements Veiculo {
    private String cor;

    public Carro(){}
    public Carro(String cor){
        this.cor = cor;
    }

    public void acelerar(){
        System.out.println("Carro acelerando...");
    }

    public void frear(){
        System.out.println("Carro freando...");
    }
    
    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String obterTipo(){
        return "Carro - Modelo: "+this.cor;
    };
}
