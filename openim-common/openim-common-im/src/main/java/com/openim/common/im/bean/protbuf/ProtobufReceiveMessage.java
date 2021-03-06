// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReceiveMessage.proto

package com.openim.common.im.bean.protbuf;

public final class ProtobufReceiveMessage {
  private ProtobufReceiveMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ReceiveMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string from = 1;
    boolean hasFrom();
    String getFrom();
    
    // optional string to = 2;
    boolean hasTo();
    String getTo();
    
    // optional int64 msgTime = 3;
    boolean hasMsgTime();
    long getMsgTime();
  }
  public static final class ReceiveMessage extends
      com.google.protobuf.GeneratedMessage
      implements ReceiveMessageOrBuilder {
    // Use ReceiveMessage.newBuilder() to construct.
    private ReceiveMessage(Builder builder) {
      super(builder);
    }
    private ReceiveMessage(boolean noInit) {}
    
    private static final ReceiveMessage defaultInstance;
    public static ReceiveMessage getDefaultInstance() {
      return defaultInstance;
    }
    
    public ReceiveMessage getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.internal_static_com_openim_common_im_bean_protbuf_ReceiveMessage_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.internal_static_com_openim_common_im_bean_protbuf_ReceiveMessage_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string from = 1;
    public static final int FROM_FIELD_NUMBER = 1;
    private java.lang.Object from_;
    public boolean hasFrom() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getFrom() {
      java.lang.Object ref = from_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          from_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string to = 2;
    public static final int TO_FIELD_NUMBER = 2;
    private java.lang.Object to_;
    public boolean hasTo() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getTo() {
      java.lang.Object ref = to_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          to_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getToBytes() {
      java.lang.Object ref = to_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        to_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int64 msgTime = 3;
    public static final int MSGTIME_FIELD_NUMBER = 3;
    private long msgTime_;
    public boolean hasMsgTime() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public long getMsgTime() {
      return msgTime_;
    }
    
    private void initFields() {
      from_ = "";
      to_ = "";
      msgTime_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getFromBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getToBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, msgTime_);
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
          .computeBytesSize(1, getFromBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getToBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, msgTime_);
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
    
    public static com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.internal_static_com_openim_common_im_bean_protbuf_ReceiveMessage_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.internal_static_com_openim_common_im_bean_protbuf_ReceiveMessage_fieldAccessorTable;
      }
      
      // Construct using com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
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
        from_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        to_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        msgTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage.getDescriptor();
      }
      
      public com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage getDefaultInstanceForType() {
        return com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage.getDefaultInstance();
      }
      
      public com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage build() {
        com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage buildPartial() {
        com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage result = new com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.from_ = from_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.to_ = to_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.msgTime_ = msgTime_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage) {
          return mergeFrom((com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage other) {
        if (other == com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage.getDefaultInstance()) return this;
        if (other.hasFrom()) {
          setFrom(other.getFrom());
        }
        if (other.hasTo()) {
          setTo(other.getTo());
        }
        if (other.hasMsgTime()) {
          setMsgTime(other.getMsgTime());
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
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              from_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              to_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              msgTime_ = input.readInt64();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string from = 1;
      private java.lang.Object from_ = "";
      public boolean hasFrom() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getFrom() {
        java.lang.Object ref = from_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          from_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setFrom(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        from_ = value;
        onChanged();
        return this;
      }
      public Builder clearFrom() {
        bitField0_ = (bitField0_ & ~0x00000001);
        from_ = getDefaultInstance().getFrom();
        onChanged();
        return this;
      }
      void setFrom(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        from_ = value;
        onChanged();
      }
      
      // optional string to = 2;
      private java.lang.Object to_ = "";
      public boolean hasTo() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getTo() {
        java.lang.Object ref = to_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          to_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setTo(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        to_ = value;
        onChanged();
        return this;
      }
      public Builder clearTo() {
        bitField0_ = (bitField0_ & ~0x00000002);
        to_ = getDefaultInstance().getTo();
        onChanged();
        return this;
      }
      void setTo(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        to_ = value;
        onChanged();
      }
      
      // optional int64 msgTime = 3;
      private long msgTime_ ;
      public boolean hasMsgTime() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public long getMsgTime() {
        return msgTime_;
      }
      public Builder setMsgTime(long value) {
        bitField0_ |= 0x00000004;
        msgTime_ = value;
        onChanged();
        return this;
      }
      public Builder clearMsgTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        msgTime_ = 0L;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.openim.common.im.bean.protbuf.ReceiveMessage)
    }
    
    static {
      defaultInstance = new ReceiveMessage(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.openim.common.im.bean.protbuf.ReceiveMessage)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_openim_common_im_bean_protbuf_ReceiveMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_openim_common_im_bean_protbuf_ReceiveMessage_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ReceiveMessage.proto\022!com.openim.commo" +
      "n.im.bean.protbuf\";\n\016ReceiveMessage\022\014\n\004f" +
      "rom\030\001 \001(\t\022\n\n\002to\030\002 \001(\t\022\017\n\007msgTime\030\003 \001(\003B\030" +
      "B\026ProtobufReceiveMessage"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_openim_common_im_bean_protbuf_ReceiveMessage_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_openim_common_im_bean_protbuf_ReceiveMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_openim_common_im_bean_protbuf_ReceiveMessage_descriptor,
              new java.lang.String[] { "From", "To", "MsgTime", },
              com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage.class,
              com.openim.common.im.bean.protbuf.ProtobufReceiveMessage.ReceiveMessage.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
