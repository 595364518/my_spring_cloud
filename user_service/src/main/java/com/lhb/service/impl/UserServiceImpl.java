package com.lhb.service.impl;

import com.lhb.service.UserService;
import com.lhb.dao.UserDao;
import com.lhb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 13:42:52 2020/8/12
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User save(User user) {
        User save = userDao.save(user);
        save.setPassword("******");

        return save;
    }

    @Override
    public void delete(Long id) {

        userDao.deleteById(id);
    }

    @Override
    public User update(User user) {
        User save = userDao.save(user);

        save.setPassword("******");
        return save;
    }

    @Override
    public List<User> findAll() {

        return userDao.findAll();
    }

    @Override
    public User findById(Long id) {
        return userDao.findById(id).get();
    }
}
