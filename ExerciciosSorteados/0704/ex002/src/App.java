/* Uma empresa de vendas precisa implementar a rotina de cobrança com a seguinte regra:
• Os boletos atrasados devem receber uma multa de 5% ao constar em atraso;
• O valor do boleto deve ser recalculado a cada dia com juros de 1% por dia de atraso (juros sobre juros);
• Desenvolva um programa em Java, Orientado a Objetos que dado o valor original do boleto, e os dias de atraso calcule o valor total a ser pago;
Exemplo: Um boleto no valor de R$ 259,90 com 2 dias de atraso deve ser recalculado em R$ 278,38 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do boleto: ");
        double valor = sc.nextDouble();

        System.out.print("Digite os dias de atraso: ");
        int dias = sc.nextInt();

        Boleto boleto = new Boleto(valor, dias);
        double valorTotal = boleto.calcularValorTotal();

        System.out.printf("O valor total a pagar é: R$ %.2f\n", valorTotal);

        sc.close();
    }
}