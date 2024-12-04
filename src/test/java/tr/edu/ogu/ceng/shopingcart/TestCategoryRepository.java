package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tr.edu.ogu.ceng.shopingcart.entity.Category;
import tr.edu.ogu.ceng.shopingcart.repository.CategoryRepository;

@SpringBootTest
public class TestCategoryRepository extends Container{

    @Autowired
    CategoryRepository repository;

    @Test
    void test(){
        Category category = new Category();
        category.setName("q");
        repository.save(category);
    }

}
