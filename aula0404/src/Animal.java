public class Animal{
    private String nome;
    private float peso;
    private int recinto;

    //construtores
    public Animal(String nome, float peso, int recinto){
        this.nome = nome;
        this.peso = peso;
        this.recinto = recinto;
    }

    public Animal(){}

    //getters and setters
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public int getRecinto(){
        return this.recinto;
    }

    public void setRecinto(int recinto){
        this.recinto = recinto;
    }

    public void emitirSom(int quantidade){
        for(int i = 1; i <= quantidade; i++){
            System.out.print("muuuuuuuuu ");
        }
        System.out.println("");
    }

    @Override  // reescrever um método que já existe
    public String toString(){
        return "Nome: " + this.nome + "\nPeso: " + this.peso + "\nRecinto: " + this.recinto;
    }
}