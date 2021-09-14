package com.hanss.foody.domain.meal;

import com.hanss.foody.domain.product.Product;
import com.hanss.foody.domain.store.Store;
import lombok.Data;
import org.hibernate.annotations.Formula;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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
