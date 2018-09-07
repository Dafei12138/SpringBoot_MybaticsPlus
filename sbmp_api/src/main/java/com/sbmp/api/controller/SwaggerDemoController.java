package com.sbmp.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/13.
 */
@RestController
@RequestMapping("api")
@Api("swaggerDemoController相关的api")
public class SwaggerDemoController {

    @ApiOperation(value = "根据id查询学生信息", notes = "查询数据库中某个的学生信息")
    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public String getStudent() {
        return "hello swaggerDemoController相关的api";
    }


}