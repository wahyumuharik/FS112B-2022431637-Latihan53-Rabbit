/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan53.Rabbit;

/**
 *
 * @author 
 * NAMA              : Wahyu Muharik
 * KELAS             : FS112B
 * NIK               : 2022431637
 * Deskripsi Program : Program Untuk Mendeskripsikan Kelinci Dengan Menggunakan 
 *                     Konsep Inheritance, Polymorphism dan Constructor
 */
public class Main {
    public static void main(String[]args){
        Rabbit r = new Rabbit("Peter",false,"grass",4,"grey");
        System.out.println("Hello, His name is " + r.getName());
        System.out.println(r.getName()+" is Vegetarian? " + r.vegetarian);
        System.out.println(r.getName()+" eats " + r.getEats());
        System.out.println(r.getName()+" has " + r.getNoOfLegs() + " legs");
        System.out.println(r.getName()+" color is " + r.getColor());
    }
}
