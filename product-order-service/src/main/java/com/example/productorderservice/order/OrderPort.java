package com.example.productorderservice.order;

import com.example.productorderservice.product.Product;
import org.springframework.stereotype.Component;

interface OrderPort {
    Product getProductById(final Long productId);

    void save(Order order);
}
