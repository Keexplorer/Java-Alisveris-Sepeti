package tr.edu.ogu.ceng.shopingcart.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Version;
import lombok.Data;
import tr.edu.ogu.ceng.shopingcart.entity.Category;

import java.time.LocalDateTime;

@Data
public class ProductDto {

    private Long id;

    private String name;

    private String description;

    private double price;

    private int stockQuantity;

    private String imageUrl;

    private boolean isActive = true;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Category category;

    private Integer createdBy;

    private Integer updatedBy;

    private Integer deletedBy;

    private LocalDateTime deletedAt;

    private Integer version;

}
