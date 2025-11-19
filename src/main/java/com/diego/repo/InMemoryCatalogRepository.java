package com.diego.repo;
import com.diego.interfaces.CatalogRepository;
import com.diego.model.*;
import java.math.BigDecimal;
import java.util.List;

public class InMemoryCatalogRepository implements CatalogRepository {
    private final List<MenuItem> data = List.of(
            new MenuItem("Americano", new BigDecimal("3.50"), Category.DRINK),
            new MenuItem("Latte", new BigDecimal("4.20"), Category.DRINK),
            new MenuItem("Croissant", new BigDecimal("4.25"), Category.BAKERY),
            new MenuItem("Blueberry Muffin", new BigDecimal("3.50"), Category.BAKERY),
            new MenuItem("Croissant", new BigDecimal("3.00"), Category.BAKERY)
    );
    @Override public List<MenuItem> all(){ return data; }
    @Override public List<MenuItem> byCategory(Category c){ return data.stream().filter(mi -> mi.getCategory()==c).toList(); }
}