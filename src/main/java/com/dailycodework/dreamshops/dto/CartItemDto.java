package com.dailycodework.dreamshops.dto;

import com.dailycodework.dreamshops.model.Product;

import java.math.BigDecimal;

public class CartItemDto {
    private Long itemId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private ProductDto product;
}
