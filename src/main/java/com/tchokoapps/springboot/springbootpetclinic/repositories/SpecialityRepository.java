package com.tchokoapps.springboot.springbootpetclinic.repositories;

import com.tchokoapps.springboot.springbootpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
