package com.example.websocket.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.websocket.model.ChatModel;
import com.example.websocket.service.ChatService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping ("/api/messages")
public class ChatListController {

    private final ChatService chatService;

    public ChatListController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping
    public List<ChatModel> getListChat() {
        return chatService.getAllMessages();
    }
}
