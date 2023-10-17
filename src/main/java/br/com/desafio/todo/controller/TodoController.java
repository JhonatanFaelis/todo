package br.com.desafio.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.todo.entity.Todo;
import br.com.desafio.todo.service.TodoService;

@RestController
@RequestMapping("/todo")
public class TodoController {
    
    @Autowired
    private TodoService ts;

    @PostMapping
    List<Todo> create (@RequestBody Todo todo){
        return ts.create(todo);
    }

    @GetMapping
    List<Todo> list(){
        return ts.list();
    }


    @PutMapping
    List<Todo> update (@RequestBody Todo todo){
        return ts.update(todo);
    }

    @DeleteMapping("/{id}")
    List<Todo> delete(int id){
        return ts.delete(id);
    }
}
