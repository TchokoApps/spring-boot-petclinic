package com.tchokoapps.springboot.springbootpetclinic.repositories;

import com.tchokoapps.springboot.springbootpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
