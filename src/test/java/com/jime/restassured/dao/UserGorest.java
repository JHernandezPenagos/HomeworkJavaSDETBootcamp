package com.jime.restassured.dao;


import lombok.Data;

@Data
public class UserGorest {

    //va a ser los elementos de la pagina

    private int id;
    private String name;
    private String email;
    private String gender;
    private String status;
}
