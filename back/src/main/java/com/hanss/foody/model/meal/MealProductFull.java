package com.hanss.foody.model.meal;
import com.hanss.foody.model.product.Product;
import com.hanss.foody.model.unit.Unit;
import org.springframework.data.rest.core.config.Projection;

@Projection(
        name = "MealProductFull",
        types = { MealProduct.class })
public interface MealProductFull {
    Long getId();
    Meal getMeal();
    Product getProduct();
    Float getQuantity();
    Unit getUnit();
}
