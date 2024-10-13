package com.thinkconstructive.rest_demo.model;

public class cloudvendor {


    public void setVendor_id(String vendor_id) {
        this.vendor_id = vendor_id;
    }

    private String vendor_name;
    private String vendor_address;
    private String vendor_phone;
    private String vendor_id;

    public cloudvendor(String vendor_name, String vendor_address, String vendor_phone, String vendor_id) {
        this.vendor_name = vendor_name;
        this.vendor_address = vendor_address;
        this.vendor_phone = vendor_phone;
        this.vendor_id = vendor_id;
    }
    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getVendor_address() {
        return vendor_address;
    }

    public void setVendor_address(String vendor_address) {
        this.vendor_address = vendor_address;
    }

    public String getVendor_phone() {
        return vendor_phone;
    }

    public void setVendor_phone(String vendor_phone) {
        this.vendor_phone = vendor_phone;
    }

    public String getVendor_id() {
        return vendor_id;
    }

}
