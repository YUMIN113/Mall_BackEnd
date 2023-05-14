package com.enterprise.mall.item.controller;

import com.enterprise.mall.item.dto.ItemRequestDto;
import com.enterprise.mall.item.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerItem(@RequestBody ItemRequestDto itemRequestDto) {

        // item 테이블에 저장
        itemService.createItem(itemRequestDto);
        return ResponseEntity.ok("item registration success");
    }
}
