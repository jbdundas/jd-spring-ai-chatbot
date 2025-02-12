package com.jd.spring.ai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;

public class ChatService {

	@Autowired
	public ChatClient chatClient;
	
	public String request(String message){
		var response = chatClient.prompt(message).call().content();
		return response;
	}
}
