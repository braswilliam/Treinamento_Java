import java.util.ArrayList;


public class Empresa {
    private Integer quanMaximaDeFuncionarios;
    ArrayList<Funcionario> listaDeFuncionarios;
    private Funcionario funcionario;

    public Empresa(Integer quanMaximaDeFuncionarios) {
        this.quanMaximaDeFuncionarios = quanMaximaDeFuncionarios;
        listaDeFuncionarios = new ArrayList<Funcionario>();
    }

    public void addFuncionario(Funcionario funcionario) {
        if (listaDeFuncionarios.size() < quanMaximaDeFuncionarios) {
            listaDeFuncionarios.add(funcionario);
            System.out.println("Funcionário add com sucesso");
        } else {
            System.out.println("Limite máximo de funcionários atingindo");
        }
    }

    public void darAumento(int id, double valorAumento){
        for (Funcionario funcionario: listaDeFuncionarios) {
            if (funcionario.getId() == id){
                double aumento = funcionario.getSalario() * valorAumento / 100;
                funcionario.setSalario(funcionario.getSalario() + aumento);
                break;
            }
        }
    }

    public void imprimirListaDeFuncionarios() {
        System.out.println("\nLista detalhada de Funcionários: ");
        System.out.println();
        for (Funcionario funcionario : listaDeFuncionarios) {
            System.out.println("ID: " + funcionario.getId() + " Nome: " + funcionario.getNome() + " Salário: " + funcionario.getSalario());
        }
    }


    public Integer getQuanMaximaDeFuncionarios() {
        return quanMaximaDeFuncionarios;
    }



}

