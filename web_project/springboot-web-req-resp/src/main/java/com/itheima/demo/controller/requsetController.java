package com.itheima.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
@RestController
public class requsetController {
    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request){
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//        int age = Integer.parseInt(ageStr);
//        System.out.println(name+":"+age);
//        return "Ok";
//    }
    public String simpleParam(String name, Integer age){
        System.out.println(name+":"+age);
        return "Ok";

    }
}
