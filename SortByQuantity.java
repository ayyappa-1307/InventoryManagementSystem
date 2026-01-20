package comparator;

import model.Product;
import java.util.Comparator;

public class SortByQuantity implements Comparator<Product> {
public int compare(Product p1, Product p2) {
return Integer.compare(p1.getQuantity(), p2.getQuantity());
}
}