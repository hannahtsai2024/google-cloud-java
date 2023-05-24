// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/context.proto

package com.google.cloud.dialogflow.v2;

/**
 * <pre>
 * The request message for
 * [Contexts.CreateContext][google.cloud.dialogflow.v2.Contexts.CreateContext].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.CreateContextRequest}
 */
public final class CreateContextRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.CreateContextRequest)
    CreateContextRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateContextRequest.newBuilder() to construct.
  private CreateContextRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateContextRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateContextRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2.ContextProto.internal_static_google_cloud_dialogflow_v2_CreateContextRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ContextProto.internal_static_google_cloud_dialogflow_v2_CreateContextRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.CreateContextRequest.class, com.google.cloud.dialogflow.v2.CreateContextRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The session to create a context for.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or
   * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   * ID&gt;/sessions/&lt;Session ID&gt;`.
   * If `Environment ID` is not specified, we assume default 'draft'
   * environment. If `User ID` is not specified, we assume default '-' user.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The session to create a context for.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or
   * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   * ID&gt;/sessions/&lt;Session ID&gt;`.
   * If `Environment ID` is not specified, we assume default 'draft'
   * environment. If `User ID` is not specified, we assume default '-' user.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTEXT_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.v2.Context context_;
  /**
   * <pre>
   * Required. The context to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Context context = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the context field is set.
   */
  @java.lang.Override
  public boolean hasContext() {
    return context_ != null;
  }
  /**
   * <pre>
   * Required. The context to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Context context = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The context.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.Context getContext() {
    return context_ == null ? com.google.cloud.dialogflow.v2.Context.getDefaultInstance() : context_;
  }
  /**
   * <pre>
   * Required. The context to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Context context = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ContextOrBuilder getContextOrBuilder() {
    return context_ == null ? com.google.cloud.dialogflow.v2.Context.getDefaultInstance() : context_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (context_ != null) {
      output.writeMessage(2, getContext());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (context_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getContext());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.CreateContextRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.CreateContextRequest other = (com.google.cloud.dialogflow.v2.CreateContextRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasContext() != other.hasContext()) return false;
    if (hasContext()) {
      if (!getContext()
          .equals(other.getContext())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasContext()) {
      hash = (37 * hash) + CONTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getContext().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.CreateContextRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.CreateContextRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.CreateContextRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.CreateContextRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.CreateContextRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.CreateContextRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.CreateContextRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.CreateContextRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateContextRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateContextRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.CreateContextRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.CreateContextRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2.CreateContextRequest prototype) {
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
   * [Contexts.CreateContext][google.cloud.dialogflow.v2.Contexts.CreateContext].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.CreateContextRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.CreateContextRequest)
      com.google.cloud.dialogflow.v2.CreateContextRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2.ContextProto.internal_static_google_cloud_dialogflow_v2_CreateContextRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ContextProto.internal_static_google_cloud_dialogflow_v2_CreateContextRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.CreateContextRequest.class, com.google.cloud.dialogflow.v2.CreateContextRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.CreateContextRequest.newBuilder()
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
      parent_ = "";
      context_ = null;
      if (contextBuilder_ != null) {
        contextBuilder_.dispose();
        contextBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ContextProto.internal_static_google_cloud_dialogflow_v2_CreateContextRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateContextRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.CreateContextRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateContextRequest build() {
      com.google.cloud.dialogflow.v2.CreateContextRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateContextRequest buildPartial() {
      com.google.cloud.dialogflow.v2.CreateContextRequest result = new com.google.cloud.dialogflow.v2.CreateContextRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2.CreateContextRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.context_ = contextBuilder_ == null
            ? context_
            : contextBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2.CreateContextRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2.CreateContextRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.CreateContextRequest other) {
      if (other == com.google.cloud.dialogflow.v2.CreateContextRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasContext()) {
        mergeContext(other.getContext());
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getContextFieldBuilder().getBuilder(),
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The session to create a context for.
     * Format: `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or
     * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
     * ID&gt;/sessions/&lt;Session ID&gt;`.
     * If `Environment ID` is not specified, we assume default 'draft'
     * environment. If `User ID` is not specified, we assume default '-' user.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The session to create a context for.
     * Format: `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or
     * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
     * ID&gt;/sessions/&lt;Session ID&gt;`.
     * If `Environment ID` is not specified, we assume default 'draft'
     * environment. If `User ID` is not specified, we assume default '-' user.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The session to create a context for.
     * Format: `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or
     * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
     * ID&gt;/sessions/&lt;Session ID&gt;`.
     * If `Environment ID` is not specified, we assume default 'draft'
     * environment. If `User ID` is not specified, we assume default '-' user.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The session to create a context for.
     * Format: `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or
     * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
     * ID&gt;/sessions/&lt;Session ID&gt;`.
     * If `Environment ID` is not specified, we assume default 'draft'
     * environment. If `User ID` is not specified, we assume default '-' user.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The session to create a context for.
     * Format: `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;` or
     * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
     * ID&gt;/sessions/&lt;Session ID&gt;`.
     * If `Environment ID` is not specified, we assume default 'draft'
     * environment. If `User ID` is not specified, we assume default '-' user.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.v2.Context context_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2.Context, com.google.cloud.dialogflow.v2.Context.Builder, com.google.cloud.dialogflow.v2.ContextOrBuilder> contextBuilder_;
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Context context = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the context field is set.
     */
    public boolean hasContext() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Context context = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The context.
     */
    public com.google.cloud.dialogflow.v2.Context getContext() {
      if (contextBuilder_ == null) {
        return context_ == null ? com.google.cloud.dialogflow.v2.Context.getDefaultInstance() : context_;
      } else {
        return contextBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Context context = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setContext(com.google.cloud.dialogflow.v2.Context value) {
      if (contextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        context_ = value;
      } else {
        contextBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Context context = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setContext(
        com.google.cloud.dialogflow.v2.Context.Builder builderForValue) {
      if (contextBuilder_ == null) {
        context_ = builderForValue.build();
      } else {
        contextBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Context context = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeContext(com.google.cloud.dialogflow.v2.Context value) {
      if (contextBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          context_ != null &&
          context_ != com.google.cloud.dialogflow.v2.Context.getDefaultInstance()) {
          getContextBuilder().mergeFrom(value);
        } else {
          context_ = value;
        }
      } else {
        contextBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Context context = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearContext() {
      bitField0_ = (bitField0_ & ~0x00000002);
      context_ = null;
      if (contextBuilder_ != null) {
        contextBuilder_.dispose();
        contextBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Context context = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2.Context.Builder getContextBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getContextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Context context = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2.ContextOrBuilder getContextOrBuilder() {
      if (contextBuilder_ != null) {
        return contextBuilder_.getMessageOrBuilder();
      } else {
        return context_ == null ?
            com.google.cloud.dialogflow.v2.Context.getDefaultInstance() : context_;
      }
    }
    /**
     * <pre>
     * Required. The context to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Context context = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2.Context, com.google.cloud.dialogflow.v2.Context.Builder, com.google.cloud.dialogflow.v2.ContextOrBuilder> 
        getContextFieldBuilder() {
      if (contextBuilder_ == null) {
        contextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.Context, com.google.cloud.dialogflow.v2.Context.Builder, com.google.cloud.dialogflow.v2.ContextOrBuilder>(
                getContext(),
                getParentForChildren(),
                isClean());
        context_ = null;
      }
      return contextBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.CreateContextRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.CreateContextRequest)
  private static final com.google.cloud.dialogflow.v2.CreateContextRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.CreateContextRequest();
  }

  public static com.google.cloud.dialogflow.v2.CreateContextRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateContextRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateContextRequest>() {
    @java.lang.Override
    public CreateContextRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateContextRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateContextRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.CreateContextRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

