package com.example.hellospring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("within(com.example.hellospring..*)")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void logMethod(JoinPoint joinpoint) {
        log.info("Calling from aspect " + joinpoint.getSignature().getName());
    }
}
