package tr.edu.ogu.ceng.shopingcart.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.edu.ogu.ceng.shopingcart.dto.CategoryDto;
import tr.edu.ogu.ceng.shopingcart.dto.SettingDto;
import tr.edu.ogu.ceng.shopingcart.entity.Category;

import tr.edu.ogu.ceng.shopingcart.entity.Setting;
import tr.edu.ogu.ceng.shopingcart.repository.CategoryRepository;


@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;


    public CategoryDto getCategory(Long id){
        Category category =categoryRepository.getReferenceById(id);

        return convertToDto(category);

    }

    public Category saveCategory(Category category){

        return categoryRepository.save(category);

    }

    private CategoryDto convertToDto(Category category) {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setName(category.getName());
        categoryDto.setCreatedAt(category.getCreatedAt());
        categoryDto.setCreatedBy(category.getCreatedBy());
        categoryDto.setDeletedBy(category.getDeletedBy());
        categoryDto.setUpdatedAt(category.getUpdatedAt());
        categoryDto.setVersion(category.getVersion());
        categoryDto.setUpdatedBy(category.getUpdatedBy());
        categoryDto.setDeletedAt(category.getDeletedAt());
        return categoryDto;
        //settingDto.setSettingKey(setting.getSettingKey());
        //settingDto.setSettingValue(setting.getSettingValue());
        //return settingDto;

    }





}
