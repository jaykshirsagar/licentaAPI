package com.unitbv.licenta.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class User {

    @Id
    private Integer id;

    private String name;

    private String prenume;

    private String password;

    private String functie;

    private String email;
}
