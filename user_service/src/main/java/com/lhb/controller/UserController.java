package com.lhb.controller;

import com.lhb.entity.Result;
import com.lhb.entity.User;
import com.lhb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 13:48:00 2020/8/12
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/get/{id}")
    public Result findById(@PathVariable(value = "id") Long id){
        Result rs = new Result();
        User byId = userService.findById(id);
        if (byId != null){
            rs.setCode(101);
            rs.setData(byId);
        }else {
            rs.setCode(102);
        }
        return rs;
    }

    @RequestMapping("/save")
    public Result save(@RequestBody User user){
        User save = userService.save(user);
        Result rs = new Result();
        if (save != null){
            rs.setCode(101);
            rs.setData(save);
        }else {
            rs.setCode(103);
        }
        return rs;
    }

    @RequestMapping("/get")
    public Result findAll(){
        Result rs = new Result();

        List<User> all = userService.findAll();

        if(all != null && all.size() != 0){
            rs.setCode(101);
            rs.setData(all);
        }else {
            rs.setCode(102);
        }

        return rs;
    }
}
