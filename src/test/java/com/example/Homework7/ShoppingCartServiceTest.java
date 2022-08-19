package com.example.Homework7;

import com.example.Homework7.model.Product;
import com.example.Homework7.model.ProductType;
import com.example.Homework7.repository.ProductRepository;
import com.example.Homework7.repository.ShoppingCartRepository;
import com.example.Homework7.service.ProductService;
import com.example.Homework7.service.ShoppingCartService;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingCartServiceTest {
    @Mock
    ShoppingCartRepository shoppingCartRepository;

    @InjectMocks
    ShoppingCartService shoppingCartService;

    @Test
    public void it_should_get_totalPrice() {
        Product product = new Product(null, ProductType.ELB, "Cuptor", "CRO", 4, false, 195);

        AssertionsForClassTypes.assertThat(shoppingCartService
                .totalPrice(1))
                .isEqualTo(product);
    }

}
