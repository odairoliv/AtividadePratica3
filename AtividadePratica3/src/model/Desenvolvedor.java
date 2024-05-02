package model;

public class Desenvolvedor extends Funcionario{

    private String especialidade;
    private float salarioFinal;
    private float salarioHora;

    public Desenvolvedor(String nome, int matricula, int horasTrabalhadas, String especialidade, float salarioHora) {
        super(nome, matricula, horasTrabalhadas);
        this.especialidade = especialidade;
        this.salarioHora = 32.5f;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public float getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(float salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor " + getNome() + " está programando em " + especialidade);
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Progresso relatado para o(a) desenvolvedor(a) " + getNome());
    }

    @Override
    public float calcularSalario() {
        salarioFinal = salarioHora * getHorasTrabalhadas();
        return salarioFinal;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEspecialidade: " + especialidade;
    }
    
}
