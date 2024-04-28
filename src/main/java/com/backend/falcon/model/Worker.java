package com.backend.falcon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@Entity(name = "worker")
@NoArgsConstructor
public class Worker {

    @Id
    private String id;
    private String firstname;
    private String lastname;
    private long phone;

    public Worker(String id, String firstname, String lastname, long phone, String profession, String authid, String adminuser, String location, String area, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.profession = profession;
        this.authid = authid;
        this.adminuser = adminuser;
        this.location = location;
        this.area = area;
        this.email = email;
    }

    private String profession;
    private String authid;
    private String adminuser;
    private String location;
    private String area;
    private String email;
}
