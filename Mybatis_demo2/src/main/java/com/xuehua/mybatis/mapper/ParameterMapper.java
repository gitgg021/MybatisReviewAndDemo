package com.xuehua.mybatis.mapper;

import com.xuehua.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    /**
     * 查询当前所有员工
     */
    List<User> getAllUser();

    /**
     * 根据id查询当前员工
     */
    User getUserById(int id);


    /**
     * 根据账号密码查询员工
     */
    User checkLogin(String username,String password);

    /**
     * 根据账号密码查询员工
     */
    User checkLoginByMap(Map<String,Object> map);

    /**
     * 添加用户
     */
    int insertUser(User user);

    /**
     * 根据账号密码查询员工@Param
     */
    User checkLoginByParam(@Param("username") String username, @Param("username")String password);

    /**
     * 根据用户名查询用户信息
     */
    User getUserByUsername(String name);




}
