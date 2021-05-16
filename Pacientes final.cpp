/*

.-Alan de Jesus Fabian garcia 
.-20310339
.-10 de Noviembre del 2020
.- Primera tarea 3er parcial

*/
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
//definicion  de variables Globales 
int opcion;
//definicion de estructuras

struct Fecha{
	int dia,mes,año;


};

struct Paciente{
	char nombre[50];
	int edad;
	float peso,estatura;
	struct Fecha fn;

};
//Menu repetitivo 
int main(){
	do{
	printf("\tMenu de opciones\n");
	printf("\t1.Modificar paciente\n");
	printf("\t2.Modificar todos los pacientes\n");
	printf("\t3.Mostrar Paciente\n");
	printf("\t4.Borrar paciente\n");
	printf("\t5.Salir\n");
	printf("\tSelecciona una opcion:\n");
	scanf("%d",&opcion);
	switch(opcion){
		case 1:
		// modificar paciente
		


		break;

		case 2:
		//capturar pacientes
		struct Paciente datos_pacientes[10];
		int x;
		for(x=0;x<10;x++)
		{
			printf("\tIngresa el nombre del paciente\n");
			fflush(stdin);
			gets(datos_pacientes[x].nombre);
			printf("\tIngresa la edad del paciente\n");
			scanf("%i",&datos_pacientes[x].edad);
			printf("\tIngresa el peso del paciente  en KG\n");
			scanf("%f",&datos_pacientes[x].peso);
			printf("\tIngresa la estatura del paciente \n");
			scanf("%f",&datos_pacientes[x].estatura);
			printf("\tCaptura la fecha de nacimiento:(dia,mes,año)\n");
			scanf("%i",&datos_pacientes[x].fn.dia);
			scanf("%i",&datos_pacientes[x].fn.mes);
			scanf("%i",&datos_pacientes[x].fn.año);





		}

		
		
		break;

		case 3:
		//Mostrar todos los pacientes 
		printf("\t los datos de los pacientes son:\n");
		for(x=0;x<10;x++)
		{
			printf("\tInformacion capturada\n\nNombre:%s\nEdad:%i\nPeso:%f\nEstatura:%i\nFecha de nacimiento %i/%i/%i",datos_pacientes[x].nombre,datos_pacientes[x].edad,datos_pacientes[x].peso,datos_pacientes[x].estatura,datos_pacientes[x].fn.dia,datos_pacientes[x].fn.mes,datos_pacientes[x].fn.año);

		}
		
		break;

		case 4:
		//Borrar el paciente seleccionado por el usuario 
		
		
		break;

		case 5:
		//Pa salir pues pa que mas veda
		

		break;

		default:
		//Por si ocurre algo extraño 
		printf("\tOpcion no valida\n");
		break;

	}
}while(opcion!=5);



}