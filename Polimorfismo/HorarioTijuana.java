import java.util.Scanner;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HorarioTijuana implements InterfaceHorarios {
    public void horaLocal(){
      
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Formato: yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        System.out.println("El horario en Tijuana es de 2 horas menos a comparacion a Guadalajara: "+" 4:35");
       
        
        /*
        Instant instancia=Instant.now();
        ZonedDateTime zTijuana=ZoneId.of( "Pacific/Tijuana ");
        ZonedDateTime zdtTijuana=instancia.atZone(zTijuana);
        */


    }
    public void horaGMT(){
        
    }
   

    
}
