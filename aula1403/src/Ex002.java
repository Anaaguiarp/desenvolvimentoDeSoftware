/* Faça um programa em Java que mostre a tabuada de 1 a 10 em uma mesma
tela. De 1 a 5 no primeiro bloco e do 6 ao 10 no segundo. Obrigatório o uso de
laço de repetição. */

public class Ex002 {
    public static void main(String[] args)  {
        for(int i=1; i<=10; i++){
            for(int j=1; j<=5; j++){
                System.out.print(j+" X "+i+" = "+(j*i)+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=1; i<=10; i++){
            for(int j=6; j<=10; j++){
                System.out.print(j+" X "+i+" = "+(j*i)+"\t");
            }
            System.out.println("");
        }
    }
}

/*

1 x 1 = 1       2 x 1 = 2       3 x 1 = 3       4 x 1 = 4       5 x 1 = 5
1 x 2 = 2       2 x 2 = 4       3 x 3 = 6       4 x 2 = 8       5 x 2 = 10

...

6 x 1 = 6       7 x 1 = 7       8 x 1 = 8       9 x 1 = 9       10 x 1 = 10
6 x 2 = 12      7 x 2 = 14      8 x 2 = 16      9 x 2 = 18      10 x 2 = 20

*/