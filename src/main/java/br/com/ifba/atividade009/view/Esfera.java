/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade009.view;

/**
 *
 * @author a1591
 */
class Esfera extends FormaTridimensional {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return 4 * Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public double obterVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(this.raio, 3);
    }

    @Override
    public String toString() {
        return "Esfera com raio: " + this.raio;
    }
}
