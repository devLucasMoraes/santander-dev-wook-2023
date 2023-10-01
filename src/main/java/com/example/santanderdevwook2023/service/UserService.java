package com.example.santanderdevwook2023.service;

import com.example.santanderdevwook2023.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
