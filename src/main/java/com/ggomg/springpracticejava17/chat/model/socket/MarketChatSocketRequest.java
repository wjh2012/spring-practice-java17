package com.ggomg.springpracticejava17.chat.model.socket;


import lombok.Builder;

@Builder
public record MarketChatSocketRequest(
    long chatRoomId,
    String message
) {

}
