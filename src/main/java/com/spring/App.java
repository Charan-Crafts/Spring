package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextBean.xml");

        FirstBean bean =(FirstBean) context.getBean("myBean");

        System.out.println(bean);
    }

}
