/* Escreva uma aplicação que receba do usuário uma frase no seguinte
formato N-N-N-...-N-N-N (representando por números inteiros separados
por hífen), extraia esses números desta frase e crie e alimente um vetor de
tamanho exato a quantidade de números. De posse desses números,
coloque-os em ordem decrescente no vetor. */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Recebe a entrada do usuário
        System.out.print("Digite os números no formato N-N-N: ");
        String entrada = scanner.nextLine();
        
        // Divide a string com base no hífen "-"
        String[] numerosStr = entrada.split("-");
        
        // Cria um vetor de inteiros com o tamanho exato
        Integer[] numeros = new Integer[numerosStr.length];
        
        // Converte os valores de String para Integer
        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i].trim());
        }
        
        // Ordena em ordem decrescente
        Arrays.sort(numeros, Collections.reverseOrder());
        
        // Exibe o vetor ordenado
        System.out.println("Números ordenados em ordem decrescente: " + Arrays.toString(numeros));
        
        scanner.close();
    }
}