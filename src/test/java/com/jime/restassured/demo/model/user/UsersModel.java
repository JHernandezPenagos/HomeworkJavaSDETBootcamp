package com.jime.restassured.demo.model.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jime.restassured.demo.model.PageModel;
import com.jime.restassured.demo.model.SupportModel;
import lombok.Data;
import java.util.List;

@Data
public class UsersModel extends PageModel {
   /* private int page;
    @JsonProperty("per_page")
    private int perPage;
    private int total;
    @JsonProperty("total_pages")
    private int totalPages;
    private List<UserModel> data;
    private SupportModel support;*/

    private List<DataModel> data;


}
