// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 * <pre>
 * UpgradeAvailableEvent is a notification sent to customers when a new
 * available version is released.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.UpgradeAvailableEvent}
 */
public final class UpgradeAvailableEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1.UpgradeAvailableEvent)
    UpgradeAvailableEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpgradeAvailableEvent.newBuilder() to construct.
  private UpgradeAvailableEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpgradeAvailableEvent() {
    version_ = "";
    resourceType_ = 0;
    resource_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpgradeAvailableEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_UpgradeAvailableEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_UpgradeAvailableEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.UpgradeAvailableEvent.class, com.google.container.v1.UpgradeAvailableEvent.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object version_ = "";
  /**
   * <pre>
   * The release version available for upgrade.
   * </pre>
   *
   * <code>string version = 1;</code>
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The release version available for upgrade.
   * </pre>
   *
   * <code>string version = 1;</code>
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_TYPE_FIELD_NUMBER = 2;
  private int resourceType_ = 0;
  /**
   * <pre>
   * The resource type of the release version.
   * </pre>
   *
   * <code>.google.container.v1.UpgradeResourceType resource_type = 2;</code>
   * @return The enum numeric value on the wire for resourceType.
   */
  @java.lang.Override public int getResourceTypeValue() {
    return resourceType_;
  }
  /**
   * <pre>
   * The resource type of the release version.
   * </pre>
   *
   * <code>.google.container.v1.UpgradeResourceType resource_type = 2;</code>
   * @return The resourceType.
   */
  @java.lang.Override public com.google.container.v1.UpgradeResourceType getResourceType() {
    com.google.container.v1.UpgradeResourceType result = com.google.container.v1.UpgradeResourceType.forNumber(resourceType_);
    return result == null ? com.google.container.v1.UpgradeResourceType.UNRECOGNIZED : result;
  }

  public static final int RELEASE_CHANNEL_FIELD_NUMBER = 3;
  private com.google.container.v1.ReleaseChannel releaseChannel_;
  /**
   * <pre>
   * The release channel of the version. If empty, it means a non-channel
   * release.
   * </pre>
   *
   * <code>.google.container.v1.ReleaseChannel release_channel = 3;</code>
   * @return Whether the releaseChannel field is set.
   */
  @java.lang.Override
  public boolean hasReleaseChannel() {
    return releaseChannel_ != null;
  }
  /**
   * <pre>
   * The release channel of the version. If empty, it means a non-channel
   * release.
   * </pre>
   *
   * <code>.google.container.v1.ReleaseChannel release_channel = 3;</code>
   * @return The releaseChannel.
   */
  @java.lang.Override
  public com.google.container.v1.ReleaseChannel getReleaseChannel() {
    return releaseChannel_ == null ? com.google.container.v1.ReleaseChannel.getDefaultInstance() : releaseChannel_;
  }
  /**
   * <pre>
   * The release channel of the version. If empty, it means a non-channel
   * release.
   * </pre>
   *
   * <code>.google.container.v1.ReleaseChannel release_channel = 3;</code>
   */
  @java.lang.Override
  public com.google.container.v1.ReleaseChannelOrBuilder getReleaseChannelOrBuilder() {
    return releaseChannel_ == null ? com.google.container.v1.ReleaseChannel.getDefaultInstance() : releaseChannel_;
  }

  public static final int RESOURCE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resource_ = "";
  /**
   * <pre>
   * Optional relative path to the resource. For example, the relative path of
   * the node pool.
   * </pre>
   *
   * <code>string resource = 4;</code>
   * @return The resource.
   */
  @java.lang.Override
  public java.lang.String getResource() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resource_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional relative path to the resource. For example, the relative path of
   * the node pool.
   * </pre>
   *
   * <code>string resource = 4;</code>
   * @return The bytes for resource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceBytes() {
    java.lang.Object ref = resource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resource_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, version_);
    }
    if (resourceType_ != com.google.container.v1.UpgradeResourceType.UPGRADE_RESOURCE_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, resourceType_);
    }
    if (releaseChannel_ != null) {
      output.writeMessage(3, getReleaseChannel());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, resource_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, version_);
    }
    if (resourceType_ != com.google.container.v1.UpgradeResourceType.UPGRADE_RESOURCE_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, resourceType_);
    }
    if (releaseChannel_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getReleaseChannel());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, resource_);
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
    if (!(obj instanceof com.google.container.v1.UpgradeAvailableEvent)) {
      return super.equals(obj);
    }
    com.google.container.v1.UpgradeAvailableEvent other = (com.google.container.v1.UpgradeAvailableEvent) obj;

    if (!getVersion()
        .equals(other.getVersion())) return false;
    if (resourceType_ != other.resourceType_) return false;
    if (hasReleaseChannel() != other.hasReleaseChannel()) return false;
    if (hasReleaseChannel()) {
      if (!getReleaseChannel()
          .equals(other.getReleaseChannel())) return false;
    }
    if (!getResource()
        .equals(other.getResource())) return false;
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + RESOURCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + resourceType_;
    if (hasReleaseChannel()) {
      hash = (37 * hash) + RELEASE_CHANNEL_FIELD_NUMBER;
      hash = (53 * hash) + getReleaseChannel().hashCode();
    }
    hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getResource().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.UpgradeAvailableEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.UpgradeAvailableEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.UpgradeAvailableEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.UpgradeAvailableEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.UpgradeAvailableEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.UpgradeAvailableEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.UpgradeAvailableEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.UpgradeAvailableEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.UpgradeAvailableEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.UpgradeAvailableEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.UpgradeAvailableEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.UpgradeAvailableEvent parseFrom(
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
  public static Builder newBuilder(com.google.container.v1.UpgradeAvailableEvent prototype) {
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
   * UpgradeAvailableEvent is a notification sent to customers when a new
   * available version is released.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.UpgradeAvailableEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.UpgradeAvailableEvent)
      com.google.container.v1.UpgradeAvailableEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_UpgradeAvailableEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_UpgradeAvailableEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.UpgradeAvailableEvent.class, com.google.container.v1.UpgradeAvailableEvent.Builder.class);
    }

    // Construct using com.google.container.v1.UpgradeAvailableEvent.newBuilder()
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
      version_ = "";
      resourceType_ = 0;
      releaseChannel_ = null;
      if (releaseChannelBuilder_ != null) {
        releaseChannelBuilder_.dispose();
        releaseChannelBuilder_ = null;
      }
      resource_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_UpgradeAvailableEvent_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.UpgradeAvailableEvent getDefaultInstanceForType() {
      return com.google.container.v1.UpgradeAvailableEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.UpgradeAvailableEvent build() {
      com.google.container.v1.UpgradeAvailableEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.UpgradeAvailableEvent buildPartial() {
      com.google.container.v1.UpgradeAvailableEvent result = new com.google.container.v1.UpgradeAvailableEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1.UpgradeAvailableEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.version_ = version_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resourceType_ = resourceType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.releaseChannel_ = releaseChannelBuilder_ == null
            ? releaseChannel_
            : releaseChannelBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.resource_ = resource_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.container.v1.UpgradeAvailableEvent) {
        return mergeFrom((com.google.container.v1.UpgradeAvailableEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.UpgradeAvailableEvent other) {
      if (other == com.google.container.v1.UpgradeAvailableEvent.getDefaultInstance()) return this;
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.resourceType_ != 0) {
        setResourceTypeValue(other.getResourceTypeValue());
      }
      if (other.hasReleaseChannel()) {
        mergeReleaseChannel(other.getReleaseChannel());
      }
      if (!other.getResource().isEmpty()) {
        resource_ = other.resource_;
        bitField0_ |= 0x00000008;
        onChanged();
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
              version_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              resourceType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getReleaseChannelFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              resource_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object version_ = "";
    /**
     * <pre>
     * The release version available for upgrade.
     * </pre>
     *
     * <code>string version = 1;</code>
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The release version available for upgrade.
     * </pre>
     *
     * <code>string version = 1;</code>
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The release version available for upgrade.
     * </pre>
     *
     * <code>string version = 1;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      version_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The release version available for upgrade.
     * </pre>
     *
     * <code>string version = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      version_ = getDefaultInstance().getVersion();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The release version available for upgrade.
     * </pre>
     *
     * <code>string version = 1;</code>
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      version_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int resourceType_ = 0;
    /**
     * <pre>
     * The resource type of the release version.
     * </pre>
     *
     * <code>.google.container.v1.UpgradeResourceType resource_type = 2;</code>
     * @return The enum numeric value on the wire for resourceType.
     */
    @java.lang.Override public int getResourceTypeValue() {
      return resourceType_;
    }
    /**
     * <pre>
     * The resource type of the release version.
     * </pre>
     *
     * <code>.google.container.v1.UpgradeResourceType resource_type = 2;</code>
     * @param value The enum numeric value on the wire for resourceType to set.
     * @return This builder for chaining.
     */
    public Builder setResourceTypeValue(int value) {
      resourceType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource type of the release version.
     * </pre>
     *
     * <code>.google.container.v1.UpgradeResourceType resource_type = 2;</code>
     * @return The resourceType.
     */
    @java.lang.Override
    public com.google.container.v1.UpgradeResourceType getResourceType() {
      com.google.container.v1.UpgradeResourceType result = com.google.container.v1.UpgradeResourceType.forNumber(resourceType_);
      return result == null ? com.google.container.v1.UpgradeResourceType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The resource type of the release version.
     * </pre>
     *
     * <code>.google.container.v1.UpgradeResourceType resource_type = 2;</code>
     * @param value The resourceType to set.
     * @return This builder for chaining.
     */
    public Builder setResourceType(com.google.container.v1.UpgradeResourceType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      resourceType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource type of the release version.
     * </pre>
     *
     * <code>.google.container.v1.UpgradeResourceType resource_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      resourceType_ = 0;
      onChanged();
      return this;
    }

    private com.google.container.v1.ReleaseChannel releaseChannel_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.container.v1.ReleaseChannel, com.google.container.v1.ReleaseChannel.Builder, com.google.container.v1.ReleaseChannelOrBuilder> releaseChannelBuilder_;
    /**
     * <pre>
     * The release channel of the version. If empty, it means a non-channel
     * release.
     * </pre>
     *
     * <code>.google.container.v1.ReleaseChannel release_channel = 3;</code>
     * @return Whether the releaseChannel field is set.
     */
    public boolean hasReleaseChannel() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The release channel of the version. If empty, it means a non-channel
     * release.
     * </pre>
     *
     * <code>.google.container.v1.ReleaseChannel release_channel = 3;</code>
     * @return The releaseChannel.
     */
    public com.google.container.v1.ReleaseChannel getReleaseChannel() {
      if (releaseChannelBuilder_ == null) {
        return releaseChannel_ == null ? com.google.container.v1.ReleaseChannel.getDefaultInstance() : releaseChannel_;
      } else {
        return releaseChannelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The release channel of the version. If empty, it means a non-channel
     * release.
     * </pre>
     *
     * <code>.google.container.v1.ReleaseChannel release_channel = 3;</code>
     */
    public Builder setReleaseChannel(com.google.container.v1.ReleaseChannel value) {
      if (releaseChannelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        releaseChannel_ = value;
      } else {
        releaseChannelBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The release channel of the version. If empty, it means a non-channel
     * release.
     * </pre>
     *
     * <code>.google.container.v1.ReleaseChannel release_channel = 3;</code>
     */
    public Builder setReleaseChannel(
        com.google.container.v1.ReleaseChannel.Builder builderForValue) {
      if (releaseChannelBuilder_ == null) {
        releaseChannel_ = builderForValue.build();
      } else {
        releaseChannelBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The release channel of the version. If empty, it means a non-channel
     * release.
     * </pre>
     *
     * <code>.google.container.v1.ReleaseChannel release_channel = 3;</code>
     */
    public Builder mergeReleaseChannel(com.google.container.v1.ReleaseChannel value) {
      if (releaseChannelBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          releaseChannel_ != null &&
          releaseChannel_ != com.google.container.v1.ReleaseChannel.getDefaultInstance()) {
          getReleaseChannelBuilder().mergeFrom(value);
        } else {
          releaseChannel_ = value;
        }
      } else {
        releaseChannelBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The release channel of the version. If empty, it means a non-channel
     * release.
     * </pre>
     *
     * <code>.google.container.v1.ReleaseChannel release_channel = 3;</code>
     */
    public Builder clearReleaseChannel() {
      bitField0_ = (bitField0_ & ~0x00000004);
      releaseChannel_ = null;
      if (releaseChannelBuilder_ != null) {
        releaseChannelBuilder_.dispose();
        releaseChannelBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The release channel of the version. If empty, it means a non-channel
     * release.
     * </pre>
     *
     * <code>.google.container.v1.ReleaseChannel release_channel = 3;</code>
     */
    public com.google.container.v1.ReleaseChannel.Builder getReleaseChannelBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getReleaseChannelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The release channel of the version. If empty, it means a non-channel
     * release.
     * </pre>
     *
     * <code>.google.container.v1.ReleaseChannel release_channel = 3;</code>
     */
    public com.google.container.v1.ReleaseChannelOrBuilder getReleaseChannelOrBuilder() {
      if (releaseChannelBuilder_ != null) {
        return releaseChannelBuilder_.getMessageOrBuilder();
      } else {
        return releaseChannel_ == null ?
            com.google.container.v1.ReleaseChannel.getDefaultInstance() : releaseChannel_;
      }
    }
    /**
     * <pre>
     * The release channel of the version. If empty, it means a non-channel
     * release.
     * </pre>
     *
     * <code>.google.container.v1.ReleaseChannel release_channel = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.container.v1.ReleaseChannel, com.google.container.v1.ReleaseChannel.Builder, com.google.container.v1.ReleaseChannelOrBuilder> 
        getReleaseChannelFieldBuilder() {
      if (releaseChannelBuilder_ == null) {
        releaseChannelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1.ReleaseChannel, com.google.container.v1.ReleaseChannel.Builder, com.google.container.v1.ReleaseChannelOrBuilder>(
                getReleaseChannel(),
                getParentForChildren(),
                isClean());
        releaseChannel_ = null;
      }
      return releaseChannelBuilder_;
    }

    private java.lang.Object resource_ = "";
    /**
     * <pre>
     * Optional relative path to the resource. For example, the relative path of
     * the node pool.
     * </pre>
     *
     * <code>string resource = 4;</code>
     * @return The resource.
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional relative path to the resource. For example, the relative path of
     * the node pool.
     * </pre>
     *
     * <code>string resource = 4;</code>
     * @return The bytes for resource.
     */
    public com.google.protobuf.ByteString
        getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional relative path to the resource. For example, the relative path of
     * the node pool.
     * </pre>
     *
     * <code>string resource = 4;</code>
     * @param value The resource to set.
     * @return This builder for chaining.
     */
    public Builder setResource(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resource_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional relative path to the resource. For example, the relative path of
     * the node pool.
     * </pre>
     *
     * <code>string resource = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearResource() {
      resource_ = getDefaultInstance().getResource();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional relative path to the resource. For example, the relative path of
     * the node pool.
     * </pre>
     *
     * <code>string resource = 4;</code>
     * @param value The bytes for resource to set.
     * @return This builder for chaining.
     */
    public Builder setResourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resource_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1.UpgradeAvailableEvent)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.UpgradeAvailableEvent)
  private static final com.google.container.v1.UpgradeAvailableEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1.UpgradeAvailableEvent();
  }

  public static com.google.container.v1.UpgradeAvailableEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpgradeAvailableEvent>
      PARSER = new com.google.protobuf.AbstractParser<UpgradeAvailableEvent>() {
    @java.lang.Override
    public UpgradeAvailableEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpgradeAvailableEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpgradeAvailableEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.UpgradeAvailableEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

