package ComboTasks.invevory;

import java.util.*;
import java.util.stream.Collectors;

public class InventoryService {

    private final Map<String, List<Product>> inventory = new HashMap<>();
    private boolean isInventoryOpen = true;

    public void setInventoryOpen(boolean inventoryOpen) {
        this.isInventoryOpen = inventoryOpen;
    }

    public void addProduct(Product product) throws OutOfStockException {
        if (!isInventoryOpen) {
            throw new OutOfStockException("Склад закрыт");
        }

        if (product == null) {
            throw new IllegalArgumentException("Product не должен быть null");
        }

        inventory
                .computeIfAbsent(product.getCategory(), k -> new ArrayList<>())
                .add(product);
    }

    public Product getProductByCategory(String category) throws OutOfStockException {
        List<Product> products = inventory.get(category);

        if (products == null || products.isEmpty()) {
            throw new OutOfStockException("Нет товаров в категории: " + category);
        }

        return products.remove(0);
    }

    public List<Product> getAllProductByCategory(String category) {
        return new ArrayList<>(
                inventory.getOrDefault(category, Collections.emptyList())
        );
    }

    public List<Product> getProductByPrice(String category, double minPrice, double maxPrice) {

        if (minPrice > maxPrice) {
            throw new IllegalArgumentException("minPrice > maxPrice");
        }

        return inventory.getOrDefault(category, Collections.emptyList())
                .stream()
                .filter(p -> p.getPrice() >= minPrice && p.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }
}