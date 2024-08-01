package com.dailycodework.dreamshops.dto;

import com.dailycodework.dreamshops.model.Cart;
import com.dailycodework.dreamshops.model.Order;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<OrderDto> orders;
    private CartDto cart;
}
