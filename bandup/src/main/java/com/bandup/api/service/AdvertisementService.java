package com.bandup.api.service;

import com.bandup.api.dto.advertisement.AdvertisementRequest;
import com.bandup.api.dto.advertisement.AdvertisementResponse;

import java.util.List;

public interface AdvertisementService {
    List<AdvertisementResponse> findAll(
            Integer pageNo,
            Integer pageSize,
            String postalCode,
            String city,
            String country,
            Long[] genreIds,
            Long[] artistTypeIds,
            Long userId
    );
    AdvertisementResponse findById(Long id);
    AdvertisementResponse create(AdvertisementRequest request);
    AdvertisementResponse update(Long id, AdvertisementRequest request);
    void deleteById(Long id);
}
