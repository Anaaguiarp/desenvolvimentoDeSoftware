public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, double taxa){
        super(saldo, taxa);
    }

    public void AtualizaSaldo(){
        super.setTaxa(getTaxa() / 100);
        super.setTaxa(super.getTaxa() += super.setSaldo(getSaldo()));
    }
}
