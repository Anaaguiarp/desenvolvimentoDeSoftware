import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nome = "sair";
        File arquivo = new File();
        do{
            Pessoa p1 = new Pessoa();
            
            System.out.println("Digite o nome da pessoa ou 'sair' para encerrar:");
            nome = sc.nextLine();
            sc.nextLine();
            if(!nome.equalsIgnoreCase("sair")){
                p1.setNome(nome);
                System.out.println("Digite um email: ");
                p1.setEmail(sc.nextLine());
                sc.nextLine();
                arquivo.writeInsertStartment(p1.toStringSql());
            }
        }while(!nome.equals("sair"));

        sc.close();
    }
}
