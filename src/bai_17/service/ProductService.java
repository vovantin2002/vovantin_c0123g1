package bai_17.service;

import bai_17.models.Product;
import bai_17.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private ProductRepository productRepository = new ProductRepository();
    @Override
    public void display() {
        List<Product > product = productRepository.getAllProduct();
        for (Product s : product) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {

    }
}
