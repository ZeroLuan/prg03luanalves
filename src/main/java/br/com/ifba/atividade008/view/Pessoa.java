/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade008.view;

/**
 *
 * @author a1591
 */
public class Pessoa {

    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(){
        this.nome = "";
        this.idade = 0;
        this.sexo = 'M';
    }

    public void fazerAniversario(String nome, int idade, char sexo){
        System.out.printf("Parabens %s, você completou %d, seu sexo é %c", nome, idade, sexo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public char getSexo() {
        return sexo;
    }

}