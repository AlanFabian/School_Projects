

public class Irregular extends Alumno{
    String materia;
    float calificacion;
    float calificacion2;
    float calificacion3;
    String justificacion;
    public void setMateria(String materia){
        this.materia=materia;

    }
    public String getMateria(){
        return materia;
    }
    public void setCalificacion(float calificacion){
        this.calificacion=calificacion;

    }
    public float getCalificacion(){
        return calificacion;
    }
    public void setCalificacion2(float calificacion2){
        this.calificacion2=calificacion2;

    }
    public float getCalificacion2(){
        return calificacion2;
    }
    public void setCalificacion3(float calificacion3){
        this.calificacion3=calificacion3;

    }
    public float getCalificacion3(){
        return calificacion3;
    }
    public void setJustificacion(String justificacion){
        this.justificacion=justificacion;
    }
    public String getJustificacion(){
        return justificacion;
    }
    

 
public void Intercambio(int registro,String nombre,String domicilio,String carrera,Float promedio,int semestre,String materia,float calificacion){
    super.setRegistro(registro);
    super.setNombre(nombre);
    super.setDomicilio(domicilio);
    super.setCarrera(carrera);
    super.setPromedio(promedio);
    super.setSemestre(semestre);
    setMateria(materia);
    setCalificacion(calificacion);

}
 

}