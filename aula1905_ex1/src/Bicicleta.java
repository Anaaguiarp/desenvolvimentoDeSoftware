public class Bicicleta implements Veiculo {
    private boolean montanha;
    
    public Bicicleta(){}
    public Bicicleta(boolean montanha){
        this.montanha = montanha;
    }
    public void acelerar(){

    }
    
    public void frear(){

    }

    public String getTipoEstrada(){
        return this.getTipoEstrada();
    }

    public void setTipoEstrada(boolean montanha){
        this.montanha = montanha;
    }
    
    public String obterTipo(){
        return "Bicicleta - Montanha: "+this.montanha;
    };
}
