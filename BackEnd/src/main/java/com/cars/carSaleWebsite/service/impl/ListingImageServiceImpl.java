package com.cars.carSaleWebsite.service.impl;

import com.cars.carSaleWebsite.dto.ListingImageDto;
import com.cars.carSaleWebsite.models.entities.listing.ListingImage;
import com.cars.carSaleWebsite.models.entities.listing.ListingVehicle;
import com.cars.carSaleWebsite.repository.ListingImageRepository;
import com.cars.carSaleWebsite.service.ListingImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.UUID;

@Service
public class ListingImageServiceImpl implements ListingImageService {

    ListingImageRepository listingImageRepository;

    @Autowired
    public ListingImageServiceImpl(ListingImageRepository listingImageRepository) {
        this.listingImageRepository = listingImageRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<ListingImageDto> getAllImagesOfListingById(ListingVehicle id) {
        try{
            List<ListingImage> images = listingImageRepository.getAllListingImagesByListing(id);
            List<ListingImageDto> mapped = images.stream().map(i -> mapToDto(i)).collect(Collectors.toList());
            return mapped;
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }


    }

    private ListingImageDto mapToDto(ListingImage list){
        ListingImageDto newItem = new ListingImageDto();

        newItem.setImageData(list.getImageData());
        newItem.setType(list.getType());
        newItem.setMain(list.getIsMain());

        return newItem;
    }
}
