package com.realdolmen.candyshop.domain;

import com.realdolmen.candyshop.util.UserUtils;

import javax.persistence.*;

public class TrackedEntityListener {
	// TODO: add an entity listener method to update userCreated and userModified before saving. Use currentUser()
	@PrePersist
	private void persist(Tracked tracked){
		tracked.setUserCreated(currentUser());
		tracked.setUserModified(currentUser());
	}
	
    // TODO: add an entity listener method to update userModified before updating. Use currentUser()
	@PreUpdate
	private void update(Tracked tracked){
		tracked.setUserModified(UserUtils.currentUser());
	}
	
    private String currentUser() {
        return UserUtils.currentUser();
    }
}
