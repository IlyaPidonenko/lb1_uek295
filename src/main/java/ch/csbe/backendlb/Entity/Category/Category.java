package ch.csbe.backendlb.Entity.Category;

import jakarta.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(columnDefinition = "varchar(255)")
    private String title;

    @Column(columnDefinition = "TINYINT")
    private Boolean active;


}
