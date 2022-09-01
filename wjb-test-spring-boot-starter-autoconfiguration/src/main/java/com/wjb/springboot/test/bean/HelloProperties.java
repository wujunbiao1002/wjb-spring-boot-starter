package com.wjb.springboot.test.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <b><code>HelloProperties</code></b>
 * <p/>
 * Description
 * <p/>
 * <b>Creation Time:</b> 2022/9/2 0:28.
 *
 * @author Arjun
 * @version 1.0.0
 * @since wjb-spring-boot-starter
 */
@ConfigurationProperties("wjb.hello")
public class HelloProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
