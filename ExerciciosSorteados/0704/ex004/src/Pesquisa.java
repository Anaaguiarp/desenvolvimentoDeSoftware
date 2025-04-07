public class Pesquisa {
    private int totalHabitantes = 0;
    private double somaSalarios = 0;
    private int maiorIdade = Integer.MIN_VALUE;
    private int menorIdade = Integer.MAX_VALUE;
    private int homensSalarioBaixo = 0;
    private int quantidadeMulheres = 0;

    public void registrarHabitante(Habitante h) {
        totalHabitantes++;
        somaSalarios += h.salario;

        if (h.idade > maiorIdade) {
            maiorIdade = h.idade;
        }

        if (h.idade < menorIdade) {
            menorIdade = h.idade;
        }

        if (h.genero.equalsIgnoreCase("M")) {
            if (h.salario <= 1000.0) {
                homensSalarioBaixo++;
            }
        }

        if (h.genero.equalsIgnoreCase("F")) {
            quantidadeMulheres++;
        }
    }

    public void mostrarRelatorio() {
        if (totalHabitantes == 0) {
            System.out.println("Nenhum habitante registrado.");
            return;
        }

        double mediaSalario = somaSalarios / totalHabitantes;

        System.out.println("\n=== Relatório da Pesquisa ===");
        System.out.printf("Média de salário: R$ %.2f\n", mediaSalario);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de homens com salário até R$ 1000: " + homensSalarioBaixo);
        System.out.println("Quantidade de mulheres: " + quantidadeMulheres);
    }
}