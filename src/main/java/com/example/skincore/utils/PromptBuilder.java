package com.example.skincore.utils;


import org.springframework.stereotype.Component;

@Component
public class PromptBuilder {

    public String buildTextPrompt(String text){
        String prompt = """
            You are SkinCore AI, an advanced dermatology analysis agent.
            Your job is to analyze the user's skin condition based on their text.

            RULES:
                1. You MUST respond ONLY in valid JSON.
                2. Do NOT include explanation outside JSON.
                3. Follow the JSON schema exactly.
                4. Leave fields empty if uncertain, but do NOT change keys.

            JSON SCHEMA (respond exactly in this format):

                {
                    "skinType": "",
                    "concern": "",
                    "severity": "",
                    "morningRoutine": [],
                    "nightRoutine": [],
                    "recommendedIngredients": [],
                    "avoidIngredients": [],
                    "possibleCondition": "",
                    "doctorAdvice": []
                }

            USER INPUT:
            """ + text;
        return prompt;
    }

    public String buildImagePrompt(String text){
        String prompt = """
            You are SkinCore AI, an advanced dermatology analysis agent.
            Your job is to analyze the user's skin condition based on their text.

            RULES:
                1. You MUST respond ONLY in valid JSON.
                2. Do NOT include explanation outside JSON.
                3. Follow the JSON schema exactly.
                4. Leave fields empty if uncertain, but do NOT change keys.
                5. Use the uploaded skin image as the primary source of analysis.
                6. Use the text only as additional context.

            JSON SCHEMA (respond exactly in this format):

                {
                    "skinType": "",
                    "concern": "",
                    "severity": "",
                    "morningRoutine": [],
                    "nightRoutine": [],
                    "recommendedIngredients": [],
                    "avoidIngredients": [],
                    "possibleCondition": "",
                    "doctorAdvice": []
                }

            User provided an image. Additional notes: 
        """ + text;
        return prompt;
    }

}
