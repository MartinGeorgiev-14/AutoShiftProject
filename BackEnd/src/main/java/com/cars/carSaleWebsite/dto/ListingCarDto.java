package com.cars.carSaleWebsite.dto;

import com.cars.carSaleWebsite.models.entities.listing.ListingImage;
import com.cars.carSaleWebsite.models.entities.user.UserEntity;
import com.cars.carSaleWebsite.models.entities.vehicle.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.*;

@Data
public class ListingCarDto
{
    private UUID id;

    private String make;
    private String model;

    private BigDecimal price;
    private Date createdAt;
    private Date editedAt;
    private Integer horsepower;
    private Integer mileage;
    private String description;
    private String engine;
    private String gearbox;
    private Integer engineDisplacement;
    private Integer mainImgIndex;
    private UUID mainImgId;
    private List<ListingImageDto> images;

    private String type;
    private String body;
    private String location;
    private String region;

    private UserEntityDto user;



}
