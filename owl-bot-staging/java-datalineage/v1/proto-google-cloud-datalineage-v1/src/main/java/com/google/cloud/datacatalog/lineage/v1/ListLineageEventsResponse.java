// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

package com.google.cloud.datacatalog.lineage.v1;

/**
 * <pre>
 * Response message for
 * [ListLineageEvents][google.cloud.datacatalog.lineage.v1.ListLineageEvents].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse}
 */
public final class ListLineageEventsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse)
    ListLineageEventsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListLineageEventsResponse.newBuilder() to construct.
  private ListLineageEventsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListLineageEventsResponse() {
    lineageEvents_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListLineageEventsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datacatalog.lineage.v1.LineageProto.internal_static_google_cloud_datacatalog_lineage_v1_ListLineageEventsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.lineage.v1.LineageProto.internal_static_google_cloud_datacatalog_lineage_v1_ListLineageEventsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse.class, com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse.Builder.class);
  }

  public static final int LINEAGE_EVENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.datacatalog.lineage.v1.LineageEvent> lineageEvents_;
  /**
   * <pre>
   * Lineage events from the specified project and location.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datacatalog.lineage.v1.LineageEvent> getLineageEventsList() {
    return lineageEvents_;
  }
  /**
   * <pre>
   * Lineage events from the specified project and location.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datacatalog.lineage.v1.LineageEventOrBuilder> 
      getLineageEventsOrBuilderList() {
    return lineageEvents_;
  }
  /**
   * <pre>
   * Lineage events from the specified project and location.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
   */
  @java.lang.Override
  public int getLineageEventsCount() {
    return lineageEvents_.size();
  }
  /**
   * <pre>
   * Lineage events from the specified project and location.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.lineage.v1.LineageEvent getLineageEvents(int index) {
    return lineageEvents_.get(index);
  }
  /**
   * <pre>
   * Lineage events from the specified project and location.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.lineage.v1.LineageEventOrBuilder getLineageEventsOrBuilder(
      int index) {
    return lineageEvents_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * The token to specify as `page_token` in the next call to get the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * The token to specify as `page_token` in the next call to get the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < lineageEvents_.size(); i++) {
      output.writeMessage(1, lineageEvents_.get(i));
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
    for (int i = 0; i < lineageEvents_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, lineageEvents_.get(i));
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
    if (!(obj instanceof com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse other = (com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse) obj;

    if (!getLineageEventsList()
        .equals(other.getLineageEventsList())) return false;
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
    if (getLineageEventsCount() > 0) {
      hash = (37 * hash) + LINEAGE_EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getLineageEventsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse prototype) {
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
   * Response message for
   * [ListLineageEvents][google.cloud.datacatalog.lineage.v1.ListLineageEvents].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse)
      com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datacatalog.lineage.v1.LineageProto.internal_static_google_cloud_datacatalog_lineage_v1_ListLineageEventsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.lineage.v1.LineageProto.internal_static_google_cloud_datacatalog_lineage_v1_ListLineageEventsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse.class, com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse.newBuilder()
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
      if (lineageEventsBuilder_ == null) {
        lineageEvents_ = java.util.Collections.emptyList();
      } else {
        lineageEvents_ = null;
        lineageEventsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datacatalog.lineage.v1.LineageProto.internal_static_google_cloud_datacatalog_lineage_v1_ListLineageEventsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse build() {
      com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse buildPartial() {
      com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse result = new com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse result) {
      if (lineageEventsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          lineageEvents_ = java.util.Collections.unmodifiableList(lineageEvents_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lineageEvents_ = lineageEvents_;
      } else {
        result.lineageEvents_ = lineageEventsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse) {
        return mergeFrom((com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse other) {
      if (other == com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse.getDefaultInstance()) return this;
      if (lineageEventsBuilder_ == null) {
        if (!other.lineageEvents_.isEmpty()) {
          if (lineageEvents_.isEmpty()) {
            lineageEvents_ = other.lineageEvents_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLineageEventsIsMutable();
            lineageEvents_.addAll(other.lineageEvents_);
          }
          onChanged();
        }
      } else {
        if (!other.lineageEvents_.isEmpty()) {
          if (lineageEventsBuilder_.isEmpty()) {
            lineageEventsBuilder_.dispose();
            lineageEventsBuilder_ = null;
            lineageEvents_ = other.lineageEvents_;
            bitField0_ = (bitField0_ & ~0x00000001);
            lineageEventsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLineageEventsFieldBuilder() : null;
          } else {
            lineageEventsBuilder_.addAllMessages(other.lineageEvents_);
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
              com.google.cloud.datacatalog.lineage.v1.LineageEvent m =
                  input.readMessage(
                      com.google.cloud.datacatalog.lineage.v1.LineageEvent.parser(),
                      extensionRegistry);
              if (lineageEventsBuilder_ == null) {
                ensureLineageEventsIsMutable();
                lineageEvents_.add(m);
              } else {
                lineageEventsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.datacatalog.lineage.v1.LineageEvent> lineageEvents_ =
      java.util.Collections.emptyList();
    private void ensureLineageEventsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lineageEvents_ = new java.util.ArrayList<com.google.cloud.datacatalog.lineage.v1.LineageEvent>(lineageEvents_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.datacatalog.lineage.v1.LineageEvent, com.google.cloud.datacatalog.lineage.v1.LineageEvent.Builder, com.google.cloud.datacatalog.lineage.v1.LineageEventOrBuilder> lineageEventsBuilder_;

    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public java.util.List<com.google.cloud.datacatalog.lineage.v1.LineageEvent> getLineageEventsList() {
      if (lineageEventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(lineageEvents_);
      } else {
        return lineageEventsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public int getLineageEventsCount() {
      if (lineageEventsBuilder_ == null) {
        return lineageEvents_.size();
      } else {
        return lineageEventsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public com.google.cloud.datacatalog.lineage.v1.LineageEvent getLineageEvents(int index) {
      if (lineageEventsBuilder_ == null) {
        return lineageEvents_.get(index);
      } else {
        return lineageEventsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public Builder setLineageEvents(
        int index, com.google.cloud.datacatalog.lineage.v1.LineageEvent value) {
      if (lineageEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLineageEventsIsMutable();
        lineageEvents_.set(index, value);
        onChanged();
      } else {
        lineageEventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public Builder setLineageEvents(
        int index, com.google.cloud.datacatalog.lineage.v1.LineageEvent.Builder builderForValue) {
      if (lineageEventsBuilder_ == null) {
        ensureLineageEventsIsMutable();
        lineageEvents_.set(index, builderForValue.build());
        onChanged();
      } else {
        lineageEventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public Builder addLineageEvents(com.google.cloud.datacatalog.lineage.v1.LineageEvent value) {
      if (lineageEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLineageEventsIsMutable();
        lineageEvents_.add(value);
        onChanged();
      } else {
        lineageEventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public Builder addLineageEvents(
        int index, com.google.cloud.datacatalog.lineage.v1.LineageEvent value) {
      if (lineageEventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLineageEventsIsMutable();
        lineageEvents_.add(index, value);
        onChanged();
      } else {
        lineageEventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public Builder addLineageEvents(
        com.google.cloud.datacatalog.lineage.v1.LineageEvent.Builder builderForValue) {
      if (lineageEventsBuilder_ == null) {
        ensureLineageEventsIsMutable();
        lineageEvents_.add(builderForValue.build());
        onChanged();
      } else {
        lineageEventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public Builder addLineageEvents(
        int index, com.google.cloud.datacatalog.lineage.v1.LineageEvent.Builder builderForValue) {
      if (lineageEventsBuilder_ == null) {
        ensureLineageEventsIsMutable();
        lineageEvents_.add(index, builderForValue.build());
        onChanged();
      } else {
        lineageEventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public Builder addAllLineageEvents(
        java.lang.Iterable<? extends com.google.cloud.datacatalog.lineage.v1.LineageEvent> values) {
      if (lineageEventsBuilder_ == null) {
        ensureLineageEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lineageEvents_);
        onChanged();
      } else {
        lineageEventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public Builder clearLineageEvents() {
      if (lineageEventsBuilder_ == null) {
        lineageEvents_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        lineageEventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public Builder removeLineageEvents(int index) {
      if (lineageEventsBuilder_ == null) {
        ensureLineageEventsIsMutable();
        lineageEvents_.remove(index);
        onChanged();
      } else {
        lineageEventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public com.google.cloud.datacatalog.lineage.v1.LineageEvent.Builder getLineageEventsBuilder(
        int index) {
      return getLineageEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public com.google.cloud.datacatalog.lineage.v1.LineageEventOrBuilder getLineageEventsOrBuilder(
        int index) {
      if (lineageEventsBuilder_ == null) {
        return lineageEvents_.get(index);  } else {
        return lineageEventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datacatalog.lineage.v1.LineageEventOrBuilder> 
         getLineageEventsOrBuilderList() {
      if (lineageEventsBuilder_ != null) {
        return lineageEventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(lineageEvents_);
      }
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public com.google.cloud.datacatalog.lineage.v1.LineageEvent.Builder addLineageEventsBuilder() {
      return getLineageEventsFieldBuilder().addBuilder(
          com.google.cloud.datacatalog.lineage.v1.LineageEvent.getDefaultInstance());
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public com.google.cloud.datacatalog.lineage.v1.LineageEvent.Builder addLineageEventsBuilder(
        int index) {
      return getLineageEventsFieldBuilder().addBuilder(
          index, com.google.cloud.datacatalog.lineage.v1.LineageEvent.getDefaultInstance());
    }
    /**
     * <pre>
     * Lineage events from the specified project and location.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_events = 1;</code>
     */
    public java.util.List<com.google.cloud.datacatalog.lineage.v1.LineageEvent.Builder> 
         getLineageEventsBuilderList() {
      return getLineageEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.datacatalog.lineage.v1.LineageEvent, com.google.cloud.datacatalog.lineage.v1.LineageEvent.Builder, com.google.cloud.datacatalog.lineage.v1.LineageEventOrBuilder> 
        getLineageEventsFieldBuilder() {
      if (lineageEventsBuilder_ == null) {
        lineageEventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datacatalog.lineage.v1.LineageEvent, com.google.cloud.datacatalog.lineage.v1.LineageEvent.Builder, com.google.cloud.datacatalog.lineage.v1.LineageEventOrBuilder>(
                lineageEvents_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        lineageEvents_ = null;
      }
      return lineageEventsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The token to specify as `page_token` in the next call to get the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * The token to specify as `page_token` in the next call to get the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * The token to specify as `page_token` in the next call to get the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * The token to specify as `page_token` in the next call to get the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * The token to specify as `page_token` in the next call to get the next page.
     * If this field is omitted, there are no subsequent pages.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse)
  private static final com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse();
  }

  public static com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListLineageEventsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListLineageEventsResponse>() {
    @java.lang.Override
    public ListLineageEventsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListLineageEventsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListLineageEventsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.lineage.v1.ListLineageEventsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

