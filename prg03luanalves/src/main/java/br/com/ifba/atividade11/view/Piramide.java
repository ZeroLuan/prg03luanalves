/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author a1591
 */
public class Piramide extends Forma3D {
    
    private double base;
    private double altura;

    public Piramide(double base, double altura) {
        super("Piramide");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        // Aproximação: apenas base quadrada
        return base * base; // Só a base
    }

    @Override
    public double obterVolume() {
        return (base * base * altura) / 3;
    }

    @Override
    public String toString() {
        return super.toString() + " | Base: " + base + " | Altura: " + altura;
    }
    
}

