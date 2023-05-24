// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 * <pre>
 * GatewayAPIConfig contains the desired config of Gateway API on this cluster.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.GatewayAPIConfig}
 */
public final class GatewayAPIConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1.GatewayAPIConfig)
    GatewayAPIConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GatewayAPIConfig.newBuilder() to construct.
  private GatewayAPIConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GatewayAPIConfig() {
    channel_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GatewayAPIConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_GatewayAPIConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_GatewayAPIConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.GatewayAPIConfig.class, com.google.container.v1.GatewayAPIConfig.Builder.class);
  }

  /**
   * <pre>
   * Channel describes if/how Gateway API should be installed and implemented in
   * a cluster.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1.GatewayAPIConfig.Channel}
   */
  public enum Channel
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default value.
     * </pre>
     *
     * <code>CHANNEL_UNSPECIFIED = 0;</code>
     */
    CHANNEL_UNSPECIFIED(0),
    /**
     * <pre>
     * Gateway API support is disabled
     * </pre>
     *
     * <code>CHANNEL_DISABLED = 1;</code>
     */
    CHANNEL_DISABLED(1),
    /**
     * <pre>
     * Gateway API support is enabled, experimental CRDs are installed
     * </pre>
     *
     * <code>CHANNEL_EXPERIMENTAL = 3;</code>
     */
    CHANNEL_EXPERIMENTAL(3),
    /**
     * <pre>
     * Gateway API support is enabled, standard CRDs are installed
     * </pre>
     *
     * <code>CHANNEL_STANDARD = 4;</code>
     */
    CHANNEL_STANDARD(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Default value.
     * </pre>
     *
     * <code>CHANNEL_UNSPECIFIED = 0;</code>
     */
    public static final int CHANNEL_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Gateway API support is disabled
     * </pre>
     *
     * <code>CHANNEL_DISABLED = 1;</code>
     */
    public static final int CHANNEL_DISABLED_VALUE = 1;
    /**
     * <pre>
     * Gateway API support is enabled, experimental CRDs are installed
     * </pre>
     *
     * <code>CHANNEL_EXPERIMENTAL = 3;</code>
     */
    public static final int CHANNEL_EXPERIMENTAL_VALUE = 3;
    /**
     * <pre>
     * Gateway API support is enabled, standard CRDs are installed
     * </pre>
     *
     * <code>CHANNEL_STANDARD = 4;</code>
     */
    public static final int CHANNEL_STANDARD_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Channel valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Channel forNumber(int value) {
      switch (value) {
        case 0: return CHANNEL_UNSPECIFIED;
        case 1: return CHANNEL_DISABLED;
        case 3: return CHANNEL_EXPERIMENTAL;
        case 4: return CHANNEL_STANDARD;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Channel>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Channel> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Channel>() {
            public Channel findValueByNumber(int number) {
              return Channel.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.container.v1.GatewayAPIConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final Channel[] VALUES = values();

    public static Channel valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Channel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1.GatewayAPIConfig.Channel)
  }

  public static final int CHANNEL_FIELD_NUMBER = 1;
  private int channel_ = 0;
  /**
   * <pre>
   * The Gateway API release channel to use for Gateway API.
   * </pre>
   *
   * <code>.google.container.v1.GatewayAPIConfig.Channel channel = 1;</code>
   * @return The enum numeric value on the wire for channel.
   */
  @java.lang.Override public int getChannelValue() {
    return channel_;
  }
  /**
   * <pre>
   * The Gateway API release channel to use for Gateway API.
   * </pre>
   *
   * <code>.google.container.v1.GatewayAPIConfig.Channel channel = 1;</code>
   * @return The channel.
   */
  @java.lang.Override public com.google.container.v1.GatewayAPIConfig.Channel getChannel() {
    com.google.container.v1.GatewayAPIConfig.Channel result = com.google.container.v1.GatewayAPIConfig.Channel.forNumber(channel_);
    return result == null ? com.google.container.v1.GatewayAPIConfig.Channel.UNRECOGNIZED : result;
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
    if (channel_ != com.google.container.v1.GatewayAPIConfig.Channel.CHANNEL_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, channel_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (channel_ != com.google.container.v1.GatewayAPIConfig.Channel.CHANNEL_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, channel_);
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
    if (!(obj instanceof com.google.container.v1.GatewayAPIConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1.GatewayAPIConfig other = (com.google.container.v1.GatewayAPIConfig) obj;

    if (channel_ != other.channel_) return false;
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
    hash = (37 * hash) + CHANNEL_FIELD_NUMBER;
    hash = (53 * hash) + channel_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.GatewayAPIConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.GatewayAPIConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.GatewayAPIConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.GatewayAPIConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.GatewayAPIConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.GatewayAPIConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.GatewayAPIConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.GatewayAPIConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.GatewayAPIConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.GatewayAPIConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.GatewayAPIConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.GatewayAPIConfig parseFrom(
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
  public static Builder newBuilder(com.google.container.v1.GatewayAPIConfig prototype) {
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
   * GatewayAPIConfig contains the desired config of Gateway API on this cluster.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.GatewayAPIConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.GatewayAPIConfig)
      com.google.container.v1.GatewayAPIConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_GatewayAPIConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_GatewayAPIConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.GatewayAPIConfig.class, com.google.container.v1.GatewayAPIConfig.Builder.class);
    }

    // Construct using com.google.container.v1.GatewayAPIConfig.newBuilder()
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
      channel_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_GatewayAPIConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.GatewayAPIConfig getDefaultInstanceForType() {
      return com.google.container.v1.GatewayAPIConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.GatewayAPIConfig build() {
      com.google.container.v1.GatewayAPIConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.GatewayAPIConfig buildPartial() {
      com.google.container.v1.GatewayAPIConfig result = new com.google.container.v1.GatewayAPIConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1.GatewayAPIConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.channel_ = channel_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.container.v1.GatewayAPIConfig) {
        return mergeFrom((com.google.container.v1.GatewayAPIConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.GatewayAPIConfig other) {
      if (other == com.google.container.v1.GatewayAPIConfig.getDefaultInstance()) return this;
      if (other.channel_ != 0) {
        setChannelValue(other.getChannelValue());
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
              channel_ = input.readEnum();
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

    private int channel_ = 0;
    /**
     * <pre>
     * The Gateway API release channel to use for Gateway API.
     * </pre>
     *
     * <code>.google.container.v1.GatewayAPIConfig.Channel channel = 1;</code>
     * @return The enum numeric value on the wire for channel.
     */
    @java.lang.Override public int getChannelValue() {
      return channel_;
    }
    /**
     * <pre>
     * The Gateway API release channel to use for Gateway API.
     * </pre>
     *
     * <code>.google.container.v1.GatewayAPIConfig.Channel channel = 1;</code>
     * @param value The enum numeric value on the wire for channel to set.
     * @return This builder for chaining.
     */
    public Builder setChannelValue(int value) {
      channel_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Gateway API release channel to use for Gateway API.
     * </pre>
     *
     * <code>.google.container.v1.GatewayAPIConfig.Channel channel = 1;</code>
     * @return The channel.
     */
    @java.lang.Override
    public com.google.container.v1.GatewayAPIConfig.Channel getChannel() {
      com.google.container.v1.GatewayAPIConfig.Channel result = com.google.container.v1.GatewayAPIConfig.Channel.forNumber(channel_);
      return result == null ? com.google.container.v1.GatewayAPIConfig.Channel.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The Gateway API release channel to use for Gateway API.
     * </pre>
     *
     * <code>.google.container.v1.GatewayAPIConfig.Channel channel = 1;</code>
     * @param value The channel to set.
     * @return This builder for chaining.
     */
    public Builder setChannel(com.google.container.v1.GatewayAPIConfig.Channel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      channel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Gateway API release channel to use for Gateway API.
     * </pre>
     *
     * <code>.google.container.v1.GatewayAPIConfig.Channel channel = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearChannel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      channel_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1.GatewayAPIConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.GatewayAPIConfig)
  private static final com.google.container.v1.GatewayAPIConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1.GatewayAPIConfig();
  }

  public static com.google.container.v1.GatewayAPIConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GatewayAPIConfig>
      PARSER = new com.google.protobuf.AbstractParser<GatewayAPIConfig>() {
    @java.lang.Override
    public GatewayAPIConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<GatewayAPIConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GatewayAPIConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.GatewayAPIConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

