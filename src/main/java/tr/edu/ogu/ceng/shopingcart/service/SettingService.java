package tr.edu.ogu.ceng.shopingcart.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.edu.ogu.ceng.shopingcart.entity.Setting;
import tr.edu.ogu.ceng.shopingcart.repository.SettingRepository;

@Service
@RequiredArgsConstructor
public class SettingService {

    private final SettingRepository settingRepository;

    public Setting getSetting(Long id){

       return settingRepository.getReferenceById(id);

    }


    public  Setting saveSetting(Setting setting){

        return  settingRepository.save(setting);



    }
}
