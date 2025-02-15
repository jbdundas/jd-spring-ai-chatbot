package com.jd.spring.ai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.ai.openai.api.OpenAiApi;
import org.springframework.ai.openai.api.OpenAiApi.ChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.jd.spring.ai.service.ChatService;
import io.micrometer.observation.ObservationRegistry;

@Configuration
public class AppConfig {

	/*
	 * @Bean("chatService") public ChatService chatService() { return new
	 * ChatService(); }
	 * 
	 * @Bean("chatClient") public ChatClient chatClient() {
	 * //OpenAiChatOptions.builder().model(OpenAiApi.ChatModel.GPT_4_O.getValue()).
	 * build() OpenAiChatOptions chatModelOptions = new
	 * OpenAiChatOptions.Builder().model(OpenAiApi.ChatModel.GPT_4_O.getValue()).
	 * build(); return ChatClient.builder(OpenAiApi.DEFAULT_CHAT_MODEL).build(); }
	 */
	
}
