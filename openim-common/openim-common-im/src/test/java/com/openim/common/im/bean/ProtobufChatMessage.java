// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatMessage.proto

package com.openim.common.im.bean;

public final class ProtobufChatMessage {
  private ProtobufChatMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ChatMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.openim.common.im.bean.ChatMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string to = 2;</code>
     */
    boolean hasTo();
    /**
     * <code>optional string to = 2;</code>
     */
    java.lang.String getTo();
    /**
     * <code>optional string to = 2;</code>
     */
    com.google.protobuf.ByteString
        getToBytes();

    /**
     * <code>optional string msg = 3;</code>
     */
    boolean hasMsg();
    /**
     * <code>optional string msg = 3;</code>
     */
    java.lang.String getMsg();
    /**
     * <code>optional string msg = 3;</code>
     */
    com.google.protobuf.ByteString
        getMsgBytes();

    /**
     * <code>optional string from = 4;</code>
     */
    boolean hasFrom();
    /**
     * <code>optional string from = 4;</code>
     */
    java.lang.String getFrom();
    /**
     * <code>optional string from = 4;</code>
     */
    com.google.protobuf.ByteString
        getFromBytes();
  }
  /**
   * Protobuf type {@code com.openim.common.im.bean.ChatMessage}
   */
  public static final class ChatMessage extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.openim.common.im.bean.ChatMessage)
      ChatMessageOrBuilder {
    // Use ChatMessage.newBuilder() to construct.
    private ChatMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ChatMessage(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ChatMessage defaultInstance;
    public static ChatMessage getDefaultInstance() {
      return defaultInstance;
    }

    public ChatMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ChatMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              to_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              msg_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              from_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.openim.common.im.bean.ProtobufChatMessage.internal_static_com_openim_common_im_bean_ChatMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.openim.common.im.bean.ProtobufChatMessage.internal_static_com_openim_common_im_bean_ChatMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.openim.common.im.bean.ProtobufChatMessage.ChatMessage.class, com.openim.common.im.bean.ProtobufChatMessage.ChatMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<ChatMessage> PARSER =
        new com.google.protobuf.AbstractParser<ChatMessage>() {
      public ChatMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChatMessage(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ChatMessage> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TO_FIELD_NUMBER = 2;
    private java.lang.Object to_;
    /**
     * <code>optional string to = 2;</code>
     */
    public boolean hasTo() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string to = 2;</code>
     */
    public java.lang.String getTo() {
      java.lang.Object ref = to_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          to_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string to = 2;</code>
     */
    public com.google.protobuf.ByteString
        getToBytes() {
      java.lang.Object ref = to_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        to_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MSG_FIELD_NUMBER = 3;
    private java.lang.Object msg_;
    /**
     * <code>optional string msg = 3;</code>
     */
    public boolean hasMsg() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string msg = 3;</code>
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          msg_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string msg = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FROM_FIELD_NUMBER = 4;
    private java.lang.Object from_;
    /**
     * <code>optional string from = 4;</code>
     */
    public boolean hasFrom() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string from = 4;</code>
     */
    public java.lang.String getFrom() {
      java.lang.Object ref = from_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          from_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string from = 4;</code>
     */
    public com.google.protobuf.ByteString
        getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      to_ = "";
      msg_ = "";
      from_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(2, getToBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(3, getMsgBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(4, getFromBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getToBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMsgBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getFromBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.openim.common.im.bean.ProtobufChatMessage.ChatMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.openim.common.im.bean.ProtobufChatMessage.ChatMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.openim.common.im.bean.ProtobufChatMessage.ChatMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.openim.common.im.bean.ProtobufChatMessage.ChatMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.openim.common.im.bean.ProtobufChatMessage.ChatMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.openim.common.im.bean.ProtobufChatMessage.ChatMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.openim.common.im.bean.ProtobufChatMessage.ChatMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.openim.common.im.bean.ProtobufChatMessage.ChatMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.openim.common.im.bean.ProtobufChatMessage.ChatMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.openim.common.im.bean.ProtobufChatMessage.ChatMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.openim.common.im.bean.ProtobufChatMessage.ChatMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.openim.common.im.bean.ChatMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.openim.common.im.bean.ChatMessage)
        com.openim.common.im.bean.ProtobufChatMessage.ChatMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.openim.common.im.bean.ProtobufChatMessage.internal_static_com_openim_common_im_bean_ChatMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.openim.common.im.bean.ProtobufChatMessage.internal_static_com_openim_common_im_bean_ChatMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.openim.common.im.bean.ProtobufChatMessage.ChatMessage.class, com.openim.common.im.bean.ProtobufChatMessage.ChatMessage.Builder.class);
      }

      // Construct using com.openim.common.im.bean.ProtobufChatMessage.ChatMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        to_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        msg_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        from_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.openim.common.im.bean.ProtobufChatMessage.internal_static_com_openim_common_im_bean_ChatMessage_descriptor;
      }

      public com.openim.common.im.bean.ProtobufChatMessage.ChatMessage getDefaultInstanceForType() {
        return com.openim.common.im.bean.ProtobufChatMessage.ChatMessage.getDefaultInstance();
      }

      public com.openim.common.im.bean.ProtobufChatMessage.ChatMessage build() {
        com.openim.common.im.bean.ProtobufChatMessage.ChatMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.openim.common.im.bean.ProtobufChatMessage.ChatMessage buildPartial() {
        com.openim.common.im.bean.ProtobufChatMessage.ChatMessage result = new com.openim.common.im.bean.ProtobufChatMessage.ChatMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.to_ = to_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.msg_ = msg_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.from_ = from_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.openim.common.im.bean.ProtobufChatMessage.ChatMessage) {
          return mergeFrom((com.openim.common.im.bean.ProtobufChatMessage.ChatMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.openim.common.im.bean.ProtobufChatMessage.ChatMessage other) {
        if (other == com.openim.common.im.bean.ProtobufChatMessage.ChatMessage.getDefaultInstance()) return this;
        if (other.hasTo()) {
          bitField0_ |= 0x00000001;
          to_ = other.to_;
          onChanged();
        }
        if (other.hasMsg()) {
          bitField0_ |= 0x00000002;
          msg_ = other.msg_;
          onChanged();
        }
        if (other.hasFrom()) {
          bitField0_ |= 0x00000004;
          from_ = other.from_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.openim.common.im.bean.ProtobufChatMessage.ChatMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.openim.common.im.bean.ProtobufChatMessage.ChatMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object to_ = "";
      /**
       * <code>optional string to = 2;</code>
       */
      public boolean hasTo() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string to = 2;</code>
       */
      public java.lang.String getTo() {
        java.lang.Object ref = to_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            to_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string to = 2;</code>
       */
      public com.google.protobuf.ByteString
          getToBytes() {
        java.lang.Object ref = to_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          to_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string to = 2;</code>
       */
      public Builder setTo(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        to_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string to = 2;</code>
       */
      public Builder clearTo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        to_ = getDefaultInstance().getTo();
        onChanged();
        return this;
      }
      /**
       * <code>optional string to = 2;</code>
       */
      public Builder setToBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        to_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object msg_ = "";
      /**
       * <code>optional string msg = 3;</code>
       */
      public boolean hasMsg() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string msg = 3;</code>
       */
      public java.lang.String getMsg() {
        java.lang.Object ref = msg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            msg_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string msg = 3;</code>
       */
      public com.google.protobuf.ByteString
          getMsgBytes() {
        java.lang.Object ref = msg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string msg = 3;</code>
       */
      public Builder setMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        msg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string msg = 3;</code>
       */
      public Builder clearMsg() {
        bitField0_ = (bitField0_ & ~0x00000002);
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }
      /**
       * <code>optional string msg = 3;</code>
       */
      public Builder setMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        msg_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object from_ = "";
      /**
       * <code>optional string from = 4;</code>
       */
      public boolean hasFrom() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string from = 4;</code>
       */
      public java.lang.String getFrom() {
        java.lang.Object ref = from_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            from_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string from = 4;</code>
       */
      public com.google.protobuf.ByteString
          getFromBytes() {
        java.lang.Object ref = from_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          from_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string from = 4;</code>
       */
      public Builder setFrom(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        from_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string from = 4;</code>
       */
      public Builder clearFrom() {
        bitField0_ = (bitField0_ & ~0x00000004);
        from_ = getDefaultInstance().getFrom();
        onChanged();
        return this;
      }
      /**
       * <code>optional string from = 4;</code>
       */
      public Builder setFromBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        from_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.openim.common.im.bean.ChatMessage)
    }

    static {
      defaultInstance = new ChatMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.openim.common.im.bean.ChatMessage)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_openim_common_im_bean_ChatMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_openim_common_im_bean_ChatMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ChatMessage.proto\022\031com.openim.common.i" +
      "m.bean\"4\n\013ChatMessage\022\n\n\002to\030\002 \001(\t\022\013\n\003msg" +
      "\030\003 \001(\t\022\014\n\004from\030\004 \001(\tB0\n\031com.openim.commo" +
      "n.im.beanB\023ProtobufChatMessage"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_openim_common_im_bean_ChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_openim_common_im_bean_ChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_openim_common_im_bean_ChatMessage_descriptor,
        new java.lang.String[] { "To", "Msg", "From", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}