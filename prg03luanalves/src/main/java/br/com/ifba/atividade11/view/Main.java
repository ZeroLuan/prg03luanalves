/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author a1591
 */
public class Main {
    
    public static void main(String args[]){
        
        Forma[] formas = new Forma[] {
            new Circulo(5),
            new Quadrado(4),
            new Triangulo(3, 6),
            new Esfera(2.5),
            new Cubo(3),
            new Piramide(4, 9)
        };

        for (Forma forma : formas) {
            System.out.println(forma.toString());

            if (forma instanceof Forma2D) {
                System.out.println("Area: " + forma.obterArea());
            } else if (forma instanceof Forma3D) {
                System.out.println("Area: " + forma.obterArea());
                System.out.println("Volume: " + forma.obterVolume());
            }

            System.out.println("----------");
        }
    } 
}
