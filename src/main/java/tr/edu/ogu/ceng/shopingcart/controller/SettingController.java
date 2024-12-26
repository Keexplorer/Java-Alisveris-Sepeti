package tr.edu.ogu.ceng.shopingcart.controller;


import io.swagger.v3.oas.annotations.Operation;
import jdk.jfr.SettingControl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.edu.ogu.ceng.shopingcart.dto.SettingDto;
import tr.edu.ogu.ceng.shopingcart.entity.Setting;
import tr.edu.ogu.ceng.shopingcart.service.SettingService;

@RestController
@RequestMapping("/API/v1/Setting")
@RequiredArgsConstructor
public class SettingController {
    private final SettingService settingService;

    @GetMapping("/{id}")
    @Operation(summary = "Example Endpoint", description = "This is an example endpoint for demonstration purposes.")
    public SettingDto getSetting(@PathVariable Long id){

        return settingService.getSetting(id);
    }

    @PostMapping
    @Operation(summary = "Add a new user", description = "Saves a new user to the database.")
    public ResponseEntity<Setting> addUser(@RequestBody SettingDto settingDto){
        Setting setting = new Setting();
        setting.setSettingKey(settingDto.getSettingKey());
        setting.setSettingValue(settingDto.getSettingValue());

        Setting savedSetting = settingService.saveSetting(setting);
        return ResponseEntity.ok(savedSetting);
    }


}
