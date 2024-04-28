package com.backend.falcon.dto;

import lombok.Data;

import java.util.Date;

@Data
public class RequestDTO {

    private String id;
    private String firstname;
    private String lastname;
    private long phone;
    private String email;
    private String area;
    private String city;
    private String request;
    private Date dateofreq;
    private String authid;
}
