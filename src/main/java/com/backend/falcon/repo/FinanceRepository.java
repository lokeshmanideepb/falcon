package com.backend.falcon.repo;

import com.backend.falcon.model.Finance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinanceRepository extends JpaRepository<Finance,String> {
}
