package com.xuehua.mybatis.test;

import com.xuehua.mybatis.mapper.UserMapper;
import com.xuehua.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    /**
     * 添加用户
     *
     * @throws IOException
     */
    @Test
    public void testMyBatis() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取SqlSession   代表Java程序和数据库之间的会话
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //测试功能
        int result = mapper.insertUser();

        /*//手动提交事务
        sqlSession.commit();*/
        sqlSession.close();
        System.out.println("result:" + result);
    }

    /**
     * 更新用户
     *
     * @throws IOException
     */
    @Test
    public void testUpdateMyBatis() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取SqlSession   代表Java程序和数据库之间的会话
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //测试功能
        int result = mapper.updateUser();

        /*//手动提交事务
        sqlSession.commit();*/
        sqlSession.close();
        System.out.println("result:" + result);
    }

    /**
     * 删除用户
     *
     * @throws IOException
     */
    @Test
    public void testDeleteMyBatis() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取SqlSession   代表Java程序和数据库之间的会话
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //测试功能
        int result = mapper.deleteUser();

        /*//手动提交事务
        sqlSession.commit();*/
        sqlSession.close();
        System.out.println("result:" + result);
    }

    /**
     * 根据id查用户
     *
     * @throws IOException
     */
    @Test
    public void testSeleteById() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取SqlSession   代表Java程序和数据库之间的会话
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //测试功能
        User user = mapper.seleteUserById();
        /*//手动提交事务
        sqlSession.commit();*/
        sqlSession.close();
        System.out.println(user);
    }

    /**
     * 查所有用户
     *
     * @throws IOException
     */
    @Test
    public void testSeleteAllUser() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取SqlSession   代表Java程序和数据库之间的会话
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //测试功能
        List<User> users = mapper.seleteALlUser();
        users.forEach(user -> System.out.println(user));
        /*//手动提交事务
        sqlSession.commit();*/
        sqlSession.close();
     /*   for (User user:users){
            System.out.println(user);
        }*/

    }
}
