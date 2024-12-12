/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade009.view;

/**
 *
 * @author a1591
 */
public class TesteFormas {
    public static void main(String[] args) {
        Forma[] formas = {
            new Circulo(3),
            new Quadrado(4),
            new Cubo(2),
            new Esfera(5)
        };

        for (Forma forma : formas) {
            System.out.println(forma);
            if (forma instanceof FormaBidimensional) {
                FormaBidimensional bidimensional = (FormaBidimensional) forma;
                System.out.println("Área: " + bidimensional.obterArea());
            } else if (forma instanceof FormaTridimensional) {
                FormaTridimensional tridimensional = (FormaTridimensional) forma;
                System.out.println("Área: " + tridimensional.obterArea());
                System.out.println("Volume: " + tridimensional.obterVolume());
            }
            System.out.println();
        }
    }
}
