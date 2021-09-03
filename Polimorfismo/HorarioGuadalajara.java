import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class HorarioGuadalajara implements InterfaceHorarios {
    public void horaLocal(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Formato: yyyy/MM/dd HH:mm:ss-> "+"Guadalajara :\n"+dtf.format(LocalDateTime.now()));


    }
    public void horaGMT(){

    }
    
    
}
