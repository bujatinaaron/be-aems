package com.aaronbujatin.beaems.booking;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookingService {

    private final BookingRepository bookingRepository;


    public Booking save(Booking booking){
        return bookingRepository.save(booking);
    }

    public Booking getBookingById(String id){
        return bookingRepository.findById(id).get();
    }

    public List<Booking> getAllBooking(){
        return bookingRepository.findAll();
    }




}
