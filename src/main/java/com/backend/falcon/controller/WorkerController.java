package com.backend.falcon.controller;


import com.backend.falcon.model.Worker;
import com.backend.falcon.repo.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkerController {


    @Autowired
    WorkerRepository workerRepository;

    @GetMapping("/worker")
    public List<Worker> getAllWorkers(){
        return workerRepository.findAll();
    }

    @GetMapping("/workerByAuthId")
    public List<Worker> getAllWorkers(@RequestParam String authId){
        return workerRepository.findByAuthid(authId);
    }

    @GetMapping("/workerById")
    public Worker getWorkerById(@RequestParam String id){
        return workerRepository.findById(id).get();
    }


}
