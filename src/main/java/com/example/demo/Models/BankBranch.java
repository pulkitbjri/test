package com.example.demo.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
@Entity
@Table(name = "branches")
public class BankBranch {

    @JsonIgnore
    @Id
    @Column(name = "ifsc")
    private String ifsc;

    @Column(name = "bank_id")
    private Long bankId;

    @Column(name = "branch")
    private String branch;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "district")
    private String district;

    @Column(name = "state")
    private String state;

    public String getIFSC() {
        return ifsc;
    }

    public void setIFSC(String IFSC) {
        this.ifsc = IFSC;
    }

    public Long getBank_id() {
        return bankId;
    }

    public void setBank_id(Long bank_id) {
        this.bankId = bank_id;
    }


    @Column(name = "bank_name")

    private String bankName;

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBank_name() {
        return bankName;
    }

    public void setBank_name(String bank_name) {
        this.bankName = bank_name;
    }
}

