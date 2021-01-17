/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shahed.alienGame;

/**
 *
 * @author Sh. A. 
 */
public class SnakeAlien extends Alien {
    private static final int SNAKE_DAMAGE = 0;
    
    public SnakeAlien(int health, String name) {
        super( health, name);
    }
    
    public int getDamage(){
    return SNAKE_DAMAGE;
    }
    
}
