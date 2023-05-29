package com.video.rental.repository;

import com.video.rental.model.Videodisk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VideodiskRepository extends JpaRepository<Videodisk, Integer> {


}
