package com.example;

import com.example.b.BeanB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ielatif on 10/26/16.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "beans.xml");

        BeanB beanb = (BeanB) context.getBean("beanb");
        beanb.hello();

    }

}
