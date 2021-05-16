/*
-Alan de Jesus Fabian g
-20310339
-PO3PO2
-25 de Noviembre de 2020
*/
#include<stdio.h>
void menu();

int main()
{
    printf("Hola");
      menu();
    

}
//Funcion  para el Menu
void menu(){
    int opcion ;
    do
    {
        
        printf("\t BIENVENIDO AL PROGRAMA \nSeleccione la opcion que necesita\n");
        printf("\t1.Calcular el area de un cuadrado\n\t2.Calcular el area de un triangulo\n\t3.Calcular el area de un rectangulo\n\t4.Calcular el areá de un círculo\n\t5.Salir\n");
        scanf("%i",&opcion);
        switch (opcion)
        {
        case 1:
         //Funcion calcular el area de un cuadrado 

            break;
        case 2:
         //funcion calcular el area de un triangulo

            break;
        case 3:
         //funcion calcular el area de un rectangulo


            break;
        case 4:
         //calcular el area de un circulo 

            break;
        default:
         printf("\tSeleccione una opcion correcta\n");
        
            break;
        }
    } while (opcion!=5);
    printf("\tGRACIAS POR UTILIZAR EL PROGRAMA \n");
    


}