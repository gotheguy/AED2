package Dominio;


public class Silo 
{
    private String nombre;
    private int capacidad;
    private int capacidadoriginal;

    
    
    public Silo(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.capacidadoriginal = capacidad;
    }

    public Silo() {
        this.nombre = null;
        this.capacidad = 0;
        this.capacidadoriginal = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidadoriginal() {
        return capacidadoriginal;
    }

    public void setCapacidadoriginal(int capacidadoriginal) {
        this.capacidadoriginal = capacidadoriginal;
    }
    
    
    
}
