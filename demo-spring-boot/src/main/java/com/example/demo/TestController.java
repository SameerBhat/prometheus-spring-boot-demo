
package com.example.demo;

import org.springframework.boot.SpringApplication;
import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;


@RestController
public class TestController {

    @GetMapping("/count")
    @Timed(value = "testing.count", description = "Time taken to return testing count")
    public String getCountPoll() {

        return "Hello";
    }

    @GetMapping("/time")
    @Timed(value = "testing.time", description = "Time taken to return testing time")
    public String getTime() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return "Hello";
    }



}
