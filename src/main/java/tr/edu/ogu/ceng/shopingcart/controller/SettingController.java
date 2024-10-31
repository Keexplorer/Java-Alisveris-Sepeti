package tr.edu.ogu.ceng.shopingcart.controller;


import jdk.jfr.SettingControl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.edu.ogu.ceng.shopingcart.dto.SettingDto;
import tr.edu.ogu.ceng.shopingcart.entity.Setting;
import tr.edu.ogu.ceng.shopingcart.service.SettingService;

@RestController
@RequestMapping("/API/v1/Setting")
@RequiredArgsConstructor
public class SettingController {
    private final SettingService settingService;

    @GetMapping("/{id}")
    public SettingDto getSetting(@PathVariable Long id){

        return settingService.getSetting(id);

    }

}
