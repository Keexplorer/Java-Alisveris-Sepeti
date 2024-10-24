package tr.edu.ogu.ceng.shopingcart.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.edu.ogu.ceng.shopingcart.entity.Category;

import tr.edu.ogu.ceng.shopingcart.repository.CategoryRepository;


@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;


    public Category saveCategory(Category category){

        return categoryRepository.save(category);

    }





}
