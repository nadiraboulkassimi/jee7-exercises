package com.realdolmen.candyshop.interceptors;

import com.realdolmen.candyshop.services.CandyService;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by NAUAZ44 on 16/08/2017.
 */
@Interceptor
@ActivateTimer
public class MethodTimerInterceptor {
    Logger logger = Logger.getLogger("CandyService");

    @AroundInvoke
    public Object method(InvocationContext ic) throws Exception{
        long start = System.nanoTime();
        try {
            return ic.proceed();
        } finally {
            long end = System.nanoTime();
            logger.info(ic.getMethod().getName() + " took " + (end - start) / 1_000_000.0 + "ms");
        }
    }

}
