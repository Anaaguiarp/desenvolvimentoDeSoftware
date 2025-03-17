/* Escreva uma aplicação capaz de receber 10 números (tipo ponto flutuante),
calcule e imprima:
• Os números digitados;
• A soma dos números;
• A média aritmética entre eles;
• O maior número;
• O menor número.
Obrigatório o uso de laço de repetição array. */

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        float[] num = new float[10];
        float soma = 0.0f, maior = 0.0f, menor = 0.0f;
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for(i = 0; i < 10; i++){
            System.out.println("Informe um número para a casinha ["+(i+1)+"]: ");
            num[i]=scanner.nextFloat();
            soma+=num[i];
        }
        for(i = 0; i < 10; i++){ //print de cada numero
            System.out.println("["+num[i]+"]");
            maior = num[0];
            menor = num [0];
            if(num[i] > menor){  //atualizando maior e menor valor
                maior = num[i];
            }else if(num[i] < menor){
                menor = num[i];
            }
        }
        System.out.println("A soma dos valores é: "+soma); //soma dos valores
        System.out.println("A média dos valores é: "+(soma/10)); // média dos valores
        System.out.println("O menor valor é: "+menor+"\tE o maior valor é: "+maior);//exibindo maior e menor valor

        scanner.close();
    }
}