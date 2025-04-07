/* Uma empresa de vendas precisa implementar a rotina de cobrança com a seguinte regra:
• Os boletos atrasados devem receber uma multa de 5% ao constar em atraso;
• O valor do boleto deve ser recalculado a cada dia com juros de 1% por dia de atraso (juros sobre juros);
• Desenvolva um programa em Java, Orientado a Objetos que dado o valor original do boleto, e os dias de atraso calcule o valor total a ser pago;
Exemplo: Um boleto no valor de R$ 259,90 com 2 dias de atraso deve ser recalculado em R$ 278,38 */

public class Boleto {
    double valor;
    int diasAtraso;

    Boleto(double valor, int diasAtraso){
        this.valor = valor;
        this.diasAtraso = diasAtraso;
    }

    public double calculaTotal(){
        if(diasAtraso == 0){
            return valor;
        }else{
            double valorMulta = valor * 1.05;
            double valorFinal = valorMulta;

            for(int i = 0; i < diasAtraso; i++){
                valorFinal *= 1.01;
            }
            return valorFinal;
        }
    }
}
