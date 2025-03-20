/* Faça um programa em Java que calcule o fatorial de um número
pré-definido. Obrigatório o uso de laço de repetição. */

import java.util.Scanner;

public class Ex004 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int num = 0, i = 0;
        System.out.println("Informe um número");
        num+=scan.nextInt();
        int fatorial = 1;
        for(i = num; i > 0; i--){
            fatorial*=i;
            if(i == num){
                System.out.print(num+"! = "+num+" . ");
            }else{
                System.out.print(i+" . ");
        }
        scan.close();
        }
    System.out.println("O resultado é: "+fatorial);
    }
}
