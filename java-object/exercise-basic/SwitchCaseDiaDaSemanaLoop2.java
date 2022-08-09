import java.util.Scanner;

public class SwitchCaseDiaDaSemanaLoop2{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numInformado = 1000;

        do{
            System.out.printf("\n Informe o dia da semana em número que você deseja verificar e dígite 0 para sair: ");
                numInformado = scanner.nextInt();

                String diaDaSemana;
                switch (numInformado){
                    case 1:
                        diaDaSemana = "Domingo";
                        break;
                    case 2:
                        diaDaSemana = "Segunda";
                        break;
                    case 3:
                        diaDaSemana = "Terça";
                        break;
                    case 4:
                        diaDaSemana = "Quarta";
                        break;
                    case 5:
                        diaDaSemana = "Quinta";
                        break;
                    case 6:
                        diaDaSemana = "Sexta";
                        break;
                    case 7:
                        diaDaSemana = "Sábado";
                        break;      
                    default:
                        diaDaSemana = "\nErro, favor informar números entre 1 e 7 ";
                        break;
                }
            System.out.printf("\n Dia da semana: "+diaDaSemana+ "\n\n");
        }while(numInformado != 0 );
    } 
}