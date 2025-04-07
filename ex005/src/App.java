public class App {
    public static void main(String[] args) throws Exception {
        try {
            Pessoa p1 = new Pessoa("12345678901");
            System.out.println("Pessoa 1 criada com CPF: " + p1.getCpf());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar Pessoa 1: " + e.getMessage());
        }

        // Teste 2: Criando pessoa com idade
        Pessoa p2 = new Pessoa(25);
        System.out.println("Pessoa 2 criada com idade: " + p2.getIdade());

        // Teste 3: Tentando criar uma pessoa com CPF inválido
        try {
            Pessoa p3 = new Pessoa("1234"); // CPF inválido
            System.out.println("Pessoa 3 criada com CPF: " + p3.getCpf());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar Pessoa 3: " + e.getMessage());
        }

        // Teste 4: Criando pessoa e depois setando CPF corretamente
        Pessoa p4 = new Pessoa();
        try {
            p4.setCpf("09876543210");
            System.out.println("Pessoa 4 teve CPF definido como: " + p4.getCpf());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao definir CPF da Pessoa 4: " + e.getMessage());
        }
    }
}
