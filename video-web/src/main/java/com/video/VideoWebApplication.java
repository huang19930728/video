package com.video;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.video.videodao.*"})
public class VideoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoWebApplication.class, args);
    }

}
