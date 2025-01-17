/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.model.dao;

import br.com.ifba.curso.connection.ConnectionFactory;
import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import java.util.List;

/**
 *
 * @author a1591
 */
public class CategoriaDAO {
    
    // Salva um curso no banco de dados
    public Curso save(Curso curso){
        EntityManager entityManager = new ConnectionFactory().getConnection();
        
        try {
            entityManager.getTransaction().begin(); // Inicia a transação
            entityManager.persist(curso); // Persiste o curso
            entityManager.getTransaction().commit(); // Confirma a transação
        } catch (Exception e) {
            entityManager.getTransaction().rollback(); // Desfaz a transação em caso de erro
            e.printStackTrace();
        } finally {
            entityManager.close(); // Fecha o EntityManager
        }

        return curso; // Retorna o curso salvo
    }  
    
    // Atualiza os dados de um curso no banco de dados
    public void update(Curso curso){
        EntityManager entityManager = new ConnectionFactory().getConnection();
        
        try {
            entityManager.getTransaction().begin(); // Inicia a transação
            entityManager.merge(curso); // Atualiza o curso
            entityManager.getTransaction().commit(); // Confirma a transação
        } catch (Exception e) {
            entityManager.getTransaction().rollback(); // Desfaz a transação em caso de erro
            e.printStackTrace();
        } finally {
            entityManager.close(); // Fecha o EntityManager
        }
    }
    
    // Busca um curso pelo ID no banco de dados
    public Curso find(Long cursoID){
        EntityManager entityManager = new ConnectionFactory().getConnection();
        Curso cursoEncontrado = null;

        try {
            cursoEncontrado = entityManager.find(Curso.class, cursoID); // Busca o curso pelo ID
            
            if (cursoEncontrado != null) {
                System.out.println("Curso encontrado: " + cursoEncontrado.getNome());
            } else {
                System.out.println("Curso não encontrado para o ID: " + cursoID);
            }
        } catch (Exception e) {
            System.err.println("Erro ao buscar curso: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (entityManager != null) {
                entityManager.close(); // Fecha o EntityManager
            }
        }

        return cursoEncontrado; // Retorna o curso encontrado ou null
    }
    
    // Remove um curso do banco de dados
    public void remove(Curso curso){
        EntityManager entityManager = new ConnectionFactory().getConnection(); 
        
        try {
            entityManager.getTransaction().begin(); // Inicia a transação
            
            Curso cursoExcluir = entityManager.find(Curso.class, curso.getId()); // Busca o curso para remoção
            
            if (cursoExcluir != null) {
                entityManager.remove(cursoExcluir); // Remove o curso encontrado
                entityManager.getTransaction().commit(); // Confirma a transação
                System.out.println("Curso removido com sucesso!");
            } else {
                System.out.println("Curso não encontrado no banco para remoção.");
                entityManager.getTransaction().rollback(); // Desfaz a transação
            }
        } catch (Exception e) {
            entityManager.getTransaction().rollback(); // Desfaz a transação em caso de erro
            System.err.println("Erro ao remover curso: " + e.getMessage());
            e.printStackTrace();
        } finally {
            entityManager.close(); // Fecha o EntityManager
        }
    }
    
    // Retorna uma lista com todos os cursos no banco de dados
    public List<Curso> read(){
        EntityManager entityManagerRead = new ConnectionFactory().getConnection();
        
        // Busca todos os cursos no banco
        List<Curso> cursosAll = entityManagerRead.createQuery("SELECT c FROM Curso c", Curso.class).getResultList();

        entityManagerRead.close(); // Fecha o EntityManager
        
        return cursosAll; // Retorna a lista de cursos
    }
}