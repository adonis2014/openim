package com.openim.chatserver.handler.netty.jdk;

import com.openim.common.im.bean.DeviceMsg;
import io.netty.channel.Channel;

/**
 * Created by shihuacai on 2015/7/22.
 */
@Deprecated
public interface IMessageHandler {
    void handle(DeviceMsg jsonObject, HandlerChain handlerChain, Channel channel);
}
