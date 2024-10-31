package tr.edu.ogu.ceng.shopingcart.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Entity
@Table(name = "setting")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //FIXME DTO ile çöz
@Data
public class Setting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "setting_key", length = 100)
    private String settingKey;

    @Column(name = "setting_value", length = 100)
    private String settingValue;

//    // Getters and Setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getSettingKey() {
//        return settingKey;
//    }
//
//    public void setSettingKey(String settingKey) {
//        this.settingKey = settingKey;
//    }
//
//    public String getSettingValue() {
//        return settingValue;
//    }
//
//    public void setSettingValue(String settingValue) {
//        this.settingValue = settingValue;
//    }

}
