import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numeros{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listaDeNumeros = new ArrayList<>();
        
        System.out.print("\nInforme o máximo de números para ser armazenados: ");
        Integer maximo = scanner.nextInt();
        
        for (int cont = 1; cont <= maximo; cont++) {
            System.out.print("Digite um número: ");
            Integer numero = scanner.nextInt();
            listaDeNumeros.add (numero);
        }

        System.out.println("\nNúmeros dentro do ArrayList: " + listaDeNumeros);

        System.out.println("\n--- Negativos ---");
        for (Integer elemento : listaDeNumeros){
            if (elemento < 0)
            System.out.println(elemento);
        }

        System.out.println("--- Pares ---");
        for (Integer elemento : listaDeNumeros){
            if (elemento % 2 == 0)
            System.out.println(elemento);
        }
        
        System.out.println("--- Impares ---");
        for (Integer elemento : listaDeNumeros){
            if (elemento % 2 != 0)
            System.out.println(elemento);
        }

        double soma = 0;
        int cont = 0;
        for (Integer elemento : listaDeNumeros){
            soma += elemento;
            cont ++;
        }

        System.out.print("\nSoma: " + soma);
        System.out.print("\nMédia: " + soma/cont + "\n\n");
    }
}
