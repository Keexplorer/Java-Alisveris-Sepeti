package tr.edu.ogu.ceng.shopingcart.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.edu.ogu.ceng.shopingcart.dto.SettingDto;
import tr.edu.ogu.ceng.shopingcart.entity.Setting;
import tr.edu.ogu.ceng.shopingcart.repository.SettingRepository;

@Service
@RequiredArgsConstructor
public class SettingService {

    private final SettingRepository settingRepository;

    public SettingDto getSetting(Long id){
        Setting setting =settingRepository.getReferenceById(id);

        return convertToDto(setting);

    }


    public  Setting saveSetting(Setting setting){

        return  settingRepository.save(setting);



    }

    private SettingDto convertToDto(Setting setting) {
        SettingDto settingDto = new SettingDto();
        settingDto.setId(setting.getId());
        settingDto.setSettingKey(setting.getSettingKey());
        settingDto.setSettingValue(setting.getSettingValue());
        return settingDto;

    }
}
