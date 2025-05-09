public class Carro {
    private String tipo;
    private String cor;
    private String placa;
    private int num_portas;

    //Construtor com parâmetros
    public Carro(String tipo, String placa, String cor, int num_portas){
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
        this.num_portas = num_portas;
    }

    //Construtor sem parâmetros
    public Carro(){ //Se o usuário não adicionar a cor do carro, será branco
        this.cor = "Branco";
    }

    // Get e Set
    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public int getNum_portas(){
        return this.num_portas;
    }

    public void setNum_portas(int num_portas){
        this.num_portas = num_portas;
    }

    public void ligar(){
        System.out.println("Carro ligado!");
    }
    public void desligar(){
        System.out.println("Carro desligado!");
    }
    public void acelerar(){
        System.out.println("Carro acelerado!");
    }
    public void frear(){
        System.out.println("Carro freando!");
    }

    public String toString(){
        String texto = "Tipo: " + this.tipo + "\n" + "Placa: " + this.placa + "\n" + "Cor: " + this.cor + "\n" + "Número de Portas: " + this.num_portas + "\n";
        return texto;
    }
}