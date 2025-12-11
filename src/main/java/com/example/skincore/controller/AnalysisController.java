package com.example.skincore.controller;

import com.example.skincore.service.SkinAnalysisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/analyze")
public class AnalysisController {

    @Autowired
    private SkinAnalysisServiceImpl analysisService;
    // POST /api/analyze/text
//    @PostMapping("/text")
//    public FinalResponse analyzeText(String text){
//        return
//    }
//
//    public FinalResponse analyzeImage(MultipartFile file, String text){
//        return
//    }

}
