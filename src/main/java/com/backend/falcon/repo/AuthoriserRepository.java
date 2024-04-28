package com.backend.falcon.repo;

import com.backend.falcon.model.Authoriser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthoriserRepository extends JpaRepository<Authoriser,String> {
    List<Authoriser> findByRequest(String request);

    Authoriser findByUsername(String username);

    List<Authoriser> findByRequestAndLocation(String request, String city);
}
