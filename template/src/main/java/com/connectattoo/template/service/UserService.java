package com.connectattoo.template.service;

import com.connectattoo.template.model.UserModel;
import com.connectattoo.template.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserModel saveUser(UserModel user) {
        UserModel userSaved = userRepository.save(user);
        return userSaved;
    }
}
