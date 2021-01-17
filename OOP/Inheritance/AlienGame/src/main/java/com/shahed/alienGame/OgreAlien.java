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
public class OgreAlien extends Alien {

    private static final int OGRE_ALIEN_DAMAGE = 1;

    public OgreAlien(int health, String name) {
        super(health, name);
    }

    public int getDamage() {
        return OGRE_ALIEN_DAMAGE;
    }
}
