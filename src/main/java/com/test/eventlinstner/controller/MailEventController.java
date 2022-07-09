package com.test.eventlinstner.controller;

import com.test.eventlinstner.publish.SendmaillEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController

//增加了新的属性
@RestController
public class MailEventController {

    @Autowired
    private SendmaillEventPublisher publisher;

    /**
     * 异步邮件发送
     * @return
     */
    @GetMapping("sendMailAsync")
    public String sendMailAsync(String content){
        publisher.sendEmailAsync("subject", content, "xxx@xxx.com");
        publisher.sendEmailAsync("subject", content, "xxx@xxx.com");
        return "success";
    }

    
}
