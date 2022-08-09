import java.security.Principal;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class VolumeEsfera{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n*** Informe os dados para realizar o calculo da Esfera *** ");

        System.out.printf("\nRaio: ");
        double raio = scanner.nextDouble();

        double c = DadosDaFuncao.circunferencia(raio);
        double v = DadosDaFuncao.volume(raio);

        System.out.printf("Circumferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", DadosDaFuncao.PI);

    }
}