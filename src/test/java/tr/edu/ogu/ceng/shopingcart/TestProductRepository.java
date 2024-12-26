package tr.edu.ogu.ceng.shopingcart;

import org.apache.commons.lang3.ObjectUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tr.edu.ogu.ceng.shopingcart.entity.Product;
import tr.edu.ogu.ceng.shopingcart.repository.ProductRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class TestProductRepository  {

    @Autowired
    ProductRepository productRepository;



    @Test
    void test(){
        Product product = new Product();
        product.setName("e");
        product.setPrice(1.2);
        product.setStockQuantity(2);
        productRepository.save(product);

        productRepository.deleteById(product.getId());

        if (productRepository.existsById(product.getId()) ==true){

            System.out.println("Product var");
        }else{
            System.out.println("Product yok");
        }





    }







}
