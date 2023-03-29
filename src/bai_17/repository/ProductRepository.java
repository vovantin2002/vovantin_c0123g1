package bai_17.repository;

import bai_17.models.Product;
import bai_17.util.ReadAndWrite;

import java.util.List;

public class ProductRepository implements IProductRepository {
    private final String FILE = "src\\bai_17\\data\\text.csv";

    @Override
    public List<Product> getAllProduct() {
        return ReadAndWrite.readFileToListString(FILE);

    }


    @Override
    public void add(String pathFile, List<Product> productList) {
        ReadAndWrite.writeStringToFile(pathFile, productList);
    }


}
