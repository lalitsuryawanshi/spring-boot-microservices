package com.video.rental.userinterface.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Videodisk {

    private Integer videoid;
    private String name;
    private String genre;
    private Double rentPerDay;

}
