package com.aaronbujatin.beaems.booking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("bookings")
public class Booking {

    @Id
    private String id;
    private String eventName;
    private LocalDate bookingDate;
    private String bookingStatus;
    private String bookingSource;
    private String clientName;
    private String clientContactNumber;
    private String email;
    private String address;
    private LocalDate weddingDate;
    private String weddingType;
    private String themeStyle;
    private String ceremonyVenue;
    private String receptionVenue;
    private String expectedGuestNumber;
    private String groomName;
    private String groomContactNumber;
    private String brideName;
    private String brideContactNumber;
    private String paymentMethod;
    private String selectedPackage;
    private String organizerName;
    private double amountPaid;
}