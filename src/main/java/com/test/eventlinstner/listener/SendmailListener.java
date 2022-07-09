package com.test.eventlinstner.listener;

import com.test.eventlinstner.event.EmailEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class  SendmailListener implements ApplicationListener<EmailEvent> {
    @Override
    @Async("taskExecutor")
    public void onApplicationEvent(EmailEvent emailEvent) {

        if (emailEvent == null) {
            return ;
        }
        System.out.println("开始发送邮件..." + emailEvent.getContent());
        // 除了发送邮件支持做一些其他的事情...模拟长时间处理事务
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发送邮件结束..." + emailEvent.getContent());

    }
}
