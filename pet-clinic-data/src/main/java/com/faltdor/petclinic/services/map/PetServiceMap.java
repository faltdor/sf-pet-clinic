/**
 * 
 */
package com.faltdor.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.faltdor.petclinic.model.Pet;
import com.faltdor.petclinic.services.PetService;

/**
 * @author
 *
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
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
