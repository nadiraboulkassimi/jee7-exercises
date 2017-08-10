package com.realdolmen.candyshop.domain;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.jboss.logging.Logger;

@ApplicationScoped
public class Candy {
	@Inject
	private Logger logger;
}
