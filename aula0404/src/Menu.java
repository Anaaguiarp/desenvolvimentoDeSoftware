import java.util.Scanner;

public class Menu {

    public static Animal cadastraAnimal(){
        Scanner sc = new Scanner (System.in);
        Animal animal1 = new Animal();
        System.out.println("Informe o nome do animal");
        animal1.setNome(sc.next());
        System.out.println("Informe o peso do animal");
        animal1.setPeso(sc.nextFloat());
        System.out.println("Informe o número do recinto do animal " + animal1.getNome());
        animal1.setRecinto(sc.nextInt());
        System.out.println("Quantas vezes você deseja emitir o som do animal? ");
        animal1.emitirSom(sc.nextInt());
        System.out.println(animal1.toString());
        return animal1;
    }
}
