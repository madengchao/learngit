package com.xiaoyi.mapper;

import com.xiaoyi.pojo.Users;

import java.util.List;

/**
 * @Address: http://www.microetech.cn/
 * @Auther: HEIFENG
 * @Date: 2020/1/27
 * @Description: com.xiaoyi.mapper
 * @version:1.0
 */
public interface UsersMapper {
    void insertUser(Users users);

    List<Users> selectUserAll();
}
