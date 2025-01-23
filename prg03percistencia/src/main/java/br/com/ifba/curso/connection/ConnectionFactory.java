/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.connection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author a1591
 */
public class ConnectionFactory {
    
    // Cria uma única instância de EntityManagerFactory para gerenciar conexões
    private static EntityManagerFactory entityManagerFactory = 
                        Persistence.createEntityManagerFactory("gerenciamento_curso");
    
    // Retorna uma nova instância de EntityManager para operações no banco de dados
    public EntityManager getConnection() {
        return entityManagerFactory.createEntityManager(); 
    }
    
}
