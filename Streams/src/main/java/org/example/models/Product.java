package org.example.models;

import java.util.Objects;

public class Product {

    private final Long id;

    private final Double price;

    public Product(Long id, Double price) {
        this.id = id;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
