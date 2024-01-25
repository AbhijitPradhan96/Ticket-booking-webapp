package com.busbookingwebapp.entities;

import lombok.Data;

import javax.persistence.Entity;
@Data
@Entity
public class User extends Abstract{

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
