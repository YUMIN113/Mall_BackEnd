package com.enterprise.mall.size.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SizeDetailRequestDto {

    private String itemBodyName;

    private Integer itemBodySize;

    @Builder
    public SizeDetailRequestDto(String itemBodyName, Integer itemBodySize) {
        this.itemBodyName = itemBodyName;
        this.itemBodySize = itemBodySize;
    }
}
