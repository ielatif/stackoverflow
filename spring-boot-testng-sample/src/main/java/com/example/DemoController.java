package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ielatif on 10/21/16.
 */
@Controller
public class DemoController {

    @GetMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "Hello world!";
    }

}
