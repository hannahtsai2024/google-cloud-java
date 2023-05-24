// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/environment.proto

package com.google.dataflow.v1beta3;

/**
 * <pre>
 * Describes any options that have an effect on the debugging of pipelines.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.DebugOptions}
 */
public final class DebugOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.DebugOptions)
    DebugOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DebugOptions.newBuilder() to construct.
  private DebugOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DebugOptions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DebugOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.dataflow.v1beta3.EnvironmentProto.internal_static_google_dataflow_v1beta3_DebugOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.EnvironmentProto.internal_static_google_dataflow_v1beta3_DebugOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.DebugOptions.class, com.google.dataflow.v1beta3.DebugOptions.Builder.class);
  }

  public static final int ENABLE_HOT_KEY_LOGGING_FIELD_NUMBER = 1;
  private boolean enableHotKeyLogging_ = false;
  /**
   * <pre>
   * When true, enables the logging of the literal hot key to the user's Cloud
   * Logging.
   * </pre>
   *
   * <code>bool enable_hot_key_logging = 1;</code>
   * @return The enableHotKeyLogging.
   */
  @java.lang.Override
  public boolean getEnableHotKeyLogging() {
    return enableHotKeyLogging_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (enableHotKeyLogging_ != false) {
      output.writeBool(1, enableHotKeyLogging_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableHotKeyLogging_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enableHotKeyLogging_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.dataflow.v1beta3.DebugOptions)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.DebugOptions other = (com.google.dataflow.v1beta3.DebugOptions) obj;

    if (getEnableHotKeyLogging()
        != other.getEnableHotKeyLogging()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ENABLE_HOT_KEY_LOGGING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableHotKeyLogging());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.DebugOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.DebugOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.DebugOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.DebugOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.DebugOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.dataflow.v1beta3.DebugOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.DebugOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.dataflow.v1beta3.DebugOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.DebugOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.DebugOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.dataflow.v1beta3.DebugOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.dataflow.v1beta3.DebugOptions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.dataflow.v1beta3.DebugOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Describes any options that have an effect on the debugging of pipelines.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.DebugOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.DebugOptions)
      com.google.dataflow.v1beta3.DebugOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.dataflow.v1beta3.EnvironmentProto.internal_static_google_dataflow_v1beta3_DebugOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.EnvironmentProto.internal_static_google_dataflow_v1beta3_DebugOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.DebugOptions.class, com.google.dataflow.v1beta3.DebugOptions.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.DebugOptions.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enableHotKeyLogging_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.dataflow.v1beta3.EnvironmentProto.internal_static_google_dataflow_v1beta3_DebugOptions_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.DebugOptions getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.DebugOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.DebugOptions build() {
      com.google.dataflow.v1beta3.DebugOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.DebugOptions buildPartial() {
      com.google.dataflow.v1beta3.DebugOptions result = new com.google.dataflow.v1beta3.DebugOptions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.dataflow.v1beta3.DebugOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enableHotKeyLogging_ = enableHotKeyLogging_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.dataflow.v1beta3.DebugOptions) {
        return mergeFrom((com.google.dataflow.v1beta3.DebugOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.DebugOptions other) {
      if (other == com.google.dataflow.v1beta3.DebugOptions.getDefaultInstance()) return this;
      if (other.getEnableHotKeyLogging() != false) {
        setEnableHotKeyLogging(other.getEnableHotKeyLogging());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              enableHotKeyLogging_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private boolean enableHotKeyLogging_ ;
    /**
     * <pre>
     * When true, enables the logging of the literal hot key to the user's Cloud
     * Logging.
     * </pre>
     *
     * <code>bool enable_hot_key_logging = 1;</code>
     * @return The enableHotKeyLogging.
     */
    @java.lang.Override
    public boolean getEnableHotKeyLogging() {
      return enableHotKeyLogging_;
    }
    /**
     * <pre>
     * When true, enables the logging of the literal hot key to the user's Cloud
     * Logging.
     * </pre>
     *
     * <code>bool enable_hot_key_logging = 1;</code>
     * @param value The enableHotKeyLogging to set.
     * @return This builder for chaining.
     */
    public Builder setEnableHotKeyLogging(boolean value) {

      enableHotKeyLogging_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * When true, enables the logging of the literal hot key to the user's Cloud
     * Logging.
     * </pre>
     *
     * <code>bool enable_hot_key_logging = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableHotKeyLogging() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enableHotKeyLogging_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.DebugOptions)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.DebugOptions)
  private static final com.google.dataflow.v1beta3.DebugOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.DebugOptions();
  }

  public static com.google.dataflow.v1beta3.DebugOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DebugOptions>
      PARSER = new com.google.protobuf.AbstractParser<DebugOptions>() {
    @java.lang.Override
    public DebugOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<DebugOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DebugOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.DebugOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

