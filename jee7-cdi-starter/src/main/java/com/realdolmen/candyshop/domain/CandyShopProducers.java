package com.realdolmen.candyshop.domain;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

import org.jboss.logging.Logger;

@ApplicationScoped
public class CandyShopProducers {

	@Produces
	public Logger getLogger(InjectionPoint injectionPoint){
		return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
	}
}
