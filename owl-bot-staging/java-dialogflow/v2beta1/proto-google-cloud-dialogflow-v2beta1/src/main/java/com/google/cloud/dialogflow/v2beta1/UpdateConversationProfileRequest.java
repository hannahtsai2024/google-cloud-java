// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/conversation_profile.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The request message for
 * [ConversationProfiles.UpdateConversationProfile][google.cloud.dialogflow.v2beta1.ConversationProfiles.UpdateConversationProfile].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest}
 */
public final class UpdateConversationProfileRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest)
    UpdateConversationProfileRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateConversationProfileRequest.newBuilder() to construct.
  private UpdateConversationProfileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateConversationProfileRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateConversationProfileRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.ConversationProfileProto.internal_static_google_cloud_dialogflow_v2beta1_UpdateConversationProfileRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.ConversationProfileProto.internal_static_google_cloud_dialogflow_v2beta1_UpdateConversationProfileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest.class, com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest.Builder.class);
  }

  public static final int CONVERSATION_PROFILE_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.v2beta1.ConversationProfile conversationProfile_;
  /**
   * <pre>
   * Required. The conversation profile to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the conversationProfile field is set.
   */
  @java.lang.Override
  public boolean hasConversationProfile() {
    return conversationProfile_ != null;
  }
  /**
   * <pre>
   * Required. The conversation profile to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The conversationProfile.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.ConversationProfile getConversationProfile() {
    return conversationProfile_ == null ? com.google.cloud.dialogflow.v2beta1.ConversationProfile.getDefaultInstance() : conversationProfile_;
  }
  /**
   * <pre>
   * Required. The conversation profile to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.ConversationProfileOrBuilder getConversationProfileOrBuilder() {
    return conversationProfile_ == null ? com.google.cloud.dialogflow.v2beta1.ConversationProfile.getDefaultInstance() : conversationProfile_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. The mask to control which fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. The mask to control which fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. The mask to control which fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
    if (conversationProfile_ != null) {
      output.writeMessage(1, getConversationProfile());
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
    if (conversationProfile_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConversationProfile());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest other = (com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest) obj;

    if (hasConversationProfile() != other.hasConversationProfile()) return false;
    if (hasConversationProfile()) {
      if (!getConversationProfile()
          .equals(other.getConversationProfile())) return false;
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
    if (hasConversationProfile()) {
      hash = (37 * hash) + CONVERSATION_PROFILE_FIELD_NUMBER;
      hash = (53 * hash) + getConversationProfile().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest prototype) {
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
   * The request message for
   * [ConversationProfiles.UpdateConversationProfile][google.cloud.dialogflow.v2beta1.ConversationProfiles.UpdateConversationProfile].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest)
      com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.ConversationProfileProto.internal_static_google_cloud_dialogflow_v2beta1_UpdateConversationProfileRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.ConversationProfileProto.internal_static_google_cloud_dialogflow_v2beta1_UpdateConversationProfileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest.class, com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest.newBuilder()
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
      conversationProfile_ = null;
      if (conversationProfileBuilder_ != null) {
        conversationProfileBuilder_.dispose();
        conversationProfileBuilder_ = null;
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
      return com.google.cloud.dialogflow.v2beta1.ConversationProfileProto.internal_static_google_cloud_dialogflow_v2beta1_UpdateConversationProfileRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest build() {
      com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest result = new com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.conversationProfile_ = conversationProfileBuilder_ == null
            ? conversationProfile_
            : conversationProfileBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest other) {
      if (other == com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest.getDefaultInstance()) return this;
      if (other.hasConversationProfile()) {
        mergeConversationProfile(other.getConversationProfile());
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
                  getConversationProfileFieldBuilder().getBuilder(),
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

    private com.google.cloud.dialogflow.v2beta1.ConversationProfile conversationProfile_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.ConversationProfile, com.google.cloud.dialogflow.v2beta1.ConversationProfile.Builder, com.google.cloud.dialogflow.v2beta1.ConversationProfileOrBuilder> conversationProfileBuilder_;
    /**
     * <pre>
     * Required. The conversation profile to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the conversationProfile field is set.
     */
    public boolean hasConversationProfile() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The conversation profile to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The conversationProfile.
     */
    public com.google.cloud.dialogflow.v2beta1.ConversationProfile getConversationProfile() {
      if (conversationProfileBuilder_ == null) {
        return conversationProfile_ == null ? com.google.cloud.dialogflow.v2beta1.ConversationProfile.getDefaultInstance() : conversationProfile_;
      } else {
        return conversationProfileBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The conversation profile to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setConversationProfile(com.google.cloud.dialogflow.v2beta1.ConversationProfile value) {
      if (conversationProfileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conversationProfile_ = value;
      } else {
        conversationProfileBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The conversation profile to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setConversationProfile(
        com.google.cloud.dialogflow.v2beta1.ConversationProfile.Builder builderForValue) {
      if (conversationProfileBuilder_ == null) {
        conversationProfile_ = builderForValue.build();
      } else {
        conversationProfileBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The conversation profile to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeConversationProfile(com.google.cloud.dialogflow.v2beta1.ConversationProfile value) {
      if (conversationProfileBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          conversationProfile_ != null &&
          conversationProfile_ != com.google.cloud.dialogflow.v2beta1.ConversationProfile.getDefaultInstance()) {
          getConversationProfileBuilder().mergeFrom(value);
        } else {
          conversationProfile_ = value;
        }
      } else {
        conversationProfileBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The conversation profile to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearConversationProfile() {
      bitField0_ = (bitField0_ & ~0x00000001);
      conversationProfile_ = null;
      if (conversationProfileBuilder_ != null) {
        conversationProfileBuilder_.dispose();
        conversationProfileBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The conversation profile to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2beta1.ConversationProfile.Builder getConversationProfileBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getConversationProfileFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The conversation profile to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2beta1.ConversationProfileOrBuilder getConversationProfileOrBuilder() {
      if (conversationProfileBuilder_ != null) {
        return conversationProfileBuilder_.getMessageOrBuilder();
      } else {
        return conversationProfile_ == null ?
            com.google.cloud.dialogflow.v2beta1.ConversationProfile.getDefaultInstance() : conversationProfile_;
      }
    }
    /**
     * <pre>
     * Required. The conversation profile to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.ConversationProfile conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.ConversationProfile, com.google.cloud.dialogflow.v2beta1.ConversationProfile.Builder, com.google.cloud.dialogflow.v2beta1.ConversationProfileOrBuilder> 
        getConversationProfileFieldBuilder() {
      if (conversationProfileBuilder_ == null) {
        conversationProfileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.ConversationProfile, com.google.cloud.dialogflow.v2beta1.ConversationProfile.Builder, com.google.cloud.dialogflow.v2beta1.ConversationProfileOrBuilder>(
                getConversationProfile(),
                getParentForChildren(),
                isClean());
        conversationProfile_ = null;
      }
      return conversationProfileBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. The mask to control which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The mask to control which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The mask to control which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The mask to control which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The mask to control which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The mask to control which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The mask to control which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The mask to control which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The mask to control which fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest)
  private static final com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateConversationProfileRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateConversationProfileRequest>() {
    @java.lang.Override
    public UpdateConversationProfileRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateConversationProfileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateConversationProfileRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.UpdateConversationProfileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

