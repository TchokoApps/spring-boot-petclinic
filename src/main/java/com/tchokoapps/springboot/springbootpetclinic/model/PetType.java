package com.tchokoapps.springboot.springbootpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;

    public PetType() {
    }

    public PetType(String name) {
        this.name = name;
    }

    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PetType{" +
                "name='" + name + '\'' +
                '}';
    }
}
