package com.enterprise.mall.security.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRequestDto {

    private String userName;

    private String userEmail;

    private String userPassword;

    @Builder
    public UserRequestDto(String userName,
                          String userEmail,
                          String userPassword) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }
}
