public class Alumno {
 
    public void setRegistro(int registro){
        this.registro=registro;

    }
    public int getRegistro(){
        return registro;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;

    }
    public void setDomicilio(String domicilio){
        this.domicilio=domicilio;
    }
    public String getDomicilio(){
        return domicilio;

    }
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
    public String getCarrera(){
        return carrera;
    }
    public void setPromedio(float promedio){
        this.promedio=promedio;
    }
    public float getPromedio(){
        return promedio;
    }
    public void setSemestre(int semestre){
        this.semestre=semestre;

    }
    public int getSemestre(){
        return semestre;
    }

int registro;
String nombre;
String domicilio;
String  carrera;
float promedio;
int semestre;
 

}