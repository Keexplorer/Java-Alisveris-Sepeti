package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import tr.edu.ogu.ceng.shopingcart.entity.Product;
import tr.edu.ogu.ceng.shopingcart.repository.ProductRepository;
import tr.edu.ogu.ceng.shopingcart.service.ProductService;

@SpringBootTest
public class TestProductService extends Container{
    @Autowired
    ProductService service;

    @MockBean
    ProductRepository repository;

    @Test

    public void test(){
        Product product = new Product();
        product.setName("k");
        product.setPrice(2.1);
        product.setStockQuantity(10);
        service.saveProduct(product);


        service.deleteProduct(product);
    }
}
