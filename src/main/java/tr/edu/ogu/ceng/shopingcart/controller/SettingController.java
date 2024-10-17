package tr.edu.ogu.ceng.shopingcart.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.edu.ogu.ceng.shopingcart.entity.Setting;
import tr.edu.ogu.ceng.shopingcart.service.SettingService;

@RestController
@RequestMapping("/API/V1/Setting")
@RequiredArgsConstructor

public class SettingController {
    private final SettingService settingService;
   @GetMapping("{id}")
   public Setting GetSetting(Long id)
    {


        return settingService.GetSetting(id);
    }



}
