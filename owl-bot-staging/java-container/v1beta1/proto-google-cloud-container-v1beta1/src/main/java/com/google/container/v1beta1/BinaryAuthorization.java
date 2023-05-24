// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 * <pre>
 * Configuration for Binary Authorization.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.BinaryAuthorization}
 */
public final class BinaryAuthorization extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.BinaryAuthorization)
    BinaryAuthorizationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BinaryAuthorization.newBuilder() to construct.
  private BinaryAuthorization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BinaryAuthorization() {
    evaluationMode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BinaryAuthorization();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_BinaryAuthorization_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_BinaryAuthorization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.BinaryAuthorization.class, com.google.container.v1beta1.BinaryAuthorization.Builder.class);
  }

  /**
   * <pre>
   * Binary Authorization mode of operation.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1beta1.BinaryAuthorization.EvaluationMode}
   */
  public enum EvaluationMode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default value
     * </pre>
     *
     * <code>EVALUATION_MODE_UNSPECIFIED = 0;</code>
     */
    EVALUATION_MODE_UNSPECIFIED(0),
    /**
     * <pre>
     * Disable BinaryAuthorization
     * </pre>
     *
     * <code>DISABLED = 1;</code>
     */
    DISABLED(1),
    /**
     * <pre>
     * Enforce Kubernetes admission requests with BinaryAuthorization using the
     * project's singleton policy. This is equivalent to setting the
     * enabled boolean to true.
     * </pre>
     *
     * <code>PROJECT_SINGLETON_POLICY_ENFORCE = 2;</code>
     */
    PROJECT_SINGLETON_POLICY_ENFORCE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Default value
     * </pre>
     *
     * <code>EVALUATION_MODE_UNSPECIFIED = 0;</code>
     */
    public static final int EVALUATION_MODE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Disable BinaryAuthorization
     * </pre>
     *
     * <code>DISABLED = 1;</code>
     */
    public static final int DISABLED_VALUE = 1;
    /**
     * <pre>
     * Enforce Kubernetes admission requests with BinaryAuthorization using the
     * project's singleton policy. This is equivalent to setting the
     * enabled boolean to true.
     * </pre>
     *
     * <code>PROJECT_SINGLETON_POLICY_ENFORCE = 2;</code>
     */
    public static final int PROJECT_SINGLETON_POLICY_ENFORCE_VALUE = 2;


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
    public static EvaluationMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EvaluationMode forNumber(int value) {
      switch (value) {
        case 0: return EVALUATION_MODE_UNSPECIFIED;
        case 1: return DISABLED;
        case 2: return PROJECT_SINGLETON_POLICY_ENFORCE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EvaluationMode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EvaluationMode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EvaluationMode>() {
            public EvaluationMode findValueByNumber(int number) {
              return EvaluationMode.forNumber(number);
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
      return com.google.container.v1beta1.BinaryAuthorization.getDescriptor().getEnumTypes().get(0);
    }

    private static final EvaluationMode[] VALUES = values();

    public static EvaluationMode valueOf(
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

    private EvaluationMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1beta1.BinaryAuthorization.EvaluationMode)
  }

  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_ = false;
  /**
   * <pre>
   * This field is deprecated. Leave this unset and instead configure
   * BinaryAuthorization using evaluation_mode. If evaluation_mode is set to
   * anything other than EVALUATION_MODE_UNSPECIFIED, this field is ignored.
   * </pre>
   *
   * <code>bool enabled = 1 [deprecated = true];</code>
   * @deprecated google.container.v1beta1.BinaryAuthorization.enabled is deprecated.
   *     See google/container/v1beta1/cluster_service.proto;l=1613
   * @return The enabled.
   */
  @java.lang.Override
  @java.lang.Deprecated public boolean getEnabled() {
    return enabled_;
  }

  public static final int EVALUATION_MODE_FIELD_NUMBER = 2;
  private int evaluationMode_ = 0;
  /**
   * <pre>
   * Mode of operation for binauthz policy evaluation. If unspecified, defaults
   * to DISABLED.
   * </pre>
   *
   * <code>.google.container.v1beta1.BinaryAuthorization.EvaluationMode evaluation_mode = 2;</code>
   * @return The enum numeric value on the wire for evaluationMode.
   */
  @java.lang.Override public int getEvaluationModeValue() {
    return evaluationMode_;
  }
  /**
   * <pre>
   * Mode of operation for binauthz policy evaluation. If unspecified, defaults
   * to DISABLED.
   * </pre>
   *
   * <code>.google.container.v1beta1.BinaryAuthorization.EvaluationMode evaluation_mode = 2;</code>
   * @return The evaluationMode.
   */
  @java.lang.Override public com.google.container.v1beta1.BinaryAuthorization.EvaluationMode getEvaluationMode() {
    com.google.container.v1beta1.BinaryAuthorization.EvaluationMode result = com.google.container.v1beta1.BinaryAuthorization.EvaluationMode.forNumber(evaluationMode_);
    return result == null ? com.google.container.v1beta1.BinaryAuthorization.EvaluationMode.UNRECOGNIZED : result;
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    if (evaluationMode_ != com.google.container.v1beta1.BinaryAuthorization.EvaluationMode.EVALUATION_MODE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, evaluationMode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enabled_);
    }
    if (evaluationMode_ != com.google.container.v1beta1.BinaryAuthorization.EvaluationMode.EVALUATION_MODE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, evaluationMode_);
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
    if (!(obj instanceof com.google.container.v1beta1.BinaryAuthorization)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.BinaryAuthorization other = (com.google.container.v1beta1.BinaryAuthorization) obj;

    if (getEnabled()
        != other.getEnabled()) return false;
    if (evaluationMode_ != other.evaluationMode_) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnabled());
    hash = (37 * hash) + EVALUATION_MODE_FIELD_NUMBER;
    hash = (53 * hash) + evaluationMode_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.BinaryAuthorization parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.BinaryAuthorization parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.BinaryAuthorization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.BinaryAuthorization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.BinaryAuthorization parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1beta1.BinaryAuthorization parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1beta1.BinaryAuthorization parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.BinaryAuthorization parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.BinaryAuthorization parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.BinaryAuthorization parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1beta1.BinaryAuthorization parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1beta1.BinaryAuthorization parseFrom(
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
  public static Builder newBuilder(com.google.container.v1beta1.BinaryAuthorization prototype) {
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
   * Configuration for Binary Authorization.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.BinaryAuthorization}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.BinaryAuthorization)
      com.google.container.v1beta1.BinaryAuthorizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_BinaryAuthorization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_BinaryAuthorization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.BinaryAuthorization.class, com.google.container.v1beta1.BinaryAuthorization.Builder.class);
    }

    // Construct using com.google.container.v1beta1.BinaryAuthorization.newBuilder()
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
      enabled_ = false;
      evaluationMode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto.internal_static_google_container_v1beta1_BinaryAuthorization_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.BinaryAuthorization getDefaultInstanceForType() {
      return com.google.container.v1beta1.BinaryAuthorization.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.BinaryAuthorization build() {
      com.google.container.v1beta1.BinaryAuthorization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.BinaryAuthorization buildPartial() {
      com.google.container.v1beta1.BinaryAuthorization result = new com.google.container.v1beta1.BinaryAuthorization(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.BinaryAuthorization result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enabled_ = enabled_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.evaluationMode_ = evaluationMode_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.container.v1beta1.BinaryAuthorization) {
        return mergeFrom((com.google.container.v1beta1.BinaryAuthorization)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.BinaryAuthorization other) {
      if (other == com.google.container.v1beta1.BinaryAuthorization.getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (other.evaluationMode_ != 0) {
        setEvaluationModeValue(other.getEvaluationModeValue());
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
              enabled_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              evaluationMode_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private boolean enabled_ ;
    /**
     * <pre>
     * This field is deprecated. Leave this unset and instead configure
     * BinaryAuthorization using evaluation_mode. If evaluation_mode is set to
     * anything other than EVALUATION_MODE_UNSPECIFIED, this field is ignored.
     * </pre>
     *
     * <code>bool enabled = 1 [deprecated = true];</code>
     * @deprecated google.container.v1beta1.BinaryAuthorization.enabled is deprecated.
     *     See google/container/v1beta1/cluster_service.proto;l=1613
     * @return The enabled.
     */
    @java.lang.Override
    @java.lang.Deprecated public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <pre>
     * This field is deprecated. Leave this unset and instead configure
     * BinaryAuthorization using evaluation_mode. If evaluation_mode is set to
     * anything other than EVALUATION_MODE_UNSPECIFIED, this field is ignored.
     * </pre>
     *
     * <code>bool enabled = 1 [deprecated = true];</code>
     * @deprecated google.container.v1beta1.BinaryAuthorization.enabled is deprecated.
     *     See google/container/v1beta1/cluster_service.proto;l=1613
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setEnabled(boolean value) {

      enabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field is deprecated. Leave this unset and instead configure
     * BinaryAuthorization using evaluation_mode. If evaluation_mode is set to
     * anything other than EVALUATION_MODE_UNSPECIFIED, this field is ignored.
     * </pre>
     *
     * <code>bool enabled = 1 [deprecated = true];</code>
     * @deprecated google.container.v1beta1.BinaryAuthorization.enabled is deprecated.
     *     See google/container/v1beta1/cluster_service.proto;l=1613
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enabled_ = false;
      onChanged();
      return this;
    }

    private int evaluationMode_ = 0;
    /**
     * <pre>
     * Mode of operation for binauthz policy evaluation. If unspecified, defaults
     * to DISABLED.
     * </pre>
     *
     * <code>.google.container.v1beta1.BinaryAuthorization.EvaluationMode evaluation_mode = 2;</code>
     * @return The enum numeric value on the wire for evaluationMode.
     */
    @java.lang.Override public int getEvaluationModeValue() {
      return evaluationMode_;
    }
    /**
     * <pre>
     * Mode of operation for binauthz policy evaluation. If unspecified, defaults
     * to DISABLED.
     * </pre>
     *
     * <code>.google.container.v1beta1.BinaryAuthorization.EvaluationMode evaluation_mode = 2;</code>
     * @param value The enum numeric value on the wire for evaluationMode to set.
     * @return This builder for chaining.
     */
    public Builder setEvaluationModeValue(int value) {
      evaluationMode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mode of operation for binauthz policy evaluation. If unspecified, defaults
     * to DISABLED.
     * </pre>
     *
     * <code>.google.container.v1beta1.BinaryAuthorization.EvaluationMode evaluation_mode = 2;</code>
     * @return The evaluationMode.
     */
    @java.lang.Override
    public com.google.container.v1beta1.BinaryAuthorization.EvaluationMode getEvaluationMode() {
      com.google.container.v1beta1.BinaryAuthorization.EvaluationMode result = com.google.container.v1beta1.BinaryAuthorization.EvaluationMode.forNumber(evaluationMode_);
      return result == null ? com.google.container.v1beta1.BinaryAuthorization.EvaluationMode.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Mode of operation for binauthz policy evaluation. If unspecified, defaults
     * to DISABLED.
     * </pre>
     *
     * <code>.google.container.v1beta1.BinaryAuthorization.EvaluationMode evaluation_mode = 2;</code>
     * @param value The evaluationMode to set.
     * @return This builder for chaining.
     */
    public Builder setEvaluationMode(com.google.container.v1beta1.BinaryAuthorization.EvaluationMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      evaluationMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mode of operation for binauthz policy evaluation. If unspecified, defaults
     * to DISABLED.
     * </pre>
     *
     * <code>.google.container.v1beta1.BinaryAuthorization.EvaluationMode evaluation_mode = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEvaluationMode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      evaluationMode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.BinaryAuthorization)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.BinaryAuthorization)
  private static final com.google.container.v1beta1.BinaryAuthorization DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.BinaryAuthorization();
  }

  public static com.google.container.v1beta1.BinaryAuthorization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BinaryAuthorization>
      PARSER = new com.google.protobuf.AbstractParser<BinaryAuthorization>() {
    @java.lang.Override
    public BinaryAuthorization parsePartialFrom(
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

  public static com.google.protobuf.Parser<BinaryAuthorization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BinaryAuthorization> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.BinaryAuthorization getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

