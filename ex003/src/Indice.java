/* A empresa de saneamento de uma cidade que controla o índice de poluição da água e mantém 3 grupos de indústrias que são altamente poluentes para o meio ambiente.
• O índice de poluição aceitável varia de 0,06 até 0,16.
• Se o índice sobe para 0,25 as indústrias do 1ž grupo são intimadas a reduzirem em 50% suas atividades;
• Se o índice crescer para 0,4 as industrias do 1ž e 2ž grupo são intimadas a suspenderem suas atividades.
• Se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.
• Desenvolva um programa em Java Orientado a objetos, que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas. */

public class Indice {
    double indicePoluicao;

    Indice(double indicePoluicao) {
        this.indicePoluicao = indicePoluicao;
    }

    public void emitirNotificacao() {
        if (indicePoluicao < 0.06) {
            System.out.println("Índice abaixo do mínimo permitido. Atenção!");
        } else if (indicePoluicao >= 0.06 && indicePoluicao <= 0.16) {
            System.out.println("Índice dentro dos limites aceitáveis.");
        } else if (indicePoluicao >= 0.25 && indicePoluicao < 0.4) {
            System.out.println("Atenção Grupo 1: reduzir suas atividades em 50%.");
        } else if (indicePoluicao >= 0.4 && indicePoluicao < 0.5) {
            System.out.println("Atenção Grupo 1 e Grupo 2: suspender suas atividades.");
        } else if (indicePoluicao >= 0.5) {
            System.out.println("Atenção todos os grupos: suspender todas as atividades imediatamente!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}