package com.sanluna.gwr;

import com.sanluna.commons.BeansAndConfigurations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Import;

@EnableConfigServer
@SpringBootApplication
@Import(BeansAndConfigurations.class)
public class ConfigurationStarter {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationStarter.class, args);
    }
}
