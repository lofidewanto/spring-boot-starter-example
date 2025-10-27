package com.example.greeting;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("@annotation(com.example.greeting.Logged)")
    public void logMethodCall(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().toShortString();
        System.out.println("[LOG] Calling: " + method);
    }
}
