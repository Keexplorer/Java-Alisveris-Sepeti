package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import tr.edu.ogu.ceng.shopingcart.dto.CartDto;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testCreateCart() {
        CartDto cartDto = new CartDto();
        ResponseEntity<CartDto> response = restTemplate.postForEntity("/API/v1/Cart", cartDto, CartDto.class);

        assertEquals(200, response.getStatusCodeValue());
        assertNotNull(response.getBody().getId());
    }
}
