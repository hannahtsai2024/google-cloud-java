/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/dialogflow/v2beta1/document.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 *
 *
 * <pre>
 * Response message for [Documents.ImportDocuments][google.cloud.dialogflow.v2beta1.Documents.ImportDocuments].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.ImportDocumentsResponse}
 */
public final class ImportDocumentsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.ImportDocumentsResponse)
    ImportDocumentsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImportDocumentsResponse.newBuilder() to construct.
  private ImportDocumentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportDocumentsResponse() {
    warnings_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportDocumentsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ImportDocumentsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                warnings_ = new java.util.ArrayList<com.google.rpc.Status>();
                mutable_bitField0_ |= 0x00000001;
              }
              warnings_.add(input.readMessage(com.google.rpc.Status.parser(), extensionRegistry));
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        warnings_ = java.util.Collections.unmodifiableList(warnings_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.DocumentProto
        .internal_static_google_cloud_dialogflow_v2beta1_ImportDocumentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.DocumentProto
        .internal_static_google_cloud_dialogflow_v2beta1_ImportDocumentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse.class,
            com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse.Builder.class);
  }

  public static final int WARNINGS_FIELD_NUMBER = 1;
  private java.util.List<com.google.rpc.Status> warnings_;
  /**
   *
   *
   * <pre>
   * Includes details about skipped documents or any other warnings.
   * </pre>
   *
   * <code>repeated .google.rpc.Status warnings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.rpc.Status> getWarningsList() {
    return warnings_;
  }
  /**
   *
   *
   * <pre>
   * Includes details about skipped documents or any other warnings.
   * </pre>
   *
   * <code>repeated .google.rpc.Status warnings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.rpc.StatusOrBuilder> getWarningsOrBuilderList() {
    return warnings_;
  }
  /**
   *
   *
   * <pre>
   * Includes details about skipped documents or any other warnings.
   * </pre>
   *
   * <code>repeated .google.rpc.Status warnings = 1;</code>
   */
  @java.lang.Override
  public int getWarningsCount() {
    return warnings_.size();
  }
  /**
   *
   *
   * <pre>
   * Includes details about skipped documents or any other warnings.
   * </pre>
   *
   * <code>repeated .google.rpc.Status warnings = 1;</code>
   */
  @java.lang.Override
  public com.google.rpc.Status getWarnings(int index) {
    return warnings_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Includes details about skipped documents or any other warnings.
   * </pre>
   *
   * <code>repeated .google.rpc.Status warnings = 1;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getWarningsOrBuilder(int index) {
    return warnings_.get(index);
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
    for (int i = 0; i < warnings_.size(); i++) {
      output.writeMessage(1, warnings_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < warnings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, warnings_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse other =
        (com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse) obj;

    if (!getWarningsList().equals(other.getWarningsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getWarningsCount() > 0) {
      hash = (37 * hash) + WARNINGS_FIELD_NUMBER;
      hash = (53 * hash) + getWarningsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse prototype) {
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
   * Response message for [Documents.ImportDocuments][google.cloud.dialogflow.v2beta1.Documents.ImportDocuments].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.ImportDocumentsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.ImportDocumentsResponse)
      com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.DocumentProto
          .internal_static_google_cloud_dialogflow_v2beta1_ImportDocumentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.DocumentProto
          .internal_static_google_cloud_dialogflow_v2beta1_ImportDocumentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse.class,
              com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getWarningsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (warningsBuilder_ == null) {
        warnings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        warningsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.DocumentProto
          .internal_static_google_cloud_dialogflow_v2beta1_ImportDocumentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse build() {
      com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse buildPartial() {
      com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse result =
          new com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse(this);
      int from_bitField0_ = bitField0_;
      if (warningsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          warnings_ = java.util.Collections.unmodifiableList(warnings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.warnings_ = warnings_;
      } else {
        result.warnings_ = warningsBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse other) {
      if (other == com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse.getDefaultInstance())
        return this;
      if (warningsBuilder_ == null) {
        if (!other.warnings_.isEmpty()) {
          if (warnings_.isEmpty()) {
            warnings_ = other.warnings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWarningsIsMutable();
            warnings_.addAll(other.warnings_);
          }
          onChanged();
        }
      } else {
        if (!other.warnings_.isEmpty()) {
          if (warningsBuilder_.isEmpty()) {
            warningsBuilder_.dispose();
            warningsBuilder_ = null;
            warnings_ = other.warnings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            warningsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getWarningsFieldBuilder()
                    : null;
          } else {
            warningsBuilder_.addAllMessages(other.warnings_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.rpc.Status> warnings_ = java.util.Collections.emptyList();

    private void ensureWarningsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        warnings_ = new java.util.ArrayList<com.google.rpc.Status>(warnings_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        warningsBuilder_;

    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public java.util.List<com.google.rpc.Status> getWarningsList() {
      if (warningsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(warnings_);
      } else {
        return warningsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public int getWarningsCount() {
      if (warningsBuilder_ == null) {
        return warnings_.size();
      } else {
        return warningsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public com.google.rpc.Status getWarnings(int index) {
      if (warningsBuilder_ == null) {
        return warnings_.get(index);
      } else {
        return warningsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public Builder setWarnings(int index, com.google.rpc.Status value) {
      if (warningsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWarningsIsMutable();
        warnings_.set(index, value);
        onChanged();
      } else {
        warningsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public Builder setWarnings(int index, com.google.rpc.Status.Builder builderForValue) {
      if (warningsBuilder_ == null) {
        ensureWarningsIsMutable();
        warnings_.set(index, builderForValue.build());
        onChanged();
      } else {
        warningsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public Builder addWarnings(com.google.rpc.Status value) {
      if (warningsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWarningsIsMutable();
        warnings_.add(value);
        onChanged();
      } else {
        warningsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public Builder addWarnings(int index, com.google.rpc.Status value) {
      if (warningsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWarningsIsMutable();
        warnings_.add(index, value);
        onChanged();
      } else {
        warningsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public Builder addWarnings(com.google.rpc.Status.Builder builderForValue) {
      if (warningsBuilder_ == null) {
        ensureWarningsIsMutable();
        warnings_.add(builderForValue.build());
        onChanged();
      } else {
        warningsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public Builder addWarnings(int index, com.google.rpc.Status.Builder builderForValue) {
      if (warningsBuilder_ == null) {
        ensureWarningsIsMutable();
        warnings_.add(index, builderForValue.build());
        onChanged();
      } else {
        warningsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public Builder addAllWarnings(java.lang.Iterable<? extends com.google.rpc.Status> values) {
      if (warningsBuilder_ == null) {
        ensureWarningsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, warnings_);
        onChanged();
      } else {
        warningsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public Builder clearWarnings() {
      if (warningsBuilder_ == null) {
        warnings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        warningsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public Builder removeWarnings(int index) {
      if (warningsBuilder_ == null) {
        ensureWarningsIsMutable();
        warnings_.remove(index);
        onChanged();
      } else {
        warningsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public com.google.rpc.Status.Builder getWarningsBuilder(int index) {
      return getWarningsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public com.google.rpc.StatusOrBuilder getWarningsOrBuilder(int index) {
      if (warningsBuilder_ == null) {
        return warnings_.get(index);
      } else {
        return warningsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public java.util.List<? extends com.google.rpc.StatusOrBuilder> getWarningsOrBuilderList() {
      if (warningsBuilder_ != null) {
        return warningsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(warnings_);
      }
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public com.google.rpc.Status.Builder addWarningsBuilder() {
      return getWarningsFieldBuilder().addBuilder(com.google.rpc.Status.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public com.google.rpc.Status.Builder addWarningsBuilder(int index) {
      return getWarningsFieldBuilder()
          .addBuilder(index, com.google.rpc.Status.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Includes details about skipped documents or any other warnings.
     * </pre>
     *
     * <code>repeated .google.rpc.Status warnings = 1;</code>
     */
    public java.util.List<com.google.rpc.Status.Builder> getWarningsBuilderList() {
      return getWarningsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        getWarningsFieldBuilder() {
      if (warningsBuilder_ == null) {
        warningsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.rpc.Status,
                com.google.rpc.Status.Builder,
                com.google.rpc.StatusOrBuilder>(
                warnings_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        warnings_ = null;
      }
      return warningsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.ImportDocumentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.ImportDocumentsResponse)
  private static final com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse();
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportDocumentsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ImportDocumentsResponse>() {
        @java.lang.Override
        public ImportDocumentsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ImportDocumentsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ImportDocumentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportDocumentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.ImportDocumentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
