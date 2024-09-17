package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@ContextConfiguration(classes = CommunityApplication.class)
@SpringBootTest
public class MailTest {
    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;
    @Test
    public void testSend(){
        mailClient.sendMail("3616266449@qq.com","Java发邮箱测试","爱你么么哒");
    }

    @Test
    public void TestTempLeaf(){
        Context context = new Context();
        context.setVariable("username","lucifer");
        String content2 = templateEngine.process("/mail/demo.html",context);
        mailClient.sendMail("3616266449@qq.com","Java发邮箱测试2",content2);


    }
}
