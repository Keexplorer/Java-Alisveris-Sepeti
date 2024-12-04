package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tr.edu.ogu.ceng.shopingcart.controller.UserController;
import tr.edu.ogu.ceng.shopingcart.service.UserService;
@SpringBootTest
public class TestUserController extends Container {
    @Mock
    UserService service;
    @Autowired
    UserController controller;
    static {
        testContainer.start();
    }
    public static String Url;
    @Test
    public void test(){

    }

}
