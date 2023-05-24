// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 * <pre>
 * Service-wide configuration.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.Config}
 */
public final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    name_ = "";
    supportedVersions_ = java.util.Collections.emptyList();
    defaultSkaffoldVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Config();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_Config_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.Config.class, com.google.cloud.deploy.v1.Config.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Name of the configuration.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the configuration.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUPPORTED_VERSIONS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.deploy.v1.SkaffoldVersion> supportedVersions_;
  /**
   * <pre>
   * All supported versions of Skaffold.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.deploy.v1.SkaffoldVersion> getSupportedVersionsList() {
    return supportedVersions_;
  }
  /**
   * <pre>
   * All supported versions of Skaffold.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.deploy.v1.SkaffoldVersionOrBuilder> 
      getSupportedVersionsOrBuilderList() {
    return supportedVersions_;
  }
  /**
   * <pre>
   * All supported versions of Skaffold.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
   */
  @java.lang.Override
  public int getSupportedVersionsCount() {
    return supportedVersions_.size();
  }
  /**
   * <pre>
   * All supported versions of Skaffold.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.SkaffoldVersion getSupportedVersions(int index) {
    return supportedVersions_.get(index);
  }
  /**
   * <pre>
   * All supported versions of Skaffold.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.SkaffoldVersionOrBuilder getSupportedVersionsOrBuilder(
      int index) {
    return supportedVersions_.get(index);
  }

  public static final int DEFAULT_SKAFFOLD_VERSION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object defaultSkaffoldVersion_ = "";
  /**
   * <pre>
   * Default Skaffold version that is assigned when a Release is created without
   * specifying a Skaffold version.
   * </pre>
   *
   * <code>string default_skaffold_version = 3;</code>
   * @return The defaultSkaffoldVersion.
   */
  @java.lang.Override
  public java.lang.String getDefaultSkaffoldVersion() {
    java.lang.Object ref = defaultSkaffoldVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      defaultSkaffoldVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Default Skaffold version that is assigned when a Release is created without
   * specifying a Skaffold version.
   * </pre>
   *
   * <code>string default_skaffold_version = 3;</code>
   * @return The bytes for defaultSkaffoldVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDefaultSkaffoldVersionBytes() {
    java.lang.Object ref = defaultSkaffoldVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      defaultSkaffoldVersion_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < supportedVersions_.size(); i++) {
      output.writeMessage(2, supportedVersions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultSkaffoldVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, defaultSkaffoldVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < supportedVersions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, supportedVersions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultSkaffoldVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, defaultSkaffoldVersion_);
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
    if (!(obj instanceof com.google.cloud.deploy.v1.Config)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.Config other = (com.google.cloud.deploy.v1.Config) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getSupportedVersionsList()
        .equals(other.getSupportedVersionsList())) return false;
    if (!getDefaultSkaffoldVersion()
        .equals(other.getDefaultSkaffoldVersion())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getSupportedVersionsCount() > 0) {
      hash = (37 * hash) + SUPPORTED_VERSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getSupportedVersionsList().hashCode();
    }
    hash = (37 * hash) + DEFAULT_SKAFFOLD_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getDefaultSkaffoldVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.deploy.v1.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.deploy.v1.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.deploy.v1.Config parseFrom(
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
  public static Builder newBuilder(com.google.cloud.deploy.v1.Config prototype) {
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
   * Service-wide configuration.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.Config)
      com.google.cloud.deploy.v1.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_Config_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.Config.class, com.google.cloud.deploy.v1.Config.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.Config.newBuilder()
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
      name_ = "";
      if (supportedVersionsBuilder_ == null) {
        supportedVersions_ = java.util.Collections.emptyList();
      } else {
        supportedVersions_ = null;
        supportedVersionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      defaultSkaffoldVersion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto.internal_static_google_cloud_deploy_v1_Config_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.Config getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.Config.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.Config build() {
      com.google.cloud.deploy.v1.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.Config buildPartial() {
      com.google.cloud.deploy.v1.Config result = new com.google.cloud.deploy.v1.Config(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.deploy.v1.Config result) {
      if (supportedVersionsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          supportedVersions_ = java.util.Collections.unmodifiableList(supportedVersions_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.supportedVersions_ = supportedVersions_;
      } else {
        result.supportedVersions_ = supportedVersionsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.deploy.v1.Config result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.defaultSkaffoldVersion_ = defaultSkaffoldVersion_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.deploy.v1.Config) {
        return mergeFrom((com.google.cloud.deploy.v1.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.Config other) {
      if (other == com.google.cloud.deploy.v1.Config.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (supportedVersionsBuilder_ == null) {
        if (!other.supportedVersions_.isEmpty()) {
          if (supportedVersions_.isEmpty()) {
            supportedVersions_ = other.supportedVersions_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSupportedVersionsIsMutable();
            supportedVersions_.addAll(other.supportedVersions_);
          }
          onChanged();
        }
      } else {
        if (!other.supportedVersions_.isEmpty()) {
          if (supportedVersionsBuilder_.isEmpty()) {
            supportedVersionsBuilder_.dispose();
            supportedVersionsBuilder_ = null;
            supportedVersions_ = other.supportedVersions_;
            bitField0_ = (bitField0_ & ~0x00000002);
            supportedVersionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSupportedVersionsFieldBuilder() : null;
          } else {
            supportedVersionsBuilder_.addAllMessages(other.supportedVersions_);
          }
        }
      }
      if (!other.getDefaultSkaffoldVersion().isEmpty()) {
        defaultSkaffoldVersion_ = other.defaultSkaffoldVersion_;
        bitField0_ |= 0x00000004;
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.cloud.deploy.v1.SkaffoldVersion m =
                  input.readMessage(
                      com.google.cloud.deploy.v1.SkaffoldVersion.parser(),
                      extensionRegistry);
              if (supportedVersionsBuilder_ == null) {
                ensureSupportedVersionsIsMutable();
                supportedVersions_.add(m);
              } else {
                supportedVersionsBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              defaultSkaffoldVersion_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Name of the configuration.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the configuration.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the configuration.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the configuration.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the configuration.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.deploy.v1.SkaffoldVersion> supportedVersions_ =
      java.util.Collections.emptyList();
    private void ensureSupportedVersionsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        supportedVersions_ = new java.util.ArrayList<com.google.cloud.deploy.v1.SkaffoldVersion>(supportedVersions_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.deploy.v1.SkaffoldVersion, com.google.cloud.deploy.v1.SkaffoldVersion.Builder, com.google.cloud.deploy.v1.SkaffoldVersionOrBuilder> supportedVersionsBuilder_;

    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public java.util.List<com.google.cloud.deploy.v1.SkaffoldVersion> getSupportedVersionsList() {
      if (supportedVersionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(supportedVersions_);
      } else {
        return supportedVersionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public int getSupportedVersionsCount() {
      if (supportedVersionsBuilder_ == null) {
        return supportedVersions_.size();
      } else {
        return supportedVersionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public com.google.cloud.deploy.v1.SkaffoldVersion getSupportedVersions(int index) {
      if (supportedVersionsBuilder_ == null) {
        return supportedVersions_.get(index);
      } else {
        return supportedVersionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public Builder setSupportedVersions(
        int index, com.google.cloud.deploy.v1.SkaffoldVersion value) {
      if (supportedVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSupportedVersionsIsMutable();
        supportedVersions_.set(index, value);
        onChanged();
      } else {
        supportedVersionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public Builder setSupportedVersions(
        int index, com.google.cloud.deploy.v1.SkaffoldVersion.Builder builderForValue) {
      if (supportedVersionsBuilder_ == null) {
        ensureSupportedVersionsIsMutable();
        supportedVersions_.set(index, builderForValue.build());
        onChanged();
      } else {
        supportedVersionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public Builder addSupportedVersions(com.google.cloud.deploy.v1.SkaffoldVersion value) {
      if (supportedVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSupportedVersionsIsMutable();
        supportedVersions_.add(value);
        onChanged();
      } else {
        supportedVersionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public Builder addSupportedVersions(
        int index, com.google.cloud.deploy.v1.SkaffoldVersion value) {
      if (supportedVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSupportedVersionsIsMutable();
        supportedVersions_.add(index, value);
        onChanged();
      } else {
        supportedVersionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public Builder addSupportedVersions(
        com.google.cloud.deploy.v1.SkaffoldVersion.Builder builderForValue) {
      if (supportedVersionsBuilder_ == null) {
        ensureSupportedVersionsIsMutable();
        supportedVersions_.add(builderForValue.build());
        onChanged();
      } else {
        supportedVersionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public Builder addSupportedVersions(
        int index, com.google.cloud.deploy.v1.SkaffoldVersion.Builder builderForValue) {
      if (supportedVersionsBuilder_ == null) {
        ensureSupportedVersionsIsMutable();
        supportedVersions_.add(index, builderForValue.build());
        onChanged();
      } else {
        supportedVersionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public Builder addAllSupportedVersions(
        java.lang.Iterable<? extends com.google.cloud.deploy.v1.SkaffoldVersion> values) {
      if (supportedVersionsBuilder_ == null) {
        ensureSupportedVersionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, supportedVersions_);
        onChanged();
      } else {
        supportedVersionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public Builder clearSupportedVersions() {
      if (supportedVersionsBuilder_ == null) {
        supportedVersions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        supportedVersionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public Builder removeSupportedVersions(int index) {
      if (supportedVersionsBuilder_ == null) {
        ensureSupportedVersionsIsMutable();
        supportedVersions_.remove(index);
        onChanged();
      } else {
        supportedVersionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public com.google.cloud.deploy.v1.SkaffoldVersion.Builder getSupportedVersionsBuilder(
        int index) {
      return getSupportedVersionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public com.google.cloud.deploy.v1.SkaffoldVersionOrBuilder getSupportedVersionsOrBuilder(
        int index) {
      if (supportedVersionsBuilder_ == null) {
        return supportedVersions_.get(index);  } else {
        return supportedVersionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.deploy.v1.SkaffoldVersionOrBuilder> 
         getSupportedVersionsOrBuilderList() {
      if (supportedVersionsBuilder_ != null) {
        return supportedVersionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(supportedVersions_);
      }
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public com.google.cloud.deploy.v1.SkaffoldVersion.Builder addSupportedVersionsBuilder() {
      return getSupportedVersionsFieldBuilder().addBuilder(
          com.google.cloud.deploy.v1.SkaffoldVersion.getDefaultInstance());
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public com.google.cloud.deploy.v1.SkaffoldVersion.Builder addSupportedVersionsBuilder(
        int index) {
      return getSupportedVersionsFieldBuilder().addBuilder(
          index, com.google.cloud.deploy.v1.SkaffoldVersion.getDefaultInstance());
    }
    /**
     * <pre>
     * All supported versions of Skaffold.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.SkaffoldVersion supported_versions = 2;</code>
     */
    public java.util.List<com.google.cloud.deploy.v1.SkaffoldVersion.Builder> 
         getSupportedVersionsBuilderList() {
      return getSupportedVersionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.deploy.v1.SkaffoldVersion, com.google.cloud.deploy.v1.SkaffoldVersion.Builder, com.google.cloud.deploy.v1.SkaffoldVersionOrBuilder> 
        getSupportedVersionsFieldBuilder() {
      if (supportedVersionsBuilder_ == null) {
        supportedVersionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.deploy.v1.SkaffoldVersion, com.google.cloud.deploy.v1.SkaffoldVersion.Builder, com.google.cloud.deploy.v1.SkaffoldVersionOrBuilder>(
                supportedVersions_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        supportedVersions_ = null;
      }
      return supportedVersionsBuilder_;
    }

    private java.lang.Object defaultSkaffoldVersion_ = "";
    /**
     * <pre>
     * Default Skaffold version that is assigned when a Release is created without
     * specifying a Skaffold version.
     * </pre>
     *
     * <code>string default_skaffold_version = 3;</code>
     * @return The defaultSkaffoldVersion.
     */
    public java.lang.String getDefaultSkaffoldVersion() {
      java.lang.Object ref = defaultSkaffoldVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        defaultSkaffoldVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Default Skaffold version that is assigned when a Release is created without
     * specifying a Skaffold version.
     * </pre>
     *
     * <code>string default_skaffold_version = 3;</code>
     * @return The bytes for defaultSkaffoldVersion.
     */
    public com.google.protobuf.ByteString
        getDefaultSkaffoldVersionBytes() {
      java.lang.Object ref = defaultSkaffoldVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        defaultSkaffoldVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Default Skaffold version that is assigned when a Release is created without
     * specifying a Skaffold version.
     * </pre>
     *
     * <code>string default_skaffold_version = 3;</code>
     * @param value The defaultSkaffoldVersion to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultSkaffoldVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      defaultSkaffoldVersion_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default Skaffold version that is assigned when a Release is created without
     * specifying a Skaffold version.
     * </pre>
     *
     * <code>string default_skaffold_version = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultSkaffoldVersion() {
      defaultSkaffoldVersion_ = getDefaultInstance().getDefaultSkaffoldVersion();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default Skaffold version that is assigned when a Release is created without
     * specifying a Skaffold version.
     * </pre>
     *
     * <code>string default_skaffold_version = 3;</code>
     * @param value The bytes for defaultSkaffoldVersion to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultSkaffoldVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      defaultSkaffoldVersion_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.Config)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.Config)
  private static final com.google.cloud.deploy.v1.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.Config();
  }

  public static com.google.cloud.deploy.v1.Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    @java.lang.Override
    public Config parsePartialFrom(
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

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

