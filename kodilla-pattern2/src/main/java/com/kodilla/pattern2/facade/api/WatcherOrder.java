package com.kodilla.pattern2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WatcherOrder {
    private static final Logger LOGGER_I = LoggerFactory.getLogger(WatcherOrder.class);

    @Before("execution(* com.kodilla.pattern2.facade.api.OrderFacade.processOrder(..))&&args(order, user)&&target(object)")
    public void logEvent(OrderDto order, Long user, Object object) {
        LOGGER_I.info("Class: "+object.getClass().getName()+", Args: "+ order +" User ID: "+user);
    }
    @Around("execution(* com.kodilla.pattern2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER_I.info("Time consumed: "+(end-begin)+"[ms]");
        } catch (Throwable throwable) {
            LOGGER_I.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}
