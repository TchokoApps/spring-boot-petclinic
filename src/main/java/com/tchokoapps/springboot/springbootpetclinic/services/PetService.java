package com.tchokoapps.springboot.springbootpetclinic.services;

import com.tchokoapps.springboot.springbootpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    public Pet findById(Long id);
    public Pet save(Pet pet);
    public Set<Pet> findAll();
}
