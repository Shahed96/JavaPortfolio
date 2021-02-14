/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreachwitharraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Walter Savitch
 */
public class ForEachWithArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ArrayList of 20 String 
        ArrayList<String> toDoList = new ArrayList<String>(20);
        System.out.println("Enter your list, when prompted");
        boolean done = false;
        String next = null;
        String answear;
        Scanner keyboard = new Scanner(System.in);
        while (!done) {
            System.out.println("input an entry:");
            next = keyboard.nextLine();
            toDoList.add(next);
            System.out.println("More item to the list?");
            answear = keyboard.nextLine();
            if (!(answear.equalsIgnoreCase("yes"))) {
                done = true;
            }
        }
        System.out.println("The list contains: ");
        for (String elements : toDoList) {
            System.out.println(elements);
        }
    }

}
