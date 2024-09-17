package com.nowcoder.community;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import org.slf4j.Logger;

@ContextConfiguration(classes = CommunityApplication.class)
@SpringBootTest
public class loggerTest {


    private static final Logger logger =LoggerFactory.getLogger(loggerTest.class);

    @Test
    public void testLogger(){
        System.out.println(logger.getName());
        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");

    }
}
