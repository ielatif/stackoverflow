package com.example.b;

import com.example.a.BeanA;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * Created by ielatif on 10/26/16.
 */
public class BeanB implements InterfaceB {

    @Autowired
    private BeanA beanA;

    @PostConstruct
    public void postConstructMethod() {
        beanA.hello();
    }

    public void hello() {
        System.out.println("Hello from beanB");
    }
}
