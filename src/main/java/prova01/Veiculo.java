/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova01;

/**
 *
 * @author a1591
 */
public class Veiculo{
    
    //Atributos
    private String marca;
    private String modelo;
    private int ano;
    
    //Construtor
    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    //Funções
    public void exibirDetalhes(){
        System.out.println("Marca do Veiculo: "+ marca +" Modelo: " + modelo +" Ano: "+ ano);
    }
    
   
    // Getters e setters
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
   
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
   

    
}
