package br.com.desafio.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import br.com.desafio.todo.entity.Todo;
import br.com.desafio.todo.repository.TodoRepository;

@Service
public class TodoService {
    
    @Autowired
    private TodoRepository t;

    public List<Todo> create(Todo todo){
        t.save(todo);
        return list();
    }

    public List<Todo> list(){
       Sort sort = Sort.by("prioridade").descending().and(
            Sort.by("nome").ascending()
        );
        return t.findAll(sort);
    }

    public List<Todo> update(Todo todo){
        t.save(todo);
        return list();
    }

    public List<Todo> delete(int id){
        t.deleteById(id);
        return list();
    }
}
