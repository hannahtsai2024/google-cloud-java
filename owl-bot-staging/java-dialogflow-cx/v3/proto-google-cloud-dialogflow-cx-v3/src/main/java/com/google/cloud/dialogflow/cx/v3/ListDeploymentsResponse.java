// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/deployment.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 * <pre>
 * The response message for
 * [Deployments.ListDeployments][google.cloud.dialogflow.cx.v3.Deployments.ListDeployments].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.ListDeploymentsResponse}
 */
public final class ListDeploymentsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.ListDeploymentsResponse)
    ListDeploymentsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDeploymentsResponse.newBuilder() to construct.
  private ListDeploymentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDeploymentsResponse() {
    deployments_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListDeploymentsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.DeploymentProto.internal_static_google_cloud_dialogflow_cx_v3_ListDeploymentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.DeploymentProto.internal_static_google_cloud_dialogflow_cx_v3_ListDeploymentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse.class, com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse.Builder.class);
  }

  public static final int DEPLOYMENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.cx.v3.Deployment> deployments_;
  /**
   * <pre>
   * The list of deployments. There will be a maximum number of items
   * returned based on the page_size field in the request. The list may in some
   * cases be empty or contain fewer entries than page_size even if this isn't
   * the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.cx.v3.Deployment> getDeploymentsList() {
    return deployments_;
  }
  /**
   * <pre>
   * The list of deployments. There will be a maximum number of items
   * returned based on the page_size field in the request. The list may in some
   * cases be empty or contain fewer entries than page_size even if this isn't
   * the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.cx.v3.DeploymentOrBuilder> 
      getDeploymentsOrBuilderList() {
    return deployments_;
  }
  /**
   * <pre>
   * The list of deployments. There will be a maximum number of items
   * returned based on the page_size field in the request. The list may in some
   * cases be empty or contain fewer entries than page_size even if this isn't
   * the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
   */
  @java.lang.Override
  public int getDeploymentsCount() {
    return deployments_.size();
  }
  /**
   * <pre>
   * The list of deployments. There will be a maximum number of items
   * returned based on the page_size field in the request. The list may in some
   * cases be empty or contain fewer entries than page_size even if this isn't
   * the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.Deployment getDeployments(int index) {
    return deployments_.get(index);
  }
  /**
   * <pre>
   * The list of deployments. There will be a maximum number of items
   * returned based on the page_size field in the request. The list may in some
   * cases be empty or contain fewer entries than page_size even if this isn't
   * the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.DeploymentOrBuilder getDeploymentsOrBuilder(
      int index) {
    return deployments_.get(index);
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
    for (int i = 0; i < deployments_.size(); i++) {
      output.writeMessage(1, deployments_.get(i));
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
    for (int i = 0; i < deployments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, deployments_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse other = (com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse) obj;

    if (!getDeploymentsList()
        .equals(other.getDeploymentsList())) return false;
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
    if (getDeploymentsCount() > 0) {
      hash = (37 * hash) + DEPLOYMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getDeploymentsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse prototype) {
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
   * [Deployments.ListDeployments][google.cloud.dialogflow.cx.v3.Deployments.ListDeployments].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.ListDeploymentsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.ListDeploymentsResponse)
      com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.DeploymentProto.internal_static_google_cloud_dialogflow_cx_v3_ListDeploymentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.DeploymentProto.internal_static_google_cloud_dialogflow_cx_v3_ListDeploymentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse.class, com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse.newBuilder()
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
      if (deploymentsBuilder_ == null) {
        deployments_ = java.util.Collections.emptyList();
      } else {
        deployments_ = null;
        deploymentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.DeploymentProto.internal_static_google_cloud_dialogflow_cx_v3_ListDeploymentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse build() {
      com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse buildPartial() {
      com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse result = new com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse result) {
      if (deploymentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          deployments_ = java.util.Collections.unmodifiableList(deployments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.deployments_ = deployments_;
      } else {
        result.deployments_ = deploymentsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse other) {
      if (other == com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse.getDefaultInstance()) return this;
      if (deploymentsBuilder_ == null) {
        if (!other.deployments_.isEmpty()) {
          if (deployments_.isEmpty()) {
            deployments_ = other.deployments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDeploymentsIsMutable();
            deployments_.addAll(other.deployments_);
          }
          onChanged();
        }
      } else {
        if (!other.deployments_.isEmpty()) {
          if (deploymentsBuilder_.isEmpty()) {
            deploymentsBuilder_.dispose();
            deploymentsBuilder_ = null;
            deployments_ = other.deployments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            deploymentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDeploymentsFieldBuilder() : null;
          } else {
            deploymentsBuilder_.addAllMessages(other.deployments_);
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
              com.google.cloud.dialogflow.cx.v3.Deployment m =
                  input.readMessage(
                      com.google.cloud.dialogflow.cx.v3.Deployment.parser(),
                      extensionRegistry);
              if (deploymentsBuilder_ == null) {
                ensureDeploymentsIsMutable();
                deployments_.add(m);
              } else {
                deploymentsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.dialogflow.cx.v3.Deployment> deployments_ =
      java.util.Collections.emptyList();
    private void ensureDeploymentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        deployments_ = new java.util.ArrayList<com.google.cloud.dialogflow.cx.v3.Deployment>(deployments_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.Deployment, com.google.cloud.dialogflow.cx.v3.Deployment.Builder, com.google.cloud.dialogflow.cx.v3.DeploymentOrBuilder> deploymentsBuilder_;

    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3.Deployment> getDeploymentsList() {
      if (deploymentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(deployments_);
      } else {
        return deploymentsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public int getDeploymentsCount() {
      if (deploymentsBuilder_ == null) {
        return deployments_.size();
      } else {
        return deploymentsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Deployment getDeployments(int index) {
      if (deploymentsBuilder_ == null) {
        return deployments_.get(index);
      } else {
        return deploymentsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public Builder setDeployments(
        int index, com.google.cloud.dialogflow.cx.v3.Deployment value) {
      if (deploymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeploymentsIsMutable();
        deployments_.set(index, value);
        onChanged();
      } else {
        deploymentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public Builder setDeployments(
        int index, com.google.cloud.dialogflow.cx.v3.Deployment.Builder builderForValue) {
      if (deploymentsBuilder_ == null) {
        ensureDeploymentsIsMutable();
        deployments_.set(index, builderForValue.build());
        onChanged();
      } else {
        deploymentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public Builder addDeployments(com.google.cloud.dialogflow.cx.v3.Deployment value) {
      if (deploymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeploymentsIsMutable();
        deployments_.add(value);
        onChanged();
      } else {
        deploymentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public Builder addDeployments(
        int index, com.google.cloud.dialogflow.cx.v3.Deployment value) {
      if (deploymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeploymentsIsMutable();
        deployments_.add(index, value);
        onChanged();
      } else {
        deploymentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public Builder addDeployments(
        com.google.cloud.dialogflow.cx.v3.Deployment.Builder builderForValue) {
      if (deploymentsBuilder_ == null) {
        ensureDeploymentsIsMutable();
        deployments_.add(builderForValue.build());
        onChanged();
      } else {
        deploymentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public Builder addDeployments(
        int index, com.google.cloud.dialogflow.cx.v3.Deployment.Builder builderForValue) {
      if (deploymentsBuilder_ == null) {
        ensureDeploymentsIsMutable();
        deployments_.add(index, builderForValue.build());
        onChanged();
      } else {
        deploymentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public Builder addAllDeployments(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.cx.v3.Deployment> values) {
      if (deploymentsBuilder_ == null) {
        ensureDeploymentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, deployments_);
        onChanged();
      } else {
        deploymentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public Builder clearDeployments() {
      if (deploymentsBuilder_ == null) {
        deployments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        deploymentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public Builder removeDeployments(int index) {
      if (deploymentsBuilder_ == null) {
        ensureDeploymentsIsMutable();
        deployments_.remove(index);
        onChanged();
      } else {
        deploymentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Deployment.Builder getDeploymentsBuilder(
        int index) {
      return getDeploymentsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.DeploymentOrBuilder getDeploymentsOrBuilder(
        int index) {
      if (deploymentsBuilder_ == null) {
        return deployments_.get(index);  } else {
        return deploymentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.cx.v3.DeploymentOrBuilder> 
         getDeploymentsOrBuilderList() {
      if (deploymentsBuilder_ != null) {
        return deploymentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(deployments_);
      }
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Deployment.Builder addDeploymentsBuilder() {
      return getDeploymentsFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.cx.v3.Deployment.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Deployment.Builder addDeploymentsBuilder(
        int index) {
      return getDeploymentsFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.cx.v3.Deployment.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of deployments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Deployment deployments = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3.Deployment.Builder> 
         getDeploymentsBuilderList() {
      return getDeploymentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.Deployment, com.google.cloud.dialogflow.cx.v3.Deployment.Builder, com.google.cloud.dialogflow.cx.v3.DeploymentOrBuilder> 
        getDeploymentsFieldBuilder() {
      if (deploymentsBuilder_ == null) {
        deploymentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.Deployment, com.google.cloud.dialogflow.cx.v3.Deployment.Builder, com.google.cloud.dialogflow.cx.v3.DeploymentOrBuilder>(
                deployments_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        deployments_ = null;
      }
      return deploymentsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.ListDeploymentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.ListDeploymentsResponse)
  private static final com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse();
  }

  public static com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDeploymentsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDeploymentsResponse>() {
    @java.lang.Override
    public ListDeploymentsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDeploymentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDeploymentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.ListDeploymentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

