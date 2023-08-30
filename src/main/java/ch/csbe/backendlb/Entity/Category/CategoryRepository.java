package ch.csbe.backendlb.Entity.Category;

import ch.csbe.backendlb.Entity.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepository extends JpaRepository<Product, Integer> {
    Product findAllCategoryById(Integer id);

    @Query("SELECT t FROM Category t WHERE t.title = ?1")
    Product findCategoryById(Integer id);
}
