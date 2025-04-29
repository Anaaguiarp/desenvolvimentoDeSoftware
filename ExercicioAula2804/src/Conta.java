public class Conta {
    private double saldo;
    private double taxa;

    public Conta(double saldo, double taxa){
        this.saldo = saldo;
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void pegarSaldo(){
        System.out.println(this.saldo);
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if(this.saldo >= this.saldo){
            this.saldo -= valor;
        }else{
            System.out.println("Você não possui saldo o suficiente");
        }  
    }

    public void AtualizaSaldo(){
        this.taxa/=100;
        this.taxa += this.saldo;
    }
}
