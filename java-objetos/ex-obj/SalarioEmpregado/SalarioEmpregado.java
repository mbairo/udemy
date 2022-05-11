import java.util.Scanner;
 
public class SalarioEmpregado{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcao funcao = new Funcao();

        System.out.println("\n*** Infomer os dados solicitados do funcionário para realizar os cálculos *** \n");

        System.out.printf("\nNome: ");
        funcao.nome = scanner.next();

        System.out.printf("Salário Grosso: ");
        funcao.salarioGrosso = scanner.nextDouble();

        System.out.printf("Imposto: ");
        funcao.imposto = scanner.nextDouble();

        System.out.println("\n*Salário com desconto: " + funcao);

        System.out.print("\nInforme a % para aumento no salário: ");
        double porcentagem = scanner.nextDouble(); 
        funcao.aumentoPorcentagemSalario(porcentagem);

        System.out.println("\n**Salário com aumento: " + funcao + "\n");
    }
}
