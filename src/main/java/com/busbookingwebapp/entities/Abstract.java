package com.busbookingwebapp.entities;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@Data
@MappedSuperclass
public class Abstract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
