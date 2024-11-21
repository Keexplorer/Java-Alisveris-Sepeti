package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import tr.edu.ogu.ceng.shopingcart.dto.CartDto;
import tr.edu.ogu.ceng.shopingcart.dto.SettingDto;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testCreateCart() {
        SettingDto settingDto = new SettingDto();
        ResponseEntity<SettingDto> response = restTemplate.postForEntity("/API/v1/Setting", settingDto, SettingDto.class);

    }
}
