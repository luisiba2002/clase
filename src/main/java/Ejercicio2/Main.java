/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import javax.sound.sampled.Port;

/**
 *
 * @author Diurno
 */
public class Main {
    public static void main(String[] args) {
        Productor p1 = new Productor();
        p1.start();
        Cola c1 = new Cola();
        c1.put(1);
        Consumidor cn1 = new Consumidor();
        
        
        for (int i = 0; i < 10; i++) {
        c1.put(i);
        cn1.setNum(c1.get()+"");
        cn1.start();
        }
    }
}
