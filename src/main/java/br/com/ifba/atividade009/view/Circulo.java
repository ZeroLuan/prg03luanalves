/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade009.view;

/**
 *
 * @author a1591
 */
class Circulo extends FormaBidimensional {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public String toString() {
        return "Círculo com raio: " + this.raio;
    }
}
