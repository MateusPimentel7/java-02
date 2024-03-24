package classe_heranca_atv;

public class App {
	 public static void main(String[] args) {
	        Pessoa empregado1 = new Empregado("João", 30, 1300.0);
	        Empregado empregado2 = new Empregado("Maria", 25, 1300.0);

	        empregado1.mostrarDados();
	        System.out.println();
	        empregado2.mostrarDados();
	    }
	}

