import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class HorarioLaPaz implements InterfaceHorarios {
    public void horaLocal(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Formato: yyyy/MM/dd HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        System.out.println("El horario en La Paz es de 1 hora menos a comparacion a Guadalajara: "+" 3:35");
      

    }
    public void horaGMT(){
        
    }
    
    
}
