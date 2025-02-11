/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.service;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.curso.repository.CursoRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 * @author a1591
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class CursoService implements CursoIService{

    private final CursoRepository cursoRepository;
    
    @Override
    public Curso save(Curso curso) throws RuntimeException{
        //Verifica se o objeto curso é nulo, se for, lança uma exceção informando que os dados não foram preenchidos
        if(curso == null){
            throw new RuntimeException ("Dados do curso nao preenchidos");
            
          //Verifica se o curso já possui um ID (caso tenha, significa que o curso já existe na base de dados)
        } else if(curso.getId() != null){
            throw new RuntimeException ("Curso ja existente no banco de dados");
            
          //Se o curso não for nulo e não tiver ID, então ele é inserido no banco de dados
        } else {
            log.info("Salvando Objeto Curso no Banco!");
            return cursoRepository.save(curso);
            
        }
    }

    @Override
    public List<Curso> findAll() {
        //Retorna todos os cursos encontrados no banco de dados
        log.info("Prcurando Todos Objeto Curso no Banco!");
        return cursoRepository.findAll();
    }

    @Override
    public Curso update(Curso curso) throws RuntimeException{
        if (curso == null) {
            throw new RuntimeException("Dados do curso não preenchidos");
        }
        if (curso.getId() == null) {
            throw new RuntimeException("ID do curso não fornecido");
        }

        // Verifica se o curso existe no banco de dados
        Optional<Curso> cursoExistente = cursoRepository.findById(curso.getId());
        if (!cursoExistente.isPresent()) {
            throw new RuntimeException("Curso não encontrado");
        }

        // Atualiza o curso no banco de dados
        log.info("Atualizando Objeto Curso no Banco!");
        return cursoRepository.save(curso);
    }

    @Override
    public void delete(Curso curso) {
        //Verifica se o objeto curso é nulo, se for, lança uma exceção informando que os dados não foram preenchidos
        if(curso == null){
            throw new RuntimeException ("Dados do curso nao preenchidos");
        //Exclui o curso do banco de dados utilizando o cursoDao
        } else {
            log.info("Excluindo Objeto Curso no Banco!");
            cursoRepository.delete(curso);
        }
    }

    @Override
    public Curso findById(Long id) {
        // Verifica se o ID fornecido é nulo, caso seja, lança uma exceção informando que o ID não foi preenchido
        if(id == null){
            throw new RuntimeException ("ID nao preenchido");
            
        //Retorna o curso encontrado pelo ID utilizando o cursoDao
        } else {
            //Retorna o curso encontrado pelo ID utilizando o cursoRepository ou uma exceção caso o curso não seja encontrado
            log.info("Procurando Objeto Curso no Banco Pelo ID!");
            return cursoRepository.findById(id).orElseThrow(() -> new RuntimeException("Curso nao encontrado."));
        }
    }

    @Override
    public List<Curso> findByNome(String nome) {
        //Verifica se o nome fornecido é nulo, caso seja, lança uma exceção informando que o nome não foi preenchido
        if(nome == null || nome.trim().isEmpty()){
            throw new RuntimeException ("Nome não preenchido");
        } else {
            //Retorna uma lista de cursos encontrados pelo nome utilizando o cursoDao
            log.info("Procurando Objeto Curso no Banco Pelo Nome!");
            return cursoRepository.findByNome(nome);
        }
    }
    
}
