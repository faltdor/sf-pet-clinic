package com.faltdor.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.faltdor.petclinic.model.Owner;
import com.faltdor.petclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }
    
    @Override
	public Owner save(Owner object) {
		return super.save(object);
	}

	@Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}
}
