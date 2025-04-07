/* Um trabalhador autônomo deseja controlar suas finanças, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
•Toda vez que ele vende um valor maior que o estabelecido pelo regulamento de MEI do estado onde vive (500,00 R$ dia) deve pagar um multa de R$ 0,10 a cada Real excedente.
• Este trabalhador precisa que você faça um programa em Java que leia o valor de todas as vendas do mês e verifique se há excesso (vendeu mais de 500,00 por dia).
• Se houver excesso, gravar na variável E (Excesso) e na variável M o valor da multa que o Trabalhador deverá pagar.
• Caso contrário mostrar tais variáveis com o conteúdo ZERO. Desenvolva uma aplicação Java Orientada a Objetos e as classes necessárias para resolver o problema.
O sistema deve conter um menu com no mínimo as seguintes opções
1 - cadastro de vendas
2 - consulta de imposto a pagar no mês (com base no mês e no ano das vendas).
0 - Sair. */

public class controleFinanceiro {
    Venda[] vendas = new Venda[1000];
    int quantidadeVendas = 0;

    final double LIMITE_DIARIO = 500.0;
    final double MULTA_POR_REAL = 0.10;

    public void cadastrarVenda(double valor, int dia, int mes, int ano) {
        vendas[quantidadeVendas] = new Venda(valor, dia, mes, ano);
        quantidadeVendas++;
    }

    public void consultarMulta(int mesConsulta, int anoConsulta) {
        double excessoTotal = 0;
        double multaTotal = 0;

        for (int i = 0; i < quantidadeVendas; i++) {
            Venda v = vendas[i];
            if (v.mes == mesConsulta && v.ano == anoConsulta) {
                if (v.valor > LIMITE_DIARIO) {
                    double excesso = v.valor - LIMITE_DIARIO;
                    excessoTotal += excesso;
                    multaTotal += excesso * MULTA_POR_REAL;
                }
            }
        }

        System.out.printf("Excesso (E) no mês: R$ %.2f%n", excessoTotal);
        System.out.printf("Multa (M) a pagar no mês: R$ %.2f%n", multaTotal);
    }
}