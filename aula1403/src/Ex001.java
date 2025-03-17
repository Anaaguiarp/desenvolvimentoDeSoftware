/* Faça um programa em Java que mostre a tabuada de um número escolhido
pelo usuário (entre 1 e 10) Obrigatório o uso de laço de repetição. Repita o
exercício cm os 3 laços. */

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num = 0, i = 0;
        System.out.println("Informe um número de 1 a 10");
        num+=scanner.nextInt();

        if(num > 10 || num < 1){
            System.out.println("Número inválido!");
        }else{
            /*for(i = 1; i <= 10; i++){
                System.out.println(num+ " X "+i+ " = "+(num*i));
            }*/
            /*while (i < 10) {
                i++;
                System.out.println(num+ " X "+i+ " = "+(num*i));
            }*/
            do{
                i++;
                System.out.println(num+ " X "+i+ " = "+(num*i));
            }while(i < 10);
        }
    }
}