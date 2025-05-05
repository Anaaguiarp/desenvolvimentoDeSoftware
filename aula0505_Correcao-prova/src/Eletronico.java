public class Eletronico extends Produto{
    private int voltagem;
    private String fonteDeEnergia;

    public int getVoltagem() {
        return this.voltagem;
    }
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    public String getFonteDeEnergia() {
        return this.fonteDeEnergia;
    }
    public void setFonteDeEnergia(String fonteDeEnergia) {
        this.fonteDeEnergia = fonteDeEnergia;
    }

    public String toString(){
        return super.toString() + "\nVoltagem: " + this.voltagem + "\n Fonte de Energia: " + this.fonteDeEnergia;
    }
}
