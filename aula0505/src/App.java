public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Contas!!");
        Conta c1 = new Conta(100);
        ContaCorrente c2 = new ContaCorrente(100);

        c1.depositar(100);
        c1.atualizaSaldo(10);

        c2.depositar(100);
        c2.atualizaSaldo(10);

        System.out.println("Saldo em c1 é: " + c1.getSaldo() + "\nSaldo em c2 é: " + c2.getSaldo());
    }
}