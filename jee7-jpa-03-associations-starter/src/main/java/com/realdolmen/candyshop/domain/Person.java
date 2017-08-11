package com.realdolmen.candyshop.domain;

import com.realdolmen.candyshop.util.DateUtils;

import javax.persistence.*;
import java.util.*;

@Entity
public class Person {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String firstName;

    @Column(nullable = false, length = 200)
    private String lastName;

    @Temporal(TemporalType.DATE)
    @Column(nullable = true)
    private Date birthDate;

    @Transient
    private long age;

    @Embedded
    private Address address;

    @ElementCollection
    @CollectionTable(name = "candy_preferences")
    @Enumerated(EnumType.STRING)
    @Column(name = "candy_color")
    private List<CandyColor> candyPreferences = new ArrayList<>();

    // TODO: add the inverse of the many-to-one relationship between Order and Person named "orderHistory"
    @OneToMany(mappedBy = "person")
    private List<Order> orderHistory;
    
    @PostLoad
    public void initializeAge() {
        this.age = DateUtils.yearsFrom(birthDate);
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
        initializeAge();
    }

    public long getAge() {
        return age;
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

	public List<Order> getOrderHistory() {
		return orderHistory;
	}

	public void setOrderHistory(List<Order> orderHistory) {
		this.orderHistory = orderHistory;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAge(long age) {
		this.age = age;
	}
    
    
}
