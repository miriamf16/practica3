package org.primitivos;

import java.util.ArrayList;

public class Triangulo extends Figura {

    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double anguloA;
    private double anguloB;
    private double anguloC;


    Triangulo(String nombre,double ladoA,double ladoB,double ladoC) {
        super(nombre);
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;
        this.anguloA=0;
        this.anguloB=0;
        this.anguloC=0;
        this._coordenadas= new ArrayList<Puntos>();
        this.es_valido=this.ValidarTriangulo();
    }

    private boolean ValidarTriangulo(){
        return ((this.ladoA + this.ladoB > this.ladoC) && (this.ladoB+ this.ladoC > this.ladoA) && (this.ladoA + ladoC > this.ladoB));
    }

    public void Dibujar(MiCanvas donde){
        super.Dibujar(donde);
        System.out.println("Dibujar-Triangulo");
    }

    public void CalcularAngulos() {
        double anguloA =( Math.pow(this.ladoA,2)-Math.pow(this.ladoB,2)-Math.pow(this.ladoC,2)) / (-2*this.ladoB* this.ladoC);
        this.anguloA= Math.acos(anguloA
    }
}
