#include<iostream>
//#include<conio.h>

#define Horas 3
#define Temperatura 3
#define Dia 3
#define Mes 3

 using namespace std;
 
 int main(void){
     int n[Mes][Dia][Temperatura][Horas]; 
     //Arreglo
     //cout<<"Ingrese El mes del cual desea saber la Temperatura"<<endl;

for(int p=0; p<Mes; p++){//Mes


    for(int f=0; f<Dia; f++){//Dia

        for(int c=0; c<Temperatura; c++) {//Temperatura
           
        for(int i=0;i<Horas;i++){//Hora
        cout<<"Ingresa la hora del dia"<<endl;
        cin>>n[p][f][c][i];

            }


        }
    }


}





    // getch();
    system("pause");
    return 0;

 }
