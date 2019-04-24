package org.ming.spring.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig(order = 2)
public class AppConfig {

    @Bean
    public ApolloConfigBean configBean() {
        return new ApolloConfigBean();
    }
}
