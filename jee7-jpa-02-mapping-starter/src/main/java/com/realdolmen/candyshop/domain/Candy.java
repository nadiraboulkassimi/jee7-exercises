package com.realdolmen.candyshop.domain;

import javax.persistence.*;

// TODO: make candy an entity
@Entity
public class Candy {

    // TODO: add properties id (Long, pk), name (String), price (double)
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Double price;
	@Enumerated(EnumType.STRING)
	private CandyColor color;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public CandyColor getColor() {
		return color;
	}
	public void setColor(CandyColor color) {
		this.color = color;
	}


}
