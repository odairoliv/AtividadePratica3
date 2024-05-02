package model;

public class Gerente extends Funcionario{

    private float bonus;
    private float salarioFinal;
    private String equipe;

    public Gerente(String nome, int matricula, int horasTrabalhadas, float salarioHora, float bonus, String equipe) {
        super(nome, matricula, horasTrabalhadas, salarioHora);
        this.bonus = bonus;
        this.equipe = equipe;
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
        salarioFinal = getHorasTrabalhadas() * getSalarioHora() + bonus;
        return salarioFinal;
    }

    
}
