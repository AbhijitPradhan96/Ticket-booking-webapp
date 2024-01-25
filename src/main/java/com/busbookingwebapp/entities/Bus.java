package com.busbookingwebapp.entities;

import lombok.Data;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Date;
@Data
@Entity
public class Bus extends Abstract{

    private String busNumber;
    private String busName;
    private String departureCity;
    private String arrivalCity;
    private Date dateOfDeparture;
    private Timestamp estimatedTime;
}
