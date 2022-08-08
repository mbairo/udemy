import java.util.Scanner;
public class MediaDaAltura{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Média da altura das pessoas ---");
        System.out.print("Altura de quantas pessoas: ");
        int quantidade = scanner.nextInt();

        float [] arrayAltura = new float [quantidade];

        float media = 0;
        for (int cont = 0; cont < quantidade; cont++) {
            System.out.print("Altura da " + (cont + 1) + "° pessoa: ");
            arrayAltura[cont] = scanner.nextFloat();
            media += arrayAltura[cont] / quantidade;            
        }
        System.out.printf("Média da altura das pessoas informada: %.2f\n", media);
    }
}