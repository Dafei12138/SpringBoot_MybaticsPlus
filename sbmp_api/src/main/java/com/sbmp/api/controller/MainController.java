package com.sbmp.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * <p>后台管理主页</p>
 *
 * @author fuzongyao
 * @date 2018/8/13
 */
@Controller
public class MainController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/")
    public String index(Model model) {
        return "main";
    }

    @GetMapping("/main")
    @ResponseBody
    public String main() {
        return "main";
    }

    @GetMapping("/redisHandler")
    @ResponseBody
    public String redisHandler(){
        stringRedisTemplate.opsForValue().set("k5", "Springboot redis");
        return stringRedisTemplate.opsForValue().get("k5");
    }
}
