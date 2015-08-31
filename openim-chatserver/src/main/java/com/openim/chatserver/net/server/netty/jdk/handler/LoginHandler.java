package com.openim.chatserver.net.server.netty.jdk.handler;

import com.openim.chatserver.ChannelUtil;
import com.openim.chatserver.configuration.BeanConfiguration;
import com.openim.chatserver.listener.ApplicationContextAware;
import com.openim.common.im.bean.DeviceMsg;
import com.openim.common.im.bean.MessageType;
import com.openim.common.mq.IMessageSender;
import com.openim.common.mq.constants.MQConstants;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by shihuacai on 2015/7/22.
 */
@Deprecated
public class LoginHandler implements IMessageHandler {

    private static final Logger LOG = LoggerFactory.getLogger(LoginHandler.class);

    private IMessageSender messageSender;

    public LoginHandler() {
        messageSender = ApplicationContextAware.getBean(IMessageSender.class);
    }

    @Override
    public void handle(DeviceMsg jsonObject, HandlerChain handlerChain, Channel channel) {
        if (jsonObject != null) {
            int type = jsonObject.getType();
            if (type == MessageType.LOGIN) {
                String loginId = jsonObject.getLoginId();
                String pwd = jsonObject.getPwd();
                //后期完成登录验证

                ChannelUtil.add(loginId, channel);
                jsonObject.setServerQueue(BeanConfiguration.chatQueueName);
                messageSender.sendMessage(MQConstants.openimExchange, MQConstants.loginRouteKey, jsonObject);

            } else {
                handlerChain.handle(jsonObject, handlerChain, channel);
            }
        }
    }
}