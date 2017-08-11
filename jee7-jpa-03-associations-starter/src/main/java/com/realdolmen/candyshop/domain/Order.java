package com.realdolmen.candyshop.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// TODO: make an entity using table "candy_order"
@Entity
@Table(name = "candy_order")
public class Order {
    // TODO: add id (primary key, generated) and deliveryAddress (embedded)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Embedded
	private Address deliveryAddress;
	
    // TODO: Add a many to one association to Person. Make sure the bidirectional side is updated as well!
	@ManyToOne
    @JoinColumn(name = "person_id")
	private Person person;
    
	// TODO: add a one to many association to OrderLine. Do not use a join-table (e.g. FK column "order_id" in "order_line")

	@OneToMany
	@JoinColumn(name = "order_id")
	private List<OrderLine> orderLines = new ArrayList<>();
	
    public double calculateTotal() {
    	double som = 0;
    	for(OrderLine ol: orderLines){
    		som += ol.calculateSubTotal();
    	}
    	return som;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}


}
