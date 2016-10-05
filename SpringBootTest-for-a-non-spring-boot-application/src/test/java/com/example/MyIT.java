package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by issam on 05/10/2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MyIT {

    @Value("${local.server.port}")
    private int serverPort;

    @Resource
    private TestRestTemplate restTemplate;

    @Test
    public void test() throws Exception {
        System.out.println("Port:" + serverPort);
        System.out.println("Hello:" + this.restTemplate.getForEntity("/", String.class).getBody());
    }
}
