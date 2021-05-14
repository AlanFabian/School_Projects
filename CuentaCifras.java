import java.util.Scanner;
public class CuentaCifras {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int numero=0;
        do{
            System.out.println("Introduce un numero");
            numero=sc.nextInt();
        }while(numero<0);
        int contador =0;
        for (int i = numero;i>0;i/=10){
            //incrementamos el contador 
            contador++;

        }
        //Controlamos en el caso de que haya una cifra de mas
        if(contador==1){
            System.out.println(" el numero "+numero+" tiene "+contador+" cifras ");

        }else{
            System.out.println(" el numero "+numero+" tiene "+contador+" cifras ");
        }
    }
    
}
