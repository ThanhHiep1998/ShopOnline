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
@Document(collection = "Size")
public class Size {

    @Id
    @Field(value = "_id")
    private ObjectId id;

    @Field(value = "size_name")
    private String sizeName;

    @Field(value = "description")
    private String description;

    @Field(value = "created_date")
    private Date createdDate;

    @Field(value = "created_by")
    private String createdBy;

    @Field(value = "updated_date")
    private Date updatedDate;

    @Field(value = "updated_by")
    private String updatedBy;
}
