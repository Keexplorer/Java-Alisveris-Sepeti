package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import tr.edu.ogu.ceng.shopingcart.entity.User;
import tr.edu.ogu.ceng.shopingcart.repository.UserRepository;
import tr.edu.ogu.ceng.shopingcart.service.UserService;

import static junit.framework.TestCase.assertEquals;


@SpringBootTest
@TestConfiguration
public class TestUserService  {
    @Autowired
    UserService service;
    @MockBean
    UserRepository repository;
    @Test
    public void test(){
        User user = new User();
        user.setPassword("123456");
        user.setUsername("emirhan");
        user.setEmail("emirhan@emirhan.com");
        service.saveUser(user);
//        User user2 = service.;
//        assertEquals("testuser", user2.getUsername());
//        System.out.println(user2.getUsername());
        repository.save(user);
    }
}
