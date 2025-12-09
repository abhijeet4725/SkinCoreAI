package com.example.skincore.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class TextRequest {

    @NotEmpty
    private String text;

}
