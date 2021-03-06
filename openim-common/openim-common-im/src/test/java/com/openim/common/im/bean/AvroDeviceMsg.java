/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.openim.common.im.bean;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AvroDeviceMsg extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroDeviceMsg\",\"namespace\":\"com.openim.common.im.bean\",\"fields\":[{\"name\":\"type\",\"type\":[\"int\",\"null\"]},{\"name\":\"to\",\"type\":[\"string\",\"null\"]},{\"name\":\"msg\",\"type\":[\"string\",\"null\"]},{\"name\":\"from\",\"type\":[\"string\",\"null\"]},{\"name\":\"loginId\",\"type\":[\"string\",\"null\"]},{\"name\":\"pwd\",\"type\":[\"string\",\"null\"]},{\"name\":\"serverQueue\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Integer type;
  @Deprecated public java.lang.CharSequence to;
  @Deprecated public java.lang.CharSequence msg;
  @Deprecated public java.lang.CharSequence from;
  @Deprecated public java.lang.CharSequence loginId;
  @Deprecated public java.lang.CharSequence pwd;
  @Deprecated public java.lang.CharSequence serverQueue;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public AvroDeviceMsg() {}

  /**
   * All-args constructor.
   */
  public AvroDeviceMsg(java.lang.Integer type, java.lang.CharSequence to, java.lang.CharSequence msg, java.lang.CharSequence from, java.lang.CharSequence loginId, java.lang.CharSequence pwd, java.lang.CharSequence serverQueue) {
    this.type = type;
    this.to = to;
    this.msg = msg;
    this.from = from;
    this.loginId = loginId;
    this.pwd = pwd;
    this.serverQueue = serverQueue;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return to;
    case 2: return msg;
    case 3: return from;
    case 4: return loginId;
    case 5: return pwd;
    case 6: return serverQueue;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (java.lang.Integer)value$; break;
    case 1: to = (java.lang.CharSequence)value$; break;
    case 2: msg = (java.lang.CharSequence)value$; break;
    case 3: from = (java.lang.CharSequence)value$; break;
    case 4: loginId = (java.lang.CharSequence)value$; break;
    case 5: pwd = (java.lang.CharSequence)value$; break;
    case 6: serverQueue = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   */
  public java.lang.Integer getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.Integer value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'to' field.
   */
  public java.lang.CharSequence getTo() {
    return to;
  }

  /**
   * Sets the value of the 'to' field.
   * @param value the value to set.
   */
  public void setTo(java.lang.CharSequence value) {
    this.to = value;
  }

  /**
   * Gets the value of the 'msg' field.
   */
  public java.lang.CharSequence getMsg() {
    return msg;
  }

  /**
   * Sets the value of the 'msg' field.
   * @param value the value to set.
   */
  public void setMsg(java.lang.CharSequence value) {
    this.msg = value;
  }

  /**
   * Gets the value of the 'from' field.
   */
  public java.lang.CharSequence getFrom() {
    return from;
  }

  /**
   * Sets the value of the 'from' field.
   * @param value the value to set.
   */
  public void setFrom(java.lang.CharSequence value) {
    this.from = value;
  }

  /**
   * Gets the value of the 'loginId' field.
   */
  public java.lang.CharSequence getLoginId() {
    return loginId;
  }

  /**
   * Sets the value of the 'loginId' field.
   * @param value the value to set.
   */
  public void setLoginId(java.lang.CharSequence value) {
    this.loginId = value;
  }

  /**
   * Gets the value of the 'pwd' field.
   */
  public java.lang.CharSequence getPwd() {
    return pwd;
  }

  /**
   * Sets the value of the 'pwd' field.
   * @param value the value to set.
   */
  public void setPwd(java.lang.CharSequence value) {
    this.pwd = value;
  }

  /**
   * Gets the value of the 'serverQueue' field.
   */
  public java.lang.CharSequence getServerQueue() {
    return serverQueue;
  }

  /**
   * Sets the value of the 'serverQueue' field.
   * @param value the value to set.
   */
  public void setServerQueue(java.lang.CharSequence value) {
    this.serverQueue = value;
  }

  /** Creates a new AvroDeviceMsg RecordBuilder */
  public static com.openim.common.im.bean.AvroDeviceMsg.Builder newBuilder() {
    return new com.openim.common.im.bean.AvroDeviceMsg.Builder();
  }
  
  /** Creates a new AvroDeviceMsg RecordBuilder by copying an existing Builder */
  public static com.openim.common.im.bean.AvroDeviceMsg.Builder newBuilder(com.openim.common.im.bean.AvroDeviceMsg.Builder other) {
    return new com.openim.common.im.bean.AvroDeviceMsg.Builder(other);
  }
  
  /** Creates a new AvroDeviceMsg RecordBuilder by copying an existing AvroDeviceMsg instance */
  public static com.openim.common.im.bean.AvroDeviceMsg.Builder newBuilder(com.openim.common.im.bean.AvroDeviceMsg other) {
    return new com.openim.common.im.bean.AvroDeviceMsg.Builder(other);
  }
  
  /**
   * RecordBuilder for AvroDeviceMsg instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroDeviceMsg>
    implements org.apache.avro.data.RecordBuilder<AvroDeviceMsg> {

    private java.lang.Integer type;
    private java.lang.CharSequence to;
    private java.lang.CharSequence msg;
    private java.lang.CharSequence from;
    private java.lang.CharSequence loginId;
    private java.lang.CharSequence pwd;
    private java.lang.CharSequence serverQueue;

    /** Creates a new Builder */
    private Builder() {
      super(com.openim.common.im.bean.AvroDeviceMsg.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.openim.common.im.bean.AvroDeviceMsg.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.to)) {
        this.to = data().deepCopy(fields()[1].schema(), other.to);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.msg)) {
        this.msg = data().deepCopy(fields()[2].schema(), other.msg);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.from)) {
        this.from = data().deepCopy(fields()[3].schema(), other.from);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.loginId)) {
        this.loginId = data().deepCopy(fields()[4].schema(), other.loginId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.pwd)) {
        this.pwd = data().deepCopy(fields()[5].schema(), other.pwd);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.serverQueue)) {
        this.serverQueue = data().deepCopy(fields()[6].schema(), other.serverQueue);
        fieldSetFlags()[6] = true;
      }
    }
    
    /** Creates a Builder by copying an existing AvroDeviceMsg instance */
    private Builder(com.openim.common.im.bean.AvroDeviceMsg other) {
            super(com.openim.common.im.bean.AvroDeviceMsg.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.to)) {
        this.to = data().deepCopy(fields()[1].schema(), other.to);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.msg)) {
        this.msg = data().deepCopy(fields()[2].schema(), other.msg);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.from)) {
        this.from = data().deepCopy(fields()[3].schema(), other.from);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.loginId)) {
        this.loginId = data().deepCopy(fields()[4].schema(), other.loginId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.pwd)) {
        this.pwd = data().deepCopy(fields()[5].schema(), other.pwd);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.serverQueue)) {
        this.serverQueue = data().deepCopy(fields()[6].schema(), other.serverQueue);
        fieldSetFlags()[6] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public java.lang.Integer getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public com.openim.common.im.bean.AvroDeviceMsg.Builder setType(java.lang.Integer value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'type' field */
    public com.openim.common.im.bean.AvroDeviceMsg.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'to' field */
    public java.lang.CharSequence getTo() {
      return to;
    }
    
    /** Sets the value of the 'to' field */
    public com.openim.common.im.bean.AvroDeviceMsg.Builder setTo(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.to = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'to' field has been set */
    public boolean hasTo() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'to' field */
    public com.openim.common.im.bean.AvroDeviceMsg.Builder clearTo() {
      to = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'msg' field */
    public java.lang.CharSequence getMsg() {
      return msg;
    }
    
    /** Sets the value of the 'msg' field */
    public com.openim.common.im.bean.AvroDeviceMsg.Builder setMsg(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.msg = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'msg' field has been set */
    public boolean hasMsg() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'msg' field */
    public com.openim.common.im.bean.AvroDeviceMsg.Builder clearMsg() {
      msg = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'from' field */
    public java.lang.CharSequence getFrom() {
      return from;
    }
    
    /** Sets the value of the 'from' field */
    public com.openim.common.im.bean.AvroDeviceMsg.Builder setFrom(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.from = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'from' field has been set */
    public boolean hasFrom() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'from' field */
    public com.openim.common.im.bean.AvroDeviceMsg.Builder clearFrom() {
      from = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'loginId' field */
    public java.lang.CharSequence getLoginId() {
      return loginId;
    }
    
    /** Sets the value of the 'loginId' field */
    public com.openim.common.im.bean.AvroDeviceMsg.Builder setLoginId(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.loginId = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'loginId' field has been set */
    public boolean hasLoginId() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'loginId' field */
    public com.openim.common.im.bean.AvroDeviceMsg.Builder clearLoginId() {
      loginId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'pwd' field */
    public java.lang.CharSequence getPwd() {
      return pwd;
    }
    
    /** Sets the value of the 'pwd' field */
    public com.openim.common.im.bean.AvroDeviceMsg.Builder setPwd(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.pwd = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'pwd' field has been set */
    public boolean hasPwd() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'pwd' field */
    public com.openim.common.im.bean.AvroDeviceMsg.Builder clearPwd() {
      pwd = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'serverQueue' field */
    public java.lang.CharSequence getServerQueue() {
      return serverQueue;
    }
    
    /** Sets the value of the 'serverQueue' field */
    public com.openim.common.im.bean.AvroDeviceMsg.Builder setServerQueue(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.serverQueue = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'serverQueue' field has been set */
    public boolean hasServerQueue() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'serverQueue' field */
    public com.openim.common.im.bean.AvroDeviceMsg.Builder clearServerQueue() {
      serverQueue = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public AvroDeviceMsg build() {
      try {
        AvroDeviceMsg record = new AvroDeviceMsg();
        record.type = fieldSetFlags()[0] ? this.type : (java.lang.Integer) defaultValue(fields()[0]);
        record.to = fieldSetFlags()[1] ? this.to : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.msg = fieldSetFlags()[2] ? this.msg : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.from = fieldSetFlags()[3] ? this.from : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.loginId = fieldSetFlags()[4] ? this.loginId : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.pwd = fieldSetFlags()[5] ? this.pwd : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.serverQueue = fieldSetFlags()[6] ? this.serverQueue : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
