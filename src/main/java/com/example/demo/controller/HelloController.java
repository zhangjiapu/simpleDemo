package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 张家谱
 * @Date 2019/3/18 0:33
 * @Version 1.0
 **/

@RestController
public class HelloController {

    /**
     * value 里面的name是前端url传参所带的参数 参数以key value的方式存在 name就是key的值
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name",defaultValue = "World")String name){
        return "Hello"+name;
    }


}
