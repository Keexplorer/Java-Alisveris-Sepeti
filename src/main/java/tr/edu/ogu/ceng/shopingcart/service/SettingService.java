package tr.edu.ogu.ceng.shopingcart.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.edu.ogu.ceng.shopingcart.entity.Setting;
import tr.edu.ogu.ceng.shopingcart.repository.SettingRepository;

@Service
@RequiredArgsConstructor
public class SettingService {

    private final SettingRepository settingRepository;

    public Setting GetSetting(Long id){
        return settingRepository.getReferenceById(id);
    }
}
