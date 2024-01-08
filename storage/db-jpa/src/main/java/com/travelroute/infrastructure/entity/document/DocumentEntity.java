package com.travelroute.infrastructure.entity.document;

import jakarta.persistence.*;

@Table(name = "document")
@Entity
public class DocumentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String path;

    private String fileType;

}
