package service;

import java.util.*;
import model.Product;

public class InventoryService {

public static <T> void display(Collection<T> items) {
for (T item : items) {
System.out.println(item);
}
}
}
