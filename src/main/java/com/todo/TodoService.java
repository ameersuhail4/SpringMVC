package com.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
@Service
public class TodoService {

     static List<Todo> todos = new ArrayList<Todo>();
     static int todoCount = 3;

    static {
        todos.add(new Todo(1, "ameer", "Learn Spring MVC", new Date().getDate(),
                false));
        todos.add(new Todo(2, "in28Minutes1", "Learn Struts", new Date().getDate(), false));
        todos.add(new Todo(3, "in28Minutes2", "Learn Hibernate", new Date().getDate(),
                false));
    }
    public void addTodo(String name, String desc, int targetDate, boolean isDone) {
        todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
    }
    public void deleteTodo(int id) {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
            }
        }
    }
    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user))
                filteredTodos.add(todo);
        }
        return filteredTodos;
    }
}
