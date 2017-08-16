package com.realdolmen.candyshop.interceptors;


import javax.interceptor.InterceptorBinding;
import java.lang.annotation.*;

import static java.lang.annotation.RetentionPolicy.*;

/**
 * Created by NAUAZ44 on 16/08/2017.
 */
@InterceptorBinding
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RUNTIME)
public @interface ActivateTimer {

}
