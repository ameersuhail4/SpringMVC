package com.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Users {
    @RequestMapping(value = "/regpage",method = RequestMethod.GET)
    public String page()
    {
        return "regPage";
    }
    @RequestMapping(value = "/regpage",method = RequestMethod.POST)
    public <name> String page(@RequestAttribute String name)
    {
        System.out.println(name);
        return "regSuc";
    }
}

