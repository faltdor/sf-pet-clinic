package com.faltdor.petclinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity{
	
	private LocalDate created;
	
	private String description;
	
	private Pet pet;

	public LocalDate getCreated() {
		return created;
	}

	public void setCreated(LocalDate created) {
		this.created = created;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

}
