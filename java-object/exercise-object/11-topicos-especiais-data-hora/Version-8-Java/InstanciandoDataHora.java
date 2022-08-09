import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class InstanciandoDataHora {
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html 
        // Para saber todos os fusos/nome horarios
        // for (String zoneName : ZoneId.getAvailableZoneIds()){
        //     System.out.println(zoneName);
        // };

        LocalDate data01 = LocalDate.now();
        LocalDateTime data02 = LocalDateTime.now();
        Instant data03 = Instant.now();
        LocalDate data04 = LocalDate.parse("2022-07-30");
        LocalDateTime data05 = LocalDateTime.parse("2022-07-30T01:30:26");
        Instant data06 = Instant.parse("2022-07-30T01:30:26z");
        Instant data07 = Instant.parse("2022-07-30T01:30:26-03:00");
              
        System.out.println("data01 = " + data01);
        System.out.println("data02 = " + data02);
        System.out.println("data03 = " + data03);
        System.out.println("data04 = " + data04);
        System.out.println("data05 = " + data05);
        System.out.println("data06 = " + data06);
        System.out.println("data07 = " + data07);
        
        // Transformar Data_hora -> Texto ISO 8601
        System.out.println("\nTransformar Data_hora -> Texto ISO 8601\n");
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterDataTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // Por padrão utiliza o UTC (Global)
        DateTimeFormatter formatterDataTimeIso = DateTimeFormatter.ISO_INSTANT;

        LocalDate data08 = LocalDate.parse("30/07/2022", formatterData);
        LocalDateTime data09 = LocalDateTime.parse("30/07/2022 01:30", formatterDataTime);
        //Outra maneira de se fazer: LocalDateTime data09 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        LocalDate data10 = LocalDate.of(2022, 7, 30);
        LocalDateTime data11 = LocalDateTime.of(2022, 7, 30, 14, 05);
        LocalDate data12 = LocalDate.parse("2022-07-30");
        Instant data13 = Instant.parse("2022-07-30T01:30:26z");
        

        System.out.println("data08 = " + data08);
        System.out.println("data09 = " + data09);
        System.out.println("data10 = " + data10);
        System.out.println("data11 = " + data11);
        System.out.println("data12 = " + data12.format(formatterData));
        System.out.println("data13 = " + formatterDataTimeIso.format(data13));
        System.out.println("(toString)data13 = " + data13);

        // Global para Local
        // Informar qual TimeZone será utilizado "withZone(ZoneId)" / Transforma hora global z em hora local / Instant necessita formatar informando o timezone
        DateTimeFormatter formatterDataTimeZone = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        Instant data14 = Instant.parse("2022-07-30T01:30:26z");
        
        System.out.println("(Global para Local: )data14 = " + formatterDataTimeZone.format(data14));
        LocalDate globalParaLocal = LocalDate.ofInstant(data14, ZoneId.systemDefault());
        LocalDate portugalParaLocal = LocalDate.ofInstant(data14, ZoneId.of("Portugal"));
        LocalDateTime globalParaLocalTime = LocalDateTime.ofInstant(data14, ZoneId.systemDefault());
        LocalDateTime portugalParaLocalTime = LocalDateTime.ofInstant(data14, ZoneId.of("Portugal"));

        System.out.println("Hora global para local: " + globalParaLocal);
        System.out.println("Hora de Portugal para local: " + portugalParaLocal);
        System.out.println("Hora global para local: " + globalParaLocalTime);
        System.out.println("Hora de Portugal para local: " + portugalParaLocalTime);


        System.out.println("\n------ Obter dados de uma data-hora local ------");

        LocalDate data15 = LocalDate.parse("2022-07-30");
        LocalDateTime data16 = LocalDateTime.parse("2022-07-30T01:30:26");

        System.out.println("data15 dia: " + data15.getDayOfMonth());
        System.out.println("data15 mês: " + data15.getMonth());
        System.out.println("data15 mês: " + data15.getMonthValue());
        System.out.println("data15 ano: " + data15.getYear());
        System.out.println("data16 hora(s): " + data16.getHour());
        System.out.println("data16 minuto(s): " + data16.getMinute());

    }
}
