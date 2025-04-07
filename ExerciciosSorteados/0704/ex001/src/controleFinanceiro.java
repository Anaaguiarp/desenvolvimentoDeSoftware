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
    Venda[] vendas = new Venda [1000];
    int contadorVendas = 0;

    final double LIMITE_VENDA = 500.0;
    final double MULTA = 0.10;

    public void cadastrarVenda(double valor, int dia, int mes, int ano){
        vendas[contadorVendas] = new Venda(valor, dia, mes, ano);
        contadorVendas++;
    }

    public void consultaImposto(int mesConsulta, int anoConsulta){
        double E = 0;
        double M = 0;

        for(int i = 0; i < contadorVendas; i++){
            Venda v = vendas[i];
            if(v.mes == mesConsulta && v.ano == anoConsulta){
                if(v.valor > LIMITE_VENDA){
                    E = v.valor - LIMITE_VENDA;
                    M = E * MULTA;
                }
            }
        }
        System.out.printf("O excesso no mês: %.2f%n", E);
        System.out.printf("Valor da multa: %.2f%n", M);
    }
}
