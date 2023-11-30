/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author KIKO
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Crono extends Thread {

    private int minutos;
    private int segundos;
    private JLabel label;
    private JLabel labelNombre;
    private boolean enEjecucion;
    private boolean waitVal = false;
    private String nombre;
    private int tiempomax;
    private int id;

    public Crono(String nombre, int tiempomax, int id) {
        this.nombre = nombre;
        this.minutos = 0;
        this.segundos = 0;
        this.tiempomax = tiempomax;
        this.id = id;

        this.labelNombre = new JLabel(String.format(nombre));
        this.labelNombre.setFont(new Font("Arial", Font.BOLD, 40));

        this.label = new JLabel(String.format("%02d:%02d", minutos, segundos));
        this.label.setFont(new Font("Arial", Font.PLAIN, 24));

        JFrame frame = new JFrame("Cronómetro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(3, 1));

        JPanel panelNombre = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelNombre.add(labelNombre);

        JPanel panelTiempo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelTiempo.add(label);

        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton boton = new JButton("BOTÓN");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panelBoton.add(boton);

        frame.add(panelNombre);
        frame.add(panelTiempo);
        frame.add(panelBoton);

        //frame.add(labelNombre);
        //frame.add(label);
        frame.setSize(300, 250);
        frame.setLocation(100, 100);
        frame.setVisible(true);

        enEjecucion = true;

    }

    public void run() {
        enEjecucion = true;
        while (enEjecucion) {

            if (segundos == 59) {
                minutos++;
                segundos = 0;
            } else {
                segundos++;
            }

            label.setText(String.format("%02d:%02d", minutos, segundos));
            try {
                Thread.sleep(10); // Espera un segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (minutos == tiempomax) {
                label.setForeground(Color.RED);
                break;
            }
        }
    }

    public void pararCronometro() {
        enEjecucion = false;
    }
    public void reanudarCronometro() {
        enEjecucion = true;
    }

}
