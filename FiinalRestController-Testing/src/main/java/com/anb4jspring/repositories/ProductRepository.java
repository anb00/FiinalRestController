package com.anb4jspring.repositories;


import java.util.ArrayList;
import java.util.List;

import com.anb4japi.Product;
import org.springframework.stereotype.Component;
//import domain.Product;

@Component
public class ProductRepository {
    private List<Product> products = new ArrayList<Product>();
    public ProductRepository() {
        products.add(new Product("Swimming","adventure adults",200f,"Nivel Alto"));
        products.add(new Product("Climnbing","adventure adults",200f,"Nivel Alto"));
        products.add(new Product("Shopping","Para todos los públicos",200f,"No level"));
    }

    public void create(Product product) { products.add(product); }
    public void remove(Product product) { products.remove(product); }
    public Product find(int id){ return  products.get(id);}
    public List<Product> findAll(){ return products;}
    public void update(int id, Product product) { products.set(id, product);}
}
