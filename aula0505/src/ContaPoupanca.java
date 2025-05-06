public class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldo){
        super(saldo);
    }

    public boolean atualizaSaldo(double taxa){
        return super.atualizaSaldo(taxa*3);
    }
}
