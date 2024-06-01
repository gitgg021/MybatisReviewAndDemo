package com.xuehua.mybatis.mapper;


import com.xuehua.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

    /**
     * Mybatis面向接口编程的两个一致
     * 1.映射文件的namespace要和mapper接口的全类名保持一致
     * 2.映射文件中的SQL语句的id要和mapper接口中的方法名一致
     *
     * 表--实体类--mapper接口--映射文件
     */

    /**
     * 添加用户信息
     */
    int insertUser();

    /**
     * 更新用户信息
     */
    int updateUser();

    /**
     * 删除用户信息
     */
    int deleteUser();

    /**
     * 根据id查询用户信息
     */
    User seleteUserById();

    /**
     * 查询所有用户信息
     */
    List<User> seleteALlUser();

}
