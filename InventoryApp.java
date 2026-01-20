package main;

import model.*;
import comparator.*;
import service.*;
import java.util.*;

public class InventoryApp {
public static void main(String[] args) {
HashSet<Product> products = new HashSet<>();

products.add(new Product("SKU101", "Mouse", 499, 20));
products.add(new Product("SKU102", "Laptop", 55000, 5));

TreeSet<Product> sortedProducts = new TreeSet<>(new SortByPrice());
sortedProducts.addAll(products);

InventoryService.display(sortedProducts);
}
}
