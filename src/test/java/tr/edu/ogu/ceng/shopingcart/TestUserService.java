package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import tr.edu.ogu.ceng.shopingcart.entity.User;
import tr.edu.ogu.ceng.shopingcart.repository.UserRepository;
import tr.edu.ogu.ceng.shopingcart.service.UserService;

@SpringBootTest
public class TestUserService extends Container {
    @Autowired
    UserService service;
    @MockBean
    UserRepository repository;
    @Test
    public void test(){
        User user = new User();
        user.setPassword("e");
        user.setUsername("h");
        user.setEmail("k");
        service.saveUser(user);
    }
}
