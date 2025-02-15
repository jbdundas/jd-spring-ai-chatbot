package com.jd.example.rest;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/openai/chat/")
public class OpenApiController {

	private final ChatClient chatClient;

	public OpenApiController(ChatClient.Builder chatClientBuilder) {
		this.chatClient = chatClientBuilder.build();
	}

	@GetMapping("/")
	public String post(String message) {
		return this.chatClient.prompt().user(message).call().content();
	}
}
