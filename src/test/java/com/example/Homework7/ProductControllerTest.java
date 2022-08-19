package com.example.Homework7;

import com.example.Homework7.controller.ShoppingCartController;
import com.example.Homework7.model.Product;
import com.example.Homework7.model.ProductType;
import com.example.Homework7.service.ShoppingCartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ShoppingCartController.class)
public class ProductControllerTest {
    @MockBean
    ShoppingCartController shoppingCartController;

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void it_should_add_stock() throws Exception {
        Product testProduct = new Product(null, ProductType.ELB, "Aragaz", "CRO", 4, false, 195);
        mockMvc.perform(post("/product/newStock/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
