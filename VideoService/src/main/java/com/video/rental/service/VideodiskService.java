package com.video.rental.service;

import com.video.rental.model.Videodisk;

import java.util.List;
import java.util.Optional;

public interface VideodiskService {

    List<Videodisk> fetchAllVideodisks();

    Optional<Videodisk> findOneVideodisk(Integer id);
}
