package com.jime.restassured.demo.model.user;

import com.jime.restassured.demo.model.SupportModel;
import com.ti.baseapi.BaseModel;
import lombok.Data;

@Data
public class UserModel extends BaseModel {
    private DataModel data;
    private SupportModel support;
}
