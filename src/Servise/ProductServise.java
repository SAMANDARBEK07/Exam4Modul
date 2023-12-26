package Servise;

import domain.Product;

import java.util.ArrayList;
import java.util.List;

public interface ProductServise {

    List<Product>PRODUCTS=new ArrayList<>();
    void addProduct(String name);
    void deleteProduct();
    void editProduct();
}
