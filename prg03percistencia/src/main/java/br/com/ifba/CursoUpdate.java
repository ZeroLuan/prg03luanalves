/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author a1591
 */
public class CursoUpdate {
    
    private final static EntityManagerFactory entityManagerFactory = 
                        Persistence.createEntityManagerFactory("gerenciamento_curso");
    
    private final static EntityManager entityManager = entityManagerFactory.createEntityManager();

    
    public static void main(String[] args){
        
        Curso curso = new Curso();
        curso.setId(1L);
        curso.setNome("Engenharia de Softwere");
        curso.setCodigoCurso("EGS");
        curso.setAtivo(true);
        
        
        // ATUALIZANDO UM CURSO
        entityManager.getTransaction().begin();
        
        entityManager.merge(curso);
        
        entityManager.getTransaction().commit();
        
        // FECHANDO OS RECURSOS
        entityManager.close();
        entityManagerFactory.close();
    }
}
