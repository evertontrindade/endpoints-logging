package com.example.actuatorendpointdefinition.controller;

import com.example.actuatorendpointdefinition.controller.contracts.MagicResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/magics")
public class MagicController {

    @GetMapping("/{finger}/discover")
    public ResponseEntity<MagicResponse> discover(@PathVariable String finger) {
        return ResponseEntity.ok(MagicResponse.builder().result(finger).build());
    }
}
