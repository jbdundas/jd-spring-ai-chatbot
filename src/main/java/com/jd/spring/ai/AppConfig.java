package com.jd.spring.ai;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import com.jd.spring.ai.service.ChatService;

@EnableAutoConfiguration
public class AppConfig {

	@Bean
	public ChatService chatService() {
		return new ChatService();
	}
}
