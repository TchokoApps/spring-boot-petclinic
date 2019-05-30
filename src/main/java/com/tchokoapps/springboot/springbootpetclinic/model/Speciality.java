package com.tchokoapps.springboot.springbootpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Speciality extends BaseEntity {
    @Column(name = "description")
    private String description;

    public Speciality(Long id, String description) {
        super(id);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Speciality{" +
                "description='" + description + '\'' +
                '}';
    }
}
