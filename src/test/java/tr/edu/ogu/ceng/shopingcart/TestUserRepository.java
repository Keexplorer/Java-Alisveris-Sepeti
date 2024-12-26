package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tr.edu.ogu.ceng.shopingcart.entity.User;
import tr.edu.ogu.ceng.shopingcart.repository.UserRepository;
import static junit.framework.TestCase.assertEquals;

@SpringBootTest
public class TestUserRepository   {

    @Autowired
    UserRepository repository;

    @Test
    public void test(){
        User user = new User();
        user.setUsername("x");
        user.setEmail("y");
        user.setPassword("z");
        repository.save(user);
        Long id = user.getId();
        User u = repository.getByUsername("x");


        assertEquals(u, user);
       // List<User> alluser = null;
       // alluser.add(user);
        repository.getAllUsers();
        //assertEquals(alluser, repository.getAllUsers());

        repository.delete(user);
        //repository.deleteById(5L);
        if (repository.existsById(id)==false){
            System.out.println("Delete is successful!");
        }
        else
            System.out.println("Could not delete user!");



    }

}
