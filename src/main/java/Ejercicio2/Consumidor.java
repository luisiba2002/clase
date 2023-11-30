/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Diurno
 */
public class Consumidor extends  Thread{
    String numero;
    
    public void run(){
        //hola mundo
        
        System.out.println(numero);
    
}
    public void setNum(String numero){
        this.numero=numero;
    }
}
