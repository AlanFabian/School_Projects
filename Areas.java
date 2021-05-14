import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Areas {
    public static void main(String args[]) throws IOException{

        BufferedReader in;
        in= new BufferedReader(new InputStreamReader(System.in));
        String input;
        int choice;
        int cuadrado=0;
        int rectangulo=0;
        int triangulo=0;
        //loop until 5 is entered
        do{
            System.out.println(" Se calculara el area de la figura que selecciones ");
            System.out.println(" Menu Principal ");
            System.out.println(" 1.Cuadrado");
            System.out.println(" 2.Rectangulo ");
            System.out.println(" 3.Triangulo ");
            System.out.println(" 4.Circulo ");
            System.out.println(" 5.SALIR ");
            System.out.println(" Ingresa la opcion que tu necesitas ");
            //get input
            input = in.readLine();
            //convert to an integer
            choice = Integer.valueOf(input).intValue();

            //el metodo lee el numero dado por el usuario
            //int opc = scan.nextInt();
            //scan.close();
            switch(choice){
                case 1:
                 //Ingresar los datos del primer numero
                Scanner num2 =new Scanner(System.in);
                System.out.println(" Ingresa la base del cuadrado ");
                int numero1 =num2.nextInt();
                 //Ingresar los datos del segundo numero
                Scanner num =new Scanner(System.in);
                System.out.println(" Ingresa la altura del cuadrado ");
                int numero2 =num.nextInt();
                 //do the  operations
                cuadrado=numero1*numero2;
                System.out.println(" El area del cuadrado es :"+cuadrado);
                break; 
                case 2:
                //Ingresar los datos del primer numero
                Scanner num3 =new Scanner(System.in);
                System.out.println(" Ingresa la base del rectangulo ");
                int numeroresta1 =num3.nextInt();
                //Ingresar los datos del segundo numero
                Scanner num4 =new Scanner(System.in);
                System.out.println(" Ingresa la altura del rectangulo ");
                int numeroresta2 =num4.nextInt();
                //do the  operations
                rectangulo=numeroresta1*numeroresta2;
                System.out.println(" la area del rectangulo es :"+rectangulo);
                break;

                case 3:
                //Ingresar los datos del primer numero
                Scanner num5 =new Scanner(System.in);
                System.out.println(" Ingresa la base del triangulo ");
                int numeromulti1 =num5.nextInt();
                //Ingresar los datos del segundo numero
                Scanner num6 =new Scanner(System.in);
                System.out.println(" Ingresa la altura del triangulo ");
                int numeromulti2 =num6.nextInt();
                //do the  operations
                triangulo=(numeromulti1*numeromulti2)/2;
                System.out.println(" el area del triangulo es: "+triangulo);
                break;

                case 4:
                //Ingresar los datos del primer numero
                Scanner num7 =new Scanner(System.in);
                System.out.println(" Ingresa el radio del circulo ");
                double numerodiv1 = num7.nextFloat();
                //do the  operations
                double circulo = Math.pow(numerodiv1,2)/3.14;
                System.out.println(" el area del circulo es : "+ circulo);
                break;

                case 5:
                System.out.println(" Gracias por utilizar el programa ");
                break;

                default:
                System.out.println(" Ha ocurrido un error ");

                break;
            }





        }while(choice!=5);


        
    }
    
}

