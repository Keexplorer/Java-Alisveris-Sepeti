package tr.edu.ogu.ceng.shopingcart.controller;


import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.edu.ogu.ceng.shopingcart.dto.CategoryDto;
import tr.edu.ogu.ceng.shopingcart.dto.SettingDto;
import tr.edu.ogu.ceng.shopingcart.entity.Category;
import tr.edu.ogu.ceng.shopingcart.entity.Setting;
import tr.edu.ogu.ceng.shopingcart.service.CategoryService;

@RestController
@RequestMapping("/API/v1/Category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    @GetMapping("/{id}")
    @Operation(summary = "Example Endpoint", description = "This is an example endpoint for demonstration purposes.")
    public CategoryDto getCategory(@PathVariable Long id){

        return categoryService.getCategory(id);
    }



}
