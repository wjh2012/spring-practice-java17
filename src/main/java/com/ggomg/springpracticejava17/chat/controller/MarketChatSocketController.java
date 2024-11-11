package com.ggomg.springpracticejava17.chat.controller;

import com.ggomg.springpracticejava17.chat.model.socket.MarketChatSocketRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MarketChatSocketController {
    private final SimpMessagingTemplate messagingTemplate;


    @MessageMapping("/market/chat/send/message/{chatRoomId}")
    public void sendMessage(@DestinationVariable("chatRoomId") long chatRoomId, MarketChatSocketRequest marketChatSocketRequest) {
        messagingTemplate.convertAndSend("/topic/market/chatroom/" + chatRoomId, marketChatSocketRequest.message());
    }
}
