package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Date;
import java.util.List;


@ContextConfiguration(classes = CommunityApplication.class)
@SpringBootTest
public class MapperTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DiscussPostMapper discussPostMapper;


    @Test
    public void testSelectUser(){
        User user  = userMapper.selectById(1);
        System.out.println(user);

        User user1 = userMapper.selectByName("testuser1");
        System.out.println(user1);

        User user2 = userMapper.selectByEmail("test1@example.com");
        System.out.println(user2);
    }

    @Test
    public  void testInsertUser(){
        User user = new User();
        user.setUsername("testuser4");
        user.setPassword("testpassword");
        user.setSalt("testsalt");
        user.setEmail("testuser@example.com");
        user.setType(0);
        user.setStatus(1);
        user.setActivateCode("testcode");
        user.setHeaderUrl("http://example.com/avatar.png");
        user.setCreateTime(new Date());
        System.out.println(userMapper.insertUser(user));

    }

    @Test
    public  void testUpdate(){
        int res = userMapper.updateStatus(1,1);
        System.out.println(res);
        User user  = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    public  void testDiscussPostMapper(){
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(0,0,10);
        for (DiscussPost discussPost : discussPosts) {
            System.out.println(discussPost);
        }

        int rows = discussPostMapper.selectDiscussPostRows(0);
        System.out.println(rows);
    }
}
