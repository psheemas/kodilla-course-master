package com.kodilla.patterns2.facade.dao.orderFacade;

import com.kodilla.patterns2.facade.api.OrderDto;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Aspect
@Component
public class FacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + "&& args(order,userId) && target(object)")
    public void logEvent(OrderDto order, Long userId, Object object) {
        List<String> tempList = order.getItems().stream()
                .map(item -> item.getProductId())
                .map(productId -> productId.toString())
                .collect(Collectors.toList());

        String listOfOrderedItems = "";
        for (int i = 0; i < tempList.size(); i++) {
            listOfOrderedItems = listOfOrderedItems  + tempList.get(i) + ", ";
        }
        LOGGER.info("Class: " + object.getClass().getName() + ", Items: " + listOfOrderedItems + "UserId: " + userId.toString());
    }

    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Time consumed for this task: " + (end - begin) + "[ms]");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }

}
