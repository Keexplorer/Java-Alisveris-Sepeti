package tr.edu.ogu.ceng.shopingcart;

import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

public class Container {

        static PostgreSQLContainer testContainer= new PostgreSQLContainer<>(DockerImageName.parse("postgres:16-alpine"));

        static{
            testContainer.start();
        }
        @DynamicPropertySource
        static void configureProperties(DynamicPropertyRegistry registry) {


            registry.add("spring.datasource.url", testContainer::getJdbcUrl);


            registry.add("spring.datasource.username", testContainer::getUsername);


            registry.add("spring.datasource.password", testContainer::getPassword);


            registry.add("spring.data.redis.host", testContainer::getHost);
        }



}
