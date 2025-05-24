//import java.io.IOException;

public class Conta {
    private double saldo;
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(valor > this.saldo){
            ContaExcecao ce = new ContaExcecao();
            try{
                ce.SaldoInsuficiente();    
            }catch(Exception e){
                System.out.println("ERRO: " + e);
            }
        }else{
            saldo -= valor;
        }
    }       
}