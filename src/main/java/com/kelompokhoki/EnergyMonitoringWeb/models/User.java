package com.kelompokhoki.EnergyMonitoringWeb.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String username;
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<EnergyUsage> energyUsages;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<TargetUsage> targetUsages;

    @Column(columnDefinition = "TEXT")
    private Date createdAt;
}
