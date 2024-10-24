package tr.edu.ogu.ceng.shopingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.edu.ogu.ceng.shopingcart.entity.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Long> {
}
