package com.enterprise.mall.item.service;

import com.enterprise.mall.item.domain.Item;
import com.enterprise.mall.item.dto.ItemRequestDto;
import com.enterprise.mall.item.repository.ItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Transactional(readOnly = false)
    public void saveItem(ItemRequestDto itemRequestDto) {
        itemRepository.save(Item.builder()
                .itemPic(itemRequestDto.getItemPic())
                .itemName(itemRequestDto.getItemName())
                .itemSubName(itemRequestDto.getItemSubName())
                .itemPrice(itemRequestDto.getItemPrice())
                .itemDetails(itemRequestDto.getItemDetails())
                .itemDescription(itemRequestDto.getItemDescription())
                .build());
    }
}
