/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package br.com.ifba.atividade006.view;

import java.util.Scanner;

/**
 * Classe que representa uma conta bancária.
 * Permite abrir, fechar, depositar, sacar e pagar mensalidades.
 * Também possui métodos para acessar e modificar os dados da conta.
 * 
 * @author a1591
 */
public class ContaBanco {

    // Instância do Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);

    // Atributos da classe
    public int numConta;   // Número da conta
    protected String tipo;    // Tipo da conta (cc - conta corrente, cp - conta poupança)
    private String dono;    // Nome do dono da conta
    private float saldo;    // Saldo atual da conta
    private boolean status; // Status da conta (aberta ou fechada)

    // Variáveis temporárias para armazenar tipo e saldo durante operações
    private String tipoTemp;
    private float saldoTemp;

    // Construtor padrão que inicializa a conta com valores padrão
    public ContaBanco(){
        this.numConta = 0;
        this.tipo = "";
        this.dono = "";
        this.saldo = 0f;
        this.status = false; // O metodo constutor serve para isso, inicializar um valor
        // veja que o "status" por obrigação deve ser inicializado como false 
        this.tipoTemp = "";
        this.saldoTemp = 0f;
    }

    // Método para abrir a conta bancária
    public void abrirConta(){
        System.out.print("Vamos Abrir Sua Conta !");
        this.status = true; // Definindo status da conta como aberta

        // Pergunta ao usuário o tipo de conta desejada
        System.out.println("Qual tipo de conta deseja abrir, cp ou cc ?");
        this.tipoTemp = scanner.nextLine(); // Lê a entrada do usuário

        // Atribui valores com base no tipo de conta escolhido
        switch(tipoTemp){
            case "cp":
                this.tipo = this.tipoTemp;
                this.saldo = 150f; // Conta poupança inicia com saldo de 150
                break;
            case "cc":
                this.tipo = this.tipoTemp;
                this.saldo = 50f; // Conta corrente inicia com saldo de 50
                break;
            default:
                // Caso o tipo informado não seja válido
                System.out.println("Não corresponde a nenhuma alternativa, tente novamente, 'cp' ou 'cc' !");
                this.saldo = 0;
                this.tipo = "";
                this.status = false;
                break;
        }
    }

    // Método para fechar a conta bancária
    public void fecharConta(){
        System.out.println("Vamos fechar sua conta !");

        if(saldo == 0){
            System.out.println("Sua Conta foi Fechada com Sucesso !");
        }else{
            System.out.println("Sua Conta Não Está Apta Para Ser Fechada, Verifique o Saldo !");
        }
    }

    // Método para depositar um valor na conta
    public void depositar(){
        if(!status){
            // Verifica se a conta está aberta
            System.out.println("Ops ! Não Pode Fazer Depósito, Sua Conta Está Como Status Falso !");
        }else{
            System.out.println("Qual o Valor do Depósito ?");
            this.saldoTemp = scanner.nextFloat(); // Lê o valor do depósito

            this.saldo += this.saldoTemp; // Atualiza o saldo
            System.out.println("Saldo atual após depósito é: " + this.saldo);
        }
    }

    // Método para sacar um valor da conta
    public void sacar(){
        if(!status){
            // Verifica se a conta está aberta
            System.out.println("Ops ! Não Pode Sacar, Sua Conta Está Como Status Falso !");
        }else{
            System.out.println("Qual o Valor Para Sacar ?");
            this.saldoTemp = scanner.nextFloat(); // Lê o valor a ser sacado

            if(saldo <= 0 || saldo < saldoTemp){
                // Verifica se há saldo suficiente
                System.out.println("Você Não Pode Sacar, Sua Conta Está Com Saldo Insuficiente");
                System.out.println("Seu saldo atual é: " + this.saldo);
            }else{
                this.saldo -= this.saldoTemp; // Atualiza o saldo após o saque
                System.out.println("Seu Saldo ATUAL: " + saldo);
            }
        }
    }

    // Método para pagar a mensalidade dependendo do tipo de conta
    public void pagarMensal(){
        switch(tipo){
            case "cp":
                if(saldo < 20){
                    System.out.println("Saldo insuficiente para Pagar Mensal");
                }else{
                    this.saldo -= 20f; // Deduz a mensalidade da conta poupança
                    System.out.println("O Saldo atual após pagar mensalidade é: " + this.saldo);
                }
                break;
            case "cc":
                if(saldo < 12){
                    System.out.println("Saldo insuficiente para Pagar Mensal");
                }else{
                    this.saldo -= 12f; // Deduz a mensalidade da conta corrente
                    System.out.println("O Saldo atual após pagar mensalidade é: " + this.saldo);
                }
                break;
            default:
                System.out.println("Não corresponde a nenhuma alternativa, tente novamente, 'cp' ou 'cc' !");
                this.saldo = 0;
                this.tipo = "";
                this.status = false;
                break;
        }
    }

    // Métodos Getter e Setter para acessar e modificar os atributos da classe

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

    public void setStatus(boolean status){
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
