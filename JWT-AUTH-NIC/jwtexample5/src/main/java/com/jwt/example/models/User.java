package com.jwt.example.models;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString   //these are lambok fields it will create the getters setters for the below fields by default

public class User {

    private String  userId;

    private String name;

    private String email;


}
