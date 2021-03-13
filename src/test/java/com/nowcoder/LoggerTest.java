package com.nowcoder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: nowcoder
 * @description: LogTest
 * @author: xiaohui
 * @create: 2021-03-13 22:43
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = NowcoderApplication.class)
public class LoggerTest {
    private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test(){
        logger.trace("trace test");
        logger.debug("12312312412414");
        logger.debug("debug log");
        logger.info("info log");
    }
}
