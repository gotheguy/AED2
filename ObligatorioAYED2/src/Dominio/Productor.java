
package Dominio;


public class Productor 
{
    private String cedula;
    private String nombre;
    private String direccion;
    private String email;
    private String celular;

    public Productor(String cedula, String nombre, String direccion, String email, String celular) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.celular = celular;
    }

    public Productor() {
        this.cedula = null;
        this.nombre = null;
        this.direccion = null;
        this.email = null;
        this.celular = null;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
    
    
}
