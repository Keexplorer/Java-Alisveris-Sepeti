package tr.edu.ogu.ceng.shopingcart.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Version;
import lombok.Data;
import tr.edu.ogu.ceng.shopingcart.entity.Cart;
import tr.edu.ogu.ceng.shopingcart.entity.Product;

import java.time.LocalDateTime;



@Data
public class CartItemDto {


    private Long id;


    private Cart cart;


    private Product product;

    private int quantity;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Integer createdBy;

    private Integer updatedBy;

    private Integer deletedBy;

    private LocalDateTime deletedAt;

    private Integer version;
}
