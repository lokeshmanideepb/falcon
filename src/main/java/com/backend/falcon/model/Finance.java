package com.backend.falcon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name="finance")
public class Finance {
    @Id
    private String transno;

    private String cid;
    private int amount;
    private String wid;
    private int wage;
    private String aid;
    private String request;
    private String cust_name;
    private String auth_name;
    private String worker_name;
    private Date tdate;
}
