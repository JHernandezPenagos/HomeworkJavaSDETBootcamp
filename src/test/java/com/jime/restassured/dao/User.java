package com.jime.restassured.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;

@Data
@JsonIgnoreProperties(ignoreUnknown = true) // si no los tengo dentro de mi campo, siga con su vida y me deje ejecutar

//data access object

public class User {

    private String login;
    private int id;

    @JsonProperty("public_repos") //modifica el elemento y lo trae como el valor que necesitamos, una anotacion tipo interfaz
    private int publicRepos;

    @JsonProperty("twitter_username")
    private String twitterUsername;


}
