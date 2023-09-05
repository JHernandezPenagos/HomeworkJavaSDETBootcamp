package com.jime.restassured.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jime.restassured.demo.model.user.UserModel;
import com.ti.baseapi.BaseModel;
import lombok.Data;

@Data
public class PageModel extends BaseModel {
    private int page;
    @JsonProperty("per_page")
    private int perPage;
    private int total;
    @JsonProperty("total_pages")
    private int totalPages;
    private SupportModel support;
}
