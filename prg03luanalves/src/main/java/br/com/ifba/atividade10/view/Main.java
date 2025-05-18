/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author a1591
 */
public class Main {
    
    public static void main(String args[]){
        
        // Criando perfis
        List<String> permissoesAdmin = Arrays.asList("GERENCIAR_USUARIOS", "VISUALIZAR_LOGS");
        PerfilUsuario perfilAdmin = new PerfilUsuario(1L, "Administrador", permissoesAdmin);

        // Criando usuários
        Usuario usuario1 = new Usuario(
            1L,
            perfilAdmin,
            "luan",
            "luan@ifba.edu.br",
            "123456",
            null,
            true
        );

        // Simulando login
        LogAuditoria log = usuario1.logar("123456");
        System.out.println(log);

        // Criando uma sessão
        Sessao sessao = usuario1.criarSessao();
        System.out.println(sessao);
    
        
    }
    
}
