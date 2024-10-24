package tr.edu.ogu.ceng.shopingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.edu.ogu.ceng.shopingcart.entity.Category;

@Repository
public interface CategoryRepository  extends JpaRepository<Category,Long> {
}
