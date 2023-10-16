/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v2/service.proto

package com.google.cloud.notebooks.v2;

/**
 *
 *
 * <pre>
 * Request for updating a notebook instance.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v2.UpdateInstanceRequest}
 */
public final class UpdateInstanceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v2.UpdateInstanceRequest)
    UpdateInstanceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateInstanceRequest.newBuilder() to construct.
  private UpdateInstanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateInstanceRequest() {
    requestId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateInstanceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.notebooks.v2.ServiceProto
        .internal_static_google_cloud_notebooks_v2_UpdateInstanceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v2.ServiceProto
        .internal_static_google_cloud_notebooks_v2_UpdateInstanceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v2.UpdateInstanceRequest.class,
            com.google.cloud.notebooks.v2.UpdateInstanceRequest.Builder.class);
  }

  public static final int INSTANCE_FIELD_NUMBER = 1;
  private com.google.cloud.notebooks.v2.Instance instance_;
  /**
   *
   *
   * <pre>
   * Required. A representation of an instance.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v2.Instance instance = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the instance field is set.
   */
  @java.lang.Override
  public boolean hasInstance() {
    return instance_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. A representation of an instance.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v2.Instance instance = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The instance.
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v2.Instance getInstance() {
    return instance_ == null
        ? com.google.cloud.notebooks.v2.Instance.getDefaultInstance()
        : instance_;
  }
  /**
   *
   *
   * <pre>
   * Required. A representation of an instance.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v2.Instance instance = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v2.InstanceOrBuilder getInstanceOrBuilder() {
    return instance_ == null
        ? com.google.cloud.notebooks.v2.Instance.getDefaultInstance()
        : instance_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Mask used to update an instance
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Mask used to update an instance
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. Mask used to update an instance
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object requestId_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Idempotent request UUID.
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  @java.lang.Override
  public java.lang.String getRequestId() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Idempotent request UUID.
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRequestIdBytes() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      requestId_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (instance_ != null) {
      output.writeMessage(1, getInstance());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, requestId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (instance_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getInstance());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requestId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, requestId_);
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
    if (!(obj instanceof com.google.cloud.notebooks.v2.UpdateInstanceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v2.UpdateInstanceRequest other =
        (com.google.cloud.notebooks.v2.UpdateInstanceRequest) obj;

    if (hasInstance() != other.hasInstance()) return false;
    if (hasInstance()) {
      if (!getInstance().equals(other.getInstance())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (!getRequestId().equals(other.getRequestId())) return false;
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
    if (hasInstance()) {
      hash = (37 * hash) + INSTANCE_FIELD_NUMBER;
      hash = (53 * hash) + getInstance().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v2.UpdateInstanceRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v2.UpdateInstanceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v2.UpdateInstanceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v2.UpdateInstanceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v2.UpdateInstanceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v2.UpdateInstanceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v2.UpdateInstanceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v2.UpdateInstanceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v2.UpdateInstanceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v2.UpdateInstanceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v2.UpdateInstanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v2.UpdateInstanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.notebooks.v2.UpdateInstanceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request for updating a notebook instance.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v2.UpdateInstanceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v2.UpdateInstanceRequest)
      com.google.cloud.notebooks.v2.UpdateInstanceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.notebooks.v2.ServiceProto
          .internal_static_google_cloud_notebooks_v2_UpdateInstanceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v2.ServiceProto
          .internal_static_google_cloud_notebooks_v2_UpdateInstanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v2.UpdateInstanceRequest.class,
              com.google.cloud.notebooks.v2.UpdateInstanceRequest.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v2.UpdateInstanceRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      instance_ = null;
      if (instanceBuilder_ != null) {
        instanceBuilder_.dispose();
        instanceBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      requestId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.notebooks.v2.ServiceProto
          .internal_static_google_cloud_notebooks_v2_UpdateInstanceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v2.UpdateInstanceRequest getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v2.UpdateInstanceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v2.UpdateInstanceRequest build() {
      com.google.cloud.notebooks.v2.UpdateInstanceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v2.UpdateInstanceRequest buildPartial() {
      com.google.cloud.notebooks.v2.UpdateInstanceRequest result =
          new com.google.cloud.notebooks.v2.UpdateInstanceRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.notebooks.v2.UpdateInstanceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.instance_ = instanceBuilder_ == null ? instance_ : instanceBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.requestId_ = requestId_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.notebooks.v2.UpdateInstanceRequest) {
        return mergeFrom((com.google.cloud.notebooks.v2.UpdateInstanceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v2.UpdateInstanceRequest other) {
      if (other == com.google.cloud.notebooks.v2.UpdateInstanceRequest.getDefaultInstance())
        return this;
      if (other.hasInstance()) {
        mergeInstance(other.getInstance());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (!other.getRequestId().isEmpty()) {
        requestId_ = other.requestId_;
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
            case 10:
              {
                input.readMessage(getInstanceFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                requestId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            default:
              {
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

    private com.google.cloud.notebooks.v2.Instance instance_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.notebooks.v2.Instance,
            com.google.cloud.notebooks.v2.Instance.Builder,
            com.google.cloud.notebooks.v2.InstanceOrBuilder>
        instanceBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A representation of an instance.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.Instance instance = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the instance field is set.
     */
    public boolean hasInstance() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. A representation of an instance.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.Instance instance = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The instance.
     */
    public com.google.cloud.notebooks.v2.Instance getInstance() {
      if (instanceBuilder_ == null) {
        return instance_ == null
            ? com.google.cloud.notebooks.v2.Instance.getDefaultInstance()
            : instance_;
      } else {
        return instanceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A representation of an instance.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.Instance instance = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setInstance(com.google.cloud.notebooks.v2.Instance value) {
      if (instanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        instance_ = value;
      } else {
        instanceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A representation of an instance.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.Instance instance = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setInstance(com.google.cloud.notebooks.v2.Instance.Builder builderForValue) {
      if (instanceBuilder_ == null) {
        instance_ = builderForValue.build();
      } else {
        instanceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A representation of an instance.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.Instance instance = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeInstance(com.google.cloud.notebooks.v2.Instance value) {
      if (instanceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && instance_ != null
            && instance_ != com.google.cloud.notebooks.v2.Instance.getDefaultInstance()) {
          getInstanceBuilder().mergeFrom(value);
        } else {
          instance_ = value;
        }
      } else {
        instanceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A representation of an instance.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.Instance instance = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearInstance() {
      bitField0_ = (bitField0_ & ~0x00000001);
      instance_ = null;
      if (instanceBuilder_ != null) {
        instanceBuilder_.dispose();
        instanceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A representation of an instance.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.Instance instance = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.notebooks.v2.Instance.Builder getInstanceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInstanceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A representation of an instance.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.Instance instance = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.notebooks.v2.InstanceOrBuilder getInstanceOrBuilder() {
      if (instanceBuilder_ != null) {
        return instanceBuilder_.getMessageOrBuilder();
      } else {
        return instance_ == null
            ? com.google.cloud.notebooks.v2.Instance.getDefaultInstance()
            : instance_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A representation of an instance.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v2.Instance instance = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.notebooks.v2.Instance,
            com.google.cloud.notebooks.v2.Instance.Builder,
            com.google.cloud.notebooks.v2.InstanceOrBuilder>
        getInstanceFieldBuilder() {
      if (instanceBuilder_ == null) {
        instanceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.notebooks.v2.Instance,
                com.google.cloud.notebooks.v2.Instance.Builder,
                com.google.cloud.notebooks.v2.InstanceOrBuilder>(
                getInstance(), getParentForChildren(), isClean());
        instance_ = null;
      }
      return instanceBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Mask used to update an instance
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Mask used to update an instance
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Mask used to update an instance
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     *
     *
     * <pre>
     * Required. Mask used to update an instance
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
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
     *
     *
     * <pre>
     * Required. Mask used to update an instance
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
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
     *
     *
     * <pre>
     * Required. Mask used to update an instance
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
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
     *
     *
     * <pre>
     * Required. Mask used to update an instance
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Mask used to update an instance
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Mask used to update an instance
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private java.lang.Object requestId_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The requestId.
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for requestId.
     */
    public com.google.protobuf.ByteString getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      requestId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      requestId_ = getDefaultInstance().getRequestId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Idempotent request UUID.
     * </pre>
     *
     * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      requestId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v2.UpdateInstanceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v2.UpdateInstanceRequest)
  private static final com.google.cloud.notebooks.v2.UpdateInstanceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v2.UpdateInstanceRequest();
  }

  public static com.google.cloud.notebooks.v2.UpdateInstanceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateInstanceRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateInstanceRequest>() {
        @java.lang.Override
        public UpdateInstanceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateInstanceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateInstanceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v2.UpdateInstanceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
