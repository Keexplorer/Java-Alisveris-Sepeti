package tr.edu.ogu.ceng.shopingcart.dto;


import lombok.Data;

@Data
public class SettingDto {

    private Long id;

    private String settingKey;

    private String settingValue;
}
