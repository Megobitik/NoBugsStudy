package Tests.ComboTasksTest;

import ComboTasks.invevory.InventoryService;
import ComboTasks.invevory.OutOfStockException;
import ComboTasks.invevory.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {
    InventoryService service = new InventoryService();

    @Test
    public void addProductWhenInventoryOpenTest() throws OutOfStockException {
        Product product = new Product("MAC", 1000, "Electronics");

        service.addProduct(product);

        List<Product> products = service.getAllProductByCategory("Electronics");

        assertEquals(1,products.size());
        assertEquals("MAC",products.get(0).getName());
    }

    @Test
    public void checkGetProductByCategory() throws OutOfStockException {
        Product product = new Product("MAC", 1000, "Electronics");
        service.addProduct(product);

        Product result = service.getProductByCategory("Electronics");

        assertEquals("Electronics",result.getCategory());
    }

    @Test
    public void checkAddProductWhenInventoryClosed() {
        service.setInventoryOpen(false);

        Product product = new Product("Phone", 800, "Phones");

        assertThrows(OutOfStockException.class, () -> {
            service.addProduct(product);
        });
    }

    @Test
    public void checkThrowException(){
        assertThrows(OutOfStockException.class,() -> service.getProductByCategory("example"));
    }

    @Test
    public void addAllProductWhenInventoryOpenTest() throws OutOfStockException {
        Product product1 = new Product("MAC", 1000, "Electronics");
        Product product2 = new Product("IPHONE", 2000, "Electronics");

        service.addProduct(product1);
        service.addProduct(product2);

        List<Product> products = service.getAllProductByCategory("Electronics");

        assertEquals(2,products.size());
        assertEquals("MAC",products.get(0).getName());
        assertEquals("IPHONE",products.get(1).getName());
    }

    @Test
    public void checkFiltredProductByPrice() throws OutOfStockException {
        Product product1 = new Product("MAC", 1000, "Electronics");
        Product product2 = new Product("IPHONE", 2000, "Electronics");

        service.addProduct(product1);
        service.addProduct(product2);

        List<Product> products = service.getProductByPrice("Electronics",1500,2000);

        assertEquals(1,products.size());
        assertEquals("IPHONE",products.get(0).getName());
    }
}
