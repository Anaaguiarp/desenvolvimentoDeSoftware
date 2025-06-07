public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private String cpf;
	private String dataNascimento;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String cpf, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nPessoa{");
		sb.append("\nNome = ").append(nome);
		sb.append("\nCPF = ").append(cpf);
		sb.append("\nData de Nascimento = ").append(dataNascimento);
		sb.append("\n}");
		return sb.toString();
	}
	
	
	
	//Define como a classe Pessoa será comparada
	@Override
	public int compareTo(Pessoa outra) {
		// Definimos que nome será usado na comparação, ordenação, busca, entre outros.
		return nome.compareTo(outra.nome);
	}
}