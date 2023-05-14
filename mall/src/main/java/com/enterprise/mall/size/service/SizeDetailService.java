package com.enterprise.mall.size.service;

import com.enterprise.mall.size.domain.SizeDetail;
import com.enterprise.mall.size.dto.SizeDetailRequestDto;
import com.enterprise.mall.size.repository.SizeDetailRepository;
import org.springframework.stereotype.Service;

@Service
public class SizeDetailService {

    private final SizeDetailRepository sizeDetailRepository;

    public SizeDetailService(SizeDetailRepository sizeDetailRepository) {
        this.sizeDetailRepository = sizeDetailRepository;
    }

    public void createSizeDetail(SizeDetailRequestDto sizeDetailRequestDto, Long itemSizeId) {
        sizeDetailRepository.save(SizeDetail.builder()
                .itemBodyName(sizeDetailRequestDto.getItemBodyName())
                .itemBodySize(sizeDetailRequestDto.getItemBodySize())
                .itemSizeId(itemSizeId)
                .build());
    }
}
