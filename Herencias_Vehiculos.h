#include<iostream>
#include<string.h>

using namespace std;
////////Clase padre////////////
class Vehiculos{
    private:
    int ruedas,pasajeros;
    char matricula[50];
    

    public:
    //Constructor
    Vehiculos();
    Vehiculos(int,int);
    //Destructor
    ~Vehiculos();
     
    void set_ruedas(int ruedas);
    int get_ruedas();
    void set_pasajeros(int pasajeros);
    int get_pasajeros();
    void set_matricula(char *);
    char* get_matricula();


};
/*      CAMION        */
class camion:public Vehiculos{
    private:
    int carga;
    char marca[50];
    int modelo;

    public:
    camion();
    camion(char,int);
    ~camion();

    void set_carga(int size);
    int get_carga();
    void set_modelo(int modelo);
    int get_modelo();
    void mostrar();
    void set_marca(char *);
    char* get_marca();

};
enum tipo {carro,van,camioneta};

class carro:public Vehiculos{
    private:
    enum tipo tipo_de_carro;
    char marca[50];
    int modelo;

    
    public:
    carro();
    carro(int);
    ~carro();
    /*
    void set_tipo(tipo t){tipo_de_carro = t; }
    enum tipo get_tipo(){ return tipo_de_carro;};
    */
    void set_marca(char *);
    char* get_marca();
    void set_modelo(int modelo);
    int get_modelo();
    void mostrar();

};



//Implementacion de los metodos
/*************************** Vehiculos ****************/
Vehiculos::Vehiculos(){
    strcpy(matricula, "VACIO");


}
Vehiculos::Vehiculos(int,int){
       ruedas = 4;
       pasajeros=4;   


}
Vehiculos::~Vehiculos(){
    cout<<endl<<"Adios mundo cruel..."<<"Vehiculos"<<endl;       

}
void Vehiculos::set_ruedas(int ruedas){
    this->ruedas = ruedas;



}
int Vehiculos::get_ruedas(){
    return ruedas;

}
void Vehiculos::set_pasajeros(int pasajeros){
    this->pasajeros = pasajeros;

}
int Vehiculos::get_pasajeros(){
    return pasajeros;
}
void Vehiculos::set_matricula(char* matricula){
    strcpy(this->matricula,matricula);

}
char *Vehiculos::get_matricula(){
    return matricula;
}
/*************************** Camion ****************/
camion::camion(){
    carga = 1000;

}
camion::camion(char,int){
   strcpy(this->marca,"Vacio");

    //Por defecto no inicializo con el año mas nuevo 
    modelo = 2021;

}
camion::~camion(){
    cout<<endl<<"Adios mundo cruel..."<<"Camion"<<endl;   

}
void camion::set_carga(int carga){
    this->carga = carga;

}
int camion::get_carga(){
    return carga;

}
void camion::set_marca(char * marca){
    strcpy(this->marca,marca);
}
char* camion::get_marca(){
    return marca;

}
void camion::mostrar(){

}
void camion::set_modelo(int modelo){
    this->modelo = modelo;



}
int camion::get_modelo(){
    return modelo;

}


/*************************** Carros ****************/
carro::carro(){
   strcpy(marca , "Vacio");


}
carro::carro(int){
   strcpy(this->marca,"Vacio");

    //Por defecto no inicializo con el año mas nuevo 
    modelo = 2021;

}
carro::~carro(){
    cout<<endl<<"Adios mundo cruel..."<<"Carros"<<endl;   

}
/*
void carro::set_tipo(tipo t){

}
*/
/*
enum carro::  tipo get_tipo(){

}
*/
void carro::set_marca(char * marca){
    strcpy(this->marca,marca);
}
char* carro::get_marca(){
    return marca;

}
void carro::set_modelo(int modelo){
    this->modelo = modelo;



}
int carro::get_modelo(){
    return modelo;

}
void carro::mostrar(){

}
