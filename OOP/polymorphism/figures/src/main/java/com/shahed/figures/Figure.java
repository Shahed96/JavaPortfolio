/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shahed.figures;

/**
 *
 * @author DELL
 */
public abstract class Figure {

    private int centerCoordinateX; //x

    private int centerCoordinateY; //y

    public Figure() {
        centerCoordinateX = 3;
        centerCoordinateY = 4;
    }
    //rest constructors .....
    
    
    
    
    

    public void center() {
        
        draw(centerCoordinateX,centerCoordinateY);
        erase();

    }

    public abstract void erase();

    public abstract void draw(int centerCoordinateX, int centerCoordinateY );
}
