package com.kelompokhoki.EnergyMonitoringWeb.dto;

import com.kelompokhoki.EnergyMonitoringWeb.models.EnergyUsage;
import com.kelompokhoki.EnergyMonitoringWeb.models.TargetUsage;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
@Getter
public class UserDto {
    private int id;
    private String username;
    private List<EnergyUsage> energyUsages;
    private List<TargetUsage> targetUsages;
    private LocalDateTime createdOn;
}