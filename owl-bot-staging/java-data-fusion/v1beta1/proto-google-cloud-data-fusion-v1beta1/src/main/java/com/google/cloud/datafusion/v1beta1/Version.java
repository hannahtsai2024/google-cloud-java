// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datafusion/v1beta1/v1beta1.proto

package com.google.cloud.datafusion.v1beta1;

/**
 * <pre>
 * The Data Fusion version.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datafusion.v1beta1.Version}
 */
public final class Version extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datafusion.v1beta1.Version)
    VersionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Version.newBuilder() to construct.
  private Version(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Version() {
    versionNumber_ = "";
    availableFeatures_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Version();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datafusion.v1beta1.V1Beta1.internal_static_google_cloud_datafusion_v1beta1_Version_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datafusion.v1beta1.V1Beta1.internal_static_google_cloud_datafusion_v1beta1_Version_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datafusion.v1beta1.Version.class, com.google.cloud.datafusion.v1beta1.Version.Builder.class);
  }

  /**
   * <pre>
   * Each type represents the release availability of a CDF version
   * </pre>
   *
   * Protobuf enum {@code google.cloud.datafusion.v1beta1.Version.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Version does not have availability yet
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * Version is under development and not considered stable
     * </pre>
     *
     * <code>TYPE_PREVIEW = 1;</code>
     */
    TYPE_PREVIEW(1),
    /**
     * <pre>
     * Version is available for public use
     * </pre>
     *
     * <code>TYPE_GENERAL_AVAILABILITY = 2;</code>
     */
    TYPE_GENERAL_AVAILABILITY(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Version does not have availability yet
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Version is under development and not considered stable
     * </pre>
     *
     * <code>TYPE_PREVIEW = 1;</code>
     */
    public static final int TYPE_PREVIEW_VALUE = 1;
    /**
     * <pre>
     * Version is available for public use
     * </pre>
     *
     * <code>TYPE_GENERAL_AVAILABILITY = 2;</code>
     */
    public static final int TYPE_GENERAL_AVAILABILITY_VALUE = 2;


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
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0: return TYPE_UNSPECIFIED;
        case 1: return TYPE_PREVIEW;
        case 2: return TYPE_GENERAL_AVAILABILITY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
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
      return com.google.cloud.datafusion.v1beta1.Version.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
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

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.datafusion.v1beta1.Version.Type)
  }

  public static final int VERSION_NUMBER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object versionNumber_ = "";
  /**
   * <pre>
   * The version number of the Data Fusion instance, such as '6.0.1.0'.
   * </pre>
   *
   * <code>string version_number = 1;</code>
   * @return The versionNumber.
   */
  @java.lang.Override
  public java.lang.String getVersionNumber() {
    java.lang.Object ref = versionNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      versionNumber_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The version number of the Data Fusion instance, such as '6.0.1.0'.
   * </pre>
   *
   * <code>string version_number = 1;</code>
   * @return The bytes for versionNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVersionNumberBytes() {
    java.lang.Object ref = versionNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      versionNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEFAULT_VERSION_FIELD_NUMBER = 2;
  private boolean defaultVersion_ = false;
  /**
   * <pre>
   * Whether this is currently the default version for Cloud Data Fusion
   * </pre>
   *
   * <code>bool default_version = 2;</code>
   * @return The defaultVersion.
   */
  @java.lang.Override
  public boolean getDefaultVersion() {
    return defaultVersion_;
  }

  public static final int AVAILABLE_FEATURES_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList availableFeatures_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Represents a list of available feature names for a given version.
   * </pre>
   *
   * <code>repeated string available_features = 3;</code>
   * @return A list containing the availableFeatures.
   */
  public com.google.protobuf.ProtocolStringList
      getAvailableFeaturesList() {
    return availableFeatures_;
  }
  /**
   * <pre>
   * Represents a list of available feature names for a given version.
   * </pre>
   *
   * <code>repeated string available_features = 3;</code>
   * @return The count of availableFeatures.
   */
  public int getAvailableFeaturesCount() {
    return availableFeatures_.size();
  }
  /**
   * <pre>
   * Represents a list of available feature names for a given version.
   * </pre>
   *
   * <code>repeated string available_features = 3;</code>
   * @param index The index of the element to return.
   * @return The availableFeatures at the given index.
   */
  public java.lang.String getAvailableFeatures(int index) {
    return availableFeatures_.get(index);
  }
  /**
   * <pre>
   * Represents a list of available feature names for a given version.
   * </pre>
   *
   * <code>repeated string available_features = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the availableFeatures at the given index.
   */
  public com.google.protobuf.ByteString
      getAvailableFeaturesBytes(int index) {
    return availableFeatures_.getByteString(index);
  }

  public static final int TYPE_FIELD_NUMBER = 4;
  private int type_ = 0;
  /**
   * <pre>
   * Type represents the release availability of the version
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.Version.Type type = 4;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Type represents the release availability of the version
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.Version.Type type = 4;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.cloud.datafusion.v1beta1.Version.Type getType() {
    com.google.cloud.datafusion.v1beta1.Version.Type result = com.google.cloud.datafusion.v1beta1.Version.Type.forNumber(type_);
    return result == null ? com.google.cloud.datafusion.v1beta1.Version.Type.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(versionNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, versionNumber_);
    }
    if (defaultVersion_ != false) {
      output.writeBool(2, defaultVersion_);
    }
    for (int i = 0; i < availableFeatures_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, availableFeatures_.getRaw(i));
    }
    if (type_ != com.google.cloud.datafusion.v1beta1.Version.Type.TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(versionNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, versionNumber_);
    }
    if (defaultVersion_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, defaultVersion_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < availableFeatures_.size(); i++) {
        dataSize += computeStringSizeNoTag(availableFeatures_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAvailableFeaturesList().size();
    }
    if (type_ != com.google.cloud.datafusion.v1beta1.Version.Type.TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, type_);
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
    if (!(obj instanceof com.google.cloud.datafusion.v1beta1.Version)) {
      return super.equals(obj);
    }
    com.google.cloud.datafusion.v1beta1.Version other = (com.google.cloud.datafusion.v1beta1.Version) obj;

    if (!getVersionNumber()
        .equals(other.getVersionNumber())) return false;
    if (getDefaultVersion()
        != other.getDefaultVersion()) return false;
    if (!getAvailableFeaturesList()
        .equals(other.getAvailableFeaturesList())) return false;
    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + VERSION_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getVersionNumber().hashCode();
    hash = (37 * hash) + DEFAULT_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDefaultVersion());
    if (getAvailableFeaturesCount() > 0) {
      hash = (37 * hash) + AVAILABLE_FEATURES_FIELD_NUMBER;
      hash = (53 * hash) + getAvailableFeaturesList().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datafusion.v1beta1.Version parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datafusion.v1beta1.Version parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datafusion.v1beta1.Version parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datafusion.v1beta1.Version parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datafusion.v1beta1.Version parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datafusion.v1beta1.Version parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datafusion.v1beta1.Version parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datafusion.v1beta1.Version parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.Version parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1beta1.Version parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datafusion.v1beta1.Version parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datafusion.v1beta1.Version parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datafusion.v1beta1.Version prototype) {
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
   * The Data Fusion version.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datafusion.v1beta1.Version}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datafusion.v1beta1.Version)
      com.google.cloud.datafusion.v1beta1.VersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datafusion.v1beta1.V1Beta1.internal_static_google_cloud_datafusion_v1beta1_Version_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datafusion.v1beta1.V1Beta1.internal_static_google_cloud_datafusion_v1beta1_Version_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datafusion.v1beta1.Version.class, com.google.cloud.datafusion.v1beta1.Version.Builder.class);
    }

    // Construct using com.google.cloud.datafusion.v1beta1.Version.newBuilder()
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
      versionNumber_ = "";
      defaultVersion_ = false;
      availableFeatures_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      type_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datafusion.v1beta1.V1Beta1.internal_static_google_cloud_datafusion_v1beta1_Version_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.Version getDefaultInstanceForType() {
      return com.google.cloud.datafusion.v1beta1.Version.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.Version build() {
      com.google.cloud.datafusion.v1beta1.Version result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.Version buildPartial() {
      com.google.cloud.datafusion.v1beta1.Version result = new com.google.cloud.datafusion.v1beta1.Version(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datafusion.v1beta1.Version result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.versionNumber_ = versionNumber_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.defaultVersion_ = defaultVersion_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        availableFeatures_.makeImmutable();
        result.availableFeatures_ = availableFeatures_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.type_ = type_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datafusion.v1beta1.Version) {
        return mergeFrom((com.google.cloud.datafusion.v1beta1.Version)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datafusion.v1beta1.Version other) {
      if (other == com.google.cloud.datafusion.v1beta1.Version.getDefaultInstance()) return this;
      if (!other.getVersionNumber().isEmpty()) {
        versionNumber_ = other.versionNumber_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getDefaultVersion() != false) {
        setDefaultVersion(other.getDefaultVersion());
      }
      if (!other.availableFeatures_.isEmpty()) {
        if (availableFeatures_.isEmpty()) {
          availableFeatures_ = other.availableFeatures_;
          bitField0_ |= 0x00000004;
        } else {
          ensureAvailableFeaturesIsMutable();
          availableFeatures_.addAll(other.availableFeatures_);
        }
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
              versionNumber_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              defaultVersion_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureAvailableFeaturesIsMutable();
              availableFeatures_.add(s);
              break;
            } // case 26
            case 32: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object versionNumber_ = "";
    /**
     * <pre>
     * The version number of the Data Fusion instance, such as '6.0.1.0'.
     * </pre>
     *
     * <code>string version_number = 1;</code>
     * @return The versionNumber.
     */
    public java.lang.String getVersionNumber() {
      java.lang.Object ref = versionNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        versionNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The version number of the Data Fusion instance, such as '6.0.1.0'.
     * </pre>
     *
     * <code>string version_number = 1;</code>
     * @return The bytes for versionNumber.
     */
    public com.google.protobuf.ByteString
        getVersionNumberBytes() {
      java.lang.Object ref = versionNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        versionNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The version number of the Data Fusion instance, such as '6.0.1.0'.
     * </pre>
     *
     * <code>string version_number = 1;</code>
     * @param value The versionNumber to set.
     * @return This builder for chaining.
     */
    public Builder setVersionNumber(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      versionNumber_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The version number of the Data Fusion instance, such as '6.0.1.0'.
     * </pre>
     *
     * <code>string version_number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersionNumber() {
      versionNumber_ = getDefaultInstance().getVersionNumber();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The version number of the Data Fusion instance, such as '6.0.1.0'.
     * </pre>
     *
     * <code>string version_number = 1;</code>
     * @param value The bytes for versionNumber to set.
     * @return This builder for chaining.
     */
    public Builder setVersionNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      versionNumber_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean defaultVersion_ ;
    /**
     * <pre>
     * Whether this is currently the default version for Cloud Data Fusion
     * </pre>
     *
     * <code>bool default_version = 2;</code>
     * @return The defaultVersion.
     */
    @java.lang.Override
    public boolean getDefaultVersion() {
      return defaultVersion_;
    }
    /**
     * <pre>
     * Whether this is currently the default version for Cloud Data Fusion
     * </pre>
     *
     * <code>bool default_version = 2;</code>
     * @param value The defaultVersion to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultVersion(boolean value) {

      defaultVersion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether this is currently the default version for Cloud Data Fusion
     * </pre>
     *
     * <code>bool default_version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultVersion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      defaultVersion_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList availableFeatures_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAvailableFeaturesIsMutable() {
      if (!availableFeatures_.isModifiable()) {
        availableFeatures_ = new com.google.protobuf.LazyStringArrayList(availableFeatures_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     * @return A list containing the availableFeatures.
     */
    public com.google.protobuf.ProtocolStringList
        getAvailableFeaturesList() {
      availableFeatures_.makeImmutable();
      return availableFeatures_;
    }
    /**
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     * @return The count of availableFeatures.
     */
    public int getAvailableFeaturesCount() {
      return availableFeatures_.size();
    }
    /**
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     * @param index The index of the element to return.
     * @return The availableFeatures at the given index.
     */
    public java.lang.String getAvailableFeatures(int index) {
      return availableFeatures_.get(index);
    }
    /**
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the availableFeatures at the given index.
     */
    public com.google.protobuf.ByteString
        getAvailableFeaturesBytes(int index) {
      return availableFeatures_.getByteString(index);
    }
    /**
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     * @param index The index to set the value at.
     * @param value The availableFeatures to set.
     * @return This builder for chaining.
     */
    public Builder setAvailableFeatures(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAvailableFeaturesIsMutable();
      availableFeatures_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     * @param value The availableFeatures to add.
     * @return This builder for chaining.
     */
    public Builder addAvailableFeatures(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAvailableFeaturesIsMutable();
      availableFeatures_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     * @param values The availableFeatures to add.
     * @return This builder for chaining.
     */
    public Builder addAllAvailableFeatures(
        java.lang.Iterable<java.lang.String> values) {
      ensureAvailableFeaturesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, availableFeatures_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvailableFeatures() {
      availableFeatures_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Represents a list of available feature names for a given version.
     * </pre>
     *
     * <code>repeated string available_features = 3;</code>
     * @param value The bytes of the availableFeatures to add.
     * @return This builder for chaining.
     */
    public Builder addAvailableFeaturesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAvailableFeaturesIsMutable();
      availableFeatures_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * Type represents the release availability of the version
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.Version.Type type = 4;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Type represents the release availability of the version
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.Version.Type type = 4;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type represents the release availability of the version
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.Version.Type type = 4;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.Version.Type getType() {
      com.google.cloud.datafusion.v1beta1.Version.Type result = com.google.cloud.datafusion.v1beta1.Version.Type.forNumber(type_);
      return result == null ? com.google.cloud.datafusion.v1beta1.Version.Type.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type represents the release availability of the version
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.Version.Type type = 4;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.cloud.datafusion.v1beta1.Version.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type represents the release availability of the version
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.Version.Type type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      type_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datafusion.v1beta1.Version)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datafusion.v1beta1.Version)
  private static final com.google.cloud.datafusion.v1beta1.Version DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datafusion.v1beta1.Version();
  }

  public static com.google.cloud.datafusion.v1beta1.Version getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Version>
      PARSER = new com.google.protobuf.AbstractParser<Version>() {
    @java.lang.Override
    public Version parsePartialFrom(
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

  public static com.google.protobuf.Parser<Version> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Version> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datafusion.v1beta1.Version getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

