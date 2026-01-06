package com.klcanteen.controller;

import com.klcanteen.dto.DeliveryLocationDto;
import com.klcanteen.service.DeliveryLocationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class DeliveryLocationController {

    private final DeliveryLocationService service;

    public DeliveryLocationController(DeliveryLocationService service) {
        this.service = service;
    }

    @PostMapping("/{orderId}/location")
    public ResponseEntity<DeliveryLocationDto> updateLocation(
            @PathVariable String orderId,
            @RequestBody DeliveryLocationDto body) {

        DeliveryLocationDto saved = service.updateLocation(orderId, body);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/{orderId}/location")
    public ResponseEntity<DeliveryLocationDto> getLocation(@PathVariable String orderId) {
        DeliveryLocationDto dto = service.getLocation(orderId);
        if (dto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dto);
    }
}
