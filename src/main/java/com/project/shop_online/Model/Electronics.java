package com.project.shop_online.Model;

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
@Document(collection = "Electronics")
public class Electronics {

	@Id
	@Field(value="_id")
	private ObjectId id ;
	
	@Field(value="monitor")
	private Long monitor;
	
	@Field(value="os")
	private String os ;
	
	@Field(value="camera_before")
	private Long cameraBefore;
	
	@Field(value="camera_after")
	private Long cameraAfter ;
	
	@Field(value="cpu")
	private String cpu  ;
	
	@Field(value="ram")
	private Long ram ;
	
	@Field(value="rom")
	private Long rom ;
	
	@Field(value="sim_card")
	private String simCard ;
	
	@Field(value="flash_light")
	private int flashLight ;
	
	@Field(value="internet")
	private String internet ;
	
	@Field(value="description")
	private String description;
	
	@Field(value="created_date")
	private Date  createdDate ;
	
	@Field(value="created_by")
	private String createdBy;
	
	@Field(value="updated_date")
	private Date updatedDate ;
	
	@Field(value="updated_by")
	private String updatedBy ;
}
 
