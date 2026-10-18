package com.example.websocket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.websocket.model.ChatModel;

public interface ChatRepository extends JpaRepository<ChatModel, Long> {

}
