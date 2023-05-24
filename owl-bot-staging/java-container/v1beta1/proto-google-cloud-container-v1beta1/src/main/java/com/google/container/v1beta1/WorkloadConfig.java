// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 * <pre>
 * WorkloadConfig defines the flags to enable or disable the
 * workload configurations for the cluster.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.WorkloadConfig}
 */
public final class WorkloadConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.WorkloadConfig)
    WorkloadConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WorkloadConfig.newBuilder() to construct.
  private WorkloadConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkloadConfig() {
    auditMode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WorkloadConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_WorkloadConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_WorkloadConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.WorkloadConfig.class, com.google.container.v1beta1.WorkloadConfig.Builder.class);
  }

  /**
   * <pre>
   * Mode defines how to audit the workload configs.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1beta1.WorkloadConfig.Mode}
   */
  public enum Mode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default value meaning that no mode has been specified.
     * </pre>
     *
     * <code>MODE_UNSPECIFIED = 0;</code>
     */
    MODE_UNSPECIFIED(0),
    /**
     * <pre>
     * This disables Workload Configuration auditing on the cluster,
     * meaning that nothing is surfaced.
     * </pre>
     *
     * <code>DISABLED = 1;</code>
     */
    DISABLED(1),
    /**
     * <pre>
     * Applies the default set of policy auditing to a cluster's workloads.
     * </pre>
     *
     * <code>BASIC = 4;</code>
     */
    BASIC(4),
    /**
     * <pre>
     * Surfaces configurations that are not in line with the
     * Pod Security Standard Baseline policy.
     * </pre>
     *
     * <code>BASELINE = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    BASELINE(2),
    /**
     * <pre>
     * Surfaces configurations that are not in line with the
     * Pod Security Standard Restricted policy.
     * </pre>
     *
     * <code>RESTRICTED = 3 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    RESTRICTED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Default value meaning that no mode has been specified.
     * </pre>
     *
     * <code>MODE_UNSPECIFIED = 0;</code>
     */
    public static final int MODE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * This disables Workload Configuration auditing on the cluster,
     * meaning that nothing is surfaced.
     * </pre>
     *
     * <code>DISABLED = 1;</code>
     */
    public static final int DISABLED_VALUE = 1;
    /**
     * <pre>
     * Applies the default set of policy auditing to a cluster's workloads.
     * </pre>
     *
     * <code>BASIC = 4;</code>
     */
    public static final int BASIC_VALUE = 4;
    /**
     * <pre>
     * Surfaces configurations that are not in line with the
     * Pod Security Standard Baseline policy.
     * </pre>
     *
     * <code>BASELINE = 2 [deprecated = true];</code>
     */
    @java.lang.Deprecated public static final int BASELINE_VALUE = 2;
    /**
     * <pre>
     * Surfaces configurations that are not in line with the
     * Pod Security Standard Restricted policy.
     * </pre>
     *
     * <code>RESTRICTED = 3 [deprecated = true];</code>
     */
    @java.lang.Deprecated public static final int RESTRICTED_VALUE = 3;


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
    public static Mode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Mode forNumber(int value) {
      switch (value) {
        case 0: return MODE_UNSPECIFIED;
        case 1: return DISABLED;
        case 4: return BASIC;
        case 2: return BASELINE;
        case 3: return RESTRICTED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Mode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Mode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Mode>() {
            public Mode findValueByNumber(int number) {
              return Mode.forNumber(number);
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
      return com.google.container.v1beta1.WorkloadConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final Mode[] VALUES = values();

    public static Mode valueOf(
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

    private Mode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1beta1.WorkloadConfig.Mode)
  }

  private int bitField0_;
  public static final int AUDIT_MODE_FIELD_NUMBER = 1;
  private int auditMode_ = 0;
  /**
   * <pre>
   * Sets which mode of auditing should be used for the cluster's workloads.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.WorkloadConfig.Mode audit_mode = 1;</code>
   * @return Whether the auditMode field is set.
   */
  @java.lang.Override public boolean hasAuditMode() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Sets which mode of auditing should be used for the cluster's workloads.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.WorkloadConfig.Mode audit_mode = 1;</code>
   * @return The enum numeric value on the wire for auditMode.
   */
  @java.lang.Override public int getAuditModeValue() {
    return auditMode_;
  }
  /**
   * <pre>
   * Sets which mode of auditing should be used for the cluster's workloads.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.WorkloadConfig.Mode audit_mode = 1;</code>
   * @return The auditMode.
   */
  @java.lang.Override public com.google.container.v1beta1.WorkloadConfig.Mode getAuditMode() {
    com.google.container.v1beta1.WorkloadConfig.Mode result = com.google.container.v1beta1.WorkloadConfig.Mode.forNumber(auditMode_);
    return result == null ? com.google.container.v1beta1.WorkloadConfig.Mode.UNRECOGNIZED : result;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeEnum(1, auditMode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, auditMode_);
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
    if (!(obj instanceof com.google.container.v1beta1.WorkloadConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.WorkloadConfig other = (com.google.container.v1beta1.WorkloadConfig) obj;

    if (hasAuditMode() != other.hasAuditMode()) return false;
    if (hasAuditMode()) {
      if (auditMode_ != other.auditMode_) return false;
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
    if (hasAuditMode()) {
      hash = (37 * hash) + AUDIT_MODE_FIELD_NUMBER;
      hash = (53 * hash) + auditMode_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.WorkloadConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.WorkloadConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.WorkloadConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.WorkloadConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.WorkloadConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.WorkloadConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.WorkloadConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.WorkloadConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.WorkloadConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.WorkloadConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1beta1.WorkloadConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.WorkloadConfig parseFrom(
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
  public static Builder newBuilder(com.google.container.v1beta1.WorkloadConfig prototype) {
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
   * WorkloadConfig defines the flags to enable or disable the
   * workload configurations for the cluster.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.WorkloadConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.WorkloadConfig)
      com.google.container.v1beta1.WorkloadConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_WorkloadConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_WorkloadConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.WorkloadConfig.class, com.google.container.v1beta1.WorkloadConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.WorkloadConfig.newBuilder()
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
      auditMode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_WorkloadConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.WorkloadConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.WorkloadConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.WorkloadConfig build() {
      com.google.container.v1beta1.WorkloadConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.WorkloadConfig buildPartial() {
      com.google.container.v1beta1.WorkloadConfig result = new com.google.container.v1beta1.WorkloadConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.WorkloadConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.auditMode_ = auditMode_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.container.v1beta1.WorkloadConfig) {
        return mergeFrom((com.google.container.v1beta1.WorkloadConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.WorkloadConfig other) {
      if (other == com.google.container.v1beta1.WorkloadConfig.getDefaultInstance()) return this;
      if (other.hasAuditMode()) {
        setAuditMode(other.getAuditMode());
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
              auditMode_ = input.readEnum();
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

    private int auditMode_ = 0;
    /**
     * <pre>
     * Sets which mode of auditing should be used for the cluster's workloads.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig.Mode audit_mode = 1;</code>
     * @return Whether the auditMode field is set.
     */
    @java.lang.Override public boolean hasAuditMode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Sets which mode of auditing should be used for the cluster's workloads.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig.Mode audit_mode = 1;</code>
     * @return The enum numeric value on the wire for auditMode.
     */
    @java.lang.Override public int getAuditModeValue() {
      return auditMode_;
    }
    /**
     * <pre>
     * Sets which mode of auditing should be used for the cluster's workloads.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig.Mode audit_mode = 1;</code>
     * @param value The enum numeric value on the wire for auditMode to set.
     * @return This builder for chaining.
     */
    public Builder setAuditModeValue(int value) {
      auditMode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Sets which mode of auditing should be used for the cluster's workloads.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig.Mode audit_mode = 1;</code>
     * @return The auditMode.
     */
    @java.lang.Override
    public com.google.container.v1beta1.WorkloadConfig.Mode getAuditMode() {
      com.google.container.v1beta1.WorkloadConfig.Mode result = com.google.container.v1beta1.WorkloadConfig.Mode.forNumber(auditMode_);
      return result == null ? com.google.container.v1beta1.WorkloadConfig.Mode.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Sets which mode of auditing should be used for the cluster's workloads.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig.Mode audit_mode = 1;</code>
     * @param value The auditMode to set.
     * @return This builder for chaining.
     */
    public Builder setAuditMode(com.google.container.v1beta1.WorkloadConfig.Mode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      auditMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Sets which mode of auditing should be used for the cluster's workloads.
     * </pre>
     *
     * <code>optional .google.container.v1beta1.WorkloadConfig.Mode audit_mode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAuditMode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      auditMode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.WorkloadConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.WorkloadConfig)
  private static final com.google.container.v1beta1.WorkloadConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.WorkloadConfig();
  }

  public static com.google.container.v1beta1.WorkloadConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkloadConfig>
      PARSER = new com.google.protobuf.AbstractParser<WorkloadConfig>() {
    @java.lang.Override
    public WorkloadConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<WorkloadConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkloadConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.WorkloadConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

