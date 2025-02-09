/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

/**
 *
 * @author a1591
 */

/*
Recursos que são comuns, a várias
classes que estão em diferentes pacotes,
devem ser colocado em um sub-pacote
dentro do pacote infrastructure;
*/

@MappedSuperclass
public class PersistenceEntity {
     
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
      
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
}
