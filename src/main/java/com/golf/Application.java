package com.golf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Keith this fires up the whole application. 
 */
@SpringBootApplication
public class Application {

    /**
     * main method to start application.
     * @param args <code>String[]</code>
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
