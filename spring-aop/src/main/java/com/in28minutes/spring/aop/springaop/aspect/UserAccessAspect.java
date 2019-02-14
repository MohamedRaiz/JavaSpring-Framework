package com.in28minutes.spring.aop.springaop.aspect;


import com.in28minutes.spring.aop.springaop.business.Business1;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP - need to say related to aop
@Aspect
//Configuration
@Configuration
public class UserAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //what kind of method calls i would need to intercept

    //"execution(* PACKAGE.*.*(..))" - this is known as a pointcut
    //Weaving & Weaver

    @Before("com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void before(JoinPoint joinPoint){


        // what to do before method call - advice
        logger.info("Intercepted Method Calls - {}", joinPoint);
    }
}
