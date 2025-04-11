public class Contador {
    private int num;

    public int getNum(){
        return this.num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public int zerar(){
        return this.num = 0;
    }

    public int incrementar(){
        return this.num += 1;
    }

    public int decrementar(){
        return this.num -= 1;
    }

    public int somar(int valor){
        return this.num += valor;
    }

    public int subtrair(int valor){
        return this.num -= valor;
    }
}