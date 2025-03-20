/* Escreva um algoritmo que utiliza um arraylist para adicionar números inteiros.
Nesse algoritmo, o usuário deve informar vários números inteiros até que o
número -1 seja informado. O arraylist, nesse caso, vai seguir a regra da teoria
dos conjuntos: um conjunto não pode ter números repetidos. Dessa forma,
toda vez que o usuário informar um número, você deve verificar se ele já está
contido no arraylist. Caso ele já esteja, você deve informar ao usuário que o
número não será adicionado. Ao final, o seu algoritmo deve imprimir o
conteúdo do arraylist ordenado. */

/* -------------Feito pela Professora Juliana--------------- */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>(); // Declaração
        Integer n = -1;
        do { 
            System.out.println("Digite um número inteiro positivo ou -1 para sair");
            n = scan.nextInt();
            if(n != -1){
                if(numeros.contains(n)){
                    System.out.println("O número "+ n + " é repetido");
                }else{
                    numeros.add(n); // Adicona elementos ao ArrayList
                    System.out.println("O número "+ n + " foi inserido no ArrayList");
                }
            }
        } while (n != -1);
        System.out.println("Foram registrados " + numeros.size() + " números.\n");
        // Ordenar o ArrayList
        Collections.sort(numeros);
        //Exibindo valores do ArrayList
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print("["+numeros.get(i)+"]\t");
        }
        scan.close();
    }
}