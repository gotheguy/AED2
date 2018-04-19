package Dominio;


public class Plantacion 
{

    private int capacidad;
    private String nombre;
    private Productor propietario;

    
    public Plantacion(String nombre, Productor propietario, int capacidad) {
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.propietario = propietario;
    }

    public Plantacion() {
        this.capacidad = 0;
        this.nombre = null;
        this.propietario = null;
    }


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Productor getPropietario() {
        return propietario;
    }

    public void setPropietario(Productor propietario) {
        this.propietario = propietario;
    }
    
    
       
    
    
}
