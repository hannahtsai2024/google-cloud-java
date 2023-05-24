// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/fulfillment.proto

package com.google.cloud.dialogflow.v2;

/**
 * <pre>
 * The request message for
 * [Fulfillments.UpdateFulfillment][google.cloud.dialogflow.v2.Fulfillments.UpdateFulfillment].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.UpdateFulfillmentRequest}
 */
public final class UpdateFulfillmentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.UpdateFulfillmentRequest)
    UpdateFulfillmentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateFulfillmentRequest.newBuilder() to construct.
  private UpdateFulfillmentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateFulfillmentRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateFulfillmentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2.FulfillmentProto.internal_static_google_cloud_dialogflow_v2_UpdateFulfillmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.FulfillmentProto.internal_static_google_cloud_dialogflow_v2_UpdateFulfillmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest.class, com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest.Builder.class);
  }

  public static final int FULFILLMENT_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.v2.Fulfillment fulfillment_;
  /**
   * <pre>
   * Required. The fulfillment to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Fulfillment fulfillment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the fulfillment field is set.
   */
  @java.lang.Override
  public boolean hasFulfillment() {
    return fulfillment_ != null;
  }
  /**
   * <pre>
   * Required. The fulfillment to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Fulfillment fulfillment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The fulfillment.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.Fulfillment getFulfillment() {
    return fulfillment_ == null ? com.google.cloud.dialogflow.v2.Fulfillment.getDefaultInstance() : fulfillment_;
  }
  /**
   * <pre>
   * Required. The fulfillment to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Fulfillment fulfillment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.FulfillmentOrBuilder getFulfillmentOrBuilder() {
    return fulfillment_ == null ? com.google.cloud.dialogflow.v2.Fulfillment.getDefaultInstance() : fulfillment_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. The mask to control which fields get updated. If the mask is not
   * present, all fields will be updated.
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
   * Required. The mask to control which fields get updated. If the mask is not
   * present, all fields will be updated.
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
   * Required. The mask to control which fields get updated. If the mask is not
   * present, all fields will be updated.
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
    if (fulfillment_ != null) {
      output.writeMessage(1, getFulfillment());
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
    if (fulfillment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFulfillment());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest other = (com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest) obj;

    if (hasFulfillment() != other.hasFulfillment()) return false;
    if (hasFulfillment()) {
      if (!getFulfillment()
          .equals(other.getFulfillment())) return false;
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
    if (hasFulfillment()) {
      hash = (37 * hash) + FULFILLMENT_FIELD_NUMBER;
      hash = (53 * hash) + getFulfillment().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest prototype) {
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
   * [Fulfillments.UpdateFulfillment][google.cloud.dialogflow.v2.Fulfillments.UpdateFulfillment].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.UpdateFulfillmentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.UpdateFulfillmentRequest)
      com.google.cloud.dialogflow.v2.UpdateFulfillmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2.FulfillmentProto.internal_static_google_cloud_dialogflow_v2_UpdateFulfillmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.FulfillmentProto.internal_static_google_cloud_dialogflow_v2_UpdateFulfillmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest.class, com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest.newBuilder()
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
      fulfillment_ = null;
      if (fulfillmentBuilder_ != null) {
        fulfillmentBuilder_.dispose();
        fulfillmentBuilder_ = null;
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
      return com.google.cloud.dialogflow.v2.FulfillmentProto.internal_static_google_cloud_dialogflow_v2_UpdateFulfillmentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest build() {
      com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest buildPartial() {
      com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest result = new com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fulfillment_ = fulfillmentBuilder_ == null
            ? fulfillment_
            : fulfillmentBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest other) {
      if (other == com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest.getDefaultInstance()) return this;
      if (other.hasFulfillment()) {
        mergeFulfillment(other.getFulfillment());
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
                  getFulfillmentFieldBuilder().getBuilder(),
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

    private com.google.cloud.dialogflow.v2.Fulfillment fulfillment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2.Fulfillment, com.google.cloud.dialogflow.v2.Fulfillment.Builder, com.google.cloud.dialogflow.v2.FulfillmentOrBuilder> fulfillmentBuilder_;
    /**
     * <pre>
     * Required. The fulfillment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Fulfillment fulfillment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the fulfillment field is set.
     */
    public boolean hasFulfillment() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required. The fulfillment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Fulfillment fulfillment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The fulfillment.
     */
    public com.google.cloud.dialogflow.v2.Fulfillment getFulfillment() {
      if (fulfillmentBuilder_ == null) {
        return fulfillment_ == null ? com.google.cloud.dialogflow.v2.Fulfillment.getDefaultInstance() : fulfillment_;
      } else {
        return fulfillmentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The fulfillment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Fulfillment fulfillment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFulfillment(com.google.cloud.dialogflow.v2.Fulfillment value) {
      if (fulfillmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fulfillment_ = value;
      } else {
        fulfillmentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The fulfillment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Fulfillment fulfillment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setFulfillment(
        com.google.cloud.dialogflow.v2.Fulfillment.Builder builderForValue) {
      if (fulfillmentBuilder_ == null) {
        fulfillment_ = builderForValue.build();
      } else {
        fulfillmentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The fulfillment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Fulfillment fulfillment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeFulfillment(com.google.cloud.dialogflow.v2.Fulfillment value) {
      if (fulfillmentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          fulfillment_ != null &&
          fulfillment_ != com.google.cloud.dialogflow.v2.Fulfillment.getDefaultInstance()) {
          getFulfillmentBuilder().mergeFrom(value);
        } else {
          fulfillment_ = value;
        }
      } else {
        fulfillmentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The fulfillment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Fulfillment fulfillment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearFulfillment() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fulfillment_ = null;
      if (fulfillmentBuilder_ != null) {
        fulfillmentBuilder_.dispose();
        fulfillmentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The fulfillment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Fulfillment fulfillment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2.Fulfillment.Builder getFulfillmentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFulfillmentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The fulfillment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Fulfillment fulfillment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2.FulfillmentOrBuilder getFulfillmentOrBuilder() {
      if (fulfillmentBuilder_ != null) {
        return fulfillmentBuilder_.getMessageOrBuilder();
      } else {
        return fulfillment_ == null ?
            com.google.cloud.dialogflow.v2.Fulfillment.getDefaultInstance() : fulfillment_;
      }
    }
    /**
     * <pre>
     * Required. The fulfillment to update.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Fulfillment fulfillment = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2.Fulfillment, com.google.cloud.dialogflow.v2.Fulfillment.Builder, com.google.cloud.dialogflow.v2.FulfillmentOrBuilder> 
        getFulfillmentFieldBuilder() {
      if (fulfillmentBuilder_ == null) {
        fulfillmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.Fulfillment, com.google.cloud.dialogflow.v2.Fulfillment.Builder, com.google.cloud.dialogflow.v2.FulfillmentOrBuilder>(
                getFulfillment(),
                getParentForChildren(),
                isClean());
        fulfillment_ = null;
      }
      return fulfillmentBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. The mask to control which fields get updated. If the mask is not
     * present, all fields will be updated.
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
     * Required. The mask to control which fields get updated. If the mask is not
     * present, all fields will be updated.
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
     * Required. The mask to control which fields get updated. If the mask is not
     * present, all fields will be updated.
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
     * Required. The mask to control which fields get updated. If the mask is not
     * present, all fields will be updated.
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
     * Required. The mask to control which fields get updated. If the mask is not
     * present, all fields will be updated.
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
     * Required. The mask to control which fields get updated. If the mask is not
     * present, all fields will be updated.
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
     * Required. The mask to control which fields get updated. If the mask is not
     * present, all fields will be updated.
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
     * Required. The mask to control which fields get updated. If the mask is not
     * present, all fields will be updated.
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
     * Required. The mask to control which fields get updated. If the mask is not
     * present, all fields will be updated.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.UpdateFulfillmentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.UpdateFulfillmentRequest)
  private static final com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest();
  }

  public static com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateFulfillmentRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateFulfillmentRequest>() {
    @java.lang.Override
    public UpdateFulfillmentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateFulfillmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateFulfillmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.UpdateFulfillmentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

