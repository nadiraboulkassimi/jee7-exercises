package com.realdolmen.candyshop.interceptors;

import org.slf4j.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * Created by NAUAZ44 on 16/08/2017.
 */
@Interceptor
@ActivateTimer
public class MethodTimerInterceptor {
    @Inject
    Logger logger;

    @AroundInvoke
    public Object method(InvocationContext ic) throws Exception{
        long start = System.nanoTime();
        try {
            System.out.println("ABC");
            logger.info(ic.getMethod().getName() + " IN DE METHOD TIMER INTERCEPTOR!" );
            return ic.proceed();
        } finally {
            long end = System.nanoTime();
            logger.info(ic.getMethod().getName() + " took " + (end - start) / 1_000_000.0 + "ms");
        }
    }

}
