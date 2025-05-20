/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author Luan 
 */
public abstract class Forma2D extends Forma {
    public Forma2D(String nome) {
        super(nome);
    }

    @Override
    public double obterVolume() {
        return 0.0; // Formas 2D não têm volume
    }
}
