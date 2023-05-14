package com.enterprise.mall.size.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor
public class SizeDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_size_detail_id")
    private Long itemSizeDetailId;

    @Column(name = "item_body_name")
    private String itemBodyName;

    @Column(name = "item_body_size")
    private Integer itemBodySize;

    @Column(name = "item_size_id")
    private Long itemSizeId;

    @CreationTimestamp
    @Column(name = "create_at")
    private LocalDateTime createAt;

    @UpdateTimestamp
    @Column(name = "modify_at")
    private LocalDateTime modifyAt;

    @Builder
    public SizeDetail(String itemBodyName,
                      Integer itemBodySize,
                      Long itemSizeId) {
        this.itemBodyName = itemBodyName;
        this.itemBodySize = itemBodySize;
        this.itemSizeId = itemSizeId;
    }
}
