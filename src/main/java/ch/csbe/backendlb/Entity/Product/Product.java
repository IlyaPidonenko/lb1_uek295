package ch.csbe.backendlb.Entity.Product;

import io.micrometer.observation.transport.Propagator;
import jakarta.persistence.*;
import ch.csbe.backendlb.Entity.Category.Category;
import org.hibernate.property.access.spi.Setter;


@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(columnDefinition = "varchar(255)")
    private String title;

    @Column(columnDefinition = "float")
    private Float price;

    @Column(columnDefinition = "varchar(100)")
    private String sku;

    @Column(columnDefinition = "TINYINT")
    private Boolean active;

    @Column(columnDefinition = "varchar(1000)")
    private String image;

    @Column(columnDefinition = "mediumtext")
    private String description;

    @Column(columnDefinition = "int")
    private Integer stock;

    @ManyToOne()
    private Category category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;

    }
}

