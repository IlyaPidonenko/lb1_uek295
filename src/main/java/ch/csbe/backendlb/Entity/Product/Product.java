package ch.csbe.backendlb.Entity.Product;

import jakarta.persistence.*;

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
    private ch.csbe.backendlb.Entity.Category.Category Category;
}
