package com.nowcoder;

import com.nowcoder.entity.DiscussPost;
import com.nowcoder.mapper.DiscussPostMapper;
import com.nowcoder.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = NowcoderApplication.class)
public class MapperTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Test
    public void test(){

        List<DiscussPost> list =  discussPostMapper.selectDiscussPosts(0,0,10);
        for(DiscussPost discussPost : list){
            System.out.println(discussPost);
        }
    }
}
