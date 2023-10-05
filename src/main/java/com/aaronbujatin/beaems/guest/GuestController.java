package com.aaronbujatin.beaems.guest;

import com.google.zxing.WriterException;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/guests")
@CrossOrigin(origins = "*")
public class GuestController {

    private final GuestService guestService;

    @PostMapping()
    public ResponseEntity<Guest> saveGuest(@RequestBody Guest guest) throws IOException, WriterException, MessagingException {
        return new ResponseEntity<>(guestService.saveGuest(guest), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Guest> getGuestById(@PathVariable("id") String id){
        return new ResponseEntity<>(guestService.getGuestById(id), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Guest>> getAllGuestByStatus(@RequestParam String status){
        return new ResponseEntity<>(guestService.getAllGuestByStatus(status), HttpStatus.OK);
    }


}