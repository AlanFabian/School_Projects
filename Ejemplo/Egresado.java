public class Egresado extends Alumno {
    String graduacion;
    public void setGraduacion(String graduacion){
        this.graduacion=graduacion;
    }
    public String getGraduacion(){
        return graduacion;
    }
    String area;
    float horas;
    float sueldo;
    String empresa;
    float salario;
    public void setArea(String area){
        this.area=area;
    }
    public String getArea(){
        return area;
    }
    public void setHoras(Float horas){
        this.horas=horas;
    }
    public Float getHoras(){
        return horas;
    }
    public void setSueldo(float sueldo){
        this.sueldo=sueldo;
    }
    public float getsueldo(){
        return sueldo;
    }
    public void setEmpresa(String empresa){
        this.empresa=empresa;
    }
    public String getEmpresa(){
        return empresa;

    }
    public void setSalario(float salario){
        this.salario=salario;
    }
    public float getSalario(){
        return salario;
    }


    public void Intercambio(int registro,String nombre,String domicilio,String carrera,Float promedio,int semestre,String graduacion){
    super.setRegistro(registro);
    super.setNombre(nombre);
    super.setDomicilio(domicilio);
    super.setCarrera(carrera);
    super.setPromedio(promedio);
    super.setSemestre(semestre);
    setGraduacion(graduacion);
    

}
public void CetiWorker(int registro,String nombre,String domicilio,String carrera,Float promedio,int semestre,String graduacion,String area,Float horas,Float sueldo){
    super.setRegistro(registro);
    super.setNombre(nombre);
    super.setDomicilio(domicilio);
    super.setCarrera(carrera);
    super.setPromedio(promedio);
    super.setSemestre(semestre);
    setGraduacion(graduacion);
    setArea(area);
    setHoras(horas);
    setSueldo(sueldo);
    

}
public void Industria(int registro,String nombre,String domicilio,String carrera,Float promedio,int semestre,String graduacion,String empresa,float salario){
    super.setRegistro(registro);
    super.setNombre(nombre);
    super.setDomicilio(domicilio);
    super.setCarrera(carrera);
    super.setPromedio(promedio);
    super.setSemestre(semestre);
    setGraduacion(graduacion);
    setEmpresa(empresa);
    setSalario(salario);
    

}

}
