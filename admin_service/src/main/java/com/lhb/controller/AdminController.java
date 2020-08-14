package com.lhb.controller;

import com.lhb.entity.Result;
import com.lhb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 14:32:40 2020/8/12
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/user/get/{id}")
    public Result findUserById(@PathVariable(value = "id")Long id){

        Result rs = restTemplate.getForObject("http://user-service/user/get/" + id, Result.class);

        return rs;
    }

    @RequestMapping("/user/get")
    public Result findUser(){

        Result rs = restTemplate.getForObject("http://user-service/user/get", Result.class);

        return rs;
    }
}
