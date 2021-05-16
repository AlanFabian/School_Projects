#include<stdio.h>

int main(){
	#define Size 5
	int lista [Size]={10,8,5,7};
	int indice=0;

	printf("Lista");
	while(indice<5){
	printf("la calificaciond el alumno %d es %d",indice+1,lista[indice]);
	indice+=1; // crear un analogo a indice
	}
	printf("\n");
	return 0;
	
}