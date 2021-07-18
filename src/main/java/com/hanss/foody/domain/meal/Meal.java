package com.hanss.foody.domain.meal;

import com.hanss.foody.domain.product.Product;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
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

    @ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(
            name = "meal_product",
            joinColumns = @JoinColumn(
                    name = "meal_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "profuct_id", referencedColumnName = "id"))
    private Set<Product> products = new HashSet<>();
    private String iconUrl;

    @Lob
    private String recipe;

    private Boolean enabled;

}
