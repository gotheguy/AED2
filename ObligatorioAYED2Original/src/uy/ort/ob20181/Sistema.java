package uy.ort.ob20181;

import TADABBPalabras.Arbol;
import uy.ort.ob20181.Retorno.Resultado;

public class Sistema implements ISistema {
    
    private Arbol palabras;

    
    public Arbol getPalabras() {
        return palabras;
    }

    public void setPalabras(Arbol palabras) {
        this.palabras = palabras;
    }
 

    //PRE CONDICIONES: Se recibe la cantidad máxima de palabras a almacenar (maxPalabras). "MaxPalabras" debe ser un entero.
    //POS CONDICIONES: Retorna ERROR_1 si maxPalabras <= 0, u OK si maxPalabras > 0 y se crearon las estructuras correspondientes.  
    @Override
    public Retorno inicializarSistema (int maxPalabras) {

        Retorno ret = new Retorno();

        ret.resultado = Resultado.NO_IMPLEMENTADA;
        ret.valorString = "NO_IMPLEMENTADA";

        //Error 1 si maxPalabras es menor o igual a 0.
        if (maxPalabras <= 0)
        {
            ret.resultado = Resultado.ERROR_1;
            ret.valorString = "ERROR_1";
        }
        else
        {
            //Arbol de palabras
            this.palabras = new Arbol();


            ret.resultado = Resultado.OK;
            ret.valorString = "OK";
        }

        return ret;   

    }

    
    
    //PRE CONDICIONES: Se consideran creadas todas las estructuras
    //POS CONDICIONES: Se devuelve OK, si se logró eliminar correctamente
    @Override
    public Retorno destruirSistema() {
        Retorno ret = new Retorno();

        //Desreferenciar arbol de palabras
        if (!palabras.esArbolVacio())
            palabras = null;
        
        
        //Indico que quiero que pase el Garbage Collector
        System.gc();
        
    
        ret.resultado = Resultado.OK;
        ret.valorString = "OK";
        
        return ret;
            
    }
    

    public Retorno analizarTexto(String texto) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    public Retorno rankingPalabras(int n) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    public Retorno aparicionesPalabra(String palabra) {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }

    public Retorno todasPalabras() {
        return new Retorno(Resultado.NO_IMPLEMENTADA);
    }
	
}
