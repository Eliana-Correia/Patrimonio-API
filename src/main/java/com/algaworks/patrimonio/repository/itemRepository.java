package com.algaworks.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.patrimonio.model.item;

//colocado entre as setas a entidade e o tipo da proporiedade do item, que é o Long
//teremos uma interface estendendo o JpaReposi
//com isso já conseguirá identificar as classes, que é um repositorio e construir em tempo de execução uma implementação de classe, 
//para que seja injetada onde quisermos utilizar.
public interface itemRepository extends JpaRepository<item, Long> {

}
