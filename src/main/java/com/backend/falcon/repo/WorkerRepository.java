package com.backend.falcon.repo;

import com.backend.falcon.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker,String> {
    List<Worker> findByAuthid(String authId);
}
