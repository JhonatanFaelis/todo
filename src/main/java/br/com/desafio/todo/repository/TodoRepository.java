package br.com.desafio.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafio.todo.entity.Todo;

public interface TodoRepository  extends JpaRepository<Todo, Integer>{
    
}
