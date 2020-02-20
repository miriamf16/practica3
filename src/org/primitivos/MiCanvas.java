package org.primitivos;

import javax.swing.*;
import java.awt.*;

public class MiCanvas extends JComponent {

    private Triangulo un_tringulo;
    private Circulo un_circulo;


    public void init(){
        this.un_circulo = new Circulo("circulo",50);
        this.un_triangulo = new Triangulo("triangulo",30,30,50);
    }
    @Override
    public void update(Graphics g){
        paint(g);
    }

    @Override
    public void paintComponent(Graphics g ){

    }



}
