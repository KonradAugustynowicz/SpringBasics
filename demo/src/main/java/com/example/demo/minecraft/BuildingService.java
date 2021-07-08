package com.example.demo.minecraft;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Component
public class BuildingService {

    @GetMapping
    public List<Building> GetBuilding()
    {
        return List.of(new Building("Fortnite"));
    }
}
