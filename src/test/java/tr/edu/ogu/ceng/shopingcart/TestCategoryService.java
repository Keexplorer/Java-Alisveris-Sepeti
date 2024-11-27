package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tr.edu.ogu.ceng.shopingcart.entity.Category;
import tr.edu.ogu.ceng.shopingcart.repository.CategoryRepository;
import tr.edu.ogu.ceng.shopingcart.service.CategoryService;

@SpringBootTest
public class TestCategoryService {
    @Autowired
    CategoryService service;

    @Mock
    CategoryRepository repository;

    @Test
    public void test(){
        Category category = new Category();
        category.setName("d");
        service.saveCategory(category);
    }
}
