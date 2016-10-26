package com.example.a;

import org.springframework.stereotype.Component;

/**
 * Created by ielatif on 10/26/16.
 */
@Component
public class BeanA implements InterfaceA {

    public void hello() {
        System.out.println("Hello from beanA");
    }
}
