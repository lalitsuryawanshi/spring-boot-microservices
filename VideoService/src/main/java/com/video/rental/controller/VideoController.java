package com.video.rental.controller;

import com.video.rental.model.Videodisk;
import com.video.rental.service.VideodiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class VideoController {

    @Autowired
    private final VideodiskService videodiskService;


    public VideoController(VideodiskService videodiskService) {
        this.videodiskService = videodiskService;
    }

    @GetMapping("/videodisks")
    public ResponseEntity<List<Videodisk>> fetchAllVideodisks(){
        return ResponseEntity.ok(videodiskService.fetchAllVideodisks());
    }

    @GetMapping("/videodisks/{id}")
    public ResponseEntity<Videodisk> fetchOneVideodisk(@PathVariable String id){
        Optional<Videodisk> videodisk = videodiskService.findOneVideodisk(Integer.valueOf(id));
        if (videodisk.isPresent()) {
            return ResponseEntity.ok(videodiskService.findOneVideodisk(Integer.valueOf(id)).get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
