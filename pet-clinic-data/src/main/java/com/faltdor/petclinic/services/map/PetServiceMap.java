/**
 * 
 */
package com.faltdor.petclinic.services.map;

import java.util.Set;

import com.faltdor.petclinic.model.Pet;
import com.faltdor.petclinic.services.PetService;

/**
 * @author
 *
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }
}
