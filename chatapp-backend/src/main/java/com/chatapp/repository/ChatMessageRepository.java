package com.chatapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chatapp.model.ChatMessage;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {}
