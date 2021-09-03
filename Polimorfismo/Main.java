public class Main {
    public static void main(String[]args){
        System.out.println("Bienvenido al sistema de horarios de Guadalajara,Tijuana y La Paz");
        HorarioGuadalajara Guadalajara=new HorarioGuadalajara();
        Guadalajara.horaLocal();
        HorarioTijuana Tijuana=new HorarioTijuana();
        Tijuana.horaLocal();
        HorarioLaPaz LaPaz=new HorarioLaPaz();
        LaPaz.horaLocal();
        System.out.println("Gracias por utilizar el sistema c:");
        

    }
    
}
