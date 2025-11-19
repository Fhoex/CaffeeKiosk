package com.diego.interfaces;
import com.diego.model.MenuItem;
import com.diego.model.Category;
import java.util.List;

public interface CatalogRepository {
    List<MenuItem> all();
    List<MenuItem> byCategory(Category category);
}