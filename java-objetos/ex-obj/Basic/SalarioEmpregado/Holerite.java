import java.util.Scanner;

import javax.swing.BoundedRangeModel;

public class Holerite{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcao holerite = new Funcao();

        System.out.println("\n*** Informe os dados do funcionário para realizar os cálculos ***");

        System.out.printf("\nNome: ");
        holerite.nome = scanner.next();

        System.out.printf("Salário Bruto: ");
        holerite.salarioBruto = scanner.nextFloat();

        System.out.printf("Imposto: ");
        holerite.imposto = scanner.nextFloat();

        //Imprime dados
        System.out.println(holerite);

        System.out.print("\nInforme a % para aumento no salário: ");
        float porcentagem = scanner.nextFloat();

        holerite.aumentoSalarial(porcentagem);

        //Imprime dados
        System.out.println(holerite);
    }
}

