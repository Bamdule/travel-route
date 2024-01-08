package com.travelroute.infrastructure.entity.category;

import jakarta.persistence.*;

@Table(name = "category")
@Entity
public class CategoryEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false, length = 30)
    private CategoryType type;
}
