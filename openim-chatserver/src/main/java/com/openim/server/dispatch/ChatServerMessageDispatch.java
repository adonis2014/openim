package com.openim.server.dispatch;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.openim.common.bean.ChatMessage;
import com.openim.common.mq.IMessageDispatch;
import com.openim.server.ChannelUtil;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;

/**
 * Created by shihuacai on 2015/7/29.
 */
@Component
public class ChatServerMessageDispatch implements IMessageDispatch {
    private static final Charset charset = Charset.forName("UTF-8");

    @Override
    public void dispatchMessage(String exchange, String routeKey, byte[] bytes) {
        String message = new String(bytes, charset);
        ChatMessage chatMessage = JSON.parseObject(message, ChatMessage.class);
        ChannelUtil.sendMessage(chatMessage.getTo(), bytes);
    }
}