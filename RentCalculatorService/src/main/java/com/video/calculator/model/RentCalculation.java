package com.video.calculator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RentCalculation {

    @Id
    @Column(name="rentalid")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer rentalid;

    private String name;

    private String genre;
    private Double rentPerDay;

}
