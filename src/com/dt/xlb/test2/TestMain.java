package com.dt.xlb.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lb.xiao on 2018/7/5.
 */
public class TestMain {
    public static void main(String[] args){
        ApplicationContext ct = new ClassPathXmlApplicationContext("spring-config.xml");
        User user = (User) ct.getBean("user");
    }
}
