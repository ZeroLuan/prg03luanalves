/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author a1591
 */
public class PagamentoPix implements IPagamento{
    
    public double valor;
    
    public PagamentoPix(){
    }
    
    public PagamentoPix(double valor){
        this.valor = valor;
    }

    @Override
    public double calcularTotal() {
        return valor * 0.98; // 2% de Cashback
    }

    @Override
    public void imprimirRecibo() {
        System.out.println(
        "========================================\n" +
        "           RECIBO DE PAGAMENTO          \n" +
        "========================================\n" +
        "Forma de pagamento : Pix\n" +
        "Valor original     : R$ " + String.format("%.2f", valor) + "\n" +
        "Cashback (2%)      : R$ " + String.format("%.2f", valor * 0.02) + "\n" +
        "Total a pagar      : R$ " + String.format("%.2f", calcularTotal()) + "\n" +
        "========================================"
    );
    }
    
    @Override
    public String gerarRecibo() {
        return (
            "========================================\n" +
            "           RECIBO DE PAGAMENTO          \n" +
            "========================================\n" +
            "Forma de pagamento : Pix\n" +
            "Valor original     : R$ " + String.format("%.2f", valor) + "\n" +
            "Cashback (2%)      : R$ " + String.format("%.2f", valor * 0.02) + "\n" +
            "Total a pagar      : R$ " + String.format("%.2f", calcularTotal()) + "\n" +
            "========================================"
        );
    }
    
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
