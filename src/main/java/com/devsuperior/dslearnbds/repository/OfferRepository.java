package com.devsuperior.dslearnbds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dslearnbds.model.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {

}
