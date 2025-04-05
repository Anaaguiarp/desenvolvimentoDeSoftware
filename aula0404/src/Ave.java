public class Ave extends Animal{
    private String local;
    private boolean migracao = false;

    public Ave(String nome, float peso, int recinto, String local, boolean migracao){
        super(nome, peso, recinto);
        this.local = local;
        this.migracao = migracao;
    }

    public Ave(){};

    public String getLocal(){
        return this.local;
    }

    public void setLocal(String local){
        this.local = local;
    }

    public boolean isMigracao(){
        return migracao;
    }

    public void setMigracao(boolean migracao){
        this.migracao = migracao;
    }

    @Override
    public void emitirSom(int quantidade){
        for(int i =1; i < quantidade; i++){
            System.out.print("có có có có");
        }
        System.out.println("");
    }

    public String toString(){
        return super.toString() + "\n" + "Local: " + this.local + "\nMigração: " + (this.migracao ? "SIM" : "NÃO");
    }
}