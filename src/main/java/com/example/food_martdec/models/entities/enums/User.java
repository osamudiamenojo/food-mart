package com.example.food_martdec.models.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
}
