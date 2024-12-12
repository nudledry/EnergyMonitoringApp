package com.kelompokhoki.EnergyMonitoringWeb.repository;

import com.kelompokhoki.EnergyMonitoringWeb.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByTitle(String url);
}
