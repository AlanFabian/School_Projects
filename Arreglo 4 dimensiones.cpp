//Ideas para el Programa Clima Categorias: hora,temperatura,dia,mes
//Alan de Jesus Fabian Garcia 
//Librerias
#include <iostream>
#include <conio.h>
//Dimenisiones arreglos
//hora,temperatura,dia,mes
#define Horas 3
#define Temperatura 3
//#define  Dia 31
#define  Mes 12

using namespace std;

int main(){

int n[Horas][Temperatura][Dia][Mes];
int acu = 0;
int prom =0;
int Meses;

for(int p=0; p<Mes; p++)/{//Mes
    cout<<"Introduzca el Mes(Numero ejemplo Marzo=3)"<<endl;
    cin>>Meses;
    for(int f=0; f<Dia; f++){//Dia

        for(int c=0; c<Temperatura; c++) {//Temperatura

        for(int=0;i<Horas;i++){//Hora
        cin>>n[p][f][c][i];

            }


        }
    }


}
//Operaciones a realizar encontrar la Temperatura media por dia, Mes,Temperatura minima,Temperatura Maxima 









getch();
}