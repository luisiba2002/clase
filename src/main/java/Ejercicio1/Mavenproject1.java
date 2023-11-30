/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        try {
            Process Pr = Runtime.getRuntime().exec("cmd /k ver"); 
            BufferedReader Br = new BufferedReader(new InputStreamReader(Pr.getInputStream()));
            String linea = "";
            while ((linea=Br.readLine()) != null) {                
                System.out.println(linea);
            }
                } catch (IOException ex) {
            Logger.getLogger(Mavenproject1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
