package com.backend.falcon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity(name = "customer")
@NoArgsConstructor
public class Customer {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private long phone;
    private String email;
    private String area;
    private String city;

    public Customer(String id, String firstname, String lastname, long phone, String email, String area, String city) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.area = area;
        this.city = city;
    }


}
