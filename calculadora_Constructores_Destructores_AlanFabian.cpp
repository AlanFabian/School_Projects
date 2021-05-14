/*Alan de Jesus Fabian Garcia 
20310339
6 de Mayo de 2021
*/
#include <iostream>
#include<math.h>
//Mandar a llamar a la clase 
#include "objeto.h"
using namespace std;
int main()
{
    int opc,optionGeometry,opcBasic;
    Calculadora cal;
    float n1,n2,res,n3;
    
   do{
       cout<<endl<<"Ingresa la opcion que deseas utilizar"<<endl;
       cout<<endl<<"1)Ecuacion de segundo grado"<<endl;
       cout<<endl<<"2)Geometria"<<endl;
       cout<<endl<<"3)Operaciones Basicas"<<endl;
       cout<<endl<<"4)Salir"<<endl;
       cin>>opc;

       switch (opc)
       {
       case 1:
       cout<<"coeficiente A:"<<endl;
       cin>>n1;
       cal.setNum1(n1);
       cout<<"coeficiente B:"<<endl;
       cin>>n2;
       cal.setNum2(n2);
       cout<<"coeficiente C:"<<endl;
       cin>>n3;
       cal.setNum3(n3);
       cal.ecuacion();
       cal.getx1();
       cal.getx2();
       
       

           break;
        case 2:
        cout<<endl<<"Ingresa el area de la figura que quiere saber"<<endl;
        cout<<endl<<"1)Cuadrado"<<endl;
        cout<<endl<<"2)Rectangulo"<<endl;
        cout<<endl<<"3)Triangulo"<<endl;
        cout<<endl<<"4)Circulo"<<endl;
        cin>>optionGeometry;
        switch (optionGeometry)
        {
        case 1:
        cout<<endl<<"Ingresa uno de los lados del cuadrado"<<endl;
        cin>>n1;
        cal.setNum1(n1);
        cal.areaCuadrado();
         cout<<endl<<cal.getNum1()<<"*"<<cal.getNum1()<<"="<<cal.getRes()<<endl;

           
            break;
        case 2:
        cout<<endl<<"Ingresa la base del rectangulo"<<endl;
        cin>>n1;
        cal.setNum1(n1);
        cout<<endl<<"Ingresa la altura del rectangulo"<<endl;
        cin>>n2;
        cal.setNum2(n2);
        cal.areaRectangulo();
        cout<<endl<<cal.getNum1()<<"Los datos del rectangulo"<<cal.getNum2()<<"="<<cal.getRes()<<endl;
           
            break;
        case 3:
        cout<<endl<<"Ingresa la base del Triangulo"<<endl;
        cin>>n1;
        cal.setNum1(n1);
        cout<<endl<<"Ingresa la altura del Triangulo"<<endl;
        cin>>n2;
        cal.setNum2(n2);
        cal.areaTriangulo();
         cout<<endl<<cal.getNum1()<<"Los datos del triangulo"<<cal.getNum2()<<"="<<cal.getRes()<<endl;
           
            break;
        case 4:
        cout<<endl<<"Ingresa el radio del Circulo"<<endl;
        cin>>n1;
        cal.setNum1(n1);
        cal.areaCirculo();
         cout<<endl<<cal.getNum1()<<"*"<<cal.getNum1()<<"*3.1416"<<"="<<cal.getRes()<<endl;
           
            break;
        default:
        cout<<endl<<"ERROR"<<endl;
            break;
        }


           break;
           
       
        //Operaciones Basicas
        case 3:
        cout<<endl<<"Selecciona la operacion basica que deseas"<<endl;
        cout<<endl<<"1)Suma"<<endl;
        cout<<endl<<"2)Resta"<<endl;
        cout<<endl<<"3)Multiplicacion"<<endl;
         cout<<endl<<"4)Division"<<endl;
        
         cin>>opcBasic;

        switch (opcBasic)
        {
        case 1:
        cout<<endl<<" Ingresa los valores necesarios para la suma: "<<endl;
        cout<<endl<<" Ingresa el valor 1 : "<<endl;
        cin>>n1;
        cal.setNum1(n1);
        cout<<endl<<" Ingresa el valor 2 :"<<endl;
        cin>>n2;
        cal.setNum2(n2);
         cal.suma();
        cout<<endl<<cal.getNum1()<<"+"<<cal.getNum2()<<"="<<cal.getRes()<<endl;

           
        break;
        case 2:
         cout<<endl<<"Ingresa los valores necesarios para la resta: "<<endl;
         cout<<endl<<" Ingresa el valor 1 : "<<endl;
         cin>>n1;
        cal.setNum1(n1);
         cout<<endl<<" Ingresa el valor 2 : "<<endl;
         cin>>n2;
        cal.setNum2(n2);
        cal.resta();
        cout<<endl<<cal.getNum1()<<"-"<<cal.getNum2()<<"="<<cal.getRes()<<endl;
         break;
        case 3:
         cout<<endl<<"Ingresa los valores necesarios para la multiplicacion: "<<endl;
        cout<<endl<<" Ingresa el valor 1 : "<<endl;
        cin>>n1;
        cal.setNum1(n1);
        cout<<endl<<" Ingresa el valor 2 : "<<endl;
        cin>>n2;
        cal.setNum2(n2);
        cal.multi();
        cout<<endl<<cal.getNum1()<<"*"<<cal.getNum2()<<"="<<cal.getRes()<<endl;

           
        break;
        case 4:
         cout<<endl<<"Ingresa los valores necesarios para la Division: "<<endl;
         cout<<endl<<" Ingresa el valor 1 : "<<endl;
         cin>>n1;
        cal.setNum1(n1);
        cout<<endl<<" Ingresa el valor 2 : "<<endl;   
        cin>>n2;
        cal.setNum2(n2);
        cal.division();
         cout<<endl<<cal.getNum1()<<"/"<<cal.getNum2()<<"="<<cal.getRes()<<endl;

           
        break;
         default:
        cout<<endl<<"Gracias por utilizar el programa"<<endl;
            break;
        }
       default:
       cout<<endl<<"Gracias por utilizar el programa"<<endl;
           break;
       }
 }while(opc!=4);{
     cout<<endl<<"Gracias por utilizar el programa"<<endl;
 }   
    
    return 0;
}








