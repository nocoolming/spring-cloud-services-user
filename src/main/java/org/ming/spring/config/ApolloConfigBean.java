package org.ming.spring.config;

import org.springframework.beans.factory.annotation.Value;

public class ApolloConfigBean {
    @Value("${port}")
    private int port;

    public int getPort() {
        return port;
    }
}
