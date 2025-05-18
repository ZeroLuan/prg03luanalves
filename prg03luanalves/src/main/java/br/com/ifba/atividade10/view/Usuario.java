/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author a1591
 */
public class Usuario {
    
    private Long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private Boolean ativo;
    
    

    public Usuario() {
    }
    
    public Usuario(Long id, PerfilUsuario perfil, String nomeUsuario, String email, String senha, LocalDateTime ultimoLogin, Boolean ativo) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.ultimoLogin = ultimoLogin;
        this.ativo = ativo;
    }

    
    
   
        public LogAuditoria logar(String senhaDigitada) {
            if (!this.senha.equals(senhaDigitada)) {
                // Senha incorreta, ainda assim vamos registrar a tentativa
                return new LogAuditoria(
                    null, this, 
                    "Tentativa de login com senha incorreta",
                    LocalDateTime.now(), 
                    "127.0.0.1" // Pode ser dinâmico depois
                );
            }

            this.ultimoLogin = LocalDateTime.now();

            return new LogAuditoria(
                null, this,
                "Login realizado com sucesso",
                ultimoLogin,
                "127.0.0.1"
            );
        }

        public Sessao criarSessao() {
            String token = UUID.randomUUID().toString(); // gera token aleatório
            return new Sessao(null, this, token);
        }


    
    
    
    
    
    @Override
    public String toString() {
        return "Usuario{" + 
                "id=" + id + 
                ", perfil=" + perfil + 
                ", nomeUsuario=" + nomeUsuario + 
                ", email=" + email + 
                ", senha=" + senha + 
                ", ultimoLogin=" + ultimoLogin + 
                ", ativo=" + ativo + 
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    
    
    
    
}
