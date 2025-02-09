/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.dao;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericIDao;
import java.util.List;

/**
 *
 * @author a1591
 */
public interface CursoIDao extends GenericIDao<Curso>{
     
    public List<Curso> findByNome(String nome);
     
}
