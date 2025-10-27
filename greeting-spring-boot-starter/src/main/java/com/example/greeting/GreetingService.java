package com.example.greeting;

public class GreetingService {

    @Logged
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
