// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/content.proto

package com.google.cloud.dataplex.v1;

/**
 * <pre>
 * Update content request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.UpdateContentRequest}
 */
public final class UpdateContentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.UpdateContentRequest)
    UpdateContentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateContentRequest.newBuilder() to construct.
  private UpdateContentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateContentRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateContentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataplex.v1.ContentProto.internal_static_google_cloud_dataplex_v1_UpdateContentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.ContentProto.internal_static_google_cloud_dataplex_v1_UpdateContentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.UpdateContentRequest.class, com.google.cloud.dataplex.v1.UpdateContentRequest.Builder.class);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. Mask of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int CONTENT_FIELD_NUMBER = 2;
  private com.google.cloud.dataplex.v1.Content content_;
  /**
   * <pre>
   * Required. Update description.
   * Only fields specified in `update_mask` are updated.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Content content = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the content field is set.
   */
  @java.lang.Override
  public boolean hasContent() {
    return content_ != null;
  }
  /**
   * <pre>
   * Required. Update description.
   * Only fields specified in `update_mask` are updated.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Content content = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The content.
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.Content getContent() {
    return content_ == null ? com.google.cloud.dataplex.v1.Content.getDefaultInstance() : content_;
  }
  /**
   * <pre>
   * Required. Update description.
   * Only fields specified in `update_mask` are updated.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Content content = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.ContentOrBuilder getContentOrBuilder() {
    return content_ == null ? com.google.cloud.dataplex.v1.Content.getDefaultInstance() : content_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_ = false;
  /**
   * <pre>
   * Optional. Only validate the request, but do not perform mutations.
   * The default is false.
   * </pre>
   *
   * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (updateMask_ != null) {
      output.writeMessage(1, getUpdateMask());
    }
    if (content_ != null) {
      output.writeMessage(2, getContent());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUpdateMask());
    }
    if (content_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getContent());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.UpdateContentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.UpdateContentRequest other = (com.google.cloud.dataplex.v1.UpdateContentRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (hasContent() != other.hasContent()) return false;
    if (hasContent()) {
      if (!getContent()
          .equals(other.getContent())) return false;
    }
    if (getValidateOnly()
        != other.getValidateOnly()) return false;
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
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    if (hasContent()) {
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.UpdateContentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.UpdateContentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.UpdateContentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.UpdateContentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.UpdateContentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.UpdateContentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.UpdateContentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.UpdateContentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.UpdateContentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.UpdateContentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.UpdateContentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.UpdateContentRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataplex.v1.UpdateContentRequest prototype) {
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
   * Update content request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.UpdateContentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.UpdateContentRequest)
      com.google.cloud.dataplex.v1.UpdateContentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataplex.v1.ContentProto.internal_static_google_cloud_dataplex_v1_UpdateContentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.ContentProto.internal_static_google_cloud_dataplex_v1_UpdateContentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.UpdateContentRequest.class, com.google.cloud.dataplex.v1.UpdateContentRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.UpdateContentRequest.newBuilder()
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
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      content_ = null;
      if (contentBuilder_ != null) {
        contentBuilder_.dispose();
        contentBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataplex.v1.ContentProto.internal_static_google_cloud_dataplex_v1_UpdateContentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.UpdateContentRequest getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.UpdateContentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.UpdateContentRequest build() {
      com.google.cloud.dataplex.v1.UpdateContentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.UpdateContentRequest buildPartial() {
      com.google.cloud.dataplex.v1.UpdateContentRequest result = new com.google.cloud.dataplex.v1.UpdateContentRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataplex.v1.UpdateContentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.content_ = contentBuilder_ == null
            ? content_
            : contentBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.validateOnly_ = validateOnly_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dataplex.v1.UpdateContentRequest) {
        return mergeFrom((com.google.cloud.dataplex.v1.UpdateContentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.UpdateContentRequest other) {
      if (other == com.google.cloud.dataplex.v1.UpdateContentRequest.getDefaultInstance()) return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasContent()) {
        mergeContent(other.getContent());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getContentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              validateOnly_ = input.readBool();
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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000001);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Required. Mask of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private com.google.cloud.dataplex.v1.Content content_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataplex.v1.Content, com.google.cloud.dataplex.v1.Content.Builder, com.google.cloud.dataplex.v1.ContentOrBuilder> contentBuilder_;
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Content content = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the content field is set.
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Content content = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The content.
     */
    public com.google.cloud.dataplex.v1.Content getContent() {
      if (contentBuilder_ == null) {
        return content_ == null ? com.google.cloud.dataplex.v1.Content.getDefaultInstance() : content_;
      } else {
        return contentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Content content = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setContent(com.google.cloud.dataplex.v1.Content value) {
      if (contentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        content_ = value;
      } else {
        contentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Content content = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setContent(
        com.google.cloud.dataplex.v1.Content.Builder builderForValue) {
      if (contentBuilder_ == null) {
        content_ = builderForValue.build();
      } else {
        contentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Content content = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeContent(com.google.cloud.dataplex.v1.Content value) {
      if (contentBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          content_ != null &&
          content_ != com.google.cloud.dataplex.v1.Content.getDefaultInstance()) {
          getContentBuilder().mergeFrom(value);
        } else {
          content_ = value;
        }
      } else {
        contentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Content content = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearContent() {
      bitField0_ = (bitField0_ & ~0x00000002);
      content_ = null;
      if (contentBuilder_ != null) {
        contentBuilder_.dispose();
        contentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Content content = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dataplex.v1.Content.Builder getContentBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getContentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Content content = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dataplex.v1.ContentOrBuilder getContentOrBuilder() {
      if (contentBuilder_ != null) {
        return contentBuilder_.getMessageOrBuilder();
      } else {
        return content_ == null ?
            com.google.cloud.dataplex.v1.Content.getDefaultInstance() : content_;
      }
    }
    /**
     * <pre>
     * Required. Update description.
     * Only fields specified in `update_mask` are updated.
     * </pre>
     *
     * <code>.google.cloud.dataplex.v1.Content content = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dataplex.v1.Content, com.google.cloud.dataplex.v1.Content.Builder, com.google.cloud.dataplex.v1.ContentOrBuilder> 
        getContentFieldBuilder() {
      if (contentBuilder_ == null) {
        contentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataplex.v1.Content, com.google.cloud.dataplex.v1.Content.Builder, com.google.cloud.dataplex.v1.ContentOrBuilder>(
                getContent(),
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      return contentBuilder_;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Only validate the request, but do not perform mutations.
     * The default is false.
     * </pre>
     *
     * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000004);
      validateOnly_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.UpdateContentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.UpdateContentRequest)
  private static final com.google.cloud.dataplex.v1.UpdateContentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.UpdateContentRequest();
  }

  public static com.google.cloud.dataplex.v1.UpdateContentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateContentRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateContentRequest>() {
    @java.lang.Override
    public UpdateContentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateContentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateContentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.UpdateContentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

