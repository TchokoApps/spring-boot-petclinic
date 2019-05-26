package com.tchokoapps.springboot.springbootpetclinic.services;

import com.tchokoapps.springboot.springbootpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    public Vet findById(Long id);
    public Vet save(Vet vet);
    public Set<Vet> findAll();
}