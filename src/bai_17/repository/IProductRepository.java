package bai_17.repository;

import bai_17.models.Product;
import bai_17.models.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAllProduct();

    void add(String pathFile, List<Product> productList);
}
