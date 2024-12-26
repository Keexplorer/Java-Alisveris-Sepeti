package tr.edu.ogu.ceng.shopingcart.service;


import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import tr.edu.ogu.ceng.shopingcart.dto.ProductDto;
import tr.edu.ogu.ceng.shopingcart.dto.SettingDto;
import tr.edu.ogu.ceng.shopingcart.entity.Product;
import tr.edu.ogu.ceng.shopingcart.entity.Setting;
import tr.edu.ogu.ceng.shopingcart.repository.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductService {


    private final ProductRepository productRepository;

    private final RestClient restClient;




    public ProductDto getProduct(Long id){
        Product product =productRepository.getReferenceById(id);

        return convertToDto((product));




    }



    public Product saveProduct(Product product){

        return productRepository.save(product);

    }

    public void deleteProduct(Product product){
        productRepository.delete(product);
    }

//    public Product deleteProduct(Product product){
//
//        return
//
//
//    }

    private ProductDto convertToDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());
        productDto.setPrice(product.getPrice());
        productDto.setStockQuantity(product.getStockQuantity());
        productDto.setImageUrl(product.getImageUrl());
        productDto.setCreatedAt(product.getCreatedAt());
        productDto.setUpdatedAt(product.getUpdatedAt());
        productDto.setCategory(product.getCategory());
        productDto.setCreatedBy(product.getCreatedBy());
        productDto.setUpdatedBy(product.getUpdatedBy());
        productDto.setDeletedBy(product.getDeletedBy());
        productDto.setDeletedAt(product.getDeletedAt());
        productDto.setVersion(product.getVersion());

        return productDto;

    }

    public Product getProductFromProductService(){

         return restClient.get().uri("http://192.168.137.195:8007/api/v1/urunler/1").accept(MediaType.APPLICATION_JSON).retrieve().body(Product.class);


    }





}
