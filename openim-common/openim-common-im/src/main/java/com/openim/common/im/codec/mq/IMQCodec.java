package com.openim.common.im.codec.mq;

/**
 * Created by shihuacai on 2015/8/26.
 */
public interface IMQCodec<T> {
    byte[] encode(T msg);
    T decode(byte[] bytes);
}
