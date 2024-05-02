package model;

public class Estagiario extends Funcionario{

    private String supervisor;
    private float salarioFinal;
    private float salarioHora;

    public Estagiario(String nome, int matricula, int horasTrabalhadas, String supervisor, float salarioHora) {
        super(nome, matricula, horasTrabalhadas);
        this.supervisor = supervisor;
        this.salarioHora = 13.33f;
    }

    @Override
    public void trabalhar() {
        System.out.println("Estagiário " + getNome() + " está trabalhando com o supervisor " + supervisor);
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Progresso relatado pelo estagiário " + getNome());
    }

    @Override
    public float calcularSalario() {
        salarioFinal = salarioHora * getHorasTrabalhadas();
        return salarioFinal;
    }


}
