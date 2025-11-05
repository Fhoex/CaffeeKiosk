package com.diego.interfaces;
import com.diego.model.MenuItem;
import java.util.List;
import com.diego.model.Category;

public interface CatalogRepository {
    List<MenuItem> all();
    List<MenuItem> byCategory(Category category);
}