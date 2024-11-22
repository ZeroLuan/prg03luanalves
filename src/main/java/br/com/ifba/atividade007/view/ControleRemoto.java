/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade007.view;

/**
 *
 * @author a1591
 */

public class ControleRemoto {

    // Atributo que controla o volume do controle remoto
    private int volume;
    // Atributo que indica se o controle remoto está ligado
    private boolean ligado;
    // Atributo que indica se o controle remoto está desligado (não usado neste código)
    private boolean desligado;

    // Método que liga o controle remoto
    public void ligar() {
        this.ligado = true;
    }

    // Método que desliga o controle remoto
    public void desligar() {
        this.ligado = false;
    }

    // Método para abrir o menu do controle remoto e ligar o dispositivo
    public void abrirMenu() {
        this.ligado = true;
        System.out.println("Ligado, Menu Aberto");
    }

    // Método para fechar o menu e desligar o dispositivo
    public void fecharMenu() {
        this.ligado = false;
        System.out.println("Fechado, Menu Desligado");
    }

    // Método que aumenta o volume em 10 unidades
    public void maisVolume() {
        this.setVolume(this.getVolume() + 10);
    }

    // Método que diminui o volume em 10 unidades
    public void menosVolume() {
        this.setVolume(this.getVolume() - 10);
    }

    // Método que ativa o modo mudo, configurando o volume para 0
    public void ligarMudo(){
        this.setVolume(0);
    }

    // Método que desativa o modo mudo, configurando o volume para 10
    public void desligarMudo(){
        this.setVolume(10);
    }

    // Método que inicia a reprodução e configura o volume para 10
    public void play(){
        this.ligado = true;
        this.setVolume(10);
        System.out.println("Play Ativo");
    }

    // Método que pausa a reprodução e configura o volume para 0
    public void pause(){
        this.ligado = false;
        this.setVolume(0);
        System.out.println("Pause Ativo");
    }

    // Método getter para o volume
    public int getVolume() {
        return volume;
    }

    // Método setter para o volume
    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Método getter para verificar se o controle está ligado
    public boolean isLigado() {
        return ligado;
    }

    // Método setter para definir o estado "ligado" do controle remoto
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // Método getter para verificar se o controle está desligado
    public boolean isDesligado() {
        return desligado;
    }

    // Método setter para definir o estado "desligado" do controle remoto
    public void setDesligado(boolean desligado) {
        this.desligado = desligado;
    }
}
