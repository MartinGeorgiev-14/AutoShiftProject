package com.cars.carSaleWebsite.service;

import com.cars.carSaleWebsite.dto.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

public interface ListingCarService {
    ListingCarDto getCarById(UUID id);
    String createCarListing(CreateCarListingDto car, List<MultipartFile> images) throws IOException;
    HashSet<ListingCarDto> getAllCars();
    CarPaginationResponse getByPage(int pageNo, int pageSize);
    String deleteCarById(UUID id);
    String updateCar(CreateCarListingDto carDto, UUID id) throws IOException;
    CarPaginationResponse searchCarByCriteria(FilterDto searchDto, int pageNo, int pageSize);
    boolean canAccessListing(String listingId);
    FormOptionsDto getAllFormOptions();
}
