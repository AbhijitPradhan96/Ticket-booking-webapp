package com.busbookingwebapp.entities;

import lombok.Data;

import javax.persistence.Entity;
@Data
@Entity
public class Passenger extends Abstract{

    private String firstName;
    private String lastName;
    private String email;
    private String phone;


}
