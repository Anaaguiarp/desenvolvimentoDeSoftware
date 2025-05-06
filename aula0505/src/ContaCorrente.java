public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo){
        super(saldo);
    }

    public boolean atualizaSaldo(double taxa){
        return super.atualizaSaldo(taxa*2);
    }

    public boolean depositar(double valorDeposito){
        boolean isOk = false;
        if(valorDeposito > 0.1){
            isOk = super.depositar(valorDeposito - 0.10);
        }
        return isOk;
    }
}
