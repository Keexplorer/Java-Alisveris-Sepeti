package tr.edu.ogu.ceng.shopingcart.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.edu.ogu.ceng.shopingcart.entity.Product;
import tr.edu.ogu.ceng.shopingcart.repository.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductService {


    private final ProductRepository productRepository;


    public Product saveProduct(Product product){

        return productRepository.save(product);

    }



}
