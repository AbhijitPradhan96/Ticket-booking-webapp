package com.busbookingwebapp.entities;

import lombok.Data;

import javax.persistence.Entity;
@Data
@Entity
public class Reservation extends Abstract{
    private boolean checkedIn;
    private  Passenger passenger;
    private Bus bus;
}
