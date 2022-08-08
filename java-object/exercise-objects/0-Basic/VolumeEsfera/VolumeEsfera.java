import java.io.Console;
import java.security.Principal;
import java.util.Scanner;

public class VolumeEsfera{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DadosDaFuncao dados = new DadosDaFuncao(); // Instanciando dados com DadosDaFuncao
        
        System.out.println("\n*** Informe os dados para realizar o calculo da Esfera *** ");

        System.out.printf("\nRaio: ");
        dados.raio = scanner.nextDouble();

        dados.calculos();

        System.out.println(dados);
    }
}