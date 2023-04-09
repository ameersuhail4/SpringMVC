package com.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;
import java.util.Date;

@org.springframework.stereotype.Controller
@SessionAttributes("name")
public class Controller {
    @Autowired
    TodoService service;
    @RequestMapping(value = "/list-todos",method = RequestMethod.GET)
    public String listTodo(ModelMap modelMap)
    {
        if(modelMap.get("name")==null)
        {
            modelMap.clear();
            return "regPage";
        }
        modelMap.addAttribute("todos",service.retrieveTodos("ameer"));
        //Todo t=TodoService.todos.get(0);
        return "list-todos";
    }
    @RequestMapping(value = "/add-todos",method =RequestMethod.GET)
    public  String showTodo(ModelMap modelMap)
    {
        Todo todo=new Todo();
       modelMap.addAttribute("todo",todo);
        return "add-todo";
    }
    @RequestMapping(value = "/add-todos",method =RequestMethod.POST)
    public  String addTodo(ModelMap modelMap,@Valid Todo todo, BindingResult result)
    {
        System.out.println(result.getModel());
        System.out.println("res works");
        if (result.hasErrors())
        {
            return "add-todo";
        }
        service.addTodo("ameer",todo.getDesc(),new Date().getDate(),false);
        modelMap.clear();

        return "redirect:list-todos";
    }
    @RequestMapping("/del-todos")
    public String delTodo(ModelMap modelMap,@RequestParam int id)
    {
        service.deleteTodo(id);
        modelMap.clear();
        return "redirect:list-todos";
    }
}
