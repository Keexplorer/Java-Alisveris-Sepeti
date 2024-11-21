package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.shaded.org.apache.commons.lang3.ObjectUtils;
import org.testcontainers.utility.DockerImageName;
import tr.edu.ogu.ceng.shopingcart.entity.User;
import tr.edu.ogu.ceng.shopingcart.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@SpringBootTest
public class TestUserRepository {
    static PostgreSQLContainer testContainer= new PostgreSQLContainer<>(DockerImageName.parse("postgres:16-alpine"));
    @Autowired
    UserRepository repository;
    static {
        testContainer.start();
    }

    @Test
    public void test(){
        User user = new User();
        user.setUsername("e");
        user.setEmail("e");
        user.setPassword("a");
        repository.save(user);
        User u = repository.getByUsername("e");
        assertEquals(u, user);
       // List<User> alluser = null;
       // alluser.add(user);
        repository.getAllUsers();
        //assertEquals(alluser, repository.getAllUsers());
    }


    @DynamicPropertySource


    static void configureProperties(DynamicPropertyRegistry registry) {


        registry.add("spring.datasource.url", testContainer::getJdbcUrl);


        registry.add("spring.datasource.username", testContainer::getUsername);


        registry.add("spring.datasource.password", testContainer::getPassword);


        registry.add("spring.data.redis.host", testContainer::getHost);

    }
}