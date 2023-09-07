package com.aaronbujatin.beaems.planner;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlannerRepository extends MongoRepository<Planner, String> {
}
