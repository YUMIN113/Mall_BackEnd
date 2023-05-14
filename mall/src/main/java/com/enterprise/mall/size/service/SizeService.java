package com.enterprise.mall.size.service;

import com.enterprise.mall.size.domain.Size;
import com.enterprise.mall.size.dto.SizeRequestDto;
import com.enterprise.mall.size.repository.SizeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SizeService {

    private final SizeRepository sizeRepository;

    public SizeService(SizeRepository sizeRepository) {
        this.sizeRepository = sizeRepository;
    }

    @Transactional(readOnly = false)
    public void createSize(SizeRequestDto sizeRequestDto, Long itemId) {
        sizeRepository.save(Size.builder()
                .itemSizeName(sizeRequestDto.getItemSizeName())
                .itemStock(sizeRequestDto.getItemStock())
                .itemId(itemId)
                .build());
    }

}
