import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // double
        double n1, n2, total;
        System.out.println("Informe o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.println("Informe o segundo número: ");
        n2 = sc.nextDouble();

        total = n1 + n2;
        System.out.println("A soma entre " + n1 + " e " + n2 + " é: " + total);

        // inteiro
        int n3, n4, total1;
        System.out.println("\nInforme o primeiro número: ");
        n3 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        n4 = sc.nextInt();

        total1 = n3 + n4;
        System.out.println("A soma entre os inteiros " + n3 + " e " + n4 + " é: " + total1);      
        sc.close();
    }
}