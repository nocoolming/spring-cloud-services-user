package org.ming.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "server.port")
public class ApplicationConfig {
    private int port;
}
