package com.nttdata.btc.config.server.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Config Server.
 *
 * @author lrs
 */
@SpringBootApplication
@EnableConfigServer
public class NttdataBtcConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NttdataBtcConfigServerApplication.class, args);
    }

}