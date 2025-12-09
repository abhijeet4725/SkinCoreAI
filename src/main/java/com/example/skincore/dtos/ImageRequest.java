package com.example.skincore.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Data
public class ImageRequest {

    @NotNull
    private MultipartFile imageFile;

    @NotEmpty
    private String text;
}
