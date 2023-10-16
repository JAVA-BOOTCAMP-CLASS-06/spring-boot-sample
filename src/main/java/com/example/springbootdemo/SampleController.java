package com.example.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
 
    @RequestMapping(value = "/welcome/{userName}", method = RequestMethod.GET)
    @ResponseBody
    public String welcome(@PathVariable(name = "userName") String userName) {
        return "Bienvenido " + userName;
    }
}