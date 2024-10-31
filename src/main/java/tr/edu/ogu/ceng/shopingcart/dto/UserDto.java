package tr.edu.ogu.ceng.shopingcart.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Version;
import lombok.Data;

import java.time.LocalDateTime;


@Data
public class UserDto {
    private Long id;
    private String username;
    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private String address;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Integer createdBy;

    private Integer updatedBy;

    private Integer deletedBy;

    private LocalDateTime deletedAt;

    private Integer version;

}
