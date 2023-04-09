package com.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class Users {
    @RequestMapping(value = "/regpage",method = RequestMethod.GET)
    public String page()
    {
        return "regPage";
    }
    @RequestMapping(value = "/regpage",method = RequestMethod.POST)
    public String page(@RequestParam("name") String name, ModelMap model)
    {
        model.put("name",name);
        System.out.println(model.get("name"));
        return "regSuc";
    }
}

