package com.example.tacocloud.tacos;

import lombok.Data;

import java.util.List;

@Data
public class Taco {

    private String name;
    private List<String> ingredients;
}
