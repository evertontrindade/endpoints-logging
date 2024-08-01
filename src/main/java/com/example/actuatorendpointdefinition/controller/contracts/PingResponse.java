package com.example.actuatorendpointdefinition.controller.contracts;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class PingResponse {
    private String result;
}
