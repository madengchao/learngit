package com.xiaoyi.service;

import com.xiaoyi.pojo.Users;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Address: http://www.microetech.cn/
 * @Auther: HEIFENG
 * @Date: 2020/1/28
 * @Description: com.xiaoyi.service
 * @version:1.0
 */
@Service
public interface UsersService {

    void insertUser(Users users);

    List<Users> selectUserAll();
}
