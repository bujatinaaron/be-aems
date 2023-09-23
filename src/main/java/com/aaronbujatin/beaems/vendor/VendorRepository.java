package com.aaronbujatin.beaems.vendor;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VendorRepository extends MongoRepository<Vendor, String> {
}
