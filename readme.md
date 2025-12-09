# SkinCore AI

**AI-powered skin analysis and personalized skincare assistant**

SkinCore AI allows users to analyze their skin using either a text description of symptoms or an uploaded photo. Leveraging **Kestra’s AI Agent** and an LLM, the system summarizes the input, identifies skin type and concerns, and generates a personalized skincare routine along with ingredient recommendations and potential condition alerts.

---

## Features

- Analyze skin from **text descriptions** or **images**
- Generate **personalized morning and night skincare routines**
- Recommend **ingredients to use** and **ingredients to avoid**
- Detect potential **skin conditions** and provide advisory notes
- Fast and clean **one-page UI**
- Backend orchestrated with **Spring Boot**
- AI workflow powered by **Kestra AI Agent**

---

## Tech Stack

- **Backend:** Spring Boot (RESTful API)
- **Frontend:** Single-page application (HTML/CSS/JS/Figma)
- **AI Orchestration:** Kestra workflow
- **LLM:** Open-source model integrated via Kestra

---

## How It Works

1. User sends a text description or uploads a skin image via the frontend
2. Backend forwards input to Kestra workflow
3. Kestra AI Agent uses the LLM to:
    - Identify skin type
    - Detect conditions
    - Suggest personalized routines and ingredient guidance
4. Backend returns structured JSON
5. Frontend displays results in a clean, user-friendly interface

---
