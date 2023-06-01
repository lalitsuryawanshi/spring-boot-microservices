package com.video.rental.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Videodisk {

    @Id
    @Column(name="videoid")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer videoid;

    private String name;

    private String genre;
    private Double rentPerDay;

}
