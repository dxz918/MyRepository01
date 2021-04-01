package com.turing.sb2;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb2Application {

    public static void main(String[] args) {
        SpringApplication.run(Sb2Application.class,args);
        //取消标题(banner)
        /*SpringApplication app = new SpringApplication(Sb2Application.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);*/
    }

}
