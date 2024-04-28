package com.backend.falcon.controller;

import com.backend.falcon.model.Authoriser;
import com.backend.falcon.repo.AuthoriserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthoriserController {

    @Autowired
    AuthoriserRepository authoriserRepository;

    @GetMapping("/authoriser")
    public List<Authoriser> getAllAuthorisers(){
        return authoriserRepository.findAll();
    }

    @GetMapping("/authoriserById")
    public Authoriser getAuthoriserById(@RequestParam String username){
        return authoriserRepository.findByUsername(username);
    }
}
