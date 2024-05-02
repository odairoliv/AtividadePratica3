package model;
import controller.Trabalhavel;

public abstract class Funcionario implements Trabalhavel {
    
    private String nome;
    private int matricula;
    private int horasTrabalhadas;
    private float salarioHora;

    public Funcionario() {
    }

    public Funcionario(String nome, int matricula, int horasTrabalhadas, float salarioHora) {
        this.nome = nome;
        this.matricula = matricula;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public abstract float calcularSalario();
}
