// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/evaluation_job.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 * <pre>
 * Records a failed evaluation job run.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.Attempt}
 */
public final class Attempt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.Attempt)
    AttemptOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Attempt.newBuilder() to construct.
  private Attempt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Attempt() {
    partialFailures_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Attempt();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.EvaluationJobOuterClass.internal_static_google_cloud_datalabeling_v1beta1_Attempt_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.EvaluationJobOuterClass.internal_static_google_cloud_datalabeling_v1beta1_Attempt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.Attempt.class, com.google.cloud.datalabeling.v1beta1.Attempt.Builder.class);
  }

  public static final int ATTEMPT_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp attemptTime_;
  /**
   * <code>.google.protobuf.Timestamp attempt_time = 1;</code>
   * @return Whether the attemptTime field is set.
   */
  @java.lang.Override
  public boolean hasAttemptTime() {
    return attemptTime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp attempt_time = 1;</code>
   * @return The attemptTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getAttemptTime() {
    return attemptTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : attemptTime_;
  }
  /**
   * <code>.google.protobuf.Timestamp attempt_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getAttemptTimeOrBuilder() {
    return attemptTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : attemptTime_;
  }

  public static final int PARTIAL_FAILURES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.rpc.Status> partialFailures_;
  /**
   * <pre>
   * Details of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.rpc.Status> getPartialFailuresList() {
    return partialFailures_;
  }
  /**
   * <pre>
   * Details of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.rpc.StatusOrBuilder> 
      getPartialFailuresOrBuilderList() {
    return partialFailures_;
  }
  /**
   * <pre>
   * Details of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  @java.lang.Override
  public int getPartialFailuresCount() {
    return partialFailures_.size();
  }
  /**
   * <pre>
   * Details of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  @java.lang.Override
  public com.google.rpc.Status getPartialFailures(int index) {
    return partialFailures_.get(index);
  }
  /**
   * <pre>
   * Details of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getPartialFailuresOrBuilder(
      int index) {
    return partialFailures_.get(index);
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
    if (attemptTime_ != null) {
      output.writeMessage(1, getAttemptTime());
    }
    for (int i = 0; i < partialFailures_.size(); i++) {
      output.writeMessage(2, partialFailures_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (attemptTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAttemptTime());
    }
    for (int i = 0; i < partialFailures_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, partialFailures_.get(i));
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.Attempt)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.Attempt other = (com.google.cloud.datalabeling.v1beta1.Attempt) obj;

    if (hasAttemptTime() != other.hasAttemptTime()) return false;
    if (hasAttemptTime()) {
      if (!getAttemptTime()
          .equals(other.getAttemptTime())) return false;
    }
    if (!getPartialFailuresList()
        .equals(other.getPartialFailuresList())) return false;
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
    if (hasAttemptTime()) {
      hash = (37 * hash) + ATTEMPT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getAttemptTime().hashCode();
    }
    if (getPartialFailuresCount() > 0) {
      hash = (37 * hash) + PARTIAL_FAILURES_FIELD_NUMBER;
      hash = (53 * hash) + getPartialFailuresList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.Attempt parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datalabeling.v1beta1.Attempt prototype) {
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
   * Records a failed evaluation job run.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.Attempt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.Attempt)
      com.google.cloud.datalabeling.v1beta1.AttemptOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationJobOuterClass.internal_static_google_cloud_datalabeling_v1beta1_Attempt_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationJobOuterClass.internal_static_google_cloud_datalabeling_v1beta1_Attempt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.Attempt.class, com.google.cloud.datalabeling.v1beta1.Attempt.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.Attempt.newBuilder()
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
      attemptTime_ = null;
      if (attemptTimeBuilder_ != null) {
        attemptTimeBuilder_.dispose();
        attemptTimeBuilder_ = null;
      }
      if (partialFailuresBuilder_ == null) {
        partialFailures_ = java.util.Collections.emptyList();
      } else {
        partialFailures_ = null;
        partialFailuresBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationJobOuterClass.internal_static_google_cloud_datalabeling_v1beta1_Attempt_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.Attempt getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.Attempt.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.Attempt build() {
      com.google.cloud.datalabeling.v1beta1.Attempt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.Attempt buildPartial() {
      com.google.cloud.datalabeling.v1beta1.Attempt result = new com.google.cloud.datalabeling.v1beta1.Attempt(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.datalabeling.v1beta1.Attempt result) {
      if (partialFailuresBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          partialFailures_ = java.util.Collections.unmodifiableList(partialFailures_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.partialFailures_ = partialFailures_;
      } else {
        result.partialFailures_ = partialFailuresBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.datalabeling.v1beta1.Attempt result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.attemptTime_ = attemptTimeBuilder_ == null
            ? attemptTime_
            : attemptTimeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datalabeling.v1beta1.Attempt) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.Attempt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.Attempt other) {
      if (other == com.google.cloud.datalabeling.v1beta1.Attempt.getDefaultInstance()) return this;
      if (other.hasAttemptTime()) {
        mergeAttemptTime(other.getAttemptTime());
      }
      if (partialFailuresBuilder_ == null) {
        if (!other.partialFailures_.isEmpty()) {
          if (partialFailures_.isEmpty()) {
            partialFailures_ = other.partialFailures_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePartialFailuresIsMutable();
            partialFailures_.addAll(other.partialFailures_);
          }
          onChanged();
        }
      } else {
        if (!other.partialFailures_.isEmpty()) {
          if (partialFailuresBuilder_.isEmpty()) {
            partialFailuresBuilder_.dispose();
            partialFailuresBuilder_ = null;
            partialFailures_ = other.partialFailures_;
            bitField0_ = (bitField0_ & ~0x00000002);
            partialFailuresBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPartialFailuresFieldBuilder() : null;
          } else {
            partialFailuresBuilder_.addAllMessages(other.partialFailures_);
          }
        }
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
                  getAttemptTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.rpc.Status m =
                  input.readMessage(
                      com.google.rpc.Status.parser(),
                      extensionRegistry);
              if (partialFailuresBuilder_ == null) {
                ensurePartialFailuresIsMutable();
                partialFailures_.add(m);
              } else {
                partialFailuresBuilder_.addMessage(m);
              }
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

    private com.google.protobuf.Timestamp attemptTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> attemptTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp attempt_time = 1;</code>
     * @return Whether the attemptTime field is set.
     */
    public boolean hasAttemptTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp attempt_time = 1;</code>
     * @return The attemptTime.
     */
    public com.google.protobuf.Timestamp getAttemptTime() {
      if (attemptTimeBuilder_ == null) {
        return attemptTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : attemptTime_;
      } else {
        return attemptTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp attempt_time = 1;</code>
     */
    public Builder setAttemptTime(com.google.protobuf.Timestamp value) {
      if (attemptTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        attemptTime_ = value;
      } else {
        attemptTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp attempt_time = 1;</code>
     */
    public Builder setAttemptTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (attemptTimeBuilder_ == null) {
        attemptTime_ = builderForValue.build();
      } else {
        attemptTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp attempt_time = 1;</code>
     */
    public Builder mergeAttemptTime(com.google.protobuf.Timestamp value) {
      if (attemptTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          attemptTime_ != null &&
          attemptTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getAttemptTimeBuilder().mergeFrom(value);
        } else {
          attemptTime_ = value;
        }
      } else {
        attemptTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp attempt_time = 1;</code>
     */
    public Builder clearAttemptTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      attemptTime_ = null;
      if (attemptTimeBuilder_ != null) {
        attemptTimeBuilder_.dispose();
        attemptTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp attempt_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getAttemptTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAttemptTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp attempt_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getAttemptTimeOrBuilder() {
      if (attemptTimeBuilder_ != null) {
        return attemptTimeBuilder_.getMessageOrBuilder();
      } else {
        return attemptTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : attemptTime_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp attempt_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getAttemptTimeFieldBuilder() {
      if (attemptTimeBuilder_ == null) {
        attemptTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getAttemptTime(),
                getParentForChildren(),
                isClean());
        attemptTime_ = null;
      }
      return attemptTimeBuilder_;
    }

    private java.util.List<com.google.rpc.Status> partialFailures_ =
      java.util.Collections.emptyList();
    private void ensurePartialFailuresIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        partialFailures_ = new java.util.ArrayList<com.google.rpc.Status>(partialFailures_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> partialFailuresBuilder_;

    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public java.util.List<com.google.rpc.Status> getPartialFailuresList() {
      if (partialFailuresBuilder_ == null) {
        return java.util.Collections.unmodifiableList(partialFailures_);
      } else {
        return partialFailuresBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public int getPartialFailuresCount() {
      if (partialFailuresBuilder_ == null) {
        return partialFailures_.size();
      } else {
        return partialFailuresBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public com.google.rpc.Status getPartialFailures(int index) {
      if (partialFailuresBuilder_ == null) {
        return partialFailures_.get(index);
      } else {
        return partialFailuresBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder setPartialFailures(
        int index, com.google.rpc.Status value) {
      if (partialFailuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartialFailuresIsMutable();
        partialFailures_.set(index, value);
        onChanged();
      } else {
        partialFailuresBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder setPartialFailures(
        int index, com.google.rpc.Status.Builder builderForValue) {
      if (partialFailuresBuilder_ == null) {
        ensurePartialFailuresIsMutable();
        partialFailures_.set(index, builderForValue.build());
        onChanged();
      } else {
        partialFailuresBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder addPartialFailures(com.google.rpc.Status value) {
      if (partialFailuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartialFailuresIsMutable();
        partialFailures_.add(value);
        onChanged();
      } else {
        partialFailuresBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder addPartialFailures(
        int index, com.google.rpc.Status value) {
      if (partialFailuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartialFailuresIsMutable();
        partialFailures_.add(index, value);
        onChanged();
      } else {
        partialFailuresBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder addPartialFailures(
        com.google.rpc.Status.Builder builderForValue) {
      if (partialFailuresBuilder_ == null) {
        ensurePartialFailuresIsMutable();
        partialFailures_.add(builderForValue.build());
        onChanged();
      } else {
        partialFailuresBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder addPartialFailures(
        int index, com.google.rpc.Status.Builder builderForValue) {
      if (partialFailuresBuilder_ == null) {
        ensurePartialFailuresIsMutable();
        partialFailures_.add(index, builderForValue.build());
        onChanged();
      } else {
        partialFailuresBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder addAllPartialFailures(
        java.lang.Iterable<? extends com.google.rpc.Status> values) {
      if (partialFailuresBuilder_ == null) {
        ensurePartialFailuresIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, partialFailures_);
        onChanged();
      } else {
        partialFailuresBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder clearPartialFailures() {
      if (partialFailuresBuilder_ == null) {
        partialFailures_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        partialFailuresBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public Builder removePartialFailures(int index) {
      if (partialFailuresBuilder_ == null) {
        ensurePartialFailuresIsMutable();
        partialFailures_.remove(index);
        onChanged();
      } else {
        partialFailuresBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public com.google.rpc.Status.Builder getPartialFailuresBuilder(
        int index) {
      return getPartialFailuresFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public com.google.rpc.StatusOrBuilder getPartialFailuresOrBuilder(
        int index) {
      if (partialFailuresBuilder_ == null) {
        return partialFailures_.get(index);  } else {
        return partialFailuresBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public java.util.List<? extends com.google.rpc.StatusOrBuilder> 
         getPartialFailuresOrBuilderList() {
      if (partialFailuresBuilder_ != null) {
        return partialFailuresBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(partialFailures_);
      }
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public com.google.rpc.Status.Builder addPartialFailuresBuilder() {
      return getPartialFailuresFieldBuilder().addBuilder(
          com.google.rpc.Status.getDefaultInstance());
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public com.google.rpc.Status.Builder addPartialFailuresBuilder(
        int index) {
      return getPartialFailuresFieldBuilder().addBuilder(
          index, com.google.rpc.Status.getDefaultInstance());
    }
    /**
     * <pre>
     * Details of errors that occurred.
     * </pre>
     *
     * <code>repeated .google.rpc.Status partial_failures = 2;</code>
     */
    public java.util.List<com.google.rpc.Status.Builder> 
         getPartialFailuresBuilderList() {
      return getPartialFailuresFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> 
        getPartialFailuresFieldBuilder() {
      if (partialFailuresBuilder_ == null) {
        partialFailuresBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>(
                partialFailures_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        partialFailures_ = null;
      }
      return partialFailuresBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.Attempt)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.Attempt)
  private static final com.google.cloud.datalabeling.v1beta1.Attempt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.Attempt();
  }

  public static com.google.cloud.datalabeling.v1beta1.Attempt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Attempt>
      PARSER = new com.google.protobuf.AbstractParser<Attempt>() {
    @java.lang.Override
    public Attempt parsePartialFrom(
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

  public static com.google.protobuf.Parser<Attempt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Attempt> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.Attempt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

