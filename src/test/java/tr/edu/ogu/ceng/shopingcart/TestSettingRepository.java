package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;
import tr.edu.ogu.ceng.shopingcart.entity.Setting;
import tr.edu.ogu.ceng.shopingcart.repository.SettingRepository;
import tr.edu.ogu.ceng.shopingcart.repository.UserRepository;

@SpringBootTest
public class TestSettingRepository {
    static PostgreSQLContainer testContainer= new PostgreSQLContainer<>(DockerImageName.parse("postgres:16-alpine"));
    @Autowired
    SettingRepository repository;
    static {
        testContainer.start();
    }

    @Test
    void test(){
        Setting setting = new Setting();
        repository.save(setting);
    }
    @DynamicPropertySource


    static void configureProperties(DynamicPropertyRegistry registry) {


        registry.add("spring.datasource.url", testContainer::getJdbcUrl);


        registry.add("spring.datasource.username", testContainer::getUsername);


        registry.add("spring.datasource.password", testContainer::getPassword);


        registry.add("spring.data.redis.host", testContainer::getHost);

    }
}
