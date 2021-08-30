package com.hanss.foody.domain.meal;
import com.hanss.foody.domain.product.Product;
import com.hanss.foody.domain.unit.Unit;
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
