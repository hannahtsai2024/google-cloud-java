// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1alpha2/dataform.proto

package com.google.cloud.dataform.v1alpha2;

/**
 * <pre>
 * `ResetWorkspaceChanges` request message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest}
 */
public final class ResetWorkspaceChangesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest)
    ResetWorkspaceChangesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResetWorkspaceChangesRequest.newBuilder() to construct.
  private ResetWorkspaceChangesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResetWorkspaceChangesRequest() {
    name_ = "";
    paths_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResetWorkspaceChangesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataform.v1alpha2.DataformProto.internal_static_google_cloud_dataform_v1alpha2_ResetWorkspaceChangesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataform.v1alpha2.DataformProto.internal_static_google_cloud_dataform_v1alpha2_ResetWorkspaceChangesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest.class, com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Required. The workspace's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
   * Required. The workspace's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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

  public static final int PATHS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList paths_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Optional. Full file paths to reset back to their committed state including filename,
   * rooted at workspace root. If left empty, all files will be reset.
   * </pre>
   *
   * <code>repeated string paths = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the paths.
   */
  public com.google.protobuf.ProtocolStringList
      getPathsList() {
    return paths_;
  }
  /**
   * <pre>
   * Optional. Full file paths to reset back to their committed state including filename,
   * rooted at workspace root. If left empty, all files will be reset.
   * </pre>
   *
   * <code>repeated string paths = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of paths.
   */
  public int getPathsCount() {
    return paths_.size();
  }
  /**
   * <pre>
   * Optional. Full file paths to reset back to their committed state including filename,
   * rooted at workspace root. If left empty, all files will be reset.
   * </pre>
   *
   * <code>repeated string paths = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The paths at the given index.
   */
  public java.lang.String getPaths(int index) {
    return paths_.get(index);
  }
  /**
   * <pre>
   * Optional. Full file paths to reset back to their committed state including filename,
   * rooted at workspace root. If left empty, all files will be reset.
   * </pre>
   *
   * <code>repeated string paths = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The bytes of the paths at the given index.
   */
  public com.google.protobuf.ByteString
      getPathsBytes(int index) {
    return paths_.getByteString(index);
  }

  public static final int CLEAN_FIELD_NUMBER = 3;
  private boolean clean_ = false;
  /**
   * <pre>
   * Optional. If set to true, untracked files will be deleted.
   * </pre>
   *
   * <code>bool clean = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The clean.
   */
  @java.lang.Override
  public boolean getClean() {
    return clean_;
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
    for (int i = 0; i < paths_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, paths_.getRaw(i));
    }
    if (clean_ != false) {
      output.writeBool(3, clean_);
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
    {
      int dataSize = 0;
      for (int i = 0; i < paths_.size(); i++) {
        dataSize += computeStringSizeNoTag(paths_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPathsList().size();
    }
    if (clean_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, clean_);
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
    if (!(obj instanceof com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest other = (com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getPathsList()
        .equals(other.getPathsList())) return false;
    if (getClean()
        != other.getClean()) return false;
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
    if (getPathsCount() > 0) {
      hash = (37 * hash) + PATHS_FIELD_NUMBER;
      hash = (53 * hash) + getPathsList().hashCode();
    }
    hash = (37 * hash) + CLEAN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getClean());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest prototype) {
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
   * `ResetWorkspaceChanges` request message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest)
      com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataform.v1alpha2.DataformProto.internal_static_google_cloud_dataform_v1alpha2_ResetWorkspaceChangesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataform.v1alpha2.DataformProto.internal_static_google_cloud_dataform_v1alpha2_ResetWorkspaceChangesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest.class, com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest.newBuilder()
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
      paths_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      clean_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataform.v1alpha2.DataformProto.internal_static_google_cloud_dataform_v1alpha2_ResetWorkspaceChangesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest getDefaultInstanceForType() {
      return com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest build() {
      com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest buildPartial() {
      com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest result = new com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        paths_.makeImmutable();
        result.paths_ = paths_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.clean_ = clean_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest) {
        return mergeFrom((com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest other) {
      if (other == com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.paths_.isEmpty()) {
        if (paths_.isEmpty()) {
          paths_ = other.paths_;
          bitField0_ |= 0x00000002;
        } else {
          ensurePathsIsMutable();
          paths_.addAll(other.paths_);
        }
        onChanged();
      }
      if (other.getClean() != false) {
        setClean(other.getClean());
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
              java.lang.String s = input.readStringRequireUtf8();
              ensurePathsIsMutable();
              paths_.add(s);
              break;
            } // case 18
            case 24: {
              clean_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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
     * Required. The workspace's name.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. The workspace's name.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. The workspace's name.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. The workspace's name.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. The workspace's name.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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

    private com.google.protobuf.LazyStringArrayList paths_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensurePathsIsMutable() {
      if (!paths_.isModifiable()) {
        paths_ = new com.google.protobuf.LazyStringArrayList(paths_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * Optional. Full file paths to reset back to their committed state including filename,
     * rooted at workspace root. If left empty, all files will be reset.
     * </pre>
     *
     * <code>repeated string paths = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return A list containing the paths.
     */
    public com.google.protobuf.ProtocolStringList
        getPathsList() {
      paths_.makeImmutable();
      return paths_;
    }
    /**
     * <pre>
     * Optional. Full file paths to reset back to their committed state including filename,
     * rooted at workspace root. If left empty, all files will be reset.
     * </pre>
     *
     * <code>repeated string paths = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The count of paths.
     */
    public int getPathsCount() {
      return paths_.size();
    }
    /**
     * <pre>
     * Optional. Full file paths to reset back to their committed state including filename,
     * rooted at workspace root. If left empty, all files will be reset.
     * </pre>
     *
     * <code>repeated string paths = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param index The index of the element to return.
     * @return The paths at the given index.
     */
    public java.lang.String getPaths(int index) {
      return paths_.get(index);
    }
    /**
     * <pre>
     * Optional. Full file paths to reset back to their committed state including filename,
     * rooted at workspace root. If left empty, all files will be reset.
     * </pre>
     *
     * <code>repeated string paths = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param index The index of the value to return.
     * @return The bytes of the paths at the given index.
     */
    public com.google.protobuf.ByteString
        getPathsBytes(int index) {
      return paths_.getByteString(index);
    }
    /**
     * <pre>
     * Optional. Full file paths to reset back to their committed state including filename,
     * rooted at workspace root. If left empty, all files will be reset.
     * </pre>
     *
     * <code>repeated string paths = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param index The index to set the value at.
     * @param value The paths to set.
     * @return This builder for chaining.
     */
    public Builder setPaths(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePathsIsMutable();
      paths_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Full file paths to reset back to their committed state including filename,
     * rooted at workspace root. If left empty, all files will be reset.
     * </pre>
     *
     * <code>repeated string paths = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The paths to add.
     * @return This builder for chaining.
     */
    public Builder addPaths(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePathsIsMutable();
      paths_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Full file paths to reset back to their committed state including filename,
     * rooted at workspace root. If left empty, all files will be reset.
     * </pre>
     *
     * <code>repeated string paths = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param values The paths to add.
     * @return This builder for chaining.
     */
    public Builder addAllPaths(
        java.lang.Iterable<java.lang.String> values) {
      ensurePathsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, paths_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Full file paths to reset back to their committed state including filename,
     * rooted at workspace root. If left empty, all files will be reset.
     * </pre>
     *
     * <code>repeated string paths = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearPaths() {
      paths_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Full file paths to reset back to their committed state including filename,
     * rooted at workspace root. If left empty, all files will be reset.
     * </pre>
     *
     * <code>repeated string paths = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes of the paths to add.
     * @return This builder for chaining.
     */
    public Builder addPathsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensurePathsIsMutable();
      paths_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean clean_ ;
    /**
     * <pre>
     * Optional. If set to true, untracked files will be deleted.
     * </pre>
     *
     * <code>bool clean = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The clean.
     */
    @java.lang.Override
    public boolean getClean() {
      return clean_;
    }
    /**
     * <pre>
     * Optional. If set to true, untracked files will be deleted.
     * </pre>
     *
     * <code>bool clean = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The clean to set.
     * @return This builder for chaining.
     */
    public Builder setClean(boolean value) {

      clean_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. If set to true, untracked files will be deleted.
     * </pre>
     *
     * <code>bool clean = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearClean() {
      bitField0_ = (bitField0_ & ~0x00000004);
      clean_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest)
  private static final com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest();
  }

  public static com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResetWorkspaceChangesRequest>
      PARSER = new com.google.protobuf.AbstractParser<ResetWorkspaceChangesRequest>() {
    @java.lang.Override
    public ResetWorkspaceChangesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResetWorkspaceChangesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResetWorkspaceChangesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

