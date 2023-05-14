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
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_size_id")
    private Long itemSizeId;

    @Column(name = "item_size_name")
    private String itemSizeName;

    @Column(name = "item_stock")
    private Long itemStock;

    @Column(name = "item_id")
    private Long itemId;

    @CreationTimestamp
    @Column(name = "create_at")
    private LocalDateTime createAt;

    @UpdateTimestamp
    @Column(name = "modify_at")
    private LocalDateTime modifyAt;

    @Builder
    public Size(String itemSizeName, Long itemStock, Long itemId) {
        this.itemSizeName = itemSizeName;
        this.itemStock = itemStock;
        this.itemId = itemId;
    }
}
