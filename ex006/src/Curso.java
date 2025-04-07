public class Curso {
    private String nome;
    private Instrutor instrutor;
    private Aluno[] alunos; // array de alunos
    private int quantidadeAlunos; // para controlar quantos alunos foram adicionados

    public Curso(String nome, Instrutor instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
        this.alunos = new Aluno[100]; // pode ter até 100 alunos (você pode aumentar se quiser)
        this.quantidadeAlunos = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
        } else {
            System.out.println("Não é possível adicionar mais alunos.");
        }
    }

    public void listarAlunos() {
        System.out.println("Alunos matriculados no curso " + nome + ":");
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("- " + alunos[i].getNome());
        }
    }

    public void listarCurso() {
        System.out.println("Curso: " + nome);
        System.out.println("Instrutor: " + instrutor.getNome());
        listarAlunos();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public Instrutor getInstrutor() {
        return instrutor;
    }
}