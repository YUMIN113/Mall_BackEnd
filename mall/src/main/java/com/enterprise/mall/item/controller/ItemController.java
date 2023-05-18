package com.enterprise.mall.item.controller;

import com.enterprise.mall.item.dto.ItemRequestDto;
import com.enterprise.mall.item.service.ItemService;
import com.enterprise.mall.size.service.SizeDetailService;
import com.enterprise.mall.size.service.SizeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    private final ItemService itemService;
    private final SizeService sizeService;
    private final SizeDetailService sizeDetailService;

    public ItemController(ItemService itemService, SizeService sizeService, SizeDetailService sizeDetailService) {
        this.itemService = itemService;
        this.sizeService = sizeService;
        this.sizeDetailService = sizeDetailService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerItem(@RequestBody ItemRequestDto itemRequestDto) {

        // item 테이블에 저장
        itemService.saveItem(itemRequestDto);

        // List<Size> 테이블에 저장
        

        return ResponseEntity.ok("item registration success");
    }
}
