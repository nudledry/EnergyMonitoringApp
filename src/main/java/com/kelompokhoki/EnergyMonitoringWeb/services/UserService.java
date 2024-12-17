package com.kelompokhoki.EnergyMonitoringWeb.services;

import com.kelompokhoki.EnergyMonitoringWeb.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> findAllUser();
}
