package com.backend.falcon.repo;

import com.backend.falcon.model.ServiceModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceModel,String> {
}
