/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.ifba;

import br.com.ifba.curso.connection.ConnectionFactory;
import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author a1591
 */
public class CursoSave{
    
    private final static EntityManagerFactory entityManagerFactory = 
                        Persistence.createEntityManagerFactory("gerenciamento_curso");
    
    private final static EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    public static void main(String[] args) {
     

        Curso curso = new Curso();
        
        curso.setId(1L);
        curso.setNome("Analise e Desenvolvimento de Sistemas");
        curso.setCodigoCurso("ADS");
        curso.setAtivo(true);

        //SALVANDO UM CURSO
        
        entityManager.getTransaction().begin();
        
        if (curso.getId() == 1) {
           System.out.println("Erro: A entidade ja possui um ID definido!");
        } else {
            entityManager.persist(curso);
        }
        entityManager.merge(curso);
        
        entityManager.getTransaction().commit();
        
        //FECHANDO OS RECURSOS
        
        entityManager.close();
        entityManagerFactory.close();
    }
}

