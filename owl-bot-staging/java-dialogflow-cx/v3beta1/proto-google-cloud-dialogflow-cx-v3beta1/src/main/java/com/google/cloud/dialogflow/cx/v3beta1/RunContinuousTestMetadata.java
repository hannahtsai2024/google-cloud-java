// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/environment.proto

package com.google.cloud.dialogflow.cx.v3beta1;

/**
 * <pre>
 * Metadata returned for the
 * [Environments.RunContinuousTest][google.cloud.dialogflow.cx.v3beta1.Environments.RunContinuousTest]
 * long running operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata}
 */
public final class RunContinuousTestMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata)
    RunContinuousTestMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RunContinuousTestMetadata.newBuilder() to construct.
  private RunContinuousTestMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RunContinuousTestMetadata() {
    errors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RunContinuousTestMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3beta1_RunContinuousTestMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3beta1_RunContinuousTestMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata.class, com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata.Builder.class);
  }

  public static final int ERRORS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.cx.v3beta1.TestError> errors_;
  /**
   * <pre>
   * The test errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.TestError> getErrorsList() {
    return errors_;
  }
  /**
   * <pre>
   * The test errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.TestErrorOrBuilder> 
      getErrorsOrBuilderList() {
    return errors_;
  }
  /**
   * <pre>
   * The test errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
   */
  @java.lang.Override
  public int getErrorsCount() {
    return errors_.size();
  }
  /**
   * <pre>
   * The test errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.TestError getErrors(int index) {
    return errors_.get(index);
  }
  /**
   * <pre>
   * The test errors.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.TestErrorOrBuilder getErrorsOrBuilder(
      int index) {
    return errors_.get(index);
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
    for (int i = 0; i < errors_.size(); i++) {
      output.writeMessage(1, errors_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < errors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, errors_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata other = (com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata) obj;

    if (!getErrorsList()
        .equals(other.getErrorsList())) return false;
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
    if (getErrorsCount() > 0) {
      hash = (37 * hash) + ERRORS_FIELD_NUMBER;
      hash = (53 * hash) + getErrorsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata prototype) {
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
   * Metadata returned for the
   * [Environments.RunContinuousTest][google.cloud.dialogflow.cx.v3beta1.Environments.RunContinuousTest]
   * long running operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata)
      com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3beta1_RunContinuousTestMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3beta1_RunContinuousTestMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata.class, com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata.newBuilder()
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
      if (errorsBuilder_ == null) {
        errors_ = java.util.Collections.emptyList();
      } else {
        errors_ = null;
        errorsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.EnvironmentProto.internal_static_google_cloud_dialogflow_cx_v3beta1_RunContinuousTestMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata build() {
      com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata result = new com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata result) {
      if (errorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          errors_ = java.util.Collections.unmodifiableList(errors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.errors_ = errors_;
      } else {
        result.errors_ = errorsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata.getDefaultInstance()) return this;
      if (errorsBuilder_ == null) {
        if (!other.errors_.isEmpty()) {
          if (errors_.isEmpty()) {
            errors_ = other.errors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureErrorsIsMutable();
            errors_.addAll(other.errors_);
          }
          onChanged();
        }
      } else {
        if (!other.errors_.isEmpty()) {
          if (errorsBuilder_.isEmpty()) {
            errorsBuilder_.dispose();
            errorsBuilder_ = null;
            errors_ = other.errors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            errorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getErrorsFieldBuilder() : null;
          } else {
            errorsBuilder_.addAllMessages(other.errors_);
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
              com.google.cloud.dialogflow.cx.v3beta1.TestError m =
                  input.readMessage(
                      com.google.cloud.dialogflow.cx.v3beta1.TestError.parser(),
                      extensionRegistry);
              if (errorsBuilder_ == null) {
                ensureErrorsIsMutable();
                errors_.add(m);
              } else {
                errorsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.cloud.dialogflow.cx.v3beta1.TestError> errors_ =
      java.util.Collections.emptyList();
    private void ensureErrorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        errors_ = new java.util.ArrayList<com.google.cloud.dialogflow.cx.v3beta1.TestError>(errors_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3beta1.TestError, com.google.cloud.dialogflow.cx.v3beta1.TestError.Builder, com.google.cloud.dialogflow.cx.v3beta1.TestErrorOrBuilder> errorsBuilder_;

    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.TestError> getErrorsList() {
      if (errorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(errors_);
      } else {
        return errorsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public int getErrorsCount() {
      if (errorsBuilder_ == null) {
        return errors_.size();
      } else {
        return errorsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.TestError getErrors(int index) {
      if (errorsBuilder_ == null) {
        return errors_.get(index);
      } else {
        return errorsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public Builder setErrors(
        int index, com.google.cloud.dialogflow.cx.v3beta1.TestError value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.set(index, value);
        onChanged();
      } else {
        errorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public Builder setErrors(
        int index, com.google.cloud.dialogflow.cx.v3beta1.TestError.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.set(index, builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public Builder addErrors(com.google.cloud.dialogflow.cx.v3beta1.TestError value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.add(value);
        onChanged();
      } else {
        errorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public Builder addErrors(
        int index, com.google.cloud.dialogflow.cx.v3beta1.TestError value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.add(index, value);
        onChanged();
      } else {
        errorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public Builder addErrors(
        com.google.cloud.dialogflow.cx.v3beta1.TestError.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.add(builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public Builder addErrors(
        int index, com.google.cloud.dialogflow.cx.v3beta1.TestError.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.add(index, builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public Builder addAllErrors(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.cx.v3beta1.TestError> values) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, errors_);
        onChanged();
      } else {
        errorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public Builder clearErrors() {
      if (errorsBuilder_ == null) {
        errors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        errorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public Builder removeErrors(int index) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.remove(index);
        onChanged();
      } else {
        errorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.TestError.Builder getErrorsBuilder(
        int index) {
      return getErrorsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.TestErrorOrBuilder getErrorsOrBuilder(
        int index) {
      if (errorsBuilder_ == null) {
        return errors_.get(index);  } else {
        return errorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.TestErrorOrBuilder> 
         getErrorsOrBuilderList() {
      if (errorsBuilder_ != null) {
        return errorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(errors_);
      }
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.TestError.Builder addErrorsBuilder() {
      return getErrorsFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.cx.v3beta1.TestError.getDefaultInstance());
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.TestError.Builder addErrorsBuilder(
        int index) {
      return getErrorsFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.cx.v3beta1.TestError.getDefaultInstance());
    }
    /**
     * <pre>
     * The test errors.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.TestError errors = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.TestError.Builder> 
         getErrorsBuilderList() {
      return getErrorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3beta1.TestError, com.google.cloud.dialogflow.cx.v3beta1.TestError.Builder, com.google.cloud.dialogflow.cx.v3beta1.TestErrorOrBuilder> 
        getErrorsFieldBuilder() {
      if (errorsBuilder_ == null) {
        errorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.TestError, com.google.cloud.dialogflow.cx.v3beta1.TestError.Builder, com.google.cloud.dialogflow.cx.v3beta1.TestErrorOrBuilder>(
                errors_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        errors_ = null;
      }
      return errorsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata)
  private static final com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunContinuousTestMetadata>
      PARSER = new com.google.protobuf.AbstractParser<RunContinuousTestMetadata>() {
    @java.lang.Override
    public RunContinuousTestMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<RunContinuousTestMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunContinuousTestMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.RunContinuousTestMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

