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

    private  Alien[] aliens;  //composition 

    //cons with para of array size 
    public AlienPack(int numAliens) {
        aliens = new Alien [numAliens]; //create the array 
    }

    public void addAlien(Alien newAlien, int index) {
        aliens[index] = newAlien;
    }

    public Alien[] getAliens() {
        return aliens;
    }

    public int calculateDamage() {
       int damage = 0; 
    for (int i=0; i<aliens.length; i++)            
      damage += aliens[i].getDamage();            
    return damage; 
    }
}
