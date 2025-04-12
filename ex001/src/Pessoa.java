public class Pessoa {
    private String nome;
    private int cod;
    private String cpf;
    private String endereco;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getCod(){
        return this.cod;
    }

    public void setCod(int cod){
        this.cod = cod;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    Pessoa(String nome, int cod, String cpf, String endereco){
        this.nome = nome;
        this.cod = cod;
        this.cpf = cpf;
        this.endereco = endereco;
    }
}