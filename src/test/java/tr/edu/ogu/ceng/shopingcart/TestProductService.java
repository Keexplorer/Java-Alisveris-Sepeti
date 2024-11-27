package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tr.edu.ogu.ceng.shopingcart.entity.Product;
import tr.edu.ogu.ceng.shopingcart.repository.ProductRepository;
import tr.edu.ogu.ceng.shopingcart.service.ProductService;

@SpringBootTest
public class TestProductService {
    @Autowired
    ProductService service;

    @Mock
    ProductRepository repository;

    @Test

    public void test(){
        Product product = new Product();
        product.setName("k");
        product.setPrice(2.1);
        product.setStockQuantity(10);
        service.saveProduct(product);
    }
}
