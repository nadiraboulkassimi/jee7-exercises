package com.realdolmen.candyshop.domain;

import com.realdolmen.candyshop.util.DateUtils;

import javax.persistence.*;
import java.util.*;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// TODO: make non nullable and restrict to 200 characters
	@Column(nullable = false, length = 200)
	private String firstName;

	// TODO: make non nullable and restrict to 200 characters
	@Column(nullable = false, length = 200)
	private String lastName;

	// TODO: add property birthdate (store only date portion) make it non
	// nullable
	@Temporal(TemporalType.DATE)
	private Date birthDate;

	// TODO: add property age (not stored in database, but calculated from
	// birthdate
	@Transient
	private int age;

	// TODO: add embedded mapping to address
	@Embedded
	private Address address;

	// TODO: add element collection (table name "candy_preferences", columns
	// ("candy_color" and "person_id")
	@ElementCollection
	@CollectionTable(name = "candy_preferences")
	@MapKeyColumn(name = "person_id")
	@Column(name = "candy_color")
	@Enumerated(EnumType.STRING)
	private List<CandyColor> candyPreferences;

	@PostLoad
	public void initializeAge() {
		this.age = (int) DateUtils.yearsFrom(birthDate);
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<CandyColor> getCandyPreferences() {
		return candyPreferences;
	}

	public void setCandyPreferences(List<CandyColor> candyPreferences) {
		this.candyPreferences = candyPreferences;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
