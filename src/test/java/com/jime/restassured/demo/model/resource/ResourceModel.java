package com.jime.restassured.demo.model.resource;

import com.jime.restassured.demo.model.SupportModel;
import com.ti.baseapi.BaseModel;
import lombok.Data;

@Data
public class ResourceModel extends BaseModel {
    private DataModel data;
    private SupportModel support;
}
