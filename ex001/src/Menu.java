import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    int opc;
    int opc2;
    int codMudanca;
    boolean sla = false;

    ArrayList<Pessoa> listaPessoa = new ArrayList<>();
    public void mostrarMenu(Scanner sc){
        do{
            System.out.println("1 - Cadastrar\n2 - Editar\n3 - Excluir\n0 - Sair");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Informe o nome: ");
                    String nome = sc.next();
                    System.out.println("Informe o código: ");
                    int cod = sc.nextInt();
                    System.out.println("Informe o cpf");
                    String cpf = sc.next();
                    System.out.println("Informe o endereco");
                    String endereco = sc.next();

                    break;
                case 2:
                    System.out.println("O que tu deseja editar?\n1 - Nome\n2 - Código\n3 - CPF\n4 - Endereço\n0 - Sair");
                    opc2 = sc.nextInt();
                    switch (opc2) {
                        case 1:
                            System.out.println("Informe o código de cadastro do usuário que deseja o nome trocar");
                            codMudanca = sc.nextInt();
                            for(int i = 0; i < listaPessoa.size(); i++){
                                if(listaPessoa.get(i).getCod() == codMudanca){
                                    System.out.println("Informe o nome que desejares");
                                    listaPessoa.get(i).getNome();
                                    System.out.println("Nome trocado para " + listaPessoa.get(i).getNome());
                                    sla = true;
                                }
                            }
                            if(!sla){
                                System.out.println("Código não encontrado!");
                            }
                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        case 0: 

                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }
        }while(opc != 0);
    }
    
}
