package com.enterprise.mall.size.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class SizeRequestDto {

    private String itemSizeName;

    private Long itemStock;

    private List<SizeDetailRequestDto> sizeDetailRequestDtoList;

    @Builder
    public SizeRequestDto(String itemSizeName,
                          Long itemStock,
                          List<SizeDetailRequestDto> sizeDetailRequestDtoList) {
        this.itemSizeName = itemSizeName;
        this.itemStock = itemStock;
        this.sizeDetailRequestDtoList = sizeDetailRequestDtoList;
    }
}
