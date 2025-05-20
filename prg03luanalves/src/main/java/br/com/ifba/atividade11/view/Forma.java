/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.view;

/**
 *
 * @author Luan Alves
 */
public abstract class Forma {
    
    protected String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double obterArea();
    public abstract double obterVolume();

    @Override
    public String toString() {
        return "Forma: " + nome;
    }
}
