package com.enterprise.mall.item.dto;

import com.enterprise.mall.size.dto.SizeRequestDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ItemRequestDto {

    private String itemPic;

    private String itemName;

    private String itemSubName;

    private Long itemPrice;

    private String itemDetails;

    private String itemDescription;

    private List<SizeRequestDto> sizeRequestDtoList;

    @Builder
    public ItemRequestDto(String itemPic,
                          String itemName,
                          String itemSubName,
                          Long itemPrice,
                          String itemDetails,
                          String itemDescription,
                          List<SizeRequestDto> sizeRequestDtoList) {
        this.itemPic = itemPic;
        this.itemName = itemName;
        this.itemSubName = itemSubName;
        this.itemPrice = itemPrice;
        this.itemDetails = itemDetails;
        this.itemDescription = itemDescription;
        this.sizeRequestDtoList = sizeRequestDtoList;
    }
}
