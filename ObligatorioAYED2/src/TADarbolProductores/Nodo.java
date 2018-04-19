package TADarbolProductores;

import Dominio.Productor;

public class Nodo {
    
    //Atributos
    private Productor dato;
    private Nodo der ;
    private Nodo izq ;

    
    //Constructores
    public Nodo(Productor p){
        dato = p;
        izq = null;
        der = null;
     }

    public Nodo(Productor p, Nodo i, Nodo d){
        dato = p;
        izq = i;
        der = d;
     }

    public Nodo() {
        dato = null;
        izq = null;
        der = null;
    }

    
    
    
    //Dato
    public Productor getDato(){
        return dato;
    }
    
    
    void setDato(Productor p){
        dato = p;
    }
    
    //Derecho
    public Nodo getDer(){
        return der;
    }
    
    
    void setDer(Nodo d){
       der = d;
    }
    
    //Izquierdo
    public Nodo getIzq(){
        return izq;
    }
    void setIzq(Nodo i){
        izq = i;
    }

    
    public String mostrarNodo() {
        String ret = "";
        
        if(this.izq != null)
        {
            ret += this.izq.mostrarNodo() + "|";
        }
        
        ret += this.dato.getCedula() + ";" + this.dato.getNombre() + ";" + this.dato.getCelular();
        
        if(this.der != null)
        {
            ret += "|" + this.der.mostrarNodo(); 
        }
        
        return ret;
    }
    
    
    
    
}
