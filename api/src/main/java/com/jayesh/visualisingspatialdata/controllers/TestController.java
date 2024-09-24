package com.jayesh.visualisingspatialdata.controllers;

import com.jayesh.visualisingspatialdata.domain.spatial.repository.SpatialDataNodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    SpatialDataNodeRepository spatialDataNodeRepository;

    @GetMapping("/")
    public String index() {
        return spatialDataNodeRepository.findNodesByName("test").getFirst().toString();
    }
}
