package com.backend.falcon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity(name = "authoriser")
@NoArgsConstructor
public class Authoriser {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String request;
    private long phone;
    private String location;
    private String username;
    private String password;

    public Authoriser(String id, String firstname, String lastname, String request, long phone, String location, String username, String password, String adminuser) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.request = request;
        this.phone = phone;
        this.location = location;
        this.username = username;
        this.password = password;
        this.adminuser = adminuser;
    }

    private String adminuser;
}
