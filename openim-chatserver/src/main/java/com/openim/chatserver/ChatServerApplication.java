package com.openim.chatserver;

import com.openim.chatserver.listener.ApplicationContextInitialized;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shihuacai on 2015/7/20.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.openim")
public class ChatServerApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ChatServerApplication.class);
        springApplication.addListeners(new ApplicationContextInitialized());
        //springApplication.addListeners(new ChatServerMessageDispatchV2());
        springApplication.run(args);
    }
}
