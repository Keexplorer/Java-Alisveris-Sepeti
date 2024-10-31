package tr.edu.ogu.ceng.shopingcart.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Version;
import lombok.Data;

import java.time.LocalDateTime;


@Data
public class CategoryDto {


    private Long id;

    private String name;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Long createdBy;

    private Long updatedBy;


    private Long deletedBy;

    private LocalDateTime deletedAt;

    private Integer version;
}
