package com.example.RestdemoShowoff3.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.RestdemoShowoff3.Model.CloudVendor;

@RestController
@RequestMapping("/vendordetails")
public class CloudVendorAPI {
    CloudVendor cloudVendor; 
    @GetMapping("{vendorId}")
    public CloudVendor getDetails(String vendorId){
       return cloudVendor;
        //return new CloudVendor("C1","Vidya","Narsapur","1111");
    }
    @PostMapping
    public String postDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "cloud vendor added successfully!!!!..";
    }
    @PutMapping
    public String updateDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "cloud vendor updated successfully!!!!..";
    }
    @DeleteMapping("/{vendorId}")
    public String deleteDetails(String vendorId){
        this.cloudVendor=null;
        return "cloud vendor deleted successfully!!!!..";
    }


}
