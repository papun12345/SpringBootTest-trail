package com.Test.myWebApp_Test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Test.myWebApp_Test.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

    @Autowired
    LoginService service;
    
    @RequestMapping(value="/", method = {RequestMethod.GET})
    public String showLoginPage_index(ModelMap model){
    	System.out.println("showLoginPage_index");
        return "index";
    }

    @RequestMapping(value="/index", method = {RequestMethod.GET})
    public String showLoginPage(ModelMap model){
    	System.out.println("showLoginPage");
        return "index";
    }

    @RequestMapping(value="/action", method = {RequestMethod.POST},produces = "html/text")
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
    	System.out.println("showWelcomePage");
        boolean isValidUser = service.validateUser(name, password);

        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return "index";
        }

        model.put("name", name);
        model.put("password", password);

        return "action";
    }

}
