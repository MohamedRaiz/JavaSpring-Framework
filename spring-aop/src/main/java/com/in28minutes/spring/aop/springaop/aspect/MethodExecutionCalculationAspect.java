package com.in28minutes.spring.aop.springaop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP - need to say related to aop
@Aspect
//Configuration
@Configuration
public class MethodExecutionCalculationAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void Around(ProceedingJoinPoint joinPoint) throws Throwable {
        //start time = x
        long startTime = System.currentTimeMillis();
        //allow execution of method
        joinPoint.proceed();
        //end time = y
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Time taken by {} is {}}", joinPoint, timeTaken);
    }

    }

