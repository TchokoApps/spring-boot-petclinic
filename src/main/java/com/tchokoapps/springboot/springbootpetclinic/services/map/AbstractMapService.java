package com.tchokoapps.springboot.springbootpetclinic.services.map;

import com.tchokoapps.springboot.springbootpetclinic.model.BaseEntity;

import java.util.*;
import java.util.function.Predicate;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        T ob = Objects.requireNonNull(object, "object can not be null");
        if (ob.getId() == null) {
            ob.setId(getNextId());
        }
        return map.put(ob.getId(), ob);
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        T ob = Objects.requireNonNull(object, "object can not be null");
        map.entrySet().removeIf(longTEntry -> longTEntry.getValue().equals(ob));
    }

    private Long getNextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet())+1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}

