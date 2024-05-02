package view;
import model.*;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Funcionario> funcionarios;
    int horasTrabalhadas;

    public Sistema() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void exibirTodosFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Não há funcionários cadastrados.");
        } else {
            System.out.println("\n----- Lista de Funcionários -----");
            for (Funcionario f : funcionarios) {
                System.out.println(f.toString());
                System.out.println();
            }
            System.out.println("---------------------------------");
        }
    }

    public void relatarProgressoPorMatricula(int matricula) {
        for (Funcionario f : funcionarios) {
            if (f.getMatricula() == matricula) {
                if (f instanceof Gerente) {
                    System.out.println();
                    ((Gerente) f).relatarProgresso();
                } else if (f instanceof Desenvolvedor) {
                    System.out.println();
                    ((Desenvolvedor) f).relatarProgresso();
                } else if (f instanceof Estagiario) {
                    System.out.println();
                    ((Estagiario) f).relatarProgresso();
                }
                return;
            }
        }
        System.out.println("Funcionário não encontrado com a matrícula fornecida.");
    }
    

    public void removerFuncionarioPorMatricula(int matricula) {
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            if (f.getMatricula() == matricula) {
                funcionarios.remove(i);
                System.out.println("Funcionário removido com sucesso.");
                return;
            }
        }
        System.out.println("Funcionário não encontrado com a matrícula fornecida.");
    }

    public String buscarFuncionarioPorMatricula(int matricula) {
        for (Funcionario f : funcionarios) {
            if (f.getMatricula() == matricula) {
                System.out.println("\n----- Dados do(a) funcionário(a) -----");
                return f.toString();
            }
        }
        return "Funcionário não encontrado com a matrícula fornecida.";
    }

    public void cadastrarFuncionario() {
        System.out.println("\n----- Cadastrar Funcionário -----");
        System.out.print("Nome: ");
        String nome = Console.lerString();
        System.out.print("Matrícula: ");
        int matricula = Console.lerInt();
        System.out.println("Selecione o tipo de funcionário:");
        System.out.println("1. Gerente");
        System.out.println("2. Desenvolvedor");
        System.out.println("3. Estagiário");
        System.out.print("Opção: ");
        int tipo = Console.lerInt();

        switch (tipo) {
            case 1:
                System.out.print("Bônus mensal: ");
                float bonusMensal = Console.lerFloat();
                System.out.print("Equipe: ");
                String equipe = Console.lerString();
                System.out.print("Quantidade de horas trabalhadas: ");
                horasTrabalhadas = Console.lerInt();
                adicionarFuncionario(new Gerente(nome, matricula, horasTrabalhadas, bonusMensal, equipe, 0));
                break;
            case 2:
                System.out.print("Especialidade: ");
                String especialidade = Console.lerString();
                System.out.print("Quantidade de horas trabalhadas: ");
                horasTrabalhadas = Console.lerInt();
                adicionarFuncionario(new Desenvolvedor(nome, matricula, horasTrabalhadas, especialidade, 0));
                break;
            case 3:
                System.out.print("Supervisor: ");
                String supervisor = Console.lerString();
                System.out.print("Quantidade de horas trabalhadas: ");
                horasTrabalhadas = Console.lerInt();
                adicionarFuncionario(new Estagiario(nome, matricula, horasTrabalhadas, supervisor, 0));
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    public void statusFuncionario(int matricula) {
        for (Funcionario f : funcionarios) {
            if (f.getMatricula() == matricula) {
                System.out.println();
                f.trabalhar();
                return;
            }
        }
        System.out.println("Funcionário não encontrado com a matrícula fornecida.");
    }
    

    public void mostrarMenu() {
        int opcao;

        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Cadastrar novo funcionário");
            System.out.println("2. Excluir funcionário");
            System.out.println("3. Buscar funcionário por matrícula");
            System.out.println("4. Exibir todos os funcionários");
            System.out.println("5. Relatar progresso de um funcionário");
            System.out.println("6. Status de um funcionário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Console.lerInt();

            switch (opcao) {
                case 1:
                    cadastrarFuncionario();
                    break;
                case 2:
                    System.out.print("Matrícula do funcionário a ser excluído: ");
                    int matricula = Console.lerInt();
                    removerFuncionarioPorMatricula(matricula);
                    break;
                case 3:
                    System.out.print("Matrícula do funcionário: ");
                    int matriculaBusca = Console.lerInt();
                    System.out.println(buscarFuncionarioPorMatricula(matriculaBusca));
                    break;
                case 4:
                    exibirTodosFuncionarios();
                    break;
                case 5:
                    System.out.print("Matrícula do funcionário para relatar progresso: ");
                    int matriculaRelatar = Console.lerInt();
                    relatarProgressoPorMatricula(matriculaRelatar);
                    break;
                case 6:
                    System.out.print("Matrícula do funcionário para status: ");
                    int matriculaStatus = Console.lerInt();
                    statusFuncionario(matriculaStatus);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 0);
    }
}
