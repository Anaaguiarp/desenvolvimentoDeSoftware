import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        ArrayList<Animal> listaAnimais = new ArrayList<>();
        listaAnimais.add(Menu.cadastraAnimal());

        Scanner sc = new Scanner(System.in);

        Ave ave1 = new Ave();
        System.out.println("Informe o nome da ave");
        ave1.setNome(sc.next());
        System.out.println("Informe o peso da ave");
        ave1.setPeso(sc.nextFloat());
        System.out.println("Informe o número do recinto da Ave: " + ave1.getNome());
        ave1.setRecinto(sc.nextInt());
        System.out.println("Informe o local nativo da ave");
        ave1.setLocal(sc.next());
        System.out.println("Está ave " + ave1.getNome() + " migra? Digite sim ou não");
        String migra = sc.next();
        if(migra.equalsIgnoreCase("Sim")){
            ave1.setMigracao(true);
        }else if(migra.equalsIgnoreCase("Não")){
            ave1.setMigracao(false);
        }else{
            System.out.println("Informação inválida! Migração foi editado como não");
            ave1.setMigracao(false);
        }
        System.out.println("Quantas vezes você deseja emitir o som da ave? ");
        ave1.emitirSom(sc.nextInt());
        sc.close();
    }
}
