// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog.v1beta1;

/**
 * <pre>
 * Request message for
 * [UpdateTag][google.cloud.datacatalog.v1beta1.DataCatalog.UpdateTag].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.UpdateTagRequest}
 */
public final class UpdateTagRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.UpdateTagRequest)
    UpdateTagRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateTagRequest.newBuilder() to construct.
  private UpdateTagRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateTagRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateTagRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datacatalog.v1beta1.Datacatalog.internal_static_google_cloud_datacatalog_v1beta1_UpdateTagRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1beta1.Datacatalog.internal_static_google_cloud_datacatalog_v1beta1_UpdateTagRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1beta1.UpdateTagRequest.class, com.google.cloud.datacatalog.v1beta1.UpdateTagRequest.Builder.class);
  }

  public static final int TAG_FIELD_NUMBER = 1;
  private com.google.cloud.datacatalog.v1beta1.Tag tag_;
  /**
   * <pre>
   * Required. The updated tag. The "name" field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Tag tag = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tag field is set.
   */
  @java.lang.Override
  public boolean hasTag() {
    return tag_ != null;
  }
  /**
   * <pre>
   * Required. The updated tag. The "name" field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Tag tag = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tag.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.Tag getTag() {
    return tag_ == null ? com.google.cloud.datacatalog.v1beta1.Tag.getDefaultInstance() : tag_;
  }
  /**
   * <pre>
   * Required. The updated tag. The "name" field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Tag tag = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.TagOrBuilder getTagOrBuilder() {
    return tag_ == null ? com.google.cloud.datacatalog.v1beta1.Tag.getDefaultInstance() : tag_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The fields to update on the Tag. If absent or empty, all modifiable fields
   * are updated. Currently the only modifiable field is the field `fields`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * The fields to update on the Tag. If absent or empty, all modifiable fields
   * are updated. Currently the only modifiable field is the field `fields`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The fields to update on the Tag. If absent or empty, all modifiable fields
   * are updated. Currently the only modifiable field is the field `fields`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (tag_ != null) {
      output.writeMessage(1, getTag());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tag_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTag());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1beta1.UpdateTagRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1beta1.UpdateTagRequest other = (com.google.cloud.datacatalog.v1beta1.UpdateTagRequest) obj;

    if (hasTag() != other.hasTag()) return false;
    if (hasTag()) {
      if (!getTag()
          .equals(other.getTag())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasTag()) {
      hash = (37 * hash) + TAG_FIELD_NUMBER;
      hash = (53 * hash) + getTag().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1beta1.UpdateTagRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.UpdateTagRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1beta1.UpdateTagRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.UpdateTagRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1beta1.UpdateTagRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.UpdateTagRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1beta1.UpdateTagRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.UpdateTagRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1beta1.UpdateTagRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datacatalog.v1beta1.UpdateTagRequest prototype) {
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
   * Request message for
   * [UpdateTag][google.cloud.datacatalog.v1beta1.DataCatalog.UpdateTag].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.UpdateTagRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.UpdateTagRequest)
      com.google.cloud.datacatalog.v1beta1.UpdateTagRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datacatalog.v1beta1.Datacatalog.internal_static_google_cloud_datacatalog_v1beta1_UpdateTagRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1beta1.Datacatalog.internal_static_google_cloud_datacatalog_v1beta1_UpdateTagRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1beta1.UpdateTagRequest.class, com.google.cloud.datacatalog.v1beta1.UpdateTagRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1beta1.UpdateTagRequest.newBuilder()
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
      tag_ = null;
      if (tagBuilder_ != null) {
        tagBuilder_.dispose();
        tagBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datacatalog.v1beta1.Datacatalog.internal_static_google_cloud_datacatalog_v1beta1_UpdateTagRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.UpdateTagRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1beta1.UpdateTagRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.UpdateTagRequest build() {
      com.google.cloud.datacatalog.v1beta1.UpdateTagRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.UpdateTagRequest buildPartial() {
      com.google.cloud.datacatalog.v1beta1.UpdateTagRequest result = new com.google.cloud.datacatalog.v1beta1.UpdateTagRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1beta1.UpdateTagRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tag_ = tagBuilder_ == null
            ? tag_
            : tagBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datacatalog.v1beta1.UpdateTagRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1beta1.UpdateTagRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1beta1.UpdateTagRequest other) {
      if (other == com.google.cloud.datacatalog.v1beta1.UpdateTagRequest.getDefaultInstance()) return this;
      if (other.hasTag()) {
        mergeTag(other.getTag());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                  getTagFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
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

    private com.google.cloud.datacatalog.v1beta1.Tag tag_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datacatalog.v1beta1.Tag, com.google.cloud.datacatalog.v1beta1.Tag.Builder, com.google.cloud.datacatalog.v1beta1.TagOrBuilder> tagBuilder_;
    /**
     * <pre>
     * Required. The updated tag. The "name" field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Tag tag = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the tag field is set.
     */
    public boolean hasTag() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The updated tag. The "name" field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Tag tag = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The tag.
     */
    public com.google.cloud.datacatalog.v1beta1.Tag getTag() {
      if (tagBuilder_ == null) {
        return tag_ == null ? com.google.cloud.datacatalog.v1beta1.Tag.getDefaultInstance() : tag_;
      } else {
        return tagBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The updated tag. The "name" field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Tag tag = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTag(com.google.cloud.datacatalog.v1beta1.Tag value) {
      if (tagBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tag_ = value;
      } else {
        tagBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The updated tag. The "name" field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Tag tag = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTag(
        com.google.cloud.datacatalog.v1beta1.Tag.Builder builderForValue) {
      if (tagBuilder_ == null) {
        tag_ = builderForValue.build();
      } else {
        tagBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The updated tag. The "name" field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Tag tag = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeTag(com.google.cloud.datacatalog.v1beta1.Tag value) {
      if (tagBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          tag_ != null &&
          tag_ != com.google.cloud.datacatalog.v1beta1.Tag.getDefaultInstance()) {
          getTagBuilder().mergeFrom(value);
        } else {
          tag_ = value;
        }
      } else {
        tagBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The updated tag. The "name" field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Tag tag = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTag() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tag_ = null;
      if (tagBuilder_ != null) {
        tagBuilder_.dispose();
        tagBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The updated tag. The "name" field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Tag tag = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.datacatalog.v1beta1.Tag.Builder getTagBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTagFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The updated tag. The "name" field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Tag tag = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.datacatalog.v1beta1.TagOrBuilder getTagOrBuilder() {
      if (tagBuilder_ != null) {
        return tagBuilder_.getMessageOrBuilder();
      } else {
        return tag_ == null ?
            com.google.cloud.datacatalog.v1beta1.Tag.getDefaultInstance() : tag_;
      }
    }
    /**
     * <pre>
     * Required. The updated tag. The "name" field must be set.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.Tag tag = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datacatalog.v1beta1.Tag, com.google.cloud.datacatalog.v1beta1.Tag.Builder, com.google.cloud.datacatalog.v1beta1.TagOrBuilder> 
        getTagFieldBuilder() {
      if (tagBuilder_ == null) {
        tagBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1beta1.Tag, com.google.cloud.datacatalog.v1beta1.Tag.Builder, com.google.cloud.datacatalog.v1beta1.TagOrBuilder>(
                getTag(),
                getParentForChildren(),
                isClean());
        tag_ = null;
      }
      return tagBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The fields to update on the Tag. If absent or empty, all modifiable fields
     * are updated. Currently the only modifiable field is the field `fields`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The fields to update on the Tag. If absent or empty, all modifiable fields
     * are updated. Currently the only modifiable field is the field `fields`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The fields to update on the Tag. If absent or empty, all modifiable fields
     * are updated. Currently the only modifiable field is the field `fields`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fields to update on the Tag. If absent or empty, all modifiable fields
     * are updated. Currently the only modifiable field is the field `fields`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fields to update on the Tag. If absent or empty, all modifiable fields
     * are updated. Currently the only modifiable field is the field `fields`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fields to update on the Tag. If absent or empty, all modifiable fields
     * are updated. Currently the only modifiable field is the field `fields`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
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
     * The fields to update on the Tag. If absent or empty, all modifiable fields
     * are updated. Currently the only modifiable field is the field `fields`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The fields to update on the Tag. If absent or empty, all modifiable fields
     * are updated. Currently the only modifiable field is the field `fields`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The fields to update on the Tag. If absent or empty, all modifiable fields
     * are updated. Currently the only modifiable field is the field `fields`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.UpdateTagRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.UpdateTagRequest)
  private static final com.google.cloud.datacatalog.v1beta1.UpdateTagRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1beta1.UpdateTagRequest();
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdateTagRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTagRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateTagRequest>() {
    @java.lang.Override
    public UpdateTagRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateTagRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTagRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.UpdateTagRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

