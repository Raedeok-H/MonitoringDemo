package com.itcous.monitoringtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class MonitoringTestApplication {

    // Logger 객체 생성
    private static final Logger log = LoggerFactory.getLogger(MonitoringTestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MonitoringTestApplication.class, args);
    }

    // 10초마다 로그 출력
    @Scheduled(fixedRate = 10000)
    public void logMessage() {
        log.info("Hello World!");
    }

}
