package com.enterprise.mall.security.service;

import com.enterprise.mall.security.domain.User;
import com.enterprise.mall.security.dto.UserRequestDto;
import com.enterprise.mall.security.enums.Role;
import com.enterprise.mall.security.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository,
                       BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Transactional(readOnly = false)
    public void createUser(UserRequestDto userRequestDto) {
        userRepository.save(User.builder()
                .userName(userRequestDto.getUserName())
                .userEmail(userRequestDto.getUserEmail())
                .userPassword(bCryptPasswordEncoder.encode(userRequestDto.getUserPassword()))
                .role(Role.USER)
                .build());
    }
}
