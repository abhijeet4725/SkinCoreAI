package com.example.skincore.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class FinalResponse {

    private String skinType;

    private String concern;

    private String severity;

    private List<String> morningRoutine;

    private List<String> nightRoutine;

    private List<String> recommendedIngredients;

    private List<String> avoidIngredients;

    private String possibleCondition;

    private List<String> doctorAdvice;
}
