/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova01;

/**
 *
 * @author a1591
 */
public class Moto extends Veiculo implements Motorizado{
    
    //Atributo
    private String nomeMoto;
    
    //Construtor
    public Moto(String nomeMoto, String marca, String modelo, int ano){
        super(marca, modelo, ano);
        this.nomeMoto = nomeMoto;
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.println("Nome da Moto: "+ this.getNomeMoto() +
                           "  Marca do Moto: "+ this.getMarca() +
                           "  Modelo: " + this.getModelo() +
                           "  Ano: "+ this.getAno()+
                           "  Potencia: " + this.getPotencia() + "CV");
    }
    
    //Funções
    public int getPotencia(){
        return 5;
    }
    
    // Getters e setters
    
    public String getNomeMoto(){
        return nomeMoto;
    }
    
    public void setNomeMoto(String nomeMoto){
        this.nomeMoto = nomeMoto;
    }
    
    
}
