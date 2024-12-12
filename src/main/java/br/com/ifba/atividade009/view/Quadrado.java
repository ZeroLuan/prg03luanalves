/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade009.view;

/**
 *
 * @author a1591
 */
class Quadrado extends FormaBidimensional {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return Math.pow(this.lado, 2);
    }

    @Override
    public String toString() {
        return "Quadrado com lado: " + this.lado;
    }
}
