package com.aaronbujatin.beaems.vendor;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VendorService {

    private final VendorRepository vendorRepository;

    public Vendor save(Vendor vendor){
        return vendorRepository.save(vendor);
    }

    public Vendor getVendorById(String id){
        return vendorRepository.findById(id).get();
    }

    public List<Vendor> getAllVendors(){
        return vendorRepository.findAll();
    }

    public Vendor update(String id, Vendor vendor){

        Vendor newVendor = vendorRepository.findById(id).get();

        if(newVendor == null){
            throw new NullPointerException("Cannot find the vendor. Value is null");
        }else {
            newVendor.setEventNameReference(vendor.getEventNameReference());
            newVendor.setCompanyName(vendor.getCompanyName());
            newVendor.setEmail(vendor.getEmail());
            newVendor.setVendorType(vendor.getVendorType());
            newVendor.setWebsite(vendor.getWebsite());
            newVendor.setStatus(vendor.getStatus());
            newVendor.setContact(vendor.getContact());
            newVendor.setPaymentStatus(vendor.getPaymentStatus());

            return vendorRepository.save(newVendor);
        }
    }



}

