package com.halcyon.ainocodebackend.model.dto.chathistory;

import lombok.Data;

import java.io.Serializable;

/**
 * 添加对话历史请求
 */
@Data
public class ChatHistoryAddRequest implements Serializable {

    /**
     * 消息内容
     */
    private String message;

    /**
     * 消息类型：user/ai/error
     */
    private String messageType;

    /**
     * 应用id
     */
    private Long appId;

    private static final long serialVersionUID = 1L;
}
