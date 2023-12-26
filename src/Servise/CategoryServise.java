package Servise;

import domain.Category;

import java.util.ArrayList;
import java.util.List;

public interface CategoryServise {

    List<Category> CATEGORIES=new ArrayList<>();

    void addCategory(String categoryName,Integer productId);
    void editCategory(String categotyName,Integer productId);
}
