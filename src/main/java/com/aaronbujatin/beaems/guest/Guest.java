package com.aaronbujatin.beaems.guest;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@Data
@AllArgsConstructor
@Document("guests")
public class Guest {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String relatedness;
    private int tableNumber;

    public static interface GuestRepository extends MongoRepository<Guest, String> {
    }
}