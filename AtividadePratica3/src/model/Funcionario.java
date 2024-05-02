package model;
import controller.Trabalhavel;

public abstract class Funcionario implements Trabalhavel {
    
    private String nome;
    private int matricula;
    private int horasTrabalhadas;

    public Funcionario() {
    }

    public Funcionario(String nome, int matricula, int horasTrabalhadas) {
        this.nome = nome;
        this.matricula = matricula;
        this.horasTrabalhadas = horasTrabalhadas;
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

    public abstract float calcularSalario();
}
