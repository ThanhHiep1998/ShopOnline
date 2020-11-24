package com.project.shop_online.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Product")
public class Product {


    @Id
    @Field(value = "_id")
    private ObjectId id;

    @Field(value = "product_name")
    private String productName;

    @Field(value = "product_code")
    private String productCode;

    @Field(value = "description")
    private String description;

    @Field(value = "brand_id")
    private ObjectId brandId;

    @Field(value = "product_hot")
    private int productHot;

    @Field(value = "product_new")
    private int productNew;

    @Field(value = "product_highlight")
    private int productHighlight;

    @Field(value = "category_id")
    private ObjectId categoryId;

    @Field(value = "status")
    private int status;

    @Field(value = "created_date")
    private Date createdDate;

    @Field(value = "created_by")
    private String createdBy;

    @Field(value = "updated_date")
    private Date updatedDate;

    @Field(value = "updated_by")
    private String updatedBy;


}
