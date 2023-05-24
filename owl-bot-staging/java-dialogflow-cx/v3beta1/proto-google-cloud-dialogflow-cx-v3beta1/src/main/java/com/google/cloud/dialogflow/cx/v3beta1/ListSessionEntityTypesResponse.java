// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/session_entity_type.proto

package com.google.cloud.dialogflow.cx.v3beta1;

/**
 * <pre>
 * The response message for
 * [SessionEntityTypes.ListSessionEntityTypes][google.cloud.dialogflow.cx.v3beta1.SessionEntityTypes.ListSessionEntityTypes].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse}
 */
public final class ListSessionEntityTypesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse)
    ListSessionEntityTypesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSessionEntityTypesResponse.newBuilder() to construct.
  private ListSessionEntityTypesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSessionEntityTypesResponse() {
    sessionEntityTypes_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSessionEntityTypesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse.class, com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse.Builder.class);
  }

  public static final int SESSION_ENTITY_TYPES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType> sessionEntityTypes_;
  /**
   * <pre>
   * The list of session entity types. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType> getSessionEntityTypesList() {
    return sessionEntityTypes_;
  }
  /**
   * <pre>
   * The list of session entity types. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeOrBuilder> 
      getSessionEntityTypesOrBuilderList() {
    return sessionEntityTypes_;
  }
  /**
   * <pre>
   * The list of session entity types. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
   */
  @java.lang.Override
  public int getSessionEntityTypesCount() {
    return sessionEntityTypes_.size();
  }
  /**
   * <pre>
   * The list of session entity types. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType getSessionEntityTypes(int index) {
    return sessionEntityTypes_.get(index);
  }
  /**
   * <pre>
   * The list of session entity types. There will be a maximum number of items
   * returned based on the page_size field in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeOrBuilder getSessionEntityTypesOrBuilder(
      int index) {
    return sessionEntityTypes_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < sessionEntityTypes_.size(); i++) {
      output.writeMessage(1, sessionEntityTypes_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < sessionEntityTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, sessionEntityTypes_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse other = (com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse) obj;

    if (!getSessionEntityTypesList()
        .equals(other.getSessionEntityTypesList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getSessionEntityTypesCount() > 0) {
      hash = (37 * hash) + SESSION_ENTITY_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getSessionEntityTypesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse prototype) {
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
   * [SessionEntityTypes.ListSessionEntityTypes][google.cloud.dialogflow.cx.v3beta1.SessionEntityTypes.ListSessionEntityTypes].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse)
      com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse.class, com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse.newBuilder()
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
      if (sessionEntityTypesBuilder_ == null) {
        sessionEntityTypes_ = java.util.Collections.emptyList();
      } else {
        sessionEntityTypes_ = null;
        sessionEntityTypesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeProto.internal_static_google_cloud_dialogflow_cx_v3beta1_ListSessionEntityTypesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse build() {
      com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse result = new com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse result) {
      if (sessionEntityTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          sessionEntityTypes_ = java.util.Collections.unmodifiableList(sessionEntityTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sessionEntityTypes_ = sessionEntityTypes_;
      } else {
        result.sessionEntityTypes_ = sessionEntityTypesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse.getDefaultInstance()) return this;
      if (sessionEntityTypesBuilder_ == null) {
        if (!other.sessionEntityTypes_.isEmpty()) {
          if (sessionEntityTypes_.isEmpty()) {
            sessionEntityTypes_ = other.sessionEntityTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSessionEntityTypesIsMutable();
            sessionEntityTypes_.addAll(other.sessionEntityTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.sessionEntityTypes_.isEmpty()) {
          if (sessionEntityTypesBuilder_.isEmpty()) {
            sessionEntityTypesBuilder_.dispose();
            sessionEntityTypesBuilder_ = null;
            sessionEntityTypes_ = other.sessionEntityTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sessionEntityTypesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSessionEntityTypesFieldBuilder() : null;
          } else {
            sessionEntityTypesBuilder_.addAllMessages(other.sessionEntityTypes_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
            case 10: {
              com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType m =
                  input.readMessage(
                      com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.parser(),
                      extensionRegistry);
              if (sessionEntityTypesBuilder_ == null) {
                ensureSessionEntityTypesIsMutable();
                sessionEntityTypes_.add(m);
              } else {
                sessionEntityTypesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType> sessionEntityTypes_ =
      java.util.Collections.emptyList();
    private void ensureSessionEntityTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sessionEntityTypes_ = new java.util.ArrayList<com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType>(sessionEntityTypes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType, com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.Builder, com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeOrBuilder> sessionEntityTypesBuilder_;

    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType> getSessionEntityTypesList() {
      if (sessionEntityTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sessionEntityTypes_);
      } else {
        return sessionEntityTypesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public int getSessionEntityTypesCount() {
      if (sessionEntityTypesBuilder_ == null) {
        return sessionEntityTypes_.size();
      } else {
        return sessionEntityTypesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType getSessionEntityTypes(int index) {
      if (sessionEntityTypesBuilder_ == null) {
        return sessionEntityTypes_.get(index);
      } else {
        return sessionEntityTypesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public Builder setSessionEntityTypes(
        int index, com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType value) {
      if (sessionEntityTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSessionEntityTypesIsMutable();
        sessionEntityTypes_.set(index, value);
        onChanged();
      } else {
        sessionEntityTypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public Builder setSessionEntityTypes(
        int index, com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.Builder builderForValue) {
      if (sessionEntityTypesBuilder_ == null) {
        ensureSessionEntityTypesIsMutable();
        sessionEntityTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        sessionEntityTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public Builder addSessionEntityTypes(com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType value) {
      if (sessionEntityTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSessionEntityTypesIsMutable();
        sessionEntityTypes_.add(value);
        onChanged();
      } else {
        sessionEntityTypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public Builder addSessionEntityTypes(
        int index, com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType value) {
      if (sessionEntityTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSessionEntityTypesIsMutable();
        sessionEntityTypes_.add(index, value);
        onChanged();
      } else {
        sessionEntityTypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public Builder addSessionEntityTypes(
        com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.Builder builderForValue) {
      if (sessionEntityTypesBuilder_ == null) {
        ensureSessionEntityTypesIsMutable();
        sessionEntityTypes_.add(builderForValue.build());
        onChanged();
      } else {
        sessionEntityTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public Builder addSessionEntityTypes(
        int index, com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.Builder builderForValue) {
      if (sessionEntityTypesBuilder_ == null) {
        ensureSessionEntityTypesIsMutable();
        sessionEntityTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        sessionEntityTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public Builder addAllSessionEntityTypes(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType> values) {
      if (sessionEntityTypesBuilder_ == null) {
        ensureSessionEntityTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sessionEntityTypes_);
        onChanged();
      } else {
        sessionEntityTypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public Builder clearSessionEntityTypes() {
      if (sessionEntityTypesBuilder_ == null) {
        sessionEntityTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sessionEntityTypesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public Builder removeSessionEntityTypes(int index) {
      if (sessionEntityTypesBuilder_ == null) {
        ensureSessionEntityTypesIsMutable();
        sessionEntityTypes_.remove(index);
        onChanged();
      } else {
        sessionEntityTypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.Builder getSessionEntityTypesBuilder(
        int index) {
      return getSessionEntityTypesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeOrBuilder getSessionEntityTypesOrBuilder(
        int index) {
      if (sessionEntityTypesBuilder_ == null) {
        return sessionEntityTypes_.get(index);  } else {
        return sessionEntityTypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeOrBuilder> 
         getSessionEntityTypesOrBuilderList() {
      if (sessionEntityTypesBuilder_ != null) {
        return sessionEntityTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sessionEntityTypes_);
      }
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.Builder addSessionEntityTypesBuilder() {
      return getSessionEntityTypesFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.Builder addSessionEntityTypesBuilder(
        int index) {
      return getSessionEntityTypesFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of session entity types. There will be a maximum number of items
     * returned based on the page_size field in the request.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3beta1.SessionEntityType session_entity_types = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.Builder> 
         getSessionEntityTypesBuilderList() {
      return getSessionEntityTypesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType, com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.Builder, com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeOrBuilder> 
        getSessionEntityTypesFieldBuilder() {
      if (sessionEntityTypesBuilder_ == null) {
        sessionEntityTypesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType, com.google.cloud.dialogflow.cx.v3beta1.SessionEntityType.Builder, com.google.cloud.dialogflow.cx.v3beta1.SessionEntityTypeOrBuilder>(
                sessionEntityTypes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        sessionEntityTypes_ = null;
      }
      return sessionEntityTypesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse)
  private static final com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSessionEntityTypesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListSessionEntityTypesResponse>() {
    @java.lang.Override
    public ListSessionEntityTypesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSessionEntityTypesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSessionEntityTypesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.ListSessionEntityTypesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

