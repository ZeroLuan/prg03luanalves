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
public class CursoFind {
    
    private final static EntityManagerFactory entityManagerFactory = 
                        Persistence.createEntityManagerFactory("gerenciamento_curso");
    
    private final static EntityManager entityManager = entityManagerFactory.createEntityManager();

    
    public static void main(String[] args){
        
        
        
        // FIND(BUSCANDO) UM CURSO
        entityManager.getTransaction().begin();
        Curso cursoEncontrado = entityManager.find(Curso.class, 1L);
        System.out.println("Cruso: " + cursoEncontrado.getNome());
        
        // FECHANDO OS RECURSOS
        entityManager.close();
        entityManagerFactory.close();
        
        
        
    }
}