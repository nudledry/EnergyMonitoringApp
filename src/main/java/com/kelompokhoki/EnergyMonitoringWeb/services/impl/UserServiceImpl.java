package com.kelompokhoki.EnergyMonitoringWeb.services.impl;

import com.kelompokhoki.EnergyMonitoringWeb.dto.UserDto;
import com.kelompokhoki.EnergyMonitoringWeb.models.User;
import com.kelompokhoki.EnergyMonitoringWeb.repository.UserRepository;
import com.kelompokhoki.EnergyMonitoringWeb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> findAllUser() {
        List<User> users = userRepository.findAllWithUsages();  // Use custom query
        return users.stream().map(this::mapToUserDto).collect(Collectors.toList());
    }

    private UserDto mapToUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .username(user.getUsername() != null ? user.getUsername() : "")
                .energyUsages(user.getEnergyUsages() != null ? user.getEnergyUsages() : Collections.emptyList())
                .targetUsages(user.getTargetUsages() != null ? user.getTargetUsages() : Collections.emptyList())
                .createdOn(user.getCreatedOn())
                .build();
    }
}
