package com.example.greeting;

import org.springframework.context.annotation.Import;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(GreetingConfiguration.class)
public @interface EnableGreetingService {
}
