package com.aaronbujatin.beaems.vendor;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document("vendors")
public class Vendor {

    @Id
    private String id;
    private String companyName;
    private String eventNameReference;
    private String email;
    private String contact;
    private String vendorType;
    private String website;
    private String status;
    private String contractDescription;
    private String paymentStatus;

}