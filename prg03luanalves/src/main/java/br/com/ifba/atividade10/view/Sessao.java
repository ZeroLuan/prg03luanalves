/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author a1591
 */
public class Sessao {
    
    private Long id;
    private Usuario usuario;
    private String token;

    public Sessao() {
    }
    
    public Sessao(Long id, Usuario usuario, String token) {
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }
    
    
    
   
    
    
    
    
    
    @Override
    public String toString() {
        return "Sessao{" + 
                "id=" + id + 
                ", usuario=" + usuario + 
                ", token=" + token + 
                '}';
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    } 
    
}
