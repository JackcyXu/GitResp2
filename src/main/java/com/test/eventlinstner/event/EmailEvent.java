package com.test.eventlinstner.event;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * 自定义邮箱事件
 */
@Data
public class EmailEvent  extends ApplicationEvent {
    // 标题
    private String subject;
    // 内容
    private String content;
    // 发件人
    private String sender;
    // 授权码
    private String authorizationCode;
    // 收件人
    private String receiver;

    public EmailEvent(Object source) {
        super(source);
    }


    public EmailEvent(Object source,String subject, String content, String receiver) {
        super(source);
        this.subject = subject;
        this.content = content;
        this.receiver = receiver;
    }


}
