package com.example.productorderservice.order;

import com.example.productorderservice.ApiTest;
import com.example.productorderservice.product.ProductSteps;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class OrderApiTest extends ApiTest {

    @Test
    void 상품준문() {
        ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성());
        final CreateOrderRequest requset = OrderSteps.상품주문요청_생성();

        final var response = OrderSteps.상품주문요청(requset);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
    }

}
