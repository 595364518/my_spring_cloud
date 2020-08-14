package com.lhb.dao;

import com.lhb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 13:08:30 2020/8/12
 */
public interface UserDao extends JpaRepository<User,Long>,
        JpaSpecificationExecutor<User> {

}
