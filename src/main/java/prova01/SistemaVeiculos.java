/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova01;

/**
 *
 * @author a1591
 */
public class SistemaVeiculos {

    public static void main(String[] args) {

       Carro carro = new Carro("", "", "", 0);
       carro.setNomeCarro("CAR");
       carro.setMarca("BMW");
       carro.setModelo("M3");
       carro.setAno(2025);
       

       carro.exibirDetalhes();
       
       Moto motinha = new Moto("","","", 0);
       motinha.setMarca("Honda");
       motinha.setModelo("pop 100");
       motinha.setAno(2025);
       motinha.setNomeMoto("MOT");
       
       motinha.exibirDetalhes();
  
       

    }

}