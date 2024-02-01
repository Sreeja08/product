package com.example.nxttrendz1.repository;

import java.util.ArrayList;
import com.example.nxttrendz1.model.*;
import org.springframework.stereotype.Repository;

public interface ProductRepository {

    ArrayList<Product> getProducts();

    Product addProduct(Product product);

    Product updateProduct(int productId, Product product);

    Product getProductById(int productId);

    void deleteProductById(int productId);
}