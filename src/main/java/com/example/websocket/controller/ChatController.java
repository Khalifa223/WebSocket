package com.example.websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.example.websocket.model.ChatModel;
import com.example.websocket.service.ChatService;

@Controller 
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @MessageMapping ("/chat.sendMessage")
    @SendTo ("/topic/messages")
    public ChatModel sendMessage(@Payload ChatModel message) {
        ChatModel savedMessage = chatService.saveMessage(message);
        return savedMessage;
    }
}
