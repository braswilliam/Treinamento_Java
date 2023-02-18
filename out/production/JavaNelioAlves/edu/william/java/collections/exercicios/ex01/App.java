import java.util.Locale;
import java.util.Scanner;




public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de funcionários: ");
        int quantidadeFuncionarios = sc.nextInt();

        sc.nextLine();

        Empresa graficaNow = new Empresa(quantidadeFuncionarios);

        for (int i = 0; i < graficaNow.getQuanMaximaDeFuncionarios(); i++) {
            System.out.println("Funcionário " + (i + 1) + " :" );
            System.out.print("ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String nome = sc.nextLine();

            System.out.print("Salary: ");
            double salario = sc.nextDouble();


            Funcionario f = new Funcionario(id, nome, salario);

            System.out.println();
            graficaNow.addFuncionario(f);

            System.out.println();
        }


        System.out.print("Informe o ID do funcionário que terá seu salario aumentado: ");
        int id = sc.nextInt();

        System.out.print("Informe o percentual de aumento: ");
        double pecentualAumento = sc.nextDouble();

        graficaNow.darAumento(id, pecentualAumento);


        System.out.println("Lista de funcionarios e aumento: ");
        graficaNow.imprimirListaDeFuncionarios();




        sc.close();

    }


}
