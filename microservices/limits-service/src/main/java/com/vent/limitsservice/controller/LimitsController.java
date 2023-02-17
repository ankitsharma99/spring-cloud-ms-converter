package com.vent.limitsservice.controller;

import com.vent.limitsservice.bean.Limits;
import com.vent.limitsservice.configuration.Configuration;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitsController {
    private final Configuration configuration;
    @GetMapping("/limits")
    public Limits retrieveLimits() {
//        return new Limits(1, 1000);
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }

}
