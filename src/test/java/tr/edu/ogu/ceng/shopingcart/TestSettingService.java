package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import tr.edu.ogu.ceng.shopingcart.entity.Setting;
import tr.edu.ogu.ceng.shopingcart.repository.SettingRepository;
import tr.edu.ogu.ceng.shopingcart.service.SettingService;

import static junit.framework.TestCase.assertEquals;

@SpringBootTest
public class TestSettingService extends Container{
    @Autowired
    SettingService service;

    @MockBean
    SettingRepository repository;

    @Test
    public void test(){
        Setting settings = new Setting();
        service.saveSetting(settings);
    }
}
