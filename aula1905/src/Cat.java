public class Cat implements Animal {
    private String nome;
    private int idade;
    private boolean castrado;

    //Construtores
    public Cat(){}
    public Cat(String nome, int idade, boolean castrado){
        this.nome = nome;
        this.idade = idade;
        this.castrado = castrado;
    }

    //Getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public boolean isCastrado() {
        return castrado;
    }
    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    //Métodos da interface
    public void som(){
        System.out.println("Miau! Miau!");
    }

    public void mover(){
        System.out.println("Gato se move! _ _ _");
    }
    
    public String toString(){
        return "Cat - Nome: "+this.nome+
            " - Idade: "+this.idade+
            " - Castrado: "+this.castrado;
    }
}