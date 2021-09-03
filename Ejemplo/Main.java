/*Alan de Jesus Fabian Garcia
20310339
1 de Septiembre de 2021*/
import java.util.Scanner;
public class Main {
   
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int opc;
    
        System.out.println("Bienvenido a Comunidad Ceti\n");
        do{
        System.out.println("Seleccione la informacion que desea ver del tipo de Alumno\n");
        System.out.println("1.Alumno regular\n");
        System.out.println("2.Becado\n");
        System.out.println("3.Servicio Social\n");
        System.out.println("4.Practicas laborales\n");
        System.out.println("5.Irregular\n");
        System.out.println("6.Egresado\n");
        System.out.println("7.Salir\n");
        opc = sc.nextInt();
        switch(opc){
            case 1:
            Regular Alex = new Regular();
            Alex.setNombre("Alex");
            Alex.setRegistro(20310338);
            Alex.setDomicilio("Castillo");
            Alex.setCarrera("Mecatronica");
            Alex.setPromedio(87);
            Alex.setSemestre(5);
            System.out.println("Nombre:\n");
            System.out.println(Alex.nombre+"\n");
            System.out.println("Registro\n");
            System.out.println(Alex.registro+"\n");
            System.out.println("Domicilio:\n");
            System.out.println(Alex.domicilio+"\n");
            System.out.println("Carrera:\n");
            System.out.println(Alex.carrera+"\n");
            System.out.println("Promedio:\n");
            System.out.println(Alex.promedio+"\n");
            System.out.println("Semestre:\n");
            System.out.println(Alex.semestre+"\n");


            break;

            case 2:
            Becado jesus=new Becado();
            jesus.setNombre("Jesus");
            jesus.setRegistro(20310339);
            jesus.setDomicilio("Gavilanes");
            jesus.setCarrera("Mecatronica");
            jesus.setPromedio(95);
            jesus.setSemestre(3);
            jesus.setMonto(2000);
            System.out.println("Nombre:\n");
            System.out.println(jesus.nombre+"\n");
            System.out.println("Registro\n");
            System.out.println(jesus.registro+"\n");
            System.out.println("Domicilio:\n");
            System.out.println(jesus.domicilio+"\n");
            System.out.println("Carrera:\n");
            System.out.println(jesus.carrera+"\n");
            System.out.println("Promedio:\n");
            System.out.println(jesus.promedio+"\n");
            System.out.println("Semestre:\n");
            System.out.println(jesus.semestre+"\n");
            System.out.println("Monto:\n");
            System.out.println(jesus.monto+"\n");



            break;

            case 3:
            Servicio jose =new Servicio();
            jose.setNombre("Jose");
            jose.setRegistro(20310441);
            jose.setDomicilio("Huertas");
            jose.setCarrera("Sistemas");
            jose.setPromedio(90);
            jose.setSemestre(7);
            jose.setHoras(56);
            jose.setArea("Administrativo");
            System.out.println("Nombre:\n");
            System.out.println(jose.nombre+"\n");
            System.out.println("Registro\n");
            System.out.println(jose.registro+"\n");
            System.out.println("Domicilio:\n");
            System.out.println(jose.domicilio+"\n");
            System.out.println("Carrera:\n");
            System.out.println(jose.carrera+"\n");
            System.out.println("Promedio:\n");
            System.out.println(jose.promedio+"\n");
            System.out.println("Semestre:\n");
            System.out.println(jose.semestre+"\n");
            System.out.println("Horas:\n");
            System.out.println(jose.horas+"\n");
            System.out.println("Area:\n");
            System.out.println(jose.area+"\n");
            




            break;

            case 4:
            Practicas martin=new Practicas();
            martin.setNombre("Martin");
            martin.setRegistro(20310556);
            martin.setDomicilio("adolfo");
            martin.setCarrera("Mecanica");
            martin.setPromedio(86);
            martin.setSemestre(8);
            martin.setHoras(80);
            martin.setEmpresa("Flextronic");
            martin.setRemuneracion(2200);
            System.out.println("Nombre:\n");
            System.out.println(martin.nombre+"\n");
            System.out.println("Registro\n");
            System.out.println(martin.registro+"\n");
            System.out.println("Domicilio:\n");
            System.out.println(martin.domicilio+"\n");
            System.out.println("Carrera:\n");
            System.out.println(martin.carrera+"\n");
            System.out.println("Promedio:\n");
            System.out.println(martin.promedio+"\n");
            System.out.println("Semestre:\n");
            System.out.println(martin.semestre+"\n");
            System.out.println("Horas:\n");
            System.out.println(martin.horas+"\n");
            System.out.println("Empresa:\n");
            System.out.println(martin.empresa+"\n");
            System.out.println("remuneracion:\n");
            System.out.println(martin.remuneracion+"\n");




            break;

            case 5:
           
            Irregular omar=new Irregular();
            omar.setNombre("Omar");
            omar.setRegistro(20310556);
            omar.setDomicilio("Mateos");
            omar.setCarrera("Mecatronica");
            omar.setPromedio(73);
            omar.setSemestre(3);
            omar.setMateria("Electromagnetismo");
            omar.setCalificacion(66);
            System.out.println("Nombre:\n");
            System.out.println(omar.nombre+"\n");
            System.out.println("Materia:\n");
            System.out.println(omar.materia+"\n");
            System.out.println("Calificacion:");
            System.out.println(omar.calificacion+"\n");
            System.out.println("Titulo:\n");
            omar.setCalificacion2(75);
            System.out.println(omar.calificacion2+"\n");
            System.out.println("Carta:\n");
            omar.setCalificacion3(80);
            System.out.println("Calificacion:");
            System.out.println(omar.calificacion3+"\n");
            System.out.println("Justificacion:\n");
            omar.setJustificacion("mi perro se comio la tarea");
            System.out.println(omar.justificacion+"\n");





            break;

            case 6:
            int opc2;
            Egresado claudio=new Egresado();
            claudio.setNombre("Claudio");
            claudio.setRegistro(20410330);
            claudio.setDomicilio("Punto sur");
            claudio.setCarrera("Informatica");
            claudio.setPromedio(94);
            claudio.setSemestre(8);
            System.out.println("Nombre:\n");
            System.out.println(claudio.nombre+"\n");
            claudio.setGraduacion("12 de febrero");
            System.out.println("Fecha de graduacion:\n");
            System.out.println(claudio.graduacion+"\n");
            System.out.println("Ingresa si el alumno es:\n1.CetiWorker \n2.Industria");
            opc2=sc.nextInt();
            switch(opc2){
                case 1:
                Egresado CetiWorker=new Egresado();
                CetiWorker.setNombre("Claudio");
                CetiWorker.setRegistro(20410330);
                CetiWorker.setDomicilio("Punto sur");
                CetiWorker.setCarrera("Informatica");
                CetiWorker.setPromedio(94);
                CetiWorker.setSemestre(8);
                CetiWorker.setGraduacion("12 de febrero");
                CetiWorker.setArea("Administrativo");
                
                CetiWorker.setSueldo(2400);
                System.out.println("Area:\n");
                System.out.println(CetiWorker.area+"\n");
                System.out.println("Horas:\n"+"8");
                System.out.println(CetiWorker.horas+"\n");
                System.out.println("sueldo:\n");
                System.out.println(CetiWorker.sueldo+"\n");


                break;
                case 2:
                Egresado Industria= new Egresado();
                Industria.setNombre("Claudio");
                Industria.setRegistro(20410330);
                Industria.setDomicilio("Punto sur");
                Industria.setCarrera("Informatica");
                Industria.setPromedio(94);
                Industria.setSemestre(8);
                Industria.setGraduacion("12 de febrero");
                Industria.setEmpresa("Flextronic");
                Industria.setSalario(8000);
                System.out.println("Empresa:\n");
                System.out.println(Industria.empresa+"\n");
                System.out.println("Salario:\n");
                System.out.println(Industria.salario+"\n");



                break;
            }



            break;

            case 7:
            System.out.println("Gracias por utilizar el sistema de Comunidad Ceti\n");

            break;

            default:
            System.out.println("ingresa una opcion correcta \n");

            break;
        }


        }while(opc!=7);

        sc.close();
    



 


}
}