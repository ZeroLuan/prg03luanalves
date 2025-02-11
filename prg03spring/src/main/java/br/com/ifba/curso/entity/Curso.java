/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author a1591
 */

@Entity
@Table(name = "curso")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Curso extends PersistenceEntity implements Serializable{
    
    @Column(name = "nome", nullable = false)
    @Getter @Setter private String nome;
    
    @Column(name = "codigo_curso", nullable = false, unique = true)
    @Getter @Setter private String codigoCurso;
    
    @Column(name = "ativo")
    @Getter @Setter private boolean ativo;
    
}
