package model;

import java.time.LocalDateTime;

public class InventoryTransaction {
private String sku;
private String action;
private LocalDateTime time;

public InventoryTransaction(String sku, String action) {
this.sku = sku;
this.action = action;
this.time = LocalDateTime.now();
}

@Override
public String toString() {
return time + " - " + sku + " : " + action;
}
}