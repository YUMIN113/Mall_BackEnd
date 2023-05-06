package com.enterprise.mall.security.enums;

import lombok.Getter;

@Getter
public enum Role {
    USER("ROLE_USER"), ADMIN("ROLE_ADMIN");
    private String roleDescription;

    Role(String roleDescription) {
        this.roleDescription = roleDescription;
    }
}
