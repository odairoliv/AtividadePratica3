package model;

public class Gerente extends Funcionario{

    private float bonus;
    private float salarioFinal;
    private String equipe;
    private float salarioHora;

    public Gerente(String nome, int matricula, int horasTrabalhadas, float bonus, String equipe, float salarioHora) {
        super(nome, matricula, horasTrabalhadas);
        this.bonus = bonus;
        this.equipe = equipe;
        this.salarioHora = 105f;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public float getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(float salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerente " + getNome() + " está coordenando a equipe " + equipe);
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Progresso relatado pelo(a) gerente " + getNome());
    }

    @Override
    public float calcularSalario() {
        salarioFinal = getHorasTrabalhadas() * salarioHora + bonus;
        return salarioFinal;
    }

    
}
