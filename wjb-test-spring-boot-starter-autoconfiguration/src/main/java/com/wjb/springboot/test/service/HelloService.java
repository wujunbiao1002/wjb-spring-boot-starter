package com.wjb.springboot.test.service;

import com.wjb.springboot.test.bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <b><code>HelloService</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2022/9/2 0:27.
 *
 * @author Arjun
 * @version 1.0.0
 * @since wjb-spring-boot-starter
 */
public class HelloService {

    @Autowired
    private HelloProperties helloProperties;

    public String sayHello(String userName){
        return helloProperties.getPrefix() + "："+userName+"》"+helloProperties.getSuffix();
    }

}
