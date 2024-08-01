package com.example.endpointslogging.controller.contracts;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PingRequest {
    private String valueRequested;
}
