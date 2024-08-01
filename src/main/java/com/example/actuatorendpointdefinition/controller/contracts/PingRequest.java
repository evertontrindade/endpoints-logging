package com.example.actuatorendpointdefinition.controller.contracts;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PingRequest {
    private String valueRequested;
}
