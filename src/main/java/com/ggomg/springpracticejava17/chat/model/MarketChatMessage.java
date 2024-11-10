package com.ggomg.springpracticejava17.chat.model;

import lombok.Builder;

@Builder
public record MarketChatMessage(
    String message
) {

}
