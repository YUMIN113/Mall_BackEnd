package com.enterprise.mall.item.domain;

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
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "item_pic")
    private String itemPic;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_sub_name")
    private String itemSubName;

    @Column(name = "item_price")
    private Long itemPrice;

    @Column(name = "item_details")
    private String itemDetails;

    @Column(name = "item_description")
    private String itemDescription;

    @CreationTimestamp
    @Column(name = "create_at")
    private LocalDateTime createAt;

    @UpdateTimestamp
    @Column(name = "modify_at")
    private LocalDateTime modifyAt;

    @Builder
    public Item(String itemPic,
                String itemName,
                String itemSubName,
                Long itemPrice,
                String itemDetails,
                String itemDescription) {
        this.itemPic = itemPic;
        this.itemName = itemName;
        this.itemSubName = itemSubName;
        this.itemPrice = itemPrice;
        this.itemDetails = itemDetails;
        this.itemDescription = itemDescription;
    }
}
