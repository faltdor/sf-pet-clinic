package com.faltdor.petclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import com.faltdor.petclinic.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
    	Optional.ofNullable(object).orElseThrow(RuntimeException::new);
    	object.setId(Optional.ofNullable(object.getId()).orElseGet(this::getNextId));
        map.put(object.getId(), object);
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry-> entry.getValue().equals(object));
    }
    
    private Long getNextId() {
    	return map.keySet().size() == 0 ? 1L : Collections.max(map.keySet()) + 1;
    }
}
