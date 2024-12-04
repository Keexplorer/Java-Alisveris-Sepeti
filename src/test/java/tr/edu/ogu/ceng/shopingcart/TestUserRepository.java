package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tr.edu.ogu.ceng.shopingcart.entity.User;
import tr.edu.ogu.ceng.shopingcart.repository.UserRepository;
import static junit.framework.TestCase.assertEquals;

@SpringBootTest
public class TestUserRepository extends Container {

    @Autowired
    UserRepository repository;

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

}
