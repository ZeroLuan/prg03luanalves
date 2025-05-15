/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author a1591
 */
public class PagamentoDinheiro implements IPagamento{
    
    public double valor;
    
    public PagamentoDinheiro(){
        
    }
    
    public PagamentoDinheiro(double valor){
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        return valor * 0.90; // 10% de Desconto !!
    }

    @Override
    public void imprimirRecibo() {
        System.out.println(
        "========================================\n" +
        "           RECIBO DE PAGAMENTO          \n" +
        "========================================\n" +
        "Forma de pagamento : Dinheiro\n" +
        "Valor original     : R$ " + String.format("%.2f", valor) + "\n" +
        "Desconto (10%)     : R$ " + String.format("%.2f", valor * 0.10) + "\n" +
        "Total a pagar      : R$ " + String.format("%.2f", calcularTotal()) + "\n" +
        "========================================"
    );
    }
    
    @Override
    public String gerarRecibo() {
        return (
            "===== RECIBO DE PAGAMENTO =====\n" +
            "Forma de pagamento: Dinheiro\n" +
            "Valor original    : R$ " + String.format("%.2f", valor) + "\n" +
            "Desconto (10%)    : R$ " + String.format("%.2f", valor * 0.10) + "\n" +
            "Total a pagar      : R$ " + String.format("%.2f", calcularTotal()) + "\n" +
            "================================"
        );
    }
    
    
    public double getValor() {
        return valor;
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }
}
