package com.wjb.springboot.test.auto;

import com.wjb.springboot.test.bean.HelloProperties;
import com.wjb.springboot.test.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <b><code>HelloServiceAutoConfiguration</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2022/9/2 0:28.
 *
 * @author Arjun
 * @version 1.0.0
 * @since wjb-spring-boot-starter
 */
@Configuration(proxyBeanMethods = false)

@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {

    @ConditionalOnMissingBean(HelloService.class)
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
