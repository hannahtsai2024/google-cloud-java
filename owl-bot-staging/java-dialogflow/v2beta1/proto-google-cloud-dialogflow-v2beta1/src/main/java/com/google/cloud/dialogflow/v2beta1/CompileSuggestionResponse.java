// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/participant.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 * <pre>
 * The response message for
 * [Participants.CompileSuggestion][google.cloud.dialogflow.v2beta1.Participants.CompileSuggestion].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.CompileSuggestionResponse}
 */
@java.lang.Deprecated public final class CompileSuggestionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.CompileSuggestionResponse)
    CompileSuggestionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompileSuggestionResponse.newBuilder() to construct.
  private CompileSuggestionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompileSuggestionResponse() {
    latestMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompileSuggestionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.ParticipantProto.internal_static_google_cloud_dialogflow_v2beta1_CompileSuggestionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.ParticipantProto.internal_static_google_cloud_dialogflow_v2beta1_CompileSuggestionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse.class, com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse.Builder.class);
  }

  public static final int SUGGESTION_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.v2beta1.Suggestion suggestion_;
  /**
   * <pre>
   * The compiled suggestion.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Suggestion suggestion = 1;</code>
   * @return Whether the suggestion field is set.
   */
  @java.lang.Override
  public boolean hasSuggestion() {
    return suggestion_ != null;
  }
  /**
   * <pre>
   * The compiled suggestion.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Suggestion suggestion = 1;</code>
   * @return The suggestion.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.Suggestion getSuggestion() {
    return suggestion_ == null ? com.google.cloud.dialogflow.v2beta1.Suggestion.getDefaultInstance() : suggestion_;
  }
  /**
   * <pre>
   * The compiled suggestion.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Suggestion suggestion = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.SuggestionOrBuilder getSuggestionOrBuilder() {
    return suggestion_ == null ? com.google.cloud.dialogflow.v2beta1.Suggestion.getDefaultInstance() : suggestion_;
  }

  public static final int LATEST_MESSAGE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object latestMessage_ = "";
  /**
   * <pre>
   * The name of the latest conversation message used to compile
   * suggestion for.
   *
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>string latest_message = 2;</code>
   * @return The latestMessage.
   */
  @java.lang.Override
  public java.lang.String getLatestMessage() {
    java.lang.Object ref = latestMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      latestMessage_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the latest conversation message used to compile
   * suggestion for.
   *
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>string latest_message = 2;</code>
   * @return The bytes for latestMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLatestMessageBytes() {
    java.lang.Object ref = latestMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      latestMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTEXT_SIZE_FIELD_NUMBER = 3;
  private int contextSize_ = 0;
  /**
   * <pre>
   * Number of messages prior to and including
   * [latest_message][google.cloud.dialogflow.v2beta1.CompileSuggestionResponse.latest_message]
   * to compile the suggestion. It may be smaller than the
   * [CompileSuggestionRequest.context_size][google.cloud.dialogflow.v2beta1.CompileSuggestionRequest.context_size]
   * field in the request if there aren't that many messages in the
   * conversation.
   * </pre>
   *
   * <code>int32 context_size = 3;</code>
   * @return The contextSize.
   */
  @java.lang.Override
  public int getContextSize() {
    return contextSize_;
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
    if (suggestion_ != null) {
      output.writeMessage(1, getSuggestion());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(latestMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, latestMessage_);
    }
    if (contextSize_ != 0) {
      output.writeInt32(3, contextSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (suggestion_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSuggestion());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(latestMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, latestMessage_);
    }
    if (contextSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, contextSize_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse other = (com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse) obj;

    if (hasSuggestion() != other.hasSuggestion()) return false;
    if (hasSuggestion()) {
      if (!getSuggestion()
          .equals(other.getSuggestion())) return false;
    }
    if (!getLatestMessage()
        .equals(other.getLatestMessage())) return false;
    if (getContextSize()
        != other.getContextSize()) return false;
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
    if (hasSuggestion()) {
      hash = (37 * hash) + SUGGESTION_FIELD_NUMBER;
      hash = (53 * hash) + getSuggestion().hashCode();
    }
    hash = (37 * hash) + LATEST_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getLatestMessage().hashCode();
    hash = (37 * hash) + CONTEXT_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getContextSize();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse prototype) {
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
   * The response message for
   * [Participants.CompileSuggestion][google.cloud.dialogflow.v2beta1.Participants.CompileSuggestion].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.CompileSuggestionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.CompileSuggestionResponse)
      com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto.internal_static_google_cloud_dialogflow_v2beta1_CompileSuggestionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto.internal_static_google_cloud_dialogflow_v2beta1_CompileSuggestionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse.class, com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse.newBuilder()
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
      suggestion_ = null;
      if (suggestionBuilder_ != null) {
        suggestionBuilder_.dispose();
        suggestionBuilder_ = null;
      }
      latestMessage_ = "";
      contextSize_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto.internal_static_google_cloud_dialogflow_v2beta1_CompileSuggestionResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse build() {
      com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse buildPartial() {
      com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse result = new com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.suggestion_ = suggestionBuilder_ == null
            ? suggestion_
            : suggestionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.latestMessage_ = latestMessage_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.contextSize_ = contextSize_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse other) {
      if (other == com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse.getDefaultInstance()) return this;
      if (other.hasSuggestion()) {
        mergeSuggestion(other.getSuggestion());
      }
      if (!other.getLatestMessage().isEmpty()) {
        latestMessage_ = other.latestMessage_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getContextSize() != 0) {
        setContextSize(other.getContextSize());
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
                  getSuggestionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              latestMessage_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              contextSize_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.google.cloud.dialogflow.v2beta1.Suggestion suggestion_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Suggestion, com.google.cloud.dialogflow.v2beta1.Suggestion.Builder, com.google.cloud.dialogflow.v2beta1.SuggestionOrBuilder> suggestionBuilder_;
    /**
     * <pre>
     * The compiled suggestion.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Suggestion suggestion = 1;</code>
     * @return Whether the suggestion field is set.
     */
    public boolean hasSuggestion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The compiled suggestion.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Suggestion suggestion = 1;</code>
     * @return The suggestion.
     */
    public com.google.cloud.dialogflow.v2beta1.Suggestion getSuggestion() {
      if (suggestionBuilder_ == null) {
        return suggestion_ == null ? com.google.cloud.dialogflow.v2beta1.Suggestion.getDefaultInstance() : suggestion_;
      } else {
        return suggestionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The compiled suggestion.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Suggestion suggestion = 1;</code>
     */
    public Builder setSuggestion(com.google.cloud.dialogflow.v2beta1.Suggestion value) {
      if (suggestionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        suggestion_ = value;
      } else {
        suggestionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The compiled suggestion.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Suggestion suggestion = 1;</code>
     */
    public Builder setSuggestion(
        com.google.cloud.dialogflow.v2beta1.Suggestion.Builder builderForValue) {
      if (suggestionBuilder_ == null) {
        suggestion_ = builderForValue.build();
      } else {
        suggestionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The compiled suggestion.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Suggestion suggestion = 1;</code>
     */
    public Builder mergeSuggestion(com.google.cloud.dialogflow.v2beta1.Suggestion value) {
      if (suggestionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          suggestion_ != null &&
          suggestion_ != com.google.cloud.dialogflow.v2beta1.Suggestion.getDefaultInstance()) {
          getSuggestionBuilder().mergeFrom(value);
        } else {
          suggestion_ = value;
        }
      } else {
        suggestionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The compiled suggestion.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Suggestion suggestion = 1;</code>
     */
    public Builder clearSuggestion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      suggestion_ = null;
      if (suggestionBuilder_ != null) {
        suggestionBuilder_.dispose();
        suggestionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The compiled suggestion.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Suggestion suggestion = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Suggestion.Builder getSuggestionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSuggestionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The compiled suggestion.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Suggestion suggestion = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.SuggestionOrBuilder getSuggestionOrBuilder() {
      if (suggestionBuilder_ != null) {
        return suggestionBuilder_.getMessageOrBuilder();
      } else {
        return suggestion_ == null ?
            com.google.cloud.dialogflow.v2beta1.Suggestion.getDefaultInstance() : suggestion_;
      }
    }
    /**
     * <pre>
     * The compiled suggestion.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Suggestion suggestion = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.v2beta1.Suggestion, com.google.cloud.dialogflow.v2beta1.Suggestion.Builder, com.google.cloud.dialogflow.v2beta1.SuggestionOrBuilder> 
        getSuggestionFieldBuilder() {
      if (suggestionBuilder_ == null) {
        suggestionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.Suggestion, com.google.cloud.dialogflow.v2beta1.Suggestion.Builder, com.google.cloud.dialogflow.v2beta1.SuggestionOrBuilder>(
                getSuggestion(),
                getParentForChildren(),
                isClean());
        suggestion_ = null;
      }
      return suggestionBuilder_;
    }

    private java.lang.Object latestMessage_ = "";
    /**
     * <pre>
     * The name of the latest conversation message used to compile
     * suggestion for.
     *
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
     * </pre>
     *
     * <code>string latest_message = 2;</code>
     * @return The latestMessage.
     */
    public java.lang.String getLatestMessage() {
      java.lang.Object ref = latestMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        latestMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the latest conversation message used to compile
     * suggestion for.
     *
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
     * </pre>
     *
     * <code>string latest_message = 2;</code>
     * @return The bytes for latestMessage.
     */
    public com.google.protobuf.ByteString
        getLatestMessageBytes() {
      java.lang.Object ref = latestMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        latestMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the latest conversation message used to compile
     * suggestion for.
     *
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
     * </pre>
     *
     * <code>string latest_message = 2;</code>
     * @param value The latestMessage to set.
     * @return This builder for chaining.
     */
    public Builder setLatestMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      latestMessage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the latest conversation message used to compile
     * suggestion for.
     *
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
     * </pre>
     *
     * <code>string latest_message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatestMessage() {
      latestMessage_ = getDefaultInstance().getLatestMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the latest conversation message used to compile
     * suggestion for.
     *
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
     * </pre>
     *
     * <code>string latest_message = 2;</code>
     * @param value The bytes for latestMessage to set.
     * @return This builder for chaining.
     */
    public Builder setLatestMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      latestMessage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int contextSize_ ;
    /**
     * <pre>
     * Number of messages prior to and including
     * [latest_message][google.cloud.dialogflow.v2beta1.CompileSuggestionResponse.latest_message]
     * to compile the suggestion. It may be smaller than the
     * [CompileSuggestionRequest.context_size][google.cloud.dialogflow.v2beta1.CompileSuggestionRequest.context_size]
     * field in the request if there aren't that many messages in the
     * conversation.
     * </pre>
     *
     * <code>int32 context_size = 3;</code>
     * @return The contextSize.
     */
    @java.lang.Override
    public int getContextSize() {
      return contextSize_;
    }
    /**
     * <pre>
     * Number of messages prior to and including
     * [latest_message][google.cloud.dialogflow.v2beta1.CompileSuggestionResponse.latest_message]
     * to compile the suggestion. It may be smaller than the
     * [CompileSuggestionRequest.context_size][google.cloud.dialogflow.v2beta1.CompileSuggestionRequest.context_size]
     * field in the request if there aren't that many messages in the
     * conversation.
     * </pre>
     *
     * <code>int32 context_size = 3;</code>
     * @param value The contextSize to set.
     * @return This builder for chaining.
     */
    public Builder setContextSize(int value) {

      contextSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of messages prior to and including
     * [latest_message][google.cloud.dialogflow.v2beta1.CompileSuggestionResponse.latest_message]
     * to compile the suggestion. It may be smaller than the
     * [CompileSuggestionRequest.context_size][google.cloud.dialogflow.v2beta1.CompileSuggestionRequest.context_size]
     * field in the request if there aren't that many messages in the
     * conversation.
     * </pre>
     *
     * <code>int32 context_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearContextSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      contextSize_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.CompileSuggestionResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.CompileSuggestionResponse)
  private static final com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse();
  }

  public static com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompileSuggestionResponse>
      PARSER = new com.google.protobuf.AbstractParser<CompileSuggestionResponse>() {
    @java.lang.Override
    public CompileSuggestionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CompileSuggestionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompileSuggestionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.CompileSuggestionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

