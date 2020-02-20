package org.primitivos;

import java.util.List;

public class Figura {

    private String nombre;
    protected boolean es_valido;
    /*para que la lista se guarde las coordenadas*/
    protected List<Puntos> _coordenadas;


    Figura(String nombre){
        this.nombre=nombre;
        this.es_valido=false;
    }

    public boolean EsValido(){

        return this.es_valido;
    }

    public void Dibujar(MiCanvas donde){

        System.out.println("dibujar-figura");
    }

}
