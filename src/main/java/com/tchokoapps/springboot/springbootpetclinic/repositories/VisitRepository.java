package com.tchokoapps.springboot.springbootpetclinic.repositories;

import com.tchokoapps.springboot.springbootpetclinic.model.Vet;
import com.tchokoapps.springboot.springbootpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
