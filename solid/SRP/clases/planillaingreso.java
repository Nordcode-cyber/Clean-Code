package solid.SRP.clases;

import java.util.Date;

public class planillaingreso extends Empleado {
    /*
     * Single Responsability Principle
     */
    protected Date fecha;
    protected Date hora;
   
    public planillaingreso(String nombre, String apellido,int edad, Date fecha, Date hora){
    super(nombre,apellido,edad);
    /*this todos los objetos de la superclase primero */
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.fecha=fecha;
    this.hora=hora;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Date getHora() {
        return hora;
    }
    public void setHora(Date hora) {
        this.hora = hora;
    }
    public planillaingreso(){
        
    }
    
}
