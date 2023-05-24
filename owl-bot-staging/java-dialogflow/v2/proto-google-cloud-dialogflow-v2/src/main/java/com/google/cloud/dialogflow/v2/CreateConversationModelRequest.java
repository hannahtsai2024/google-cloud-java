// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/conversation_model.proto

package com.google.cloud.dialogflow.v2;

/**
 * <pre>
 * The request message for
 * [ConversationModels.CreateConversationModel][google.cloud.dialogflow.v2.ConversationModels.CreateConversationModel]
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.CreateConversationModelRequest}
 */
public final class CreateConversationModelRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.CreateConversationModelRequest)
    CreateConversationModelRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateConversationModelRequest.newBuilder() to construct.
  private CreateConversationModelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateConversationModelRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateConversationModelRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2.ConversationModelProto.internal_static_google_cloud_dialogflow_v2_CreateConversationModelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationModelProto.internal_static_google_cloud_dialogflow_v2_CreateConversationModelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.CreateConversationModelRequest.class, com.google.cloud.dialogflow.v2.CreateConversationModelRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * The project to create conversation model for. Format:
   * `projects/&lt;Project ID&gt;`
   * </pre>
   *
   * <code>string parent = 1;</code>
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
   * The project to create conversation model for. Format:
   * `projects/&lt;Project ID&gt;`
   * </pre>
   *
   * <code>string parent = 1;</code>
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

  public static final int CONVERSATION_MODEL_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.v2.ConversationModel conversationModel_;
  /**
   * <pre>
   * Required. The conversation model to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.ConversationModel conversation_model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the conversationModel field is set.
   */
  @java.lang.Override
  public boolean hasConversationModel() {
    return conversationModel_ != null;
  }
  /**
   * <pre>
   * Required. The conversation model to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.ConversationModel conversation_model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The conversationModel.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ConversationModel getConversationModel() {
    return conversationModel_ == null ? com.google.cloud.dialogflow.v2.ConversationModel.getDefaultInstance() : conversationModel_;
  }
  /**
   * <pre>
   * Required. The conversation model to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.ConversationModel conversation_model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ConversationModelOrBuilder getConversationModelOrBuilder() {
    return conversationModel_ == null ? com.google.cloud.dialogflow.v2.ConversationModel.getDefaultInstance() : conversationModel_;
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
    if (conversationModel_ != null) {
      output.writeMessage(2, getConversationModel());
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
    if (conversationModel_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConversationModel());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.CreateConversationModelRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.CreateConversationModelRequest other = (com.google.cloud.dialogflow.v2.CreateConversationModelRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasConversationModel() != other.hasConversationModel()) return false;
    if (hasConversationModel()) {
      if (!getConversationModel()
          .equals(other.getConversationModel())) return false;
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
    if (hasConversationModel()) {
      hash = (37 * hash) + CONVERSATION_MODEL_FIELD_NUMBER;
      hash = (53 * hash) + getConversationModel().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.CreateConversationModelRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.CreateConversationModelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.CreateConversationModelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.CreateConversationModelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.CreateConversationModelRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.CreateConversationModelRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.CreateConversationModelRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.CreateConversationModelRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.CreateConversationModelRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2.CreateConversationModelRequest prototype) {
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
   * [ConversationModels.CreateConversationModel][google.cloud.dialogflow.v2.ConversationModels.CreateConversationModel]
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.CreateConversationModelRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.CreateConversationModelRequest)
      com.google.cloud.dialogflow.v2.CreateConversationModelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto.internal_static_google_cloud_dialogflow_v2_CreateConversationModelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto.internal_static_google_cloud_dialogflow_v2_CreateConversationModelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.CreateConversationModelRequest.class, com.google.cloud.dialogflow.v2.CreateConversationModelRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.CreateConversationModelRequest.newBuilder()
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
      conversationModel_ = null;
      if (conversationModelBuilder_ != null) {
        conversationModelBuilder_.dispose();
        conversationModelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationModelProto.internal_static_google_cloud_dialogflow_v2_CreateConversationModelRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateConversationModelRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.CreateConversationModelRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateConversationModelRequest build() {
      com.google.cloud.dialogflow.v2.CreateConversationModelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.CreateConversationModelRequest buildPartial() {
      com.google.cloud.dialogflow.v2.CreateConversationModelRequest result = new com.google.cloud.dialogflow.v2.CreateConversationModelRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2.CreateConversationModelRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.conversationModel_ = conversationModelBuilder_ == null
            ? conversationModel_
            : conversationModelBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2.CreateConversationModelRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2.CreateConversationModelRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.CreateConversationModelRequest other) {
      if (other == com.google.cloud.dialogflow.v2.CreateConversationModelRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasConversationModel()) {
        mergeConversationModel(other.getConversationModel());
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
                  getConversationModelFieldBuilder().getBuilder(),
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
     * The project to create conversation model for. Format:
     * `projects/&lt;Project ID&gt;`
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The project to create conversation model for. Format:
     * `projects/&lt;Project ID&gt;`
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The project to create conversation model for. Format:
     * `projects/&lt;Project ID&gt;`
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The project to create conversation model for. Format:
     * `projects/&lt;Project ID&gt;`
     * </pre>
     *
     * <code>string parent = 1;</code>
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
     * The project to create conversation model for. Format:
     * `projects/&lt;Project ID&gt;`
     * </pre>
     *
     * <code>string parent = 1;</code>
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

    private com.google.cloud.dialogflow.v2.ConversationModel conversationModel_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2.ConversationModel, com.google.cloud.dialogflow.v2.ConversationModel.Builder, com.google.cloud.dialogflow.v2.ConversationModelOrBuilder> conversationModelBuilder_;
    /**
     * <pre>
     * Required. The conversation model to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.ConversationModel conversation_model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the conversationModel field is set.
     */
    public boolean hasConversationModel() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The conversation model to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.ConversationModel conversation_model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The conversationModel.
     */
    public com.google.cloud.dialogflow.v2.ConversationModel getConversationModel() {
      if (conversationModelBuilder_ == null) {
        return conversationModel_ == null ? com.google.cloud.dialogflow.v2.ConversationModel.getDefaultInstance() : conversationModel_;
      } else {
        return conversationModelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The conversation model to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.ConversationModel conversation_model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setConversationModel(com.google.cloud.dialogflow.v2.ConversationModel value) {
      if (conversationModelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conversationModel_ = value;
      } else {
        conversationModelBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The conversation model to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.ConversationModel conversation_model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setConversationModel(
        com.google.cloud.dialogflow.v2.ConversationModel.Builder builderForValue) {
      if (conversationModelBuilder_ == null) {
        conversationModel_ = builderForValue.build();
      } else {
        conversationModelBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The conversation model to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.ConversationModel conversation_model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeConversationModel(com.google.cloud.dialogflow.v2.ConversationModel value) {
      if (conversationModelBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          conversationModel_ != null &&
          conversationModel_ != com.google.cloud.dialogflow.v2.ConversationModel.getDefaultInstance()) {
          getConversationModelBuilder().mergeFrom(value);
        } else {
          conversationModel_ = value;
        }
      } else {
        conversationModelBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The conversation model to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.ConversationModel conversation_model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearConversationModel() {
      bitField0_ = (bitField0_ & ~0x00000002);
      conversationModel_ = null;
      if (conversationModelBuilder_ != null) {
        conversationModelBuilder_.dispose();
        conversationModelBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The conversation model to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.ConversationModel conversation_model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2.ConversationModel.Builder getConversationModelBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getConversationModelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The conversation model to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.ConversationModel conversation_model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.dialogflow.v2.ConversationModelOrBuilder getConversationModelOrBuilder() {
      if (conversationModelBuilder_ != null) {
        return conversationModelBuilder_.getMessageOrBuilder();
      } else {
        return conversationModel_ == null ?
            com.google.cloud.dialogflow.v2.ConversationModel.getDefaultInstance() : conversationModel_;
      }
    }
    /**
     * <pre>
     * Required. The conversation model to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.ConversationModel conversation_model = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2.ConversationModel, com.google.cloud.dialogflow.v2.ConversationModel.Builder, com.google.cloud.dialogflow.v2.ConversationModelOrBuilder> 
        getConversationModelFieldBuilder() {
      if (conversationModelBuilder_ == null) {
        conversationModelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.ConversationModel, com.google.cloud.dialogflow.v2.ConversationModel.Builder, com.google.cloud.dialogflow.v2.ConversationModelOrBuilder>(
                getConversationModel(),
                getParentForChildren(),
                isClean());
        conversationModel_ = null;
      }
      return conversationModelBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.CreateConversationModelRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.CreateConversationModelRequest)
  private static final com.google.cloud.dialogflow.v2.CreateConversationModelRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.CreateConversationModelRequest();
  }

  public static com.google.cloud.dialogflow.v2.CreateConversationModelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateConversationModelRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateConversationModelRequest>() {
    @java.lang.Override
    public CreateConversationModelRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateConversationModelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateConversationModelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.CreateConversationModelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

