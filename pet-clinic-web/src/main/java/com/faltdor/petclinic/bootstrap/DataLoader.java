package com.faltdor.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.faltdor.petclinic.model.Owner;
import com.faltdor.petclinic.model.PetType;
import com.faltdor.petclinic.model.Vet;
import com.faltdor.petclinic.services.OwnerService;
import com.faltdor.petclinic.services.PetTypeService;
import com.faltdor.petclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}
 
	@Override
	public void run(String... args) throws Exception {
		PetType petType = new PetType();
		petType.setName("Dog");
		petTypeService.save(petType);
		
		petType = new PetType();
		petType.setName("Cat");
		petTypeService.save(petType);
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Michael");
		owner1.setLastName("Weston");
		owner1.setAddress("1234 Four louder");
		owner1.setCity("Miami");
		owner1.setTelephone("123456789");
		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("1234 Four louder");
		owner2.setCity("Miami");
		owner2.setTelephone("123456789");
		ownerService.save(owner2);
		System.out.println("Loaded Owners....");

		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Jessie");
		vet2.setLastName("Porter");
		vetService.save(vet2);
		System.out.println("Loaded Vets....");

	}

}
