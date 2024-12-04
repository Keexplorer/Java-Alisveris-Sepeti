package tr.edu.ogu.ceng.shopingcart.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.edu.ogu.ceng.shopingcart.dto.SettingDto;
import tr.edu.ogu.ceng.shopingcart.service.UserService;

@RestController
@RequestMapping("/API/v1/User")
@RequiredArgsConstructor
public class UserController {
private final UserService userService;

}
