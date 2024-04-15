package com.example.rest_demo.controller;

import com.example.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CloudVendor")


public class cloudAPIService {
    CloudVendor cloudVendor;

    @GetMapping("/{vendorId}")



    public CloudVendor getCloudVendorDetails(String vendorId){
        return   cloudVendor;
//                "c11", "Kashi", "Jhapa", "998765";

    }

    @PostMapping
    public  String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "cloud vendor return sucessfully";

    }

    @PutMapping
    public  String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "cloud vendor return Updatedsucessfully";

    }

    @DeleteMapping("{vendorID}")
    public  String deleteCloudDetails(String vendorId){

        this.cloudVendor= null;
        return "Cloud vendorId deleted successfullly";
    }
}

