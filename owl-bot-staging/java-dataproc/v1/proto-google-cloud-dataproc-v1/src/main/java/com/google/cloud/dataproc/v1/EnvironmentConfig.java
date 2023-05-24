// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

/**
 * <pre>
 * Environment configuration for a workload.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.EnvironmentConfig}
 */
public final class EnvironmentConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.EnvironmentConfig)
    EnvironmentConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EnvironmentConfig.newBuilder() to construct.
  private EnvironmentConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnvironmentConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EnvironmentConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataproc.v1.SharedProto.internal_static_google_cloud_dataproc_v1_EnvironmentConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.SharedProto.internal_static_google_cloud_dataproc_v1_EnvironmentConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.EnvironmentConfig.class, com.google.cloud.dataproc.v1.EnvironmentConfig.Builder.class);
  }

  public static final int EXECUTION_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.dataproc.v1.ExecutionConfig executionConfig_;
  /**
   * <pre>
   * Optional. Execution configuration for a workload.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the executionConfig field is set.
   */
  @java.lang.Override
  public boolean hasExecutionConfig() {
    return executionConfig_ != null;
  }
  /**
   * <pre>
   * Optional. Execution configuration for a workload.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The executionConfig.
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.ExecutionConfig getExecutionConfig() {
    return executionConfig_ == null ? com.google.cloud.dataproc.v1.ExecutionConfig.getDefaultInstance() : executionConfig_;
  }
  /**
   * <pre>
   * Optional. Execution configuration for a workload.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.ExecutionConfigOrBuilder getExecutionConfigOrBuilder() {
    return executionConfig_ == null ? com.google.cloud.dataproc.v1.ExecutionConfig.getDefaultInstance() : executionConfig_;
  }

  public static final int PERIPHERALS_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.dataproc.v1.PeripheralsConfig peripheralsConfig_;
  /**
   * <pre>
   * Optional. Peripherals configuration that workload has access to.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the peripheralsConfig field is set.
   */
  @java.lang.Override
  public boolean hasPeripheralsConfig() {
    return peripheralsConfig_ != null;
  }
  /**
   * <pre>
   * Optional. Peripherals configuration that workload has access to.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The peripheralsConfig.
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.PeripheralsConfig getPeripheralsConfig() {
    return peripheralsConfig_ == null ? com.google.cloud.dataproc.v1.PeripheralsConfig.getDefaultInstance() : peripheralsConfig_;
  }
  /**
   * <pre>
   * Optional. Peripherals configuration that workload has access to.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.PeripheralsConfigOrBuilder getPeripheralsConfigOrBuilder() {
    return peripheralsConfig_ == null ? com.google.cloud.dataproc.v1.PeripheralsConfig.getDefaultInstance() : peripheralsConfig_;
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
    if (executionConfig_ != null) {
      output.writeMessage(1, getExecutionConfig());
    }
    if (peripheralsConfig_ != null) {
      output.writeMessage(2, getPeripheralsConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (executionConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getExecutionConfig());
    }
    if (peripheralsConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPeripheralsConfig());
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.EnvironmentConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.EnvironmentConfig other = (com.google.cloud.dataproc.v1.EnvironmentConfig) obj;

    if (hasExecutionConfig() != other.hasExecutionConfig()) return false;
    if (hasExecutionConfig()) {
      if (!getExecutionConfig()
          .equals(other.getExecutionConfig())) return false;
    }
    if (hasPeripheralsConfig() != other.hasPeripheralsConfig()) return false;
    if (hasPeripheralsConfig()) {
      if (!getPeripheralsConfig()
          .equals(other.getPeripheralsConfig())) return false;
    }
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
    if (hasExecutionConfig()) {
      hash = (37 * hash) + EXECUTION_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getExecutionConfig().hashCode();
    }
    if (hasPeripheralsConfig()) {
      hash = (37 * hash) + PERIPHERALS_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getPeripheralsConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.EnvironmentConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1.EnvironmentConfig prototype) {
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
   * Environment configuration for a workload.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.EnvironmentConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.EnvironmentConfig)
      com.google.cloud.dataproc.v1.EnvironmentConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1.SharedProto.internal_static_google_cloud_dataproc_v1_EnvironmentConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.SharedProto.internal_static_google_cloud_dataproc_v1_EnvironmentConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.EnvironmentConfig.class, com.google.cloud.dataproc.v1.EnvironmentConfig.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.EnvironmentConfig.newBuilder()
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
      executionConfig_ = null;
      if (executionConfigBuilder_ != null) {
        executionConfigBuilder_.dispose();
        executionConfigBuilder_ = null;
      }
      peripheralsConfig_ = null;
      if (peripheralsConfigBuilder_ != null) {
        peripheralsConfigBuilder_.dispose();
        peripheralsConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1.SharedProto.internal_static_google_cloud_dataproc_v1_EnvironmentConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.EnvironmentConfig getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.EnvironmentConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.EnvironmentConfig build() {
      com.google.cloud.dataproc.v1.EnvironmentConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.EnvironmentConfig buildPartial() {
      com.google.cloud.dataproc.v1.EnvironmentConfig result = new com.google.cloud.dataproc.v1.EnvironmentConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataproc.v1.EnvironmentConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.executionConfig_ = executionConfigBuilder_ == null
            ? executionConfig_
            : executionConfigBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.peripheralsConfig_ = peripheralsConfigBuilder_ == null
            ? peripheralsConfig_
            : peripheralsConfigBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dataproc.v1.EnvironmentConfig) {
        return mergeFrom((com.google.cloud.dataproc.v1.EnvironmentConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.EnvironmentConfig other) {
      if (other == com.google.cloud.dataproc.v1.EnvironmentConfig.getDefaultInstance()) return this;
      if (other.hasExecutionConfig()) {
        mergeExecutionConfig(other.getExecutionConfig());
      }
      if (other.hasPeripheralsConfig()) {
        mergePeripheralsConfig(other.getPeripheralsConfig());
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
            case 10: {
              input.readMessage(
                  getExecutionConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPeripheralsConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.google.cloud.dataproc.v1.ExecutionConfig executionConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataproc.v1.ExecutionConfig, com.google.cloud.dataproc.v1.ExecutionConfig.Builder, com.google.cloud.dataproc.v1.ExecutionConfigOrBuilder> executionConfigBuilder_;
    /**
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the executionConfig field is set.
     */
    public boolean hasExecutionConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The executionConfig.
     */
    public com.google.cloud.dataproc.v1.ExecutionConfig getExecutionConfig() {
      if (executionConfigBuilder_ == null) {
        return executionConfig_ == null ? com.google.cloud.dataproc.v1.ExecutionConfig.getDefaultInstance() : executionConfig_;
      } else {
        return executionConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setExecutionConfig(com.google.cloud.dataproc.v1.ExecutionConfig value) {
      if (executionConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        executionConfig_ = value;
      } else {
        executionConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setExecutionConfig(
        com.google.cloud.dataproc.v1.ExecutionConfig.Builder builderForValue) {
      if (executionConfigBuilder_ == null) {
        executionConfig_ = builderForValue.build();
      } else {
        executionConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeExecutionConfig(com.google.cloud.dataproc.v1.ExecutionConfig value) {
      if (executionConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          executionConfig_ != null &&
          executionConfig_ != com.google.cloud.dataproc.v1.ExecutionConfig.getDefaultInstance()) {
          getExecutionConfigBuilder().mergeFrom(value);
        } else {
          executionConfig_ = value;
        }
      } else {
        executionConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearExecutionConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      executionConfig_ = null;
      if (executionConfigBuilder_ != null) {
        executionConfigBuilder_.dispose();
        executionConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.dataproc.v1.ExecutionConfig.Builder getExecutionConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getExecutionConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.dataproc.v1.ExecutionConfigOrBuilder getExecutionConfigOrBuilder() {
      if (executionConfigBuilder_ != null) {
        return executionConfigBuilder_.getMessageOrBuilder();
      } else {
        return executionConfig_ == null ?
            com.google.cloud.dataproc.v1.ExecutionConfig.getDefaultInstance() : executionConfig_;
      }
    }
    /**
     * <pre>
     * Optional. Execution configuration for a workload.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.ExecutionConfig execution_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataproc.v1.ExecutionConfig, com.google.cloud.dataproc.v1.ExecutionConfig.Builder, com.google.cloud.dataproc.v1.ExecutionConfigOrBuilder> 
        getExecutionConfigFieldBuilder() {
      if (executionConfigBuilder_ == null) {
        executionConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.ExecutionConfig, com.google.cloud.dataproc.v1.ExecutionConfig.Builder, com.google.cloud.dataproc.v1.ExecutionConfigOrBuilder>(
                getExecutionConfig(),
                getParentForChildren(),
                isClean());
        executionConfig_ = null;
      }
      return executionConfigBuilder_;
    }

    private com.google.cloud.dataproc.v1.PeripheralsConfig peripheralsConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataproc.v1.PeripheralsConfig, com.google.cloud.dataproc.v1.PeripheralsConfig.Builder, com.google.cloud.dataproc.v1.PeripheralsConfigOrBuilder> peripheralsConfigBuilder_;
    /**
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the peripheralsConfig field is set.
     */
    public boolean hasPeripheralsConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The peripheralsConfig.
     */
    public com.google.cloud.dataproc.v1.PeripheralsConfig getPeripheralsConfig() {
      if (peripheralsConfigBuilder_ == null) {
        return peripheralsConfig_ == null ? com.google.cloud.dataproc.v1.PeripheralsConfig.getDefaultInstance() : peripheralsConfig_;
      } else {
        return peripheralsConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setPeripheralsConfig(com.google.cloud.dataproc.v1.PeripheralsConfig value) {
      if (peripheralsConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        peripheralsConfig_ = value;
      } else {
        peripheralsConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setPeripheralsConfig(
        com.google.cloud.dataproc.v1.PeripheralsConfig.Builder builderForValue) {
      if (peripheralsConfigBuilder_ == null) {
        peripheralsConfig_ = builderForValue.build();
      } else {
        peripheralsConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergePeripheralsConfig(com.google.cloud.dataproc.v1.PeripheralsConfig value) {
      if (peripheralsConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          peripheralsConfig_ != null &&
          peripheralsConfig_ != com.google.cloud.dataproc.v1.PeripheralsConfig.getDefaultInstance()) {
          getPeripheralsConfigBuilder().mergeFrom(value);
        } else {
          peripheralsConfig_ = value;
        }
      } else {
        peripheralsConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearPeripheralsConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      peripheralsConfig_ = null;
      if (peripheralsConfigBuilder_ != null) {
        peripheralsConfigBuilder_.dispose();
        peripheralsConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.dataproc.v1.PeripheralsConfig.Builder getPeripheralsConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPeripheralsConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.cloud.dataproc.v1.PeripheralsConfigOrBuilder getPeripheralsConfigOrBuilder() {
      if (peripheralsConfigBuilder_ != null) {
        return peripheralsConfigBuilder_.getMessageOrBuilder();
      } else {
        return peripheralsConfig_ == null ?
            com.google.cloud.dataproc.v1.PeripheralsConfig.getDefaultInstance() : peripheralsConfig_;
      }
    }
    /**
     * <pre>
     * Optional. Peripherals configuration that workload has access to.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.PeripheralsConfig peripherals_config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataproc.v1.PeripheralsConfig, com.google.cloud.dataproc.v1.PeripheralsConfig.Builder, com.google.cloud.dataproc.v1.PeripheralsConfigOrBuilder> 
        getPeripheralsConfigFieldBuilder() {
      if (peripheralsConfigBuilder_ == null) {
        peripheralsConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataproc.v1.PeripheralsConfig, com.google.cloud.dataproc.v1.PeripheralsConfig.Builder, com.google.cloud.dataproc.v1.PeripheralsConfigOrBuilder>(
                getPeripheralsConfig(),
                getParentForChildren(),
                isClean());
        peripheralsConfig_ = null;
      }
      return peripheralsConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.EnvironmentConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.EnvironmentConfig)
  private static final com.google.cloud.dataproc.v1.EnvironmentConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.EnvironmentConfig();
  }

  public static com.google.cloud.dataproc.v1.EnvironmentConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnvironmentConfig>
      PARSER = new com.google.protobuf.AbstractParser<EnvironmentConfig>() {
    @java.lang.Override
    public EnvironmentConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<EnvironmentConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnvironmentConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.EnvironmentConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

