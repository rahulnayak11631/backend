package com.thbs.backend.Repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


import com.thbs.backend.Models.ImagesDB;

public interface ImagesDBRepo extends JpaRepository<ImagesDB, UUID> {

    List<ImagesDB> findByOrganizerId(UUID organizerId);
   



}
