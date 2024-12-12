/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade009.view;

/**
 *
 * @author a1591
 */
class Cubo extends FormaTridimensional {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return 6 * Math.pow(this.lado, 2);
    }

    @Override
    public double obterVolume() {
        return Math.pow(this.lado, 3);
    }

    @Override
    public String toString() {
        return "Cubo com lado: " + this.lado;
    }
}
