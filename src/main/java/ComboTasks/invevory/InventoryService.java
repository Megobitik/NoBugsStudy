package ComboTasks.invevory;

import java.util.*;
import java.util.stream.Collectors;

public class InventoryService {

    private Map<String, List<Product>> inventory = new HashMap<>();
    private boolean isInventoryOpen = true;

    public void setInventoryOpen(Boolean inventoryOpen){
        isInventoryOpen = inventoryOpen;
    }

    public void addProduct(Product product){
        if (!isInventoryOpen){
            return;
        }
        inventory.computeIfAbsent(product.getCategory(),k -> new ArrayList<>()).add(product);
    }

    public Product getProductByCategory(String categoty) throws OutOfStockException {

        List<Product> products = inventory.get(categoty);

        if (products == null || products.isEmpty()){
            throw new OutOfStockException("No product");
        }
        return products.remove(0);
    }

    public List<Product> getAllProductByCategory(String category){
        return inventory.getOrDefault(category, Collections.emptyList()).stream().collect(Collectors.toList());
    }

    public List<Product> getProductByPrice(String category, double price){
        return inventory.getOrDefault(category,Collections.emptyList())
                .stream()
                .filter(p -> p.getPrice() >= price)
                .collect(Collectors.toList());
    }
}
