// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/service.proto

package com.google.cloud.dataplex.v1;

/**
 * <pre>
 * List assets response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.ListAssetsResponse}
 */
public final class ListAssetsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.ListAssetsResponse)
    ListAssetsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAssetsResponse.newBuilder() to construct.
  private ListAssetsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAssetsResponse() {
    assets_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAssetsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataplex.v1.ServiceProto.internal_static_google_cloud_dataplex_v1_ListAssetsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.ServiceProto.internal_static_google_cloud_dataplex_v1_ListAssetsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.ListAssetsResponse.class, com.google.cloud.dataplex.v1.ListAssetsResponse.Builder.class);
  }

  public static final int ASSETS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dataplex.v1.Asset> assets_;
  /**
   * <pre>
   * Asset under the given parent zone.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dataplex.v1.Asset> getAssetsList() {
    return assets_;
  }
  /**
   * <pre>
   * Asset under the given parent zone.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dataplex.v1.AssetOrBuilder> 
      getAssetsOrBuilderList() {
    return assets_;
  }
  /**
   * <pre>
   * Asset under the given parent zone.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
   */
  @java.lang.Override
  public int getAssetsCount() {
    return assets_.size();
  }
  /**
   * <pre>
   * Asset under the given parent zone.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.Asset getAssets(int index) {
    return assets_.get(index);
  }
  /**
   * <pre>
   * Asset under the given parent zone.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.AssetOrBuilder getAssetsOrBuilder(
      int index) {
    return assets_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
    for (int i = 0; i < assets_.size(); i++) {
      output.writeMessage(1, assets_.get(i));
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
    for (int i = 0; i < assets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, assets_.get(i));
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.ListAssetsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.ListAssetsResponse other = (com.google.cloud.dataplex.v1.ListAssetsResponse) obj;

    if (!getAssetsList()
        .equals(other.getAssetsList())) return false;
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
    if (getAssetsCount() > 0) {
      hash = (37 * hash) + ASSETS_FIELD_NUMBER;
      hash = (53 * hash) + getAssetsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.ListAssetsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.ListAssetsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.ListAssetsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.ListAssetsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.ListAssetsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataplex.v1.ListAssetsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.ListAssetsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.ListAssetsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.ListAssetsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.ListAssetsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataplex.v1.ListAssetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataplex.v1.ListAssetsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataplex.v1.ListAssetsResponse prototype) {
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
   * List assets response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.ListAssetsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.ListAssetsResponse)
      com.google.cloud.dataplex.v1.ListAssetsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataplex.v1.ServiceProto.internal_static_google_cloud_dataplex_v1_ListAssetsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.ServiceProto.internal_static_google_cloud_dataplex_v1_ListAssetsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.ListAssetsResponse.class, com.google.cloud.dataplex.v1.ListAssetsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.ListAssetsResponse.newBuilder()
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
      if (assetsBuilder_ == null) {
        assets_ = java.util.Collections.emptyList();
      } else {
        assets_ = null;
        assetsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataplex.v1.ServiceProto.internal_static_google_cloud_dataplex_v1_ListAssetsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.ListAssetsResponse getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.ListAssetsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.ListAssetsResponse build() {
      com.google.cloud.dataplex.v1.ListAssetsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.ListAssetsResponse buildPartial() {
      com.google.cloud.dataplex.v1.ListAssetsResponse result = new com.google.cloud.dataplex.v1.ListAssetsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.dataplex.v1.ListAssetsResponse result) {
      if (assetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          assets_ = java.util.Collections.unmodifiableList(assets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.assets_ = assets_;
      } else {
        result.assets_ = assetsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dataplex.v1.ListAssetsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dataplex.v1.ListAssetsResponse) {
        return mergeFrom((com.google.cloud.dataplex.v1.ListAssetsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.ListAssetsResponse other) {
      if (other == com.google.cloud.dataplex.v1.ListAssetsResponse.getDefaultInstance()) return this;
      if (assetsBuilder_ == null) {
        if (!other.assets_.isEmpty()) {
          if (assets_.isEmpty()) {
            assets_ = other.assets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAssetsIsMutable();
            assets_.addAll(other.assets_);
          }
          onChanged();
        }
      } else {
        if (!other.assets_.isEmpty()) {
          if (assetsBuilder_.isEmpty()) {
            assetsBuilder_.dispose();
            assetsBuilder_ = null;
            assets_ = other.assets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            assetsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAssetsFieldBuilder() : null;
          } else {
            assetsBuilder_.addAllMessages(other.assets_);
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
              com.google.cloud.dataplex.v1.Asset m =
                  input.readMessage(
                      com.google.cloud.dataplex.v1.Asset.parser(),
                      extensionRegistry);
              if (assetsBuilder_ == null) {
                ensureAssetsIsMutable();
                assets_.add(m);
              } else {
                assetsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.dataplex.v1.Asset> assets_ =
      java.util.Collections.emptyList();
    private void ensureAssetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        assets_ = new java.util.ArrayList<com.google.cloud.dataplex.v1.Asset>(assets_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dataplex.v1.Asset, com.google.cloud.dataplex.v1.Asset.Builder, com.google.cloud.dataplex.v1.AssetOrBuilder> assetsBuilder_;

    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public java.util.List<com.google.cloud.dataplex.v1.Asset> getAssetsList() {
      if (assetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(assets_);
      } else {
        return assetsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public int getAssetsCount() {
      if (assetsBuilder_ == null) {
        return assets_.size();
      } else {
        return assetsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public com.google.cloud.dataplex.v1.Asset getAssets(int index) {
      if (assetsBuilder_ == null) {
        return assets_.get(index);
      } else {
        return assetsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public Builder setAssets(
        int index, com.google.cloud.dataplex.v1.Asset value) {
      if (assetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAssetsIsMutable();
        assets_.set(index, value);
        onChanged();
      } else {
        assetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public Builder setAssets(
        int index, com.google.cloud.dataplex.v1.Asset.Builder builderForValue) {
      if (assetsBuilder_ == null) {
        ensureAssetsIsMutable();
        assets_.set(index, builderForValue.build());
        onChanged();
      } else {
        assetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public Builder addAssets(com.google.cloud.dataplex.v1.Asset value) {
      if (assetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAssetsIsMutable();
        assets_.add(value);
        onChanged();
      } else {
        assetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public Builder addAssets(
        int index, com.google.cloud.dataplex.v1.Asset value) {
      if (assetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAssetsIsMutable();
        assets_.add(index, value);
        onChanged();
      } else {
        assetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public Builder addAssets(
        com.google.cloud.dataplex.v1.Asset.Builder builderForValue) {
      if (assetsBuilder_ == null) {
        ensureAssetsIsMutable();
        assets_.add(builderForValue.build());
        onChanged();
      } else {
        assetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public Builder addAssets(
        int index, com.google.cloud.dataplex.v1.Asset.Builder builderForValue) {
      if (assetsBuilder_ == null) {
        ensureAssetsIsMutable();
        assets_.add(index, builderForValue.build());
        onChanged();
      } else {
        assetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public Builder addAllAssets(
        java.lang.Iterable<? extends com.google.cloud.dataplex.v1.Asset> values) {
      if (assetsBuilder_ == null) {
        ensureAssetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, assets_);
        onChanged();
      } else {
        assetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public Builder clearAssets() {
      if (assetsBuilder_ == null) {
        assets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        assetsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public Builder removeAssets(int index) {
      if (assetsBuilder_ == null) {
        ensureAssetsIsMutable();
        assets_.remove(index);
        onChanged();
      } else {
        assetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public com.google.cloud.dataplex.v1.Asset.Builder getAssetsBuilder(
        int index) {
      return getAssetsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public com.google.cloud.dataplex.v1.AssetOrBuilder getAssetsOrBuilder(
        int index) {
      if (assetsBuilder_ == null) {
        return assets_.get(index);  } else {
        return assetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dataplex.v1.AssetOrBuilder> 
         getAssetsOrBuilderList() {
      if (assetsBuilder_ != null) {
        return assetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(assets_);
      }
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public com.google.cloud.dataplex.v1.Asset.Builder addAssetsBuilder() {
      return getAssetsFieldBuilder().addBuilder(
          com.google.cloud.dataplex.v1.Asset.getDefaultInstance());
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public com.google.cloud.dataplex.v1.Asset.Builder addAssetsBuilder(
        int index) {
      return getAssetsFieldBuilder().addBuilder(
          index, com.google.cloud.dataplex.v1.Asset.getDefaultInstance());
    }
    /**
     * <pre>
     * Asset under the given parent zone.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.Asset assets = 1;</code>
     */
    public java.util.List<com.google.cloud.dataplex.v1.Asset.Builder> 
         getAssetsBuilderList() {
      return getAssetsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dataplex.v1.Asset, com.google.cloud.dataplex.v1.Asset.Builder, com.google.cloud.dataplex.v1.AssetOrBuilder> 
        getAssetsFieldBuilder() {
      if (assetsBuilder_ == null) {
        assetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataplex.v1.Asset, com.google.cloud.dataplex.v1.Asset.Builder, com.google.cloud.dataplex.v1.AssetOrBuilder>(
                assets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        assets_ = null;
      }
      return assetsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.ListAssetsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.ListAssetsResponse)
  private static final com.google.cloud.dataplex.v1.ListAssetsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.ListAssetsResponse();
  }

  public static com.google.cloud.dataplex.v1.ListAssetsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAssetsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAssetsResponse>() {
    @java.lang.Override
    public ListAssetsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAssetsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAssetsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.ListAssetsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

