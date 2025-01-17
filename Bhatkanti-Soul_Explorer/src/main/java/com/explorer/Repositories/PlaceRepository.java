package com.explorer.Repositories;

import com.explorer.Models.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Integer> {
    List<Place> findAll();
   // List<Place> getPlacesByCityId(int cityId);
    List<Place> findByCityCityId(int cityId);
}