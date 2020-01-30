package com.xiaoyi.service.impl;

import com.xiaoyi.mapper.UsersMapper;
import com.xiaoyi.pojo.Users;
import com.xiaoyi.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Address: http://www.microetech.cn/
 * @Auther: HEIFENG
 * @Date: 2020/1/28
 * @Description: com.xiaoyi.service.impl
 * @version:1.0
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void insertUser(Users users) {
        usersMapper.insertUser(users);
    }

    @Override
    public List<Users> selectUserAll() {
        return usersMapper.selectUserAll();
    }
}
