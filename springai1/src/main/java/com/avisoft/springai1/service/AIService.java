package com.avisoft.springai1.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AIService {

    @Autowired
    private ChatClient chatClient;

    public String explain(String topic, String level){

        PromptTemplate template = new PromptTemplate("""
                You are a Senior Java Trainer.
                
                Explain{topic}.
                
                Audience: {level}
                
                Rules: 
                 - Use Hinglish
                 - Beginner Friendly
                 - Only in 50 to 100 words
                """);

        String prompt = template.render(
                Map.of(
                        "topic", topic,
                        "level", level
                )
        );

        return chatClient
                .prompt(prompt)
                .call()
                .content();
    }
}