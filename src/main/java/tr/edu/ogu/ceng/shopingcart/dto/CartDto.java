package tr.edu.ogu.ceng.shopingcart.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Version;
import lombok.Data;
import tr.edu.ogu.ceng.shopingcart.entity.CartItem;
import tr.edu.ogu.ceng.shopingcart.entity.User;

import java.time.LocalDateTime;
import java.util.List;


@Data
public class CartDto {


    private Long id;


    private User user;

    private List<CartItem> cartItems;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Integer createdBy;

    private Integer updatedBy;

    private Integer deletedBy;

    private LocalDateTime deletedAt;

    private Integer version;
}
