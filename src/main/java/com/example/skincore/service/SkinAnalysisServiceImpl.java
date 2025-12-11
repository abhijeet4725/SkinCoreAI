package com.example.skincore.service;

import com.example.skincore.dtos.FinalResponse;
import com.example.skincore.dtos.ImageRequest;
import com.example.skincore.dtos.TextRequest;
import com.example.skincore.utils.KestraClient;
import com.example.skincore.utils.PromptBuilder;
import com.example.skincore.utils.ResponseParser;
import org.springframework.stereotype.Service;

@Service
public class SkinAnalysisServiceImpl {


    private final PromptBuilder promptBuilder;
    private final KestraClient kestraClient;
    private final ResponseParser responseParser;

    public SkinAnalysisServiceImpl(PromptBuilder promptBuilder, KestraClient kestraClient, ResponseParser responseParser) {
        this.promptBuilder = promptBuilder;
        this.kestraClient = kestraClient;
        this.responseParser = responseParser;
    }

//    FinalResponse analyzeText(TextRequest textRequest) {
//
//    }
//
//    FinalResponse analyzeImage(ImageRequest imageRequest){
//
//    }
}
