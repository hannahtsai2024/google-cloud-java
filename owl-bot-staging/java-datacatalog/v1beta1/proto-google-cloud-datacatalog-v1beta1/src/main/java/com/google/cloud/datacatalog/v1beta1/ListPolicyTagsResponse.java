// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/policytagmanager.proto

package com.google.cloud.datacatalog.v1beta1;

/**
 * <pre>
 * Response message for
 * [ListPolicyTags][google.cloud.datacatalog.v1beta1.PolicyTagManager.ListPolicyTags].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse}
 */
public final class ListPolicyTagsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse)
    ListPolicyTagsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPolicyTagsResponse.newBuilder() to construct.
  private ListPolicyTagsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPolicyTagsResponse() {
    policyTags_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListPolicyTagsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto.internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto.internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse.class, com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse.Builder.class);
  }

  public static final int POLICY_TAGS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.datacatalog.v1beta1.PolicyTag> policyTags_;
  /**
   * <pre>
   * The policy tags that are in the requested taxonomy.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datacatalog.v1beta1.PolicyTag> getPolicyTagsList() {
    return policyTags_;
  }
  /**
   * <pre>
   * The policy tags that are in the requested taxonomy.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder> 
      getPolicyTagsOrBuilderList() {
    return policyTags_;
  }
  /**
   * <pre>
   * The policy tags that are in the requested taxonomy.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
   */
  @java.lang.Override
  public int getPolicyTagsCount() {
    return policyTags_.size();
  }
  /**
   * <pre>
   * The policy tags that are in the requested taxonomy.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.PolicyTag getPolicyTags(int index) {
    return policyTags_.get(index);
  }
  /**
   * <pre>
   * The policy tags that are in the requested taxonomy.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder getPolicyTagsOrBuilder(
      int index) {
    return policyTags_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token used to retrieve the next page of results, or empty if there are no
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
   * Token used to retrieve the next page of results, or empty if there are no
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
    for (int i = 0; i < policyTags_.size(); i++) {
      output.writeMessage(1, policyTags_.get(i));
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
    for (int i = 0; i < policyTags_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, policyTags_.get(i));
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse other = (com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse) obj;

    if (!getPolicyTagsList()
        .equals(other.getPolicyTagsList())) return false;
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
    if (getPolicyTagsCount() > 0) {
      hash = (37 * hash) + POLICY_TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getPolicyTagsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse prototype) {
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
   * [ListPolicyTags][google.cloud.datacatalog.v1beta1.PolicyTagManager.ListPolicyTags].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse)
      com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto.internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto.internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse.class, com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse.newBuilder()
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
      if (policyTagsBuilder_ == null) {
        policyTags_ = java.util.Collections.emptyList();
      } else {
        policyTags_ = null;
        policyTagsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto.internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse build() {
      com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse buildPartial() {
      com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse result = new com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse result) {
      if (policyTagsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          policyTags_ = java.util.Collections.unmodifiableList(policyTags_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.policyTags_ = policyTags_;
      } else {
        result.policyTags_ = policyTagsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse) {
        return mergeFrom((com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse other) {
      if (other == com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse.getDefaultInstance()) return this;
      if (policyTagsBuilder_ == null) {
        if (!other.policyTags_.isEmpty()) {
          if (policyTags_.isEmpty()) {
            policyTags_ = other.policyTags_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePolicyTagsIsMutable();
            policyTags_.addAll(other.policyTags_);
          }
          onChanged();
        }
      } else {
        if (!other.policyTags_.isEmpty()) {
          if (policyTagsBuilder_.isEmpty()) {
            policyTagsBuilder_.dispose();
            policyTagsBuilder_ = null;
            policyTags_ = other.policyTags_;
            bitField0_ = (bitField0_ & ~0x00000001);
            policyTagsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPolicyTagsFieldBuilder() : null;
          } else {
            policyTagsBuilder_.addAllMessages(other.policyTags_);
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
              com.google.cloud.datacatalog.v1beta1.PolicyTag m =
                  input.readMessage(
                      com.google.cloud.datacatalog.v1beta1.PolicyTag.parser(),
                      extensionRegistry);
              if (policyTagsBuilder_ == null) {
                ensurePolicyTagsIsMutable();
                policyTags_.add(m);
              } else {
                policyTagsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.datacatalog.v1beta1.PolicyTag> policyTags_ =
      java.util.Collections.emptyList();
    private void ensurePolicyTagsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        policyTags_ = new java.util.ArrayList<com.google.cloud.datacatalog.v1beta1.PolicyTag>(policyTags_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.datacatalog.v1beta1.PolicyTag, com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder, com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder> policyTagsBuilder_;

    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public java.util.List<com.google.cloud.datacatalog.v1beta1.PolicyTag> getPolicyTagsList() {
      if (policyTagsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(policyTags_);
      } else {
        return policyTagsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public int getPolicyTagsCount() {
      if (policyTagsBuilder_ == null) {
        return policyTags_.size();
      } else {
        return policyTagsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.PolicyTag getPolicyTags(int index) {
      if (policyTagsBuilder_ == null) {
        return policyTags_.get(index);
      } else {
        return policyTagsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder setPolicyTags(
        int index, com.google.cloud.datacatalog.v1beta1.PolicyTag value) {
      if (policyTagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolicyTagsIsMutable();
        policyTags_.set(index, value);
        onChanged();
      } else {
        policyTagsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder setPolicyTags(
        int index, com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder builderForValue) {
      if (policyTagsBuilder_ == null) {
        ensurePolicyTagsIsMutable();
        policyTags_.set(index, builderForValue.build());
        onChanged();
      } else {
        policyTagsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder addPolicyTags(com.google.cloud.datacatalog.v1beta1.PolicyTag value) {
      if (policyTagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolicyTagsIsMutable();
        policyTags_.add(value);
        onChanged();
      } else {
        policyTagsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder addPolicyTags(
        int index, com.google.cloud.datacatalog.v1beta1.PolicyTag value) {
      if (policyTagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolicyTagsIsMutable();
        policyTags_.add(index, value);
        onChanged();
      } else {
        policyTagsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder addPolicyTags(
        com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder builderForValue) {
      if (policyTagsBuilder_ == null) {
        ensurePolicyTagsIsMutable();
        policyTags_.add(builderForValue.build());
        onChanged();
      } else {
        policyTagsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder addPolicyTags(
        int index, com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder builderForValue) {
      if (policyTagsBuilder_ == null) {
        ensurePolicyTagsIsMutable();
        policyTags_.add(index, builderForValue.build());
        onChanged();
      } else {
        policyTagsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder addAllPolicyTags(
        java.lang.Iterable<? extends com.google.cloud.datacatalog.v1beta1.PolicyTag> values) {
      if (policyTagsBuilder_ == null) {
        ensurePolicyTagsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, policyTags_);
        onChanged();
      } else {
        policyTagsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder clearPolicyTags() {
      if (policyTagsBuilder_ == null) {
        policyTags_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        policyTagsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder removePolicyTags(int index) {
      if (policyTagsBuilder_ == null) {
        ensurePolicyTagsIsMutable();
        policyTags_.remove(index);
        onChanged();
      } else {
        policyTagsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder getPolicyTagsBuilder(
        int index) {
      return getPolicyTagsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder getPolicyTagsOrBuilder(
        int index) {
      if (policyTagsBuilder_ == null) {
        return policyTags_.get(index);  } else {
        return policyTagsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder> 
         getPolicyTagsOrBuilderList() {
      if (policyTagsBuilder_ != null) {
        return policyTagsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(policyTags_);
      }
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder addPolicyTagsBuilder() {
      return getPolicyTagsFieldBuilder().addBuilder(
          com.google.cloud.datacatalog.v1beta1.PolicyTag.getDefaultInstance());
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder addPolicyTagsBuilder(
        int index) {
      return getPolicyTagsFieldBuilder().addBuilder(
          index, com.google.cloud.datacatalog.v1beta1.PolicyTag.getDefaultInstance());
    }
    /**
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public java.util.List<com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder> 
         getPolicyTagsBuilderList() {
      return getPolicyTagsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.datacatalog.v1beta1.PolicyTag, com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder, com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder> 
        getPolicyTagsFieldBuilder() {
      if (policyTagsBuilder_ == null) {
        policyTagsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datacatalog.v1beta1.PolicyTag, com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder, com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder>(
                policyTags_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        policyTags_ = null;
      }
      return policyTagsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token used to retrieve the next page of results, or empty if there are no
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
     * Token used to retrieve the next page of results, or empty if there are no
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
     * Token used to retrieve the next page of results, or empty if there are no
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
     * Token used to retrieve the next page of results, or empty if there are no
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
     * Token used to retrieve the next page of results, or empty if there are no
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse)
  private static final com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse();
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPolicyTagsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListPolicyTagsResponse>() {
    @java.lang.Override
    public ListPolicyTagsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPolicyTagsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPolicyTagsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

