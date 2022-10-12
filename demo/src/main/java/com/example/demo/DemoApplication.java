package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(DemoApplication.class);

        logger.trace("trace 로깅이야!!! {}", "트레이스!");
        logger.debug("debug 로깅이야!!! {}", "디버그!");
        logger.info("info 로깅이야!!! {}", "인포인포!");
        logger.warn("warn 로깅이야!!! {}", "워닝!");
        logger.error("error 로깅이야!!! {}", "에러!");

        SpringApplication.run(DemoApplication.class, args);
    }
}
