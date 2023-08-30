package ch.csbe.backendlb.Entity.User;

import ch.csbe.backendlb.Entity.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Product, Integer> {
    Product findAllUsersById(Integer id);

    @Query("SELECT t FROM User t WHERE t.name = ?1")
    Product findUserById(Integer id);
}