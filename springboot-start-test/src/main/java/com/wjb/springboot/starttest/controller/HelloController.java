package com.wjb.springboot.starttest.controller;

import com.wjb.springboot.test.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b><code>HelloController</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2022/9/2 0:49.
 *
 * @author Arjun
 * @version 1.0.0
 * @since springboot
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/say/{userName}")
    public String say(@PathVariable("userName") String userName){
        return helloService.sayHello(userName);
    }
}
