public class App {
    public static void main(String[] args) {
        Instrutor instrutor = new Instrutor("Carlos Silva", "11122233344");
        
        Aluno aluno1 = new Aluno("Ana Souza", "55566677788");
        Aluno aluno2 = new Aluno("Bruno Lima", "99988877766");
        Aluno aluno3 = new Aluno("Carla Torres", "33322211100");

        Curso cursoJava = new Curso("Curso de Java", instrutor);

        cursoJava.adicionarAluno(aluno1);
        cursoJava.adicionarAluno(aluno2);
        cursoJava.adicionarAluno(aluno3);

        cursoJava.listarCurso();
    }
}