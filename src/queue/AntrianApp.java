/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author User
 */
public class AntrianApp {
    public static void main(String[] args){
        Antrian antrian = new Antrian(10);
        antrian.enqueue(40);
        antrian.display();
        antrian.enqueue(33);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        antrian.enqueue(60);
        antrian.display();
        System.out.println("yang diambil dari Antrian = " + antrian.dequeue());
        antrian.display();
        System.out.println("yang diambil dari Antrian = " + antrian.dequeue());
        antrian.display();
        antrian.enqueue(54);
        antrian.display();
        System.out.println("nilai yang paling depan  = " + antrian.peek());
    }
}
