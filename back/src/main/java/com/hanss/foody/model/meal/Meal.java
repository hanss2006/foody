package com.hanss.foody.model.meal;

import com.hanss.foody.model.product.Product;
import com.hanss.foody.model.store.Store;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Formula;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer calories;
    private Float proteins;
    private Float fats;
    private Float carbohydrates;
    private String iconUrl;

    @Lob
    private String recipe;
    private Boolean enabled;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "meal")
    private List<Store> stores;

    @ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(
            name = "meal_product",
            joinColumns = @JoinColumn(
                    name = "MEAL_ID", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "PRODUCT_ID", referencedColumnName = "id"))
    private Set<Product> products = new HashSet<>();

    @Formula("(select COUNT(s.id) > 0 from store s where s.meal_id = id)")
    private Boolean stored;
}
