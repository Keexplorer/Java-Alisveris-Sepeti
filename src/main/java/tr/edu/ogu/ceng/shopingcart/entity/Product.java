package tr.edu.ogu.ceng.shopingcart.entity;

import jakarta.persistence.*;
import lombok.Data;



import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "Products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private double price;

    @Column(name = "stock_quantity", nullable = false)
    private int stockQuantity;

    @Column(name = "image_url", length = 255)
    private String imageUrl;

    @Column(name = "is_active", columnDefinition = "BOOLEAN DEFAULT TRUE")
    private boolean isActive = true;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;
}

