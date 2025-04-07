/* Foi feita uma pesquisa entre os habitantes de uma cidade. Foram coletados os dados de idade, gênero (M/F) e renda. Faça uma aplicação em Java Orientada a Objetos contenha um menu onde seja possível registrar, os dados de cada habitante e, ainda consultar as seguintes informações:

1. A média de salário do grupo;
2. Maior e menor idade do grupo;
3. Quantidade de habitantes do gênero masculino com salário até R$ 1000,00;
4. Quantidade de habitantes do gênero feminino;*/

public class Habitante {
    double salario;
    int idade;
    String genero;
    
    Habitante(double salario, int idade, String genero){
        this.salario = salario;
        this.idade = idade;
        this.genero = genero;
    }
}