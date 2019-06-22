package com.tchokoapps.springboot.springbootpetclinic.services.impl;

import com.tchokoapps.springboot.springbootpetclinic.model.Speciality;
import com.tchokoapps.springboot.springbootpetclinic.repositories.SpecialityRepository;
import com.tchokoapps.springboot.springbootpetclinic.services.SpecialityService;

import java.util.HashSet;
import java.util.Set;

public class SpecialityServiceImpl implements SpecialityService {

    private SpecialityRepository specialityRepository;

    public SpecialityServiceImpl(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
