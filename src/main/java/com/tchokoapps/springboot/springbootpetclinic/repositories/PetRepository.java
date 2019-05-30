package com.tchokoapps.springboot.springbootpetclinic.repositories;

import com.tchokoapps.springboot.springbootpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
