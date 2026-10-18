package com.example.websocket.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.websocket.model.ChatModel;
import com.example.websocket.repository.ChatRepository;

@Service 
public class ChatService {

    private final ChatRepository chatRepository;

    public ChatService(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    public ChatModel saveMessage(ChatModel message) {
        return chatRepository.save(message);
    }

    public List<ChatModel> getAllMessages() {
        return chatRepository.findAll();
    }
}
