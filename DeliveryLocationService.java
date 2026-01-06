package com.klcanteen.service;

import com.klcanteen.dto.DeliveryLocationDto;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class DeliveryLocationService {

    private final Map<String, DeliveryLocationDto> liveLocations = new ConcurrentHashMap<>();

    public DeliveryLocationDto updateLocation(String orderId, DeliveryLocationDto dto) {
        long now = System.currentTimeMillis();
        DeliveryLocationDto updated = new DeliveryLocationDto(
                orderId,
                dto.getLatitude(),
                dto.getLongitude(),
                dto.getStatus(),
                now
        );
        liveLocations.put(orderId, updated);
        return updated;
    }

    public DeliveryLocationDto getLocation(String orderId) {
        return liveLocations.get(orderId);
    }
}
