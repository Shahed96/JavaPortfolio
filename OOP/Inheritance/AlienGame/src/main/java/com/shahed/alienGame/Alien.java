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
 abstract class Alien {

    private int health; // 0=dead, 100=full strength
    private String name;

    public Alien(int health, String name) {
        setHealth(health);
        setName(name);
    }

    public void setHealth(int health) {
        if (health <= 0 && health >= 100) {
            this.health = health;
        }
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public abstract int getDamage();
}
