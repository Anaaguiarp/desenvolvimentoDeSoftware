public class Boleto {
    double valor;
    int diasAtraso;

    Boleto(double valor, int diasAtraso){
        this.valor = valor;
        this.diasAtraso = diasAtraso;
    }

    public double calcularValorTotal() {
        if (diasAtraso == 0) {
            return valor;
        } else {
            double valorComMulta = valor * 1.05; // 5% de multa
            double valorFinal = valorComMulta;

            for (int i = 0; i < diasAtraso; i++) {
                valorFinal = valorFinal * 1.01; // 1% de juros por dia
            }

            return valorFinal;
        }
    }
}
