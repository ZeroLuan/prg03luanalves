/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade006.view;
import java.util.Scanner;

/**
 *
 * @author a1591
 */
public class ContaBanco {

    Scanner scanner = new Scanner(System.in);

    private int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    private String tipoTemp;
    private float saldoTemp;


    public ContaBanco(){
        this.numConta = 0;
        this.tipo = "";
        this.dono = "";
        this.saldo = 0f;
        this.status = false;

        this.tipoTemp = "";
        this.saldoTemp = 0f;
    }



    public void abrirConta(){

        System.out.print("Vamos Abrir Sua Conta !");
        this.status = true;

        System.out.println("Qual tipo de conta deseja abrir, cp ou cc ?");
        this.tipoTemp = scanner.nextLine();

        switch(tipoTemp){
            case "cp":
                this.tipo = this.tipoTemp;
                this.saldo = 150f;
                break;
            case "cc":
                this.tipo = this.tipoTemp;
                this.saldo = 50f;
                break;
            default:
                System.out.println("Não corresponde a nenhuma alternativa tente novamente, 'cp' ou 'cc' !");
                this.saldo = 0;
                this.tipo = "";
                this.status = false;
                break;
        }

    }

    public void fecharConta(){
        System.out.println("Vamos fechar sua conta !");

        if(saldo == 0){
            System.out.println("Sua Conta foi Fechada com Sucesso !");
        }else{
            System.out.println("Sua Conta Não Esta Apta Para Ser Fechada, Verifique o Saldo !");
        }
    }

    public void depositar(){
        if(!status){
            System.out.println("Ops ! Não Pode Fazer Deposito, Sua Conta Esta Como Status Falso !");
        }else{
            System.out.println("Qual o Valor do Deposito ?");
            this.saldoTemp = scanner.nextFloat();

            this.saldo += this.saldoTemp;
            System.out.println("Saldo atual apos depositar e : " + this.saldo);
        }
    }

    public void sacar(){
        if(!status){
            System.out.println("Ops ! Não Pode Sacar, Sua Conta Esta Como Status Falso !");
        }else{
            System.out.println("Qual o Valor Para Sacar ?");
             this.saldoTemp = scanner.nextFloat();

            if(saldo <= 0 || saldo < saldoTemp){
                System.out.println("Você Não Pode Sacar, Sua Conta Esta Com Saldo Insuficinte");
                System.out.println("Seu saldo atual e: " + this.saldo);
            }else{
                this.saldo -= this.saldoTemp;
                System.out.println("Seu Saldo ATUAL: " + saldo);
            }
        }

    }

    public void pagarMensal(){
        switch(tipo){
            case "cp":
                if(saldo < 20){
                    System.out.println("Saldo insuficiente para Pagar Mensal");
                }else{
                    this.saldo -= 20f;
                    System.out.println("O Saldo atual apos pagar mensalidade e: " + this.saldo);
                }
                break;
            case "cc":
                if(saldo < 12){
                    System.out.println("Saldo insuficiente para Pagar Mensal");
                }else{
                    this.saldo -= 12f;
                    System.out.println("O Saldo atual apos pagar mensalidade e: " + this.saldo);
                }
                break;
            default:
                System.out.println("Não corresponde a nenhuma alternativa tente novamente, 'cp' ou 'cc' !");
                this.saldo = 0;
                this.tipo = "";
                this.status = false;
                break;
        }
    }




    public int getNumConta(){
        return numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getDono(){
        return dono;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return status;
    }

    public void SetStatus(boolean status){
        this.status = status;
    }

    public String getTipoTemp() {
        return tipoTemp;
    }


    public void setTipoTemp(String tipoTemp) {
        this.tipoTemp = tipoTemp;
    }

    public float getSaldoTemp() {
        return saldoTemp;
    }

    public void setSaldoTemp(float saldoTemp) {
        this.saldoTemp = saldoTemp;
    }


}
