import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoDatasHoras {
    public static void main(String[] args) {
        LocalDate data01 = LocalDate.parse("2022-08-01");
        LocalDateTime data02 = LocalDateTime.parse("2022-08-01T01:30:26");
        Instant data03 = Instant.parse("2022-08-01T01:30:26Z");
        
        System.out.println("\n----- LocalDate -----");
        LocalDate localDateSemanaPassada = data01.minusDays(7);
        LocalDate localDateProximaSemana = data01.plusDays(7);
        LocalDate localDateAumentaAnos = data01.plusYears(7);

        System.out.println("localDateSemanaPassada: " + localDateSemanaPassada);
        System.out.println("localDateProximaSemana: " + localDateProximaSemana);
        System.out.println("localDateAumentaAnos: " + localDateAumentaAnos);

        System.out.println("\n----- LocalDateTime -----");
        LocalDateTime localDateSemanaPassadaTime = data02.minusDays(7);
        LocalDateTime localDateProximaSemanaTime = data02.plusDays(7);
        LocalDateTime localDateAumentaAnosTime = data02.plusYears(7);
        
        System.out.println("localDateSemanaPassadaTime: " + localDateSemanaPassadaTime);
        System.out.println("localDateProximaSemanaTime: " + localDateProximaSemanaTime);
        System.out.println("localDateAumentaAnosTime: " + localDateAumentaAnosTime);

        System.out.println("\n-- Horas/Minutos/Segundos --");
        LocalDateTime localDateSemanaPassadaMinutos = data02.plusMinutes(13);
        System.out.println("localDateSemanaPassadaMinutos: " + localDateSemanaPassadaMinutos);

        System.out.println("\n----- Instant -----");
        Instant semanaPassadaInstant = data03.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = data03.plus(7, ChronoUnit.DAYS);

        System.out.println("SemanaPassadaInstant: " + semanaPassadaInstant);
        System.out.println("ProximaSemanaInstant: " + proximaSemanaInstant);

        System.out.println("\n----- Duration -----");
        // LocalDate não possui tempo, por isso se faz necessário acrescentar ".atTime(0, 0)" ou ".atStartOfDay()"
        Duration tempoEntre1 = Duration.between(localDateSemanaPassada.atStartOfDay(), data01.atStartOfDay());
        System.out.println("tempoEntre1: " + tempoEntre1.toDays());
        Duration tempoEntre2 = Duration.between(localDateSemanaPassadaTime, data02);
        System.out.println("tempoEntre2: " + tempoEntre2.toDays());
        Duration tempoEntre3 = Duration.between(semanaPassadaInstant, data03);
        System.out.println("tempoEntre3: " + tempoEntre3.toDays());
        Duration tempoEntre4 = Duration.between(data03,semanaPassadaInstant);
        System.out.println("tempoEntre4: " + tempoEntre4.toDays());
    }
} 
