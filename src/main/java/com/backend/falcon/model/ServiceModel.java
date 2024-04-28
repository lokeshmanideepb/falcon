package com.backend.falcon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@Entity(name = "service")
@NoArgsConstructor
public class ServiceModel {
    @Id
    private String id;
    private String request;
    private Date dateofreq;
    private String aflag;
    private int transflag;

    public ServiceModel(String id, String request, Date dateofreq, String aflag, int transflag, String authid) {
        this.id = id;
        this.request = request;
        this.dateofreq = dateofreq;
        this.aflag = aflag;
        this.transflag = transflag;
        this.authid = authid;
    }

    private String authid;

}
