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
// source: google/cloud/asset/v1/assets.proto

package com.google.cloud.asset.v1;

/**
 *
 *
 * <pre>
 * Represents the detailed state of an entity under analysis, such as a
 * resource, an identity or an access.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.IamPolicyAnalysisState}
 */
public final class IamPolicyAnalysisState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.IamPolicyAnalysisState)
    IamPolicyAnalysisStateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use IamPolicyAnalysisState.newBuilder() to construct.
  private IamPolicyAnalysisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IamPolicyAnalysisState() {
    code_ = 0;
    cause_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IamPolicyAnalysisState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private IamPolicyAnalysisState(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8:
            {
              int rawValue = input.readEnum();

              code_ = rawValue;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              cause_ = s;
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.asset.v1.AssetProto
        .internal_static_google_cloud_asset_v1_IamPolicyAnalysisState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetProto
        .internal_static_google_cloud_asset_v1_IamPolicyAnalysisState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.IamPolicyAnalysisState.class,
            com.google.cloud.asset.v1.IamPolicyAnalysisState.Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   *
   *
   * <pre>
   * The Google standard error code that best describes the state.
   * For example:
   * - OK means the analysis on this entity has been successfully finished;
   * - PERMISSION_DENIED means an access denied error is encountered;
   * - DEADLINE_EXCEEDED means the analysis on this entity hasn't been started
   * in time;
   * </pre>
   *
   * <code>.google.rpc.Code code = 1;</code>
   *
   * @return The enum numeric value on the wire for code.
   */
  @java.lang.Override
  public int getCodeValue() {
    return code_;
  }
  /**
   *
   *
   * <pre>
   * The Google standard error code that best describes the state.
   * For example:
   * - OK means the analysis on this entity has been successfully finished;
   * - PERMISSION_DENIED means an access denied error is encountered;
   * - DEADLINE_EXCEEDED means the analysis on this entity hasn't been started
   * in time;
   * </pre>
   *
   * <code>.google.rpc.Code code = 1;</code>
   *
   * @return The code.
   */
  @java.lang.Override
  public com.google.rpc.Code getCode() {
    @SuppressWarnings("deprecation")
    com.google.rpc.Code result = com.google.rpc.Code.valueOf(code_);
    return result == null ? com.google.rpc.Code.UNRECOGNIZED : result;
  }

  public static final int CAUSE_FIELD_NUMBER = 2;
  private volatile java.lang.Object cause_;
  /**
   *
   *
   * <pre>
   * The human-readable description of the cause of failure.
   * </pre>
   *
   * <code>string cause = 2;</code>
   *
   * @return The cause.
   */
  @java.lang.Override
  public java.lang.String getCause() {
    java.lang.Object ref = cause_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cause_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The human-readable description of the cause of failure.
   * </pre>
   *
   * <code>string cause = 2;</code>
   *
   * @return The bytes for cause.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCauseBytes() {
    java.lang.Object ref = cause_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      cause_ = b;
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
    if (code_ != com.google.rpc.Code.OK.getNumber()) {
      output.writeEnum(1, code_);
    }
    if (!getCauseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cause_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != com.google.rpc.Code.OK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, code_);
    }
    if (!getCauseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cause_);
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
    if (!(obj instanceof com.google.cloud.asset.v1.IamPolicyAnalysisState)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.IamPolicyAnalysisState other =
        (com.google.cloud.asset.v1.IamPolicyAnalysisState) obj;

    if (code_ != other.code_) return false;
    if (!getCause().equals(other.getCause())) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + code_;
    hash = (37 * hash) + CAUSE_FIELD_NUMBER;
    hash = (53 * hash) + getCause().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.IamPolicyAnalysisState parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.IamPolicyAnalysisState parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.IamPolicyAnalysisState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.IamPolicyAnalysisState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.IamPolicyAnalysisState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.IamPolicyAnalysisState parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.IamPolicyAnalysisState parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.IamPolicyAnalysisState parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.IamPolicyAnalysisState parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.IamPolicyAnalysisState parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.IamPolicyAnalysisState parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.IamPolicyAnalysisState parseFrom(
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

  public static Builder newBuilder(com.google.cloud.asset.v1.IamPolicyAnalysisState prototype) {
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
   * Represents the detailed state of an entity under analysis, such as a
   * resource, an identity or an access.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.IamPolicyAnalysisState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.IamPolicyAnalysisState)
      com.google.cloud.asset.v1.IamPolicyAnalysisStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1.AssetProto
          .internal_static_google_cloud_asset_v1_IamPolicyAnalysisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetProto
          .internal_static_google_cloud_asset_v1_IamPolicyAnalysisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.IamPolicyAnalysisState.class,
              com.google.cloud.asset.v1.IamPolicyAnalysisState.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.IamPolicyAnalysisState.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      code_ = 0;

      cause_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetProto
          .internal_static_google_cloud_asset_v1_IamPolicyAnalysisState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.IamPolicyAnalysisState getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.IamPolicyAnalysisState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.IamPolicyAnalysisState build() {
      com.google.cloud.asset.v1.IamPolicyAnalysisState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.IamPolicyAnalysisState buildPartial() {
      com.google.cloud.asset.v1.IamPolicyAnalysisState result =
          new com.google.cloud.asset.v1.IamPolicyAnalysisState(this);
      result.code_ = code_;
      result.cause_ = cause_;
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
      if (other instanceof com.google.cloud.asset.v1.IamPolicyAnalysisState) {
        return mergeFrom((com.google.cloud.asset.v1.IamPolicyAnalysisState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.IamPolicyAnalysisState other) {
      if (other == com.google.cloud.asset.v1.IamPolicyAnalysisState.getDefaultInstance())
        return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      if (!other.getCause().isEmpty()) {
        cause_ = other.cause_;
        onChanged();
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
      com.google.cloud.asset.v1.IamPolicyAnalysisState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.asset.v1.IamPolicyAnalysisState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int code_ = 0;
    /**
     *
     *
     * <pre>
     * The Google standard error code that best describes the state.
     * For example:
     * - OK means the analysis on this entity has been successfully finished;
     * - PERMISSION_DENIED means an access denied error is encountered;
     * - DEADLINE_EXCEEDED means the analysis on this entity hasn't been started
     * in time;
     * </pre>
     *
     * <code>.google.rpc.Code code = 1;</code>
     *
     * @return The enum numeric value on the wire for code.
     */
    @java.lang.Override
    public int getCodeValue() {
      return code_;
    }
    /**
     *
     *
     * <pre>
     * The Google standard error code that best describes the state.
     * For example:
     * - OK means the analysis on this entity has been successfully finished;
     * - PERMISSION_DENIED means an access denied error is encountered;
     * - DEADLINE_EXCEEDED means the analysis on this entity hasn't been started
     * in time;
     * </pre>
     *
     * <code>.google.rpc.Code code = 1;</code>
     *
     * @param value The enum numeric value on the wire for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeValue(int value) {

      code_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google standard error code that best describes the state.
     * For example:
     * - OK means the analysis on this entity has been successfully finished;
     * - PERMISSION_DENIED means an access denied error is encountered;
     * - DEADLINE_EXCEEDED means the analysis on this entity hasn't been started
     * in time;
     * </pre>
     *
     * <code>.google.rpc.Code code = 1;</code>
     *
     * @return The code.
     */
    @java.lang.Override
    public com.google.rpc.Code getCode() {
      @SuppressWarnings("deprecation")
      com.google.rpc.Code result = com.google.rpc.Code.valueOf(code_);
      return result == null ? com.google.rpc.Code.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The Google standard error code that best describes the state.
     * For example:
     * - OK means the analysis on this entity has been successfully finished;
     * - PERMISSION_DENIED means an access denied error is encountered;
     * - DEADLINE_EXCEEDED means the analysis on this entity hasn't been started
     * in time;
     * </pre>
     *
     * <code>.google.rpc.Code code = 1;</code>
     *
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(com.google.rpc.Code value) {
      if (value == null) {
        throw new NullPointerException();
      }

      code_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Google standard error code that best describes the state.
     * For example:
     * - OK means the analysis on this entity has been successfully finished;
     * - PERMISSION_DENIED means an access denied error is encountered;
     * - DEADLINE_EXCEEDED means the analysis on this entity hasn't been started
     * in time;
     * </pre>
     *
     * <code>.google.rpc.Code code = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCode() {

      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object cause_ = "";
    /**
     *
     *
     * <pre>
     * The human-readable description of the cause of failure.
     * </pre>
     *
     * <code>string cause = 2;</code>
     *
     * @return The cause.
     */
    public java.lang.String getCause() {
      java.lang.Object ref = cause_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cause_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The human-readable description of the cause of failure.
     * </pre>
     *
     * <code>string cause = 2;</code>
     *
     * @return The bytes for cause.
     */
    public com.google.protobuf.ByteString getCauseBytes() {
      java.lang.Object ref = cause_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        cause_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The human-readable description of the cause of failure.
     * </pre>
     *
     * <code>string cause = 2;</code>
     *
     * @param value The cause to set.
     * @return This builder for chaining.
     */
    public Builder setCause(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      cause_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The human-readable description of the cause of failure.
     * </pre>
     *
     * <code>string cause = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCause() {

      cause_ = getDefaultInstance().getCause();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The human-readable description of the cause of failure.
     * </pre>
     *
     * <code>string cause = 2;</code>
     *
     * @param value The bytes for cause to set.
     * @return This builder for chaining.
     */
    public Builder setCauseBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      cause_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.IamPolicyAnalysisState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.IamPolicyAnalysisState)
  private static final com.google.cloud.asset.v1.IamPolicyAnalysisState DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.IamPolicyAnalysisState();
  }

  public static com.google.cloud.asset.v1.IamPolicyAnalysisState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IamPolicyAnalysisState> PARSER =
      new com.google.protobuf.AbstractParser<IamPolicyAnalysisState>() {
        @java.lang.Override
        public IamPolicyAnalysisState parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new IamPolicyAnalysisState(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<IamPolicyAnalysisState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IamPolicyAnalysisState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.IamPolicyAnalysisState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
