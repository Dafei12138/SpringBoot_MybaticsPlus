package com.sbmp.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/main")
    public @ResponseBody String say(){
        return "hello Spring boot";
    }

    @GetMapping("/redisHandler")
    @ResponseBody
    public String redisHandler(){
        stringRedisTemplate.opsForValue().set("k5", "Springboot redis");
        return stringRedisTemplate.opsForValue().get("k5");
    }

    @RequestMapping("/hellobtl")
    public ModelAndView helloBeetl(){
        System.out.println("xxx");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username","hhhhh");
        modelAndView.setViewName("add");
        return modelAndView;
    }

}
