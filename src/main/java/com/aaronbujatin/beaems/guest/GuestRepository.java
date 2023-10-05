package com.aaronbujatin.beaems.guest;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface GuestRepository extends MongoRepository<Guest, String> {

    List<Guest> findByStatus(String status);


}