/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author a1591
 */
public class PagamentoCartao implements IPagamento{
    
    public double valor;
    
    public PagamentoCartao(){
    }
        
    public PagamentoCartao(double valor){
        this.valor = valor;
    }
    
    
   
    @Override
    public double calcularTotal() {
        return this.valor * 1.05; // 5% de Taxa
    }

    @Override
    public void imprimirRecibo() {     
        System.out.println(
        "===== RECIBO DE PAGAMENTO =====\n" +
        "Forma de pagamento: Cartao\n" +
        "Valor original     : R$ " + String.format("%.2f", valor) + "\n" +
        "Taxa (5%)          : R$ " + String.format("%.2f", valor * 0.05) + "\n" +
        "Total a pagar      : R$ " + String.format("%.2f", calcularTotal()) + "\n" +
        "================================"
    );
    }
    
    @Override
    public String gerarRecibo() {
        return (
            "===== RECIBO DE PAGAMENTO =====\n" +
            "Forma de pagamento: Cartao\n" +
            "Valor original     : R$ " + String.format("%.2f", valor) + "\n" +
            "Taxa (5%)          : R$ " + String.format("%.2f", valor * 0.05) + "\n" +
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
