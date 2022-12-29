package com.ljguo;

import com.ljguo.config.SpringConfig;
import com.ljguo.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ac.getBean(AccountService.class);
        accountService.method("ljguo","gxx",100);
    }
}
