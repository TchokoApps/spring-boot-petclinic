package com.tchokoapps.springboot.springbootpetclinic.services.impl;

import com.tchokoapps.springboot.springbootpetclinic.model.Speciality;
import com.tchokoapps.springboot.springbootpetclinic.model.Visit;
import com.tchokoapps.springboot.springbootpetclinic.repositories.SpecialityRepository;
import com.tchokoapps.springboot.springbootpetclinic.repositories.VisitRepository;
import com.tchokoapps.springboot.springbootpetclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

public class VisitServiceImpl implements VisitService {

    private VisitRepository visitRepository;

    public VisitServiceImpl(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
