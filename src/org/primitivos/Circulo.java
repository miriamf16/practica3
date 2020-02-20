package org.primitivos;

import java.util.ArrayList;

public class Circulo extends Figura {

    private double radio;


    Circulo(String nombre,double radio) {
        super(nombre);
        this.radio = radio;
        this.es_valido=this.ValidarCirculo();
        this._coordenadas= new ArrayList<Puntos>();

    }

    private boolean ValidarCirculo(){
        return (this.radio > 0 );
    }

    public double CalcularArea(){
        return Math.PI*(this.radio*this.radio);
    }

    public double CalcularPerimetro(){
        return((2* Math.PI)*this.radio);
    }

    public void Dibujar(MiCanvas donde){
        super.Dibujar(donde);
        System.out.println("Dibujar-Circulo");
    }

    /*Pintar*/


}
