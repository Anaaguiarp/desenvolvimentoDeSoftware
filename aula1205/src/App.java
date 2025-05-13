import java.util.Scanner;

import javafx.scene.shape.Circle;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //Classes abstratas não são instanciáveis
        //Forma2D forma = new Forma2D(); 
        Retangulo retangulo = new Retangulo(3.5,5,"Sala");
        System.out.println("Área do retângulo é: " + retangulo.calculaArea());
        Circulo circulo = new Circulo(2, 2, "Bola");
        System.out.println("A área do círculo é: " + circulo.calculaArea());
        ArrayList<Forma2D> formas = new ArrayList<>();
        /* Cadastrar, editar e listar formas */
        Scanner sc = new Scanner(System.in);
        int opc;
        String menu = "\n------Formas 2D------\n" +
                            "1 - Cadastrar Formas\n" +
                            "2 - Listar Formas\n" +
                            "3 - Editar Formas\n" +
                            "4 - Excluir Forma\n" +
                            "0 - Sair\n" +
                            "Digite a opção desejada: ";
        do{
            System.out.println(menu);
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Qual forma deseja cadastrar?\n" +
                    "1 - Retangulo\n" +
                    "2 - Circulo");
                    int forma = sc.nextInt();
                    System.out.println("Digite a altura da forma: ");
                    double h = sc.nextDouble();
                    System.out.println("Digite a largura da forma: ");
                    double w = sc.nextDouble();
                    System.out.println("Digite o nome da forma: ");
                    String n = sc.next();
                    sc.nextLine();
                    if(forma == 1){
                        formas.add(new Retangulo(h, w, n));
                    }else if(forma == 2){
                        formas.add(new Circulo(h, w, n));
                    }
                    System.out.println(formas.size() + " Formas2D cadastradas!");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(opc!=0);
    }
}