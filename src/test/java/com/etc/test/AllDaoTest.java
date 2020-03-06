package com.etc.test;

import com.etc.dao.UserDao;
import com.etc.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring-mybatis.xml")
public class AllDaoTest {

    @Resource
    private UserDao userDao;

    //查询用户测试
    @Test
    public void queryUserTest(){
        List<User> list = userDao.queryUser(null);
        for(User u:list){
            System.out.println("userId:"+u.getUserId()+",userName:"+u.getUserName()+",phone:"+u.getPhone());
        }
    }

    //删除用户测试
    @Test
    public void delUserTest(){
        userDao.delUser(1);
    }
}
