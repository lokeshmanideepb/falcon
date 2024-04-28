package com.backend.falcon.controller;

import com.backend.falcon.dto.RequestDTO;
import com.backend.falcon.model.Authoriser;
import com.backend.falcon.model.Customer;
import com.backend.falcon.model.ServiceModel;
import com.backend.falcon.repo.AuthoriserRepository;
import com.backend.falcon.repo.CustomerRepository;
import com.backend.falcon.repo.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RequestController {

    @Autowired
    ServiceRepository serviceRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    AuthoriserRepository authoriserRepository;


    @PostMapping("/request")
    public ResponseEntity<String> createRequest(@RequestBody RequestDTO request){
        try{
            List<Authoriser> authoriserList = authoriserRepository.findByRequestAndLocation(request.getRequest(),request.getCity());
            ServiceModel serviceModel = ServiceModel.builder().id(request.getId())
                    .request(request.getRequest())
                    .dateofreq(request.getDateofreq())
                    .authid(authoriserList.get(0).getId())
                    .transflag(0)
                    .aflag("0")
                    .build();
            Customer customer = Customer.builder().id(request.getId())
                    .area(request.getArea())
                    .city(request.getCity())
                    .firstname(request.getFirstname())
                    .lastname(request.getLastname())
                    .phone(request.getPhone())
                    .email(request.getEmail())
                    .build();
            customerRepository.save(customer);
            serviceRepository.save(serviceModel);
            return new ResponseEntity<>("Success",HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
        }
    }

}
