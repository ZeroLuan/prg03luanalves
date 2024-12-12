/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova01;

/**
 *
 * @author a1591
 */
public class Carro extends Veiculo implements Motorizado{
    
    private String nomeCarro;
    
    //Construtor
    public Carro(String nomeCarro, String marca, String modelo, int ano){
        super(marca, modelo, ano);
        this.nomeCarro = nomeCarro;
    }
    
    
    //Funções
    @Override
    public void exibirDetalhes(){
        System.out.println("Nome do Carro: "+ this.getNomeCarro() +
                           "  Marca do Carro: "+ this.getMarca() +
                           "  Modelo: " + this.getModelo() +
                           "  Ano: "+ this.getAno()+
                           "  Potencia: " + this.getPotencia() + "CV");
    }
    
    
    public int getPotencia(){
        return 980;
    }
    
    // Getters e setters
    
    public String getNomeCarro(){
        return nomeCarro;
    }
    
    public void setNomeCarro(String nomeCarro){
        this.nomeCarro = nomeCarro;
    }
}
