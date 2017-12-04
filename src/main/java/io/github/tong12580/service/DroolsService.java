package io.github.tong12580.service;

import io.github.tong12580.domain.Message;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yuton
 * @version 1.0
 * @description io.github.tong12580.service
 * @since 上午10:39 2017/12/4
 */
@Service
public class DroolsService {
    @Resource
    private KieSession kieSession;

    public String fireRule() {
        Message message = new Message();
        message.setMessage("Hello World");
        message.setStatus(Message.HELLO);
        kieSession.insert(message);//插入
        kieSession.fireAllRules();//执行规则
//        kieSession.dispose();关闭session
        return message.getMessage();
    }
}
