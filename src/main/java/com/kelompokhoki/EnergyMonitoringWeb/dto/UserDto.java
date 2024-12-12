package com.kelompokhoki.EnergyMonitoringWeb.dto;

import com.kelompokhoki.EnergyMonitoringWeb.models.EnergyUsage;
import com.kelompokhoki.EnergyMonitoringWeb.models.TargetUsage;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class UserDto {
    private int id;
    private String username;
    private List<EnergyUsage> energyUsages;
    private List<TargetUsage> targetUsages;
    private Date createdAt;
}
