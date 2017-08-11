package com.realdolmen.candyshop.domain;

import com.realdolmen.candyshop.AbstractPersistenceTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class OrderPersistenceTest extends AbstractPersistenceTest {
	@Test
	public void orderCanBePersisted() throws Exception {
		Order o = new Order();
		o.setDeliveryAddress(new Address("Kattenberg", "7", "Huizingen", "2574"));
		em.persist(o);
		assertNotNull(o.getId());
	}

	@Test
	public void orderCanBeLoaded() throws Exception {
		Order order = em.find(Order.class, 2000L);
		assertEquals("Manhattan 13 1078 Geel", order.getDeliveryAddress().toString());
	}

	@Test
	public void orderCanHavePerson() throws Exception {
		Person p = em.find(Person.class, 3000L);
		Order o = new Order();
		o.setPerson(p);
		em.persist(o);
		em.flush();
		em.clear();

		Order po = em.find(Order.class, o.getId());
		assertEquals("Tyler", po.getPerson().getFirstName());
	}

	@Test
	public void orderHasOrderLines() throws Exception {
		Order o = em.find(Order.class, 1000L);
		List<OrderLine> orderLines = o.getOrderLines();
		assertEquals(3, orderLines.size());
	}

	@Test
	public void orderLinesFromOrderHaveCandy() throws Exception {
		Order o = em.find(Order.class, 3000L);
		OrderLine ol = o.getOrderLines().get(0);
		assertEquals("Sweethearts", ol.getCandy().getName());
	}

	@Test
	public void orderCanAddOrderLine() throws Exception {
		Order o = new Order();
		Candy c1 = new Candy("Yellow candy", 1.1, CandyColor.YELLOW);
		OrderLine ol1 = new OrderLine(4L, c1);

		o.setOrderLines(Arrays.asList(ol1));
		assertTrue(o.getOrderLines().size() > 0);
	}

	@Test
	public void orderCanCalculateTotalPrice() throws Exception {
		Order o = new Order();
		Candy c1 = new Candy("Yellow candy", 1.1, CandyColor.YELLOW);
		OrderLine ol1 = new OrderLine(4L, c1);
		Candy c2 = new Candy("Blue candy", 1.4, CandyColor.BLUE);
		OrderLine ol2 = new OrderLine(1L, c2);
		Candy c3 = new Candy("Green candy", 2.0, CandyColor.GREEN);
		OrderLine ol3 = new OrderLine(2L, c3);
		o.setOrderLines(Arrays.asList(ol1, ol2, ol3));

		double tot = (1.1 * 4 + 1.4 * 1 + 2 * 2);
		assertTrue(o.calculateTotal() == tot);
		assertEquals(o.calculateTotal(), tot, 0.01);
	}
}
