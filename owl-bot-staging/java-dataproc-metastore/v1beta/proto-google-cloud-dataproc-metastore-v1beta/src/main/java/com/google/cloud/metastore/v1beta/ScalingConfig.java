// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1beta/metastore.proto

package com.google.cloud.metastore.v1beta;

/**
 * <pre>
 * Represents the scaling configuration of a metastore service.
 * </pre>
 *
 * Protobuf type {@code google.cloud.metastore.v1beta.ScalingConfig}
 */
public final class ScalingConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.metastore.v1beta.ScalingConfig)
    ScalingConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScalingConfig.newBuilder() to construct.
  private ScalingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScalingConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScalingConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.metastore.v1beta.MetastoreProto.internal_static_google_cloud_metastore_v1beta_ScalingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.metastore.v1beta.MetastoreProto.internal_static_google_cloud_metastore_v1beta_ScalingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.metastore.v1beta.ScalingConfig.class, com.google.cloud.metastore.v1beta.ScalingConfig.Builder.class);
  }

  /**
   * <pre>
   * Metastore instance sizes.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.metastore.v1beta.ScalingConfig.InstanceSize}
   */
  public enum InstanceSize
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified instance size
     * </pre>
     *
     * <code>INSTANCE_SIZE_UNSPECIFIED = 0;</code>
     */
    INSTANCE_SIZE_UNSPECIFIED(0),
    /**
     * <pre>
     * Extra small instance size, maps to a scaling factor of 0.1.
     * </pre>
     *
     * <code>EXTRA_SMALL = 1;</code>
     */
    EXTRA_SMALL(1),
    /**
     * <pre>
     * Small instance size, maps to a scaling factor of 0.5.
     * </pre>
     *
     * <code>SMALL = 2;</code>
     */
    SMALL(2),
    /**
     * <pre>
     * Medium instance size, maps to a scaling factor of 1.0.
     * </pre>
     *
     * <code>MEDIUM = 3;</code>
     */
    MEDIUM(3),
    /**
     * <pre>
     * Large instance size, maps to a scaling factor of 3.0.
     * </pre>
     *
     * <code>LARGE = 4;</code>
     */
    LARGE(4),
    /**
     * <pre>
     * Extra large instance size, maps to a scaling factor of 6.0.
     * </pre>
     *
     * <code>EXTRA_LARGE = 5;</code>
     */
    EXTRA_LARGE(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified instance size
     * </pre>
     *
     * <code>INSTANCE_SIZE_UNSPECIFIED = 0;</code>
     */
    public static final int INSTANCE_SIZE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Extra small instance size, maps to a scaling factor of 0.1.
     * </pre>
     *
     * <code>EXTRA_SMALL = 1;</code>
     */
    public static final int EXTRA_SMALL_VALUE = 1;
    /**
     * <pre>
     * Small instance size, maps to a scaling factor of 0.5.
     * </pre>
     *
     * <code>SMALL = 2;</code>
     */
    public static final int SMALL_VALUE = 2;
    /**
     * <pre>
     * Medium instance size, maps to a scaling factor of 1.0.
     * </pre>
     *
     * <code>MEDIUM = 3;</code>
     */
    public static final int MEDIUM_VALUE = 3;
    /**
     * <pre>
     * Large instance size, maps to a scaling factor of 3.0.
     * </pre>
     *
     * <code>LARGE = 4;</code>
     */
    public static final int LARGE_VALUE = 4;
    /**
     * <pre>
     * Extra large instance size, maps to a scaling factor of 6.0.
     * </pre>
     *
     * <code>EXTRA_LARGE = 5;</code>
     */
    public static final int EXTRA_LARGE_VALUE = 5;


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
    public static InstanceSize valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static InstanceSize forNumber(int value) {
      switch (value) {
        case 0: return INSTANCE_SIZE_UNSPECIFIED;
        case 1: return EXTRA_SMALL;
        case 2: return SMALL;
        case 3: return MEDIUM;
        case 4: return LARGE;
        case 5: return EXTRA_LARGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<InstanceSize>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        InstanceSize> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<InstanceSize>() {
            public InstanceSize findValueByNumber(int number) {
              return InstanceSize.forNumber(number);
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
      return com.google.cloud.metastore.v1beta.ScalingConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final InstanceSize[] VALUES = values();

    public static InstanceSize valueOf(
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

    private InstanceSize(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.metastore.v1beta.ScalingConfig.InstanceSize)
  }

  private int scalingModelCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object scalingModel_;
  public enum ScalingModelCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    INSTANCE_SIZE(1),
    SCALING_FACTOR(2),
    SCALINGMODEL_NOT_SET(0);
    private final int value;
    private ScalingModelCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ScalingModelCase valueOf(int value) {
      return forNumber(value);
    }

    public static ScalingModelCase forNumber(int value) {
      switch (value) {
        case 1: return INSTANCE_SIZE;
        case 2: return SCALING_FACTOR;
        case 0: return SCALINGMODEL_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ScalingModelCase
  getScalingModelCase() {
    return ScalingModelCase.forNumber(
        scalingModelCase_);
  }

  public static final int INSTANCE_SIZE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * An enum of readable instance sizes, with each instance size mapping to a
   * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
   * </pre>
   *
   * <code>.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize instance_size = 1;</code>
   * @return Whether the instanceSize field is set.
   */
  public boolean hasInstanceSize() {
    return scalingModelCase_ == 1;
  }
  /**
   * <pre>
   * An enum of readable instance sizes, with each instance size mapping to a
   * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
   * </pre>
   *
   * <code>.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize instance_size = 1;</code>
   * @return The enum numeric value on the wire for instanceSize.
   */
  public int getInstanceSizeValue() {
    if (scalingModelCase_ == 1) {
      return (java.lang.Integer) scalingModel_;
    }
    return 0;
  }
  /**
   * <pre>
   * An enum of readable instance sizes, with each instance size mapping to a
   * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
   * </pre>
   *
   * <code>.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize instance_size = 1;</code>
   * @return The instanceSize.
   */
  public com.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize getInstanceSize() {
    if (scalingModelCase_ == 1) {
      com.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize result = com.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize.forNumber(
          (java.lang.Integer) scalingModel_);
      return result == null ? com.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize.UNRECOGNIZED : result;
    }
    return com.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize.INSTANCE_SIZE_UNSPECIFIED;
  }

  public static final int SCALING_FACTOR_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Scaling factor, increments of 0.1 for values less than 1.0, and
   * increments of 1.0 for values greater than 1.0.
   * </pre>
   *
   * <code>float scaling_factor = 2;</code>
   * @return Whether the scalingFactor field is set.
   */
  @java.lang.Override
  public boolean hasScalingFactor() {
    return scalingModelCase_ == 2;
  }
  /**
   * <pre>
   * Scaling factor, increments of 0.1 for values less than 1.0, and
   * increments of 1.0 for values greater than 1.0.
   * </pre>
   *
   * <code>float scaling_factor = 2;</code>
   * @return The scalingFactor.
   */
  @java.lang.Override
  public float getScalingFactor() {
    if (scalingModelCase_ == 2) {
      return (java.lang.Float) scalingModel_;
    }
    return 0F;
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
    if (scalingModelCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) scalingModel_));
    }
    if (scalingModelCase_ == 2) {
      output.writeFloat(
          2, (float)((java.lang.Float) scalingModel_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scalingModelCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) scalingModel_));
    }
    if (scalingModelCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(
            2, (float)((java.lang.Float) scalingModel_));
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
    if (!(obj instanceof com.google.cloud.metastore.v1beta.ScalingConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.metastore.v1beta.ScalingConfig other = (com.google.cloud.metastore.v1beta.ScalingConfig) obj;

    if (!getScalingModelCase().equals(other.getScalingModelCase())) return false;
    switch (scalingModelCase_) {
      case 1:
        if (getInstanceSizeValue()
            != other.getInstanceSizeValue()) return false;
        break;
      case 2:
        if (java.lang.Float.floatToIntBits(getScalingFactor())
            != java.lang.Float.floatToIntBits(
                other.getScalingFactor())) return false;
        break;
      case 0:
      default:
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
    switch (scalingModelCase_) {
      case 1:
        hash = (37 * hash) + INSTANCE_SIZE_FIELD_NUMBER;
        hash = (53 * hash) + getInstanceSizeValue();
        break;
      case 2:
        hash = (37 * hash) + SCALING_FACTOR_FIELD_NUMBER;
        hash = (53 * hash) + java.lang.Float.floatToIntBits(
            getScalingFactor());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.metastore.v1beta.ScalingConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1beta.ScalingConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1beta.ScalingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1beta.ScalingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1beta.ScalingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1beta.ScalingConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1beta.ScalingConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1beta.ScalingConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1beta.ScalingConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1beta.ScalingConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1beta.ScalingConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1beta.ScalingConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.metastore.v1beta.ScalingConfig prototype) {
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
   * Represents the scaling configuration of a metastore service.
   * </pre>
   *
   * Protobuf type {@code google.cloud.metastore.v1beta.ScalingConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.metastore.v1beta.ScalingConfig)
      com.google.cloud.metastore.v1beta.ScalingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.metastore.v1beta.MetastoreProto.internal_static_google_cloud_metastore_v1beta_ScalingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.metastore.v1beta.MetastoreProto.internal_static_google_cloud_metastore_v1beta_ScalingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.metastore.v1beta.ScalingConfig.class, com.google.cloud.metastore.v1beta.ScalingConfig.Builder.class);
    }

    // Construct using com.google.cloud.metastore.v1beta.ScalingConfig.newBuilder()
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
      scalingModelCase_ = 0;
      scalingModel_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.metastore.v1beta.MetastoreProto.internal_static_google_cloud_metastore_v1beta_ScalingConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1beta.ScalingConfig getDefaultInstanceForType() {
      return com.google.cloud.metastore.v1beta.ScalingConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1beta.ScalingConfig build() {
      com.google.cloud.metastore.v1beta.ScalingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1beta.ScalingConfig buildPartial() {
      com.google.cloud.metastore.v1beta.ScalingConfig result = new com.google.cloud.metastore.v1beta.ScalingConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.metastore.v1beta.ScalingConfig result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.metastore.v1beta.ScalingConfig result) {
      result.scalingModelCase_ = scalingModelCase_;
      result.scalingModel_ = this.scalingModel_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.metastore.v1beta.ScalingConfig) {
        return mergeFrom((com.google.cloud.metastore.v1beta.ScalingConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.metastore.v1beta.ScalingConfig other) {
      if (other == com.google.cloud.metastore.v1beta.ScalingConfig.getDefaultInstance()) return this;
      switch (other.getScalingModelCase()) {
        case INSTANCE_SIZE: {
          setInstanceSizeValue(other.getInstanceSizeValue());
          break;
        }
        case SCALING_FACTOR: {
          setScalingFactor(other.getScalingFactor());
          break;
        }
        case SCALINGMODEL_NOT_SET: {
          break;
        }
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
              int rawValue = input.readEnum();
              scalingModelCase_ = 1;
              scalingModel_ = rawValue;
              break;
            } // case 8
            case 21: {
              scalingModel_ = input.readFloat();
              scalingModelCase_ = 2;
              break;
            } // case 21
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
    private int scalingModelCase_ = 0;
    private java.lang.Object scalingModel_;
    public ScalingModelCase
        getScalingModelCase() {
      return ScalingModelCase.forNumber(
          scalingModelCase_);
    }

    public Builder clearScalingModel() {
      scalingModelCase_ = 0;
      scalingModel_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * An enum of readable instance sizes, with each instance size mapping to a
     * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
     * </pre>
     *
     * <code>.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize instance_size = 1;</code>
     * @return Whether the instanceSize field is set.
     */
    @java.lang.Override
    public boolean hasInstanceSize() {
      return scalingModelCase_ == 1;
    }
    /**
     * <pre>
     * An enum of readable instance sizes, with each instance size mapping to a
     * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
     * </pre>
     *
     * <code>.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize instance_size = 1;</code>
     * @return The enum numeric value on the wire for instanceSize.
     */
    @java.lang.Override
    public int getInstanceSizeValue() {
      if (scalingModelCase_ == 1) {
        return ((java.lang.Integer) scalingModel_).intValue();
      }
      return 0;
    }
    /**
     * <pre>
     * An enum of readable instance sizes, with each instance size mapping to a
     * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
     * </pre>
     *
     * <code>.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize instance_size = 1;</code>
     * @param value The enum numeric value on the wire for instanceSize to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceSizeValue(int value) {
      scalingModelCase_ = 1;
      scalingModel_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An enum of readable instance sizes, with each instance size mapping to a
     * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
     * </pre>
     *
     * <code>.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize instance_size = 1;</code>
     * @return The instanceSize.
     */
    @java.lang.Override
    public com.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize getInstanceSize() {
      if (scalingModelCase_ == 1) {
        com.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize result = com.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize.forNumber(
            (java.lang.Integer) scalingModel_);
        return result == null ? com.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize.UNRECOGNIZED : result;
      }
      return com.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize.INSTANCE_SIZE_UNSPECIFIED;
    }
    /**
     * <pre>
     * An enum of readable instance sizes, with each instance size mapping to a
     * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
     * </pre>
     *
     * <code>.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize instance_size = 1;</code>
     * @param value The instanceSize to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceSize(com.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize value) {
      if (value == null) {
        throw new NullPointerException();
      }
      scalingModelCase_ = 1;
      scalingModel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An enum of readable instance sizes, with each instance size mapping to a
     * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
     * </pre>
     *
     * <code>.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize instance_size = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInstanceSize() {
      if (scalingModelCase_ == 1) {
        scalingModelCase_ = 0;
        scalingModel_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Scaling factor, increments of 0.1 for values less than 1.0, and
     * increments of 1.0 for values greater than 1.0.
     * </pre>
     *
     * <code>float scaling_factor = 2;</code>
     * @return Whether the scalingFactor field is set.
     */
    public boolean hasScalingFactor() {
      return scalingModelCase_ == 2;
    }
    /**
     * <pre>
     * Scaling factor, increments of 0.1 for values less than 1.0, and
     * increments of 1.0 for values greater than 1.0.
     * </pre>
     *
     * <code>float scaling_factor = 2;</code>
     * @return The scalingFactor.
     */
    public float getScalingFactor() {
      if (scalingModelCase_ == 2) {
        return (java.lang.Float) scalingModel_;
      }
      return 0F;
    }
    /**
     * <pre>
     * Scaling factor, increments of 0.1 for values less than 1.0, and
     * increments of 1.0 for values greater than 1.0.
     * </pre>
     *
     * <code>float scaling_factor = 2;</code>
     * @param value The scalingFactor to set.
     * @return This builder for chaining.
     */
    public Builder setScalingFactor(float value) {

      scalingModelCase_ = 2;
      scalingModel_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scaling factor, increments of 0.1 for values less than 1.0, and
     * increments of 1.0 for values greater than 1.0.
     * </pre>
     *
     * <code>float scaling_factor = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearScalingFactor() {
      if (scalingModelCase_ == 2) {
        scalingModelCase_ = 0;
        scalingModel_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:google.cloud.metastore.v1beta.ScalingConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.metastore.v1beta.ScalingConfig)
  private static final com.google.cloud.metastore.v1beta.ScalingConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.metastore.v1beta.ScalingConfig();
  }

  public static com.google.cloud.metastore.v1beta.ScalingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScalingConfig>
      PARSER = new com.google.protobuf.AbstractParser<ScalingConfig>() {
    @java.lang.Override
    public ScalingConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScalingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScalingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.metastore.v1beta.ScalingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

