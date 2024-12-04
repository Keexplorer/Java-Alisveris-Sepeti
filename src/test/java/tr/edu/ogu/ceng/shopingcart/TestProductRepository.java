package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tr.edu.ogu.ceng.shopingcart.entity.Product;
import tr.edu.ogu.ceng.shopingcart.repository.ProductRepository;

@SpringBootTest
public class TestProductRepository extends Container{

    @Autowired
    ProductRepository repository;

    @Test
    void test(){
        Product product = new Product();
        product.setName("e");
        product.setPrice(1.2);
        product.setStockQuantity(2);
        repository.save(product);
    }

}
