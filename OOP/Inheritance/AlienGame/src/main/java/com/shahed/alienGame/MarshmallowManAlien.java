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
public class MarshmallowManAlien extends Alien {

    private static final int MARSHMALLOW_MAN_ALIEN_DAMAGE = 2;

    public MarshmallowManAlien(int health, String name) {
        super(health, name);
    }

    public int getDamage() {
        return MARSHMALLOW_MAN_ALIEN_DAMAGE;
    }
}
