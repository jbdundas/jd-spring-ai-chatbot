package com.jd.spring.ai.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jd.spring.ai.service.ChatService;

@RestController
@RequestMapping("/openai")
public class ChatGptController {

	@Autowired
	public ChatService chatService;
	
	@GetMapping("/chat")
	public ResponseEntity<String> post(String message) {
		var response = chatService.request(message);
		return ResponseEntity.ok(response);

	}
	
}
