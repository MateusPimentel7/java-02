package classe_heranca_atv;

public class Pessoa {
	public String nome;
	public int idade;
	
	 public Pessoa(String nome, int idade) {
	        this.nome = nome;
	        this.idade = idade;
	    }

	    public void mostrarDados() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade);
	    }
}
