public class Pessoa {
    // Atributos privados (boas práticas)
    private String cpf;
    private int idade;

    // Construtor vazio (não recomendado se o CPF for obrigatório)
    public Pessoa() {
        // Aqui não preenche nada
    }

    // Construtor com CPF
    public Pessoa(String cpf) {
        if (validarCPF(cpf)) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido!");
        }
    }

    // Construtor com idade
    public Pessoa(int idade) {
        this.idade = idade;
    }

    // Getter e Setter do CPF
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (validarCPF(cpf)) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido!");
        }
    }

    // Getter e Setter da Idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para validar o CPF (bem simples, só para exemplo)
    private boolean validarCPF(String cpf) {
        // Aqui só vou checar se tem 11 dígitos
        return cpf != null && cpf.matches("\\d{11}");
    }
}