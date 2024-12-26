package tr.edu.ogu.ceng.shopingcart.controller;


import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.edu.ogu.ceng.shopingcart.dto.UserDto;
import tr.edu.ogu.ceng.shopingcart.entity.User;
import tr.edu.ogu.ceng.shopingcart.service.UserService;

@RestController
@RequestMapping("/API/v1/User")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping("/{id}")
    @Operation(summary = "Example Endpoint", description = "This is an example endpoint for demonstration purposes.")
    public UserDto getUser(@PathVariable Long id) {

        return userService.getUser(id);
    }

    @PostMapping
    @Operation(summary = "Add a new user", description = "Saves a new user to the database.")
    public ResponseEntity<User> addUser(@RequestBody UserDto userDto){
        User user = new User();
        user.setId(userDto.getId());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setUsername(userDto.getUsername());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setAddress(userDto.getAddress());
        user.setCreatedAt(userDto.getCreatedAt());
        user.setCreatedBy(userDto.getCreatedBy());
        user.setDeletedAt(userDto.getDeletedAt());
        user.setDeletedBy(userDto.getDeletedBy());
        user.setUpdatedAt(userDto.getUpdatedAt());
        user.setUpdatedBy(userDto.getUpdatedBy());
        user.setVersion(userDto.getVersion());


        User savedUser = userService.saveUser(user);
        return ResponseEntity.ok(savedUser);
    }



}
