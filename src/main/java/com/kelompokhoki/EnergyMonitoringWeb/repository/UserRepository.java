package com.kelompokhoki.EnergyMonitoringWeb.repository;

import com.kelompokhoki.EnergyMonitoringWeb.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u LEFT JOIN FETCH u.energyUsages LEFT JOIN FETCH u.targetUsages")
    List<User> findAllWithUsages();
}
