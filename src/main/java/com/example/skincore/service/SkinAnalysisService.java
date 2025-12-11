package com.example.skincore.service;

import com.example.skincore.dtos.FinalResponse;
import com.example.skincore.dtos.ImageRequest;
import com.example.skincore.dtos.TextRequest;

public interface SkinAnalysisService {
    FinalResponse analyzeText(TextRequest textRequest);
    FinalResponse analyzeImage(ImageRequest imageRequest);
}
