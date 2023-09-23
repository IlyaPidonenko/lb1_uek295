package ch.csbe.backendlb.resources.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        List<Product> products = productService.getAll();
        return products;
    }
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productService.getById(id);
        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product createdProduct = productService.create(product);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdProduct.getId())
                .toUri();
        return ResponseEntity.created(location).body(createdProduct);
    }




    @PutMapping("/{id}")
    @Operation(
            summary = "Aktualisieren Sie ein Produkt anhand seiner ID",
            operationId = "updateProductById",
            description = "Aktualisieren Sie ein Produkt anhand seiner ID."
    )
    public Product updateProductById(
            @Parameter(description = "ID des Produkts") @PathVariable("id") Long id,
            @RequestBody Product product) {
        return productService.update(id, product);
    }


    @DeleteMapping("/{id}")
    @Operation(
            summary = "Löschen Sie ein Produkt anhand seiner ID",
            operationId = "deleteProductById",
            description = "Löschen Sie ein Produkt anhand seiner ID."
    )
    @ApiResponse(
            responseCode = "204",
            description = "Produkt gelöscht"
    )
    public void deleteProductById(
            @Parameter(description = "ID des zu löschenden Produkts") @PathVariable("id") Long id) {
        productService.deleteById(id);
    }
}
