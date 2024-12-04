package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tr.edu.ogu.ceng.shopingcart.entity.Setting;
import tr.edu.ogu.ceng.shopingcart.repository.SettingRepository;

@SpringBootTest
public class TestSettingRepository extends Container{

    @Autowired
    SettingRepository repository;

    @Test
    void test(){
        Setting setting = new Setting();
        repository.save(setting);
    }

}
