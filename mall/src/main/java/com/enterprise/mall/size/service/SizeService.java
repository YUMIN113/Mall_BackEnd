package com.enterprise.mall.size.service;

import com.enterprise.mall.size.domain.Size;
import com.enterprise.mall.size.dto.SizeRequestDto;
import com.enterprise.mall.size.repository.SizeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SizeService {

    private final SizeRepository sizeRepository;

    public SizeService(SizeRepository sizeRepository) {
        this.sizeRepository = sizeRepository;
    }

    @Transactional(readOnly = false)
    public void saveSize(List<SizeRequestDto> sizeRequestDtoList, Long itemId) {

        List<Size> saveSize = sizeRequestDtoList.stream()
                .map(it -> Size.createSize(it, itemId))
                .collect(Collectors.toList());

        sizeRepository.saveAll(saveSize);
    }

}
