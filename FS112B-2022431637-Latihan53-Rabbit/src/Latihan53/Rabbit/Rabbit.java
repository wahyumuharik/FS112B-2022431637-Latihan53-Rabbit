/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan53.Rabbit;

/**
 *
 * @author Wahyu Muharik
 */
public class Rabbit extends Animal {
   private String color, name;
   
   public Rabbit(String name, boolean veg, String food, int legs, String color) {
      super(name, veg, food, legs, color);
      this.name = name;
      this.color = food;
   }
   
   public String getColor(){
       return color;
   }
   
   public String getName(){
       return name;
   }
}
