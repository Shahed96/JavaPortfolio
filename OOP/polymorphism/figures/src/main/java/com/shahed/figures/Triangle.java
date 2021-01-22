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
public class Triangle extends Figure{
    
   /* public Triangle (){
    
    }*/
    @Override
    public void erase (){
    System.out.println ("erase in Triangle ");
    }
    @Override
    public void draw (int x, int y){
        System.out.println ("draw in Triangle ");

    }
    
}
