package com.example.actuatorendpointdefinition.controller;

import com.example.actuatorendpointdefinition.controller.contracts.PingRequest;
import com.example.actuatorendpointdefinition.controller.contracts.PingResponse;
import jakarta.websocket.PongMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ping")
public class PingController {
    @PostMapping
    public ResponseEntity<PingResponse> pong(@RequestBody PingRequest request) {
        return ResponseEntity.ok(PingResponse.builder().result(request.getValueRequested()).build());
    }

    @GetMapping
    public ResponseEntity<PingResponse> echo() {
        return ResponseEntity.ok(PingResponse.builder().result("pong").build());
    }
}
