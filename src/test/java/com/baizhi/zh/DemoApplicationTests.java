package com.baizhi.zh;

import com.baizhi.zh.dao.UserMapper;
import com.baizhi.zh.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void contextLoad() {
        int i = userMapper.deleteByPrimaryKey(1);
        System.out.println(i);
    }

}
