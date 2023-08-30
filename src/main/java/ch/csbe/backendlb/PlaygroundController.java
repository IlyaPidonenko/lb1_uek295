package ch.csbe.backendlb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PlaygroundController {

    @PostMapping("/products")
    public String createProduct() {
        System.out.println("Product created");
        return "Product created successfully";
    }

    @GetMapping("/products/{id}")
    public String getProduct(@PathVariable Long id) {
        System.out.println("Product details requested for ID: " + id);
        return "Product details";
    }

    @PutMapping("/products/{id}")
    public String updateProduct(@PathVariable Long id) {
        System.out.println("Product updated for ID: " + id);
        return "Product updated successfully";
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable Long id) {
        System.out.println("Product deleted for ID: " + id);
        return "Product deleted successfully";
    }

    @GetMapping("/products")
    public String getAllProducts() {
        System.out.println("All products requested");
        return "List of products";
    }

    @PostMapping("/categories")
    public String createCategory() {
        System.out.println("Category created");
        return "Category created successfully";
    }

    @GetMapping("/categories/{id}")
    public String getCategory(@PathVariable Long id) {
        System.out.println("Category details requested for ID: " + id);
        return "Category details";
    }

    @PutMapping("/categories/{id}")
    public String updateCategory(@PathVariable Long id) {
        System.out.println("Category updated for ID: " + id);
        return "Category updated successfully";
    }

    @DeleteMapping("/categories/{id}")
    public String deleteCategory(@PathVariable Long id) {
        System.out.println("Category deleted for ID: " + id);
        return "Category deleted successfully";
    }

    @GetMapping("/categories")
    public String getAllCategories() {
        System.out.println("All categories requested");
        return "List of categories";
    }

    @GetMapping("/categories/{id}/products")
    public String getProductsInCategory(@PathVariable Long id) {
        System.out.println("Products in category requested for ID: " + id);
        return "List of products in category";
    }
}


