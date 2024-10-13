package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.cloudvendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorApiService {
    cloudvendor cloudvendor;
    @GetMapping("{vendor_id}")
    public cloudvendor getCloudVendorDetails(String vendor_id) {
        return  cloudvendor;
                //(vendor_id, "name3", "Addressone", "xxxxxx");
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody cloudvendor cloudvendor) {
        this.cloudvendor = cloudvendor;
        return "cloud vendor successfully created";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody cloudvendor cloudvendor) {
        this.cloudvendor = cloudvendor;
        return "cloud vendor updated successfully ";
    }

    @DeleteMapping("/{vendor_name}")
    public String deleteCloudVendorDetails(@PathVariable String vendor_name) {
        this.cloudvendor = null;
        return "Cloud vendor deleted successfully";
    }
}
