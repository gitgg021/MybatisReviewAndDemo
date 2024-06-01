package com.xuehua.mybatis.mapper;

import com.xuehua.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SqlMapper {

    /**
     * 根据用户名模糊查询用户信息
     */
    List<User> getUserByLike(@Param("username") String username);

    int deleteMore(@Param("ids")String ids);

    void insertUser(User user);

}
