package com.video.rental.service.impl;


import com.video.rental.model.Videodisk;
import com.video.rental.repository.VideodiskRepository;
import com.video.rental.service.VideodiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideodiskServiceImpl implements VideodiskService {

    @Autowired
    private final VideodiskRepository videodiskRepository;

    public VideodiskServiceImpl(VideodiskRepository videodiskRepository) {
        this.videodiskRepository = videodiskRepository;
    }

    @Override
    public List<Videodisk> fetchAllVideodisks() {

        return videodiskRepository.findAll();
    }

    @Override
    public Optional<Videodisk> findOneVideodisk(Integer id) {

        return videodiskRepository.findById(id);
    }
}
