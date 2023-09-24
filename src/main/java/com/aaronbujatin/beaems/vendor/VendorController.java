package com.aaronbujatin.beaems.vendor;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/vendors")
@CrossOrigin("http://localhost:8100")
public class VendorController {

    private final VendorService vendorService;

    @PostMapping
    public ResponseEntity<Vendor> save(@RequestBody Vendor vendor){
        return new ResponseEntity<>(vendorService.save(vendor), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vendor> getVendorById(@PathVariable("id") String id){
        return new ResponseEntity<>(vendorService.getVendorById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Vendor>> getAllVendors(){
        return new ResponseEntity<>(vendorService.getAllVendors(), HttpStatus.OK);
    }

}
