package classe_heranca_atv;

public class Empregado extends Pessoa {
    private double salario;

    public Empregado(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarSalario() {
        System.out.println("Salário: " + salario);
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados(); 
        mostrarSalario();
    }
}