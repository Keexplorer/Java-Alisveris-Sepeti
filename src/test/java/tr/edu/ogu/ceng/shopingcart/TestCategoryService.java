package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import tr.edu.ogu.ceng.shopingcart.entity.Category;
import tr.edu.ogu.ceng.shopingcart.repository.CategoryRepository;
import tr.edu.ogu.ceng.shopingcart.service.CategoryService;

@SpringBootTest
public class TestCategoryService {
    @Autowired
    CategoryService service;


    CategoryRepository repository;

    @Test
    public void test(){
        Category category=new Category();
        category.setName("denemee");
        repository.save(category);

        service.deleteCategory(category);

        repository.save(category);


       // service.updateCategory(category, 1L);

       // service.deleteCategory(category);

    }
}
