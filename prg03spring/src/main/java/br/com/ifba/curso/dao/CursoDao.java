/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.dao;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericDao;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author a1591
 */
public class CursoDao extends GenericDao<Curso> implements CursoIDao {
    
    @Override
    public List<Curso> findByNome(String nome) {
        return entityManager.createQuery("FROM " + getTypeClass().getName() + " c WHERE c.nome LIKE :nome")
                            .setParameter("nome", "%" + nome + "%")
                            .getResultList();
    }
    
}
