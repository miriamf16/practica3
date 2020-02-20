package org.primitivos;

import javax.swing.*;

public class Main {
    public static void main(String[] args){

        Circulo mi_circulo= new Circulo("circulo1",50.0);
        Triangulo mi_triangulo = new Triangulo("triangulo1",30,30,50);

        if(mi_circulo.EsValido()){
            mi_circulo.Dibujar(new MiCanvas());
        }

        if(mi_triangulo.EsValido()){
            mi_triangulo.Dibujar(new MiCanvas());
        }

        MiCanvas canvas = new MiCanvas();
        JFrame ventana = new JFrame();
        ventana.getContentPane().add(canvas);
        ventana.setSize(400,400);
        ventana.setVisible(true);
        //macro.pack();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
