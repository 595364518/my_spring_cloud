package com.lhb.service;

import com.lhb.entity.User;

import java.util.List;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 13:33:40 2020/8/12
 */
public interface UserService {

    User save(User user);

    void delete(Long id);

    User update(User user);

    List<User> findAll();

    User findById(Long id);



}
