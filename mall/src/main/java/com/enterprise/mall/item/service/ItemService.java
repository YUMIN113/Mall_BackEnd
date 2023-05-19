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
    public Item saveItem(ItemRequestDto itemRequestDto) {
        return itemRepository.save(Item.createItem(itemRequestDto));
    }
}
