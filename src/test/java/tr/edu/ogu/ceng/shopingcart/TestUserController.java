package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import tr.edu.ogu.ceng.shopingcart.controller.UserController;
import tr.edu.ogu.ceng.shopingcart.dto.UserDto;
import tr.edu.ogu.ceng.shopingcart.service.UserService;

import java.time.LocalDateTime;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class TestUserController extends Container {

}

