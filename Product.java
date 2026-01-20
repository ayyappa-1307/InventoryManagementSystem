package model;

public class Product implements Comparable<Product> {
private String sku;
private String name;
private double price;
private int quantity;

public Product(String sku, String name, double price, int quantity) {
this.sku = sku;
this.name = name;
this.price = price;
this.quantity = quantity;
}

public String getSku() { return sku; }
public String getName() { return name; }
public double getPrice() { return price; }
public int getQuantity() { return quantity; }

@Override
public int compareTo(Product o) {
return this.name.compareToIgnoreCase(o.name);
}

@Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (!(obj instanceof Product)) return false;
Product p = (Product) obj;
return sku.equals(p.sku);
}

@Override
public int hashCode() {
return sku.hashCode();
}

@Override
public String toString() {
return sku + " | " + name + " | ₹" + price + " | Qty: " + quantity;
}
}
