/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author a1591
 */
public interface IPagamento {
    
    // Calcular o pagamento 
    public double calcularTotal();
    
    // Gera o texto do recibo
    public String gerarRecibo();
    
    // Imprime o recibo
    public void imprimirRecibo();
    
    // Implementa o set obrigatorio
    void setValor(double valor);
    
    
}
