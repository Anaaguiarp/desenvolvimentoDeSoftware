public class Conta {
    private double saldo;

    public Conta(){}

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double pegarSaldo(){
        return this.saldo;
    }

    public boolean sacar(double valorSaque){
        boolean isOk = false;
        if(valorSaque <= this.saldo){
            this.saldo -= valorSaque;
            isOk = true;
        }
        return isOk;
    }

    public boolean depositar(double valorDeposito){
        boolean isOk = false;
        if(valorDeposito > 0){
            this.saldo += valorDeposito;
            isOk = true;
        }
        return isOk;
    }
   
    public boolean atualizaSaldo(double taxa){
        boolean isOk = false;
        if(taxa >= 1 && taxa <= 100){
            this.saldo += this.saldo * (taxa/100);
            isOk = true;
        }
        return isOk;
    }

}
