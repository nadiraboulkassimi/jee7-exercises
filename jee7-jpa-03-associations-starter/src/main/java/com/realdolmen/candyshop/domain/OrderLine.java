package com.realdolmen.candyshop.domain;

import javax.persistence.*;

// TODO: make entity with table "oder_line"
@Entity
@Table(name = "order_line")
public class OrderLine {
	// TODO: add id (pk, generated) and quantity (int) properties
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long quantity;

	// TODO: add a many to one association to candy
	@ManyToOne
	private Candy candy;

	public OrderLine() {
		}

	public OrderLine(Long quantity, Candy candy) {
		super();
		this.quantity = quantity;
		this.candy = candy;
	}



	public double calculateSubTotal() {
		return quantity * candy.getPrice();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Candy getCandy() {
		return candy;
	}

	public void setCandy(Candy candy) {
		this.candy = candy;
	}

}
