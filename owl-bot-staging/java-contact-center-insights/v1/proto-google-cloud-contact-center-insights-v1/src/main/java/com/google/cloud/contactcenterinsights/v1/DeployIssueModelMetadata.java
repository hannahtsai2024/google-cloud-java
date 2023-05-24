// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 * <pre>
 * Metadata for deploying an issue model.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata}
 */
public final class DeployIssueModelMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata)
    DeployIssueModelMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeployIssueModelMetadata.newBuilder() to construct.
  private DeployIssueModelMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeployIssueModelMetadata() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeployIssueModelMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_DeployIssueModelMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_DeployIssueModelMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata.class, com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata.Builder.class);
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp createTime_;
  /**
   * <pre>
   * Output only. The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   * <pre>
   * Output only. The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   * <pre>
   * Output only. The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }

  public static final int END_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp endTime_;
  /**
   * <pre>
   * Output only. The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the endTime field is set.
   */
  @java.lang.Override
  public boolean hasEndTime() {
    return endTime_ != null;
  }
  /**
   * <pre>
   * Output only. The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getEndTime() {
    return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
  }
  /**
   * <pre>
   * Output only. The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
    return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
  }

  public static final int REQUEST_FIELD_NUMBER = 3;
  private com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest request_;
  /**
   * <pre>
   * The original request for deployment.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest request = 3;</code>
   * @return Whether the request field is set.
   */
  @java.lang.Override
  public boolean hasRequest() {
    return request_ != null;
  }
  /**
   * <pre>
   * The original request for deployment.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest request = 3;</code>
   * @return The request.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest getRequest() {
    return request_ == null ? com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest.getDefaultInstance() : request_;
  }
  /**
   * <pre>
   * The original request for deployment.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest request = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequestOrBuilder getRequestOrBuilder() {
    return request_ == null ? com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest.getDefaultInstance() : request_;
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
    if (createTime_ != null) {
      output.writeMessage(1, getCreateTime());
    }
    if (endTime_ != null) {
      output.writeMessage(2, getEndTime());
    }
    if (request_ != null) {
      output.writeMessage(3, getRequest());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCreateTime());
    }
    if (endTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEndTime());
    }
    if (request_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRequest());
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata other = (com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata) obj;

    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
    }
    if (hasEndTime() != other.hasEndTime()) return false;
    if (hasEndTime()) {
      if (!getEndTime()
          .equals(other.getEndTime())) return false;
    }
    if (hasRequest() != other.hasRequest()) return false;
    if (hasRequest()) {
      if (!getRequest()
          .equals(other.getRequest())) return false;
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
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    if (hasEndTime()) {
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime().hashCode();
    }
    if (hasRequest()) {
      hash = (37 * hash) + REQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getRequest().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata prototype) {
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
   * Metadata for deploying an issue model.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata)
      com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_DeployIssueModelMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_DeployIssueModelMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata.class, com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata.newBuilder()
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
      createTime_ = null;
      if (createTimeBuilder_ != null) {
        createTimeBuilder_.dispose();
        createTimeBuilder_ = null;
      }
      endTime_ = null;
      if (endTimeBuilder_ != null) {
        endTimeBuilder_.dispose();
        endTimeBuilder_ = null;
      }
      request_ = null;
      if (requestBuilder_ != null) {
        requestBuilder_.dispose();
        requestBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto.internal_static_google_cloud_contactcenterinsights_v1_DeployIssueModelMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata build() {
      com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata buildPartial() {
      com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata result = new com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.createTime_ = createTimeBuilder_ == null
            ? createTime_
            : createTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endTime_ = endTimeBuilder_ == null
            ? endTime_
            : endTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.request_ = requestBuilder_ == null
            ? request_
            : requestBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata other) {
      if (other == com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata.getDefaultInstance()) return this;
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (other.hasEndTime()) {
        mergeEndTime(other.getEndTime());
      }
      if (other.hasRequest()) {
        mergeRequest(other.getRequest());
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
                  getCreateTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getEndTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getRequestFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createTimeBuilder_;
    /**
     * <pre>
     * Output only. The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Output only. The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The createTime.
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createTime_ = value;
      } else {
        createTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          createTime_ != null &&
          createTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getCreateTimeBuilder().mergeFrom(value);
        } else {
          createTime_ = value;
        }
      } else {
        createTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearCreateTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      createTime_ = null;
      if (createTimeBuilder_ != null) {
        createTimeBuilder_.dispose();
        createTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      }
    }
    /**
     * <pre>
     * Output only. The time the operation was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(),
                getParentForChildren(),
                isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
    }

    private com.google.protobuf.Timestamp endTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> endTimeBuilder_;
    /**
     * <pre>
     * Output only. The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the endTime field is set.
     */
    public boolean hasEndTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Output only. The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The endTime.
     */
    public com.google.protobuf.Timestamp getEndTime() {
      if (endTimeBuilder_ == null) {
        return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
      } else {
        return endTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endTime_ = value;
      } else {
        endTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setEndTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (endTimeBuilder_ == null) {
        endTime_ = builderForValue.build();
      } else {
        endTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          endTime_ != null &&
          endTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getEndTimeBuilder().mergeFrom(value);
        } else {
          endTime_ = value;
        }
      } else {
        endTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearEndTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endTime_ = null;
      if (endTimeBuilder_ != null) {
        endTimeBuilder_.dispose();
        endTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.Timestamp.Builder getEndTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEndTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
      if (endTimeBuilder_ != null) {
        return endTimeBuilder_.getMessageOrBuilder();
      } else {
        return endTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
      }
    }
    /**
     * <pre>
     * Output only. The time the operation finished running.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getEndTimeFieldBuilder() {
      if (endTimeBuilder_ == null) {
        endTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getEndTime(),
                getParentForChildren(),
                isClean());
        endTime_ = null;
      }
      return endTimeBuilder_;
    }

    private com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest request_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest, com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest.Builder, com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequestOrBuilder> requestBuilder_;
    /**
     * <pre>
     * The original request for deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest request = 3;</code>
     * @return Whether the request field is set.
     */
    public boolean hasRequest() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The original request for deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest request = 3;</code>
     * @return The request.
     */
    public com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest getRequest() {
      if (requestBuilder_ == null) {
        return request_ == null ? com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest.getDefaultInstance() : request_;
      } else {
        return requestBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The original request for deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest request = 3;</code>
     */
    public Builder setRequest(com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest value) {
      if (requestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        request_ = value;
      } else {
        requestBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The original request for deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest request = 3;</code>
     */
    public Builder setRequest(
        com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest.Builder builderForValue) {
      if (requestBuilder_ == null) {
        request_ = builderForValue.build();
      } else {
        requestBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The original request for deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest request = 3;</code>
     */
    public Builder mergeRequest(com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest value) {
      if (requestBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          request_ != null &&
          request_ != com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest.getDefaultInstance()) {
          getRequestBuilder().mergeFrom(value);
        } else {
          request_ = value;
        }
      } else {
        requestBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The original request for deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest request = 3;</code>
     */
    public Builder clearRequest() {
      bitField0_ = (bitField0_ & ~0x00000004);
      request_ = null;
      if (requestBuilder_ != null) {
        requestBuilder_.dispose();
        requestBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The original request for deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest request = 3;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest.Builder getRequestBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getRequestFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The original request for deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest request = 3;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequestOrBuilder getRequestOrBuilder() {
      if (requestBuilder_ != null) {
        return requestBuilder_.getMessageOrBuilder();
      } else {
        return request_ == null ?
            com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest.getDefaultInstance() : request_;
      }
    }
    /**
     * <pre>
     * The original request for deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest request = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest, com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest.Builder, com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequestOrBuilder> 
        getRequestFieldBuilder() {
      if (requestBuilder_ == null) {
        requestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest, com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequest.Builder, com.google.cloud.contactcenterinsights.v1.DeployIssueModelRequestOrBuilder>(
                getRequest(),
                getParentForChildren(),
                isClean());
        request_ = null;
      }
      return requestBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata)
  private static final com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata();
  }

  public static com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeployIssueModelMetadata>
      PARSER = new com.google.protobuf.AbstractParser<DeployIssueModelMetadata>() {
    @java.lang.Override
    public DeployIssueModelMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeployIssueModelMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeployIssueModelMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.DeployIssueModelMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

