// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

package com.google.cloud.datacatalog.lineage.v1;

/**
 * <pre>
 * Link details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.lineage.v1.ProcessLinkInfo}
 */
public final class ProcessLinkInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.lineage.v1.ProcessLinkInfo)
    ProcessLinkInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProcessLinkInfo.newBuilder() to construct.
  private ProcessLinkInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProcessLinkInfo() {
    link_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProcessLinkInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datacatalog.lineage.v1.LineageProto.internal_static_google_cloud_datacatalog_lineage_v1_ProcessLinkInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.lineage.v1.LineageProto.internal_static_google_cloud_datacatalog_lineage_v1_ProcessLinkInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo.class, com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo.Builder.class);
  }

  public static final int LINK_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object link_ = "";
  /**
   * <pre>
   * The name of the link in the format of
   * `projects/{project}/locations/{location}/links/{link}`.
   * </pre>
   *
   * <code>string link = 1;</code>
   * @return The link.
   */
  @java.lang.Override
  public java.lang.String getLink() {
    java.lang.Object ref = link_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      link_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the link in the format of
   * `projects/{project}/locations/{location}/links/{link}`.
   * </pre>
   *
   * <code>string link = 1;</code>
   * @return The bytes for link.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLinkBytes() {
    java.lang.Object ref = link_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      link_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int START_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp startTime_;
  /**
   * <pre>
   * The start of the first event establishing this link-process tuple.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   * @return Whether the startTime field is set.
   */
  @java.lang.Override
  public boolean hasStartTime() {
    return startTime_ != null;
  }
  /**
   * <pre>
   * The start of the first event establishing this link-process tuple.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   * @return The startTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStartTime() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }
  /**
   * <pre>
   * The start of the first event establishing this link-process tuple.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }

  public static final int END_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp endTime_;
  /**
   * <pre>
   * The end of the last event establishing this link-process tuple.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   * @return Whether the endTime field is set.
   */
  @java.lang.Override
  public boolean hasEndTime() {
    return endTime_ != null;
  }
  /**
   * <pre>
   * The end of the last event establishing this link-process tuple.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   * @return The endTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getEndTime() {
    return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
  }
  /**
   * <pre>
   * The end of the last event establishing this link-process tuple.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
    return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(link_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, link_);
    }
    if (startTime_ != null) {
      output.writeMessage(2, getStartTime());
    }
    if (endTime_ != null) {
      output.writeMessage(3, getEndTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(link_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, link_);
    }
    if (startTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStartTime());
    }
    if (endTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getEndTime());
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
    if (!(obj instanceof com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo other = (com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo) obj;

    if (!getLink()
        .equals(other.getLink())) return false;
    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime()
          .equals(other.getStartTime())) return false;
    }
    if (hasEndTime() != other.hasEndTime()) return false;
    if (hasEndTime()) {
      if (!getEndTime()
          .equals(other.getEndTime())) return false;
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
    hash = (37 * hash) + LINK_FIELD_NUMBER;
    hash = (53 * hash) + getLink().hashCode();
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    if (hasEndTime()) {
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo prototype) {
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
   * Link details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.lineage.v1.ProcessLinkInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.lineage.v1.ProcessLinkInfo)
      com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datacatalog.lineage.v1.LineageProto.internal_static_google_cloud_datacatalog_lineage_v1_ProcessLinkInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.lineage.v1.LineageProto.internal_static_google_cloud_datacatalog_lineage_v1_ProcessLinkInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo.class, com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo.newBuilder()
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
      link_ = "";
      startTime_ = null;
      if (startTimeBuilder_ != null) {
        startTimeBuilder_.dispose();
        startTimeBuilder_ = null;
      }
      endTime_ = null;
      if (endTimeBuilder_ != null) {
        endTimeBuilder_.dispose();
        endTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datacatalog.lineage.v1.LineageProto.internal_static_google_cloud_datacatalog_lineage_v1_ProcessLinkInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo build() {
      com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo buildPartial() {
      com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo result = new com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.link_ = link_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startTime_ = startTimeBuilder_ == null
            ? startTime_
            : startTimeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.endTime_ = endTimeBuilder_ == null
            ? endTime_
            : endTimeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo) {
        return mergeFrom((com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo other) {
      if (other == com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo.getDefaultInstance()) return this;
      if (!other.getLink().isEmpty()) {
        link_ = other.link_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
      }
      if (other.hasEndTime()) {
        mergeEndTime(other.getEndTime());
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
              link_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getStartTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getEndTimeFieldBuilder().getBuilder(),
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

    private java.lang.Object link_ = "";
    /**
     * <pre>
     * The name of the link in the format of
     * `projects/{project}/locations/{location}/links/{link}`.
     * </pre>
     *
     * <code>string link = 1;</code>
     * @return The link.
     */
    public java.lang.String getLink() {
      java.lang.Object ref = link_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        link_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the link in the format of
     * `projects/{project}/locations/{location}/links/{link}`.
     * </pre>
     *
     * <code>string link = 1;</code>
     * @return The bytes for link.
     */
    public com.google.protobuf.ByteString
        getLinkBytes() {
      java.lang.Object ref = link_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        link_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the link in the format of
     * `projects/{project}/locations/{location}/links/{link}`.
     * </pre>
     *
     * <code>string link = 1;</code>
     * @param value The link to set.
     * @return This builder for chaining.
     */
    public Builder setLink(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      link_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the link in the format of
     * `projects/{project}/locations/{location}/links/{link}`.
     * </pre>
     *
     * <code>string link = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLink() {
      link_ = getDefaultInstance().getLink();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the link in the format of
     * `projects/{project}/locations/{location}/links/{link}`.
     * </pre>
     *
     * <code>string link = 1;</code>
     * @param value The bytes for link to set.
     * @return This builder for chaining.
     */
    public Builder setLinkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      link_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp startTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startTimeBuilder_;
    /**
     * <pre>
     * The start of the first event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     * @return Whether the startTime field is set.
     */
    public boolean hasStartTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The start of the first event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     * @return The startTime.
     */
    public com.google.protobuf.Timestamp getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The start of the first event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
      } else {
        startTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The start of the first event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder setStartTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The start of the first event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          startTime_ != null &&
          startTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getStartTimeBuilder().mergeFrom(value);
        } else {
          startTime_ = value;
        }
      } else {
        startTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The start of the first event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public Builder clearStartTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      startTime_ = null;
      if (startTimeBuilder_ != null) {
        startTimeBuilder_.dispose();
        startTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The start of the first event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The start of the first event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      }
    }
    /**
     * <pre>
     * The start of the first event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getStartTime(),
                getParentForChildren(),
                isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    private com.google.protobuf.Timestamp endTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> endTimeBuilder_;
    /**
     * <pre>
     * The end of the last event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
     * @return Whether the endTime field is set.
     */
    public boolean hasEndTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The end of the last event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
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
     * The end of the last event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
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
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The end of the last event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
     */
    public Builder setEndTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (endTimeBuilder_ == null) {
        endTime_ = builderForValue.build();
      } else {
        endTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The end of the last event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
     */
    public Builder mergeEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          endTime_ != null &&
          endTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getEndTimeBuilder().mergeFrom(value);
        } else {
          endTime_ = value;
        }
      } else {
        endTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The end of the last event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
     */
    public Builder clearEndTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
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
     * The end of the last event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getEndTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getEndTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The end of the last event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
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
     * The end of the last event establishing this link-process tuple.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.lineage.v1.ProcessLinkInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.lineage.v1.ProcessLinkInfo)
  private static final com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo();
  }

  public static com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProcessLinkInfo>
      PARSER = new com.google.protobuf.AbstractParser<ProcessLinkInfo>() {
    @java.lang.Override
    public ProcessLinkInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProcessLinkInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProcessLinkInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.lineage.v1.ProcessLinkInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

