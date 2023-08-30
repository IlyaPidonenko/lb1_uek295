package ch.csbe.backendlb.Entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findAllProductsById(Integer id);

    @Query("SELECT t FROM Product t WHERE t.title = ?1")
    Product findProductsById(Integer id);
}
