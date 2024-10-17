package tr.edu.ogu.ceng.shopingcart.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Settings")
public class Setting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "setting_key", nullable = false, length = 100)
    private String settingKey;

    @Column(name = "setting_value", length = 100)
    private String settingValue;
}
