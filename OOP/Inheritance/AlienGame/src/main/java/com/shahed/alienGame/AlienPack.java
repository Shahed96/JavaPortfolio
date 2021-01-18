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
public class AlienPack {

    private Alien[] aliens;  //composition (array of a class type)

    //cons with para of array size 
    public AlienPack(int numAliens) {
        aliens = new Alien[numAliens]; //create the array 
    }

    public void addAlien(Alien newAlien, int index) {
        aliens[index] = newAlien;
    }

    public Alien[] getAliens() {
        return aliens;
    }

    public int calculateDamage() {
        int damage = 0;
        for (int i = 0; i < aliens.length; i++) {
            damage += aliens[i].getDamage();    //getDamage of each alien type will determined in the 
        }                                             //run time because of late binding
        return damage;
    }
}
