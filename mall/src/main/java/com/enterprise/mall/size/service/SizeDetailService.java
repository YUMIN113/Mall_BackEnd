package com.enterprise.mall.size.service;

import com.enterprise.mall.size.domain.SizeDetail;
import com.enterprise.mall.size.dto.SizeDetailRequestDto;
import com.enterprise.mall.size.repository.SizeDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SizeDetailService {

    private final SizeDetailRepository sizeDetailRepository;

    public SizeDetailService(SizeDetailRepository sizeDetailRepository) {
        this.sizeDetailRepository = sizeDetailRepository;
    }

    public void saveSizeDetail(List<SizeDetailRequestDto> sizeDetailRequestDtoList, Long itemSizeId) {

        List<SizeDetail> saveSizeDetail = sizeDetailRequestDtoList.stream()
                .map(it -> SizeDetail.createRegisterSizeDetail(it, itemSizeId))
                .collect(Collectors.toList());

        sizeDetailRepository.saveAll(saveSizeDetail);

    }
}
