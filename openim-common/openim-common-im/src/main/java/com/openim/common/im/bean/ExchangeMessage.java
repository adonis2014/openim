package com.openim.common.im.bean;

import com.google.protobuf.MessageLite;
import com.openim.common.im.codec.mq.MQBsonCodecUtilV2;
import io.netty.util.CharsetUtil;

/**
 * Created by shihuacai on 2015/8/20.
 */
public class ExchangeMessage {

    private static final int MAX_VALUE = 127;
    private static final int MIN_VALUE = 0;

    private int type;

    private MessageLite messageLite;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        if(type > MAX_VALUE || type < MIN_VALUE){
            throw new IllegalArgumentException(MIN_VALUE + " <= type <= " + MAX_VALUE);
        }
        this.type = type;
    }
    //@JsonIgnore
    public <T extends MessageLite> T getMessageLite() {
        return (T)messageLite;
    }

    public void setMessageLite(MessageLite messageLite) {
        this.messageLite = messageLite;
    }

    @Override
    public String toString() {
        return new String(MQBsonCodecUtilV2.encode(this), CharsetUtil.UTF_8);
    }

    /*@Override
    public String toString() {
        return toBsonString();
    }

    public String toBsonString(){
        BasicDBObject obj = new BasicDBObject();
        obj.put("type", type);
        obj.put("message", messageLite.toByteArray());

        return obj.toString();
    }*/
}
