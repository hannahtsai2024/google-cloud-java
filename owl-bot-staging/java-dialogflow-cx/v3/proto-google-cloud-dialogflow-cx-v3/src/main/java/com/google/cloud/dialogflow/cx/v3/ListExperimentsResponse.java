// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/experiment.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 * <pre>
 * The response message for
 * [Experiments.ListExperiments][google.cloud.dialogflow.cx.v3.Experiments.ListExperiments].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.ListExperimentsResponse}
 */
public final class ListExperimentsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.ListExperimentsResponse)
    ListExperimentsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListExperimentsResponse.newBuilder() to construct.
  private ListExperimentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListExperimentsResponse() {
    experiments_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListExperimentsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.ExperimentProto.internal_static_google_cloud_dialogflow_cx_v3_ListExperimentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.ExperimentProto.internal_static_google_cloud_dialogflow_cx_v3_ListExperimentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse.class, com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse.Builder.class);
  }

  public static final int EXPERIMENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.cx.v3.Experiment> experiments_;
  /**
   * <pre>
   * The list of experiments. There will be a maximum number of items
   * returned based on the page_size field in the request. The list may in some
   * cases be empty or contain fewer entries than page_size even if this isn't
   * the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.cx.v3.Experiment> getExperimentsList() {
    return experiments_;
  }
  /**
   * <pre>
   * The list of experiments. There will be a maximum number of items
   * returned based on the page_size field in the request. The list may in some
   * cases be empty or contain fewer entries than page_size even if this isn't
   * the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.cx.v3.ExperimentOrBuilder> 
      getExperimentsOrBuilderList() {
    return experiments_;
  }
  /**
   * <pre>
   * The list of experiments. There will be a maximum number of items
   * returned based on the page_size field in the request. The list may in some
   * cases be empty or contain fewer entries than page_size even if this isn't
   * the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
   */
  @java.lang.Override
  public int getExperimentsCount() {
    return experiments_.size();
  }
  /**
   * <pre>
   * The list of experiments. There will be a maximum number of items
   * returned based on the page_size field in the request. The list may in some
   * cases be empty or contain fewer entries than page_size even if this isn't
   * the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.Experiment getExperiments(int index) {
    return experiments_.get(index);
  }
  /**
   * <pre>
   * The list of experiments. There will be a maximum number of items
   * returned based on the page_size field in the request. The list may in some
   * cases be empty or contain fewer entries than page_size even if this isn't
   * the last page.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.ExperimentOrBuilder getExperimentsOrBuilder(
      int index) {
    return experiments_.get(index);
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
    for (int i = 0; i < experiments_.size(); i++) {
      output.writeMessage(1, experiments_.get(i));
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
    for (int i = 0; i < experiments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, experiments_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse other = (com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse) obj;

    if (!getExperimentsList()
        .equals(other.getExperimentsList())) return false;
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
    if (getExperimentsCount() > 0) {
      hash = (37 * hash) + EXPERIMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getExperimentsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse prototype) {
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
   * [Experiments.ListExperiments][google.cloud.dialogflow.cx.v3.Experiments.ListExperiments].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.ListExperimentsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.ListExperimentsResponse)
      com.google.cloud.dialogflow.cx.v3.ListExperimentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.ExperimentProto.internal_static_google_cloud_dialogflow_cx_v3_ListExperimentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.ExperimentProto.internal_static_google_cloud_dialogflow_cx_v3_ListExperimentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse.class, com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse.newBuilder()
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
      if (experimentsBuilder_ == null) {
        experiments_ = java.util.Collections.emptyList();
      } else {
        experiments_ = null;
        experimentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.ExperimentProto.internal_static_google_cloud_dialogflow_cx_v3_ListExperimentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse build() {
      com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse buildPartial() {
      com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse result = new com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse result) {
      if (experimentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          experiments_ = java.util.Collections.unmodifiableList(experiments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.experiments_ = experiments_;
      } else {
        result.experiments_ = experimentsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse other) {
      if (other == com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse.getDefaultInstance()) return this;
      if (experimentsBuilder_ == null) {
        if (!other.experiments_.isEmpty()) {
          if (experiments_.isEmpty()) {
            experiments_ = other.experiments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExperimentsIsMutable();
            experiments_.addAll(other.experiments_);
          }
          onChanged();
        }
      } else {
        if (!other.experiments_.isEmpty()) {
          if (experimentsBuilder_.isEmpty()) {
            experimentsBuilder_.dispose();
            experimentsBuilder_ = null;
            experiments_ = other.experiments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            experimentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getExperimentsFieldBuilder() : null;
          } else {
            experimentsBuilder_.addAllMessages(other.experiments_);
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
              com.google.cloud.dialogflow.cx.v3.Experiment m =
                  input.readMessage(
                      com.google.cloud.dialogflow.cx.v3.Experiment.parser(),
                      extensionRegistry);
              if (experimentsBuilder_ == null) {
                ensureExperimentsIsMutable();
                experiments_.add(m);
              } else {
                experimentsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.dialogflow.cx.v3.Experiment> experiments_ =
      java.util.Collections.emptyList();
    private void ensureExperimentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        experiments_ = new java.util.ArrayList<com.google.cloud.dialogflow.cx.v3.Experiment>(experiments_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.Experiment, com.google.cloud.dialogflow.cx.v3.Experiment.Builder, com.google.cloud.dialogflow.cx.v3.ExperimentOrBuilder> experimentsBuilder_;

    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3.Experiment> getExperimentsList() {
      if (experimentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(experiments_);
      } else {
        return experimentsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public int getExperimentsCount() {
      if (experimentsBuilder_ == null) {
        return experiments_.size();
      } else {
        return experimentsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Experiment getExperiments(int index) {
      if (experimentsBuilder_ == null) {
        return experiments_.get(index);
      } else {
        return experimentsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public Builder setExperiments(
        int index, com.google.cloud.dialogflow.cx.v3.Experiment value) {
      if (experimentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExperimentsIsMutable();
        experiments_.set(index, value);
        onChanged();
      } else {
        experimentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public Builder setExperiments(
        int index, com.google.cloud.dialogflow.cx.v3.Experiment.Builder builderForValue) {
      if (experimentsBuilder_ == null) {
        ensureExperimentsIsMutable();
        experiments_.set(index, builderForValue.build());
        onChanged();
      } else {
        experimentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public Builder addExperiments(com.google.cloud.dialogflow.cx.v3.Experiment value) {
      if (experimentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExperimentsIsMutable();
        experiments_.add(value);
        onChanged();
      } else {
        experimentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public Builder addExperiments(
        int index, com.google.cloud.dialogflow.cx.v3.Experiment value) {
      if (experimentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExperimentsIsMutable();
        experiments_.add(index, value);
        onChanged();
      } else {
        experimentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public Builder addExperiments(
        com.google.cloud.dialogflow.cx.v3.Experiment.Builder builderForValue) {
      if (experimentsBuilder_ == null) {
        ensureExperimentsIsMutable();
        experiments_.add(builderForValue.build());
        onChanged();
      } else {
        experimentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public Builder addExperiments(
        int index, com.google.cloud.dialogflow.cx.v3.Experiment.Builder builderForValue) {
      if (experimentsBuilder_ == null) {
        ensureExperimentsIsMutable();
        experiments_.add(index, builderForValue.build());
        onChanged();
      } else {
        experimentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public Builder addAllExperiments(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.cx.v3.Experiment> values) {
      if (experimentsBuilder_ == null) {
        ensureExperimentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, experiments_);
        onChanged();
      } else {
        experimentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public Builder clearExperiments() {
      if (experimentsBuilder_ == null) {
        experiments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        experimentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public Builder removeExperiments(int index) {
      if (experimentsBuilder_ == null) {
        ensureExperimentsIsMutable();
        experiments_.remove(index);
        onChanged();
      } else {
        experimentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Experiment.Builder getExperimentsBuilder(
        int index) {
      return getExperimentsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.ExperimentOrBuilder getExperimentsOrBuilder(
        int index) {
      if (experimentsBuilder_ == null) {
        return experiments_.get(index);  } else {
        return experimentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.cx.v3.ExperimentOrBuilder> 
         getExperimentsOrBuilderList() {
      if (experimentsBuilder_ != null) {
        return experimentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(experiments_);
      }
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Experiment.Builder addExperimentsBuilder() {
      return getExperimentsFieldBuilder().addBuilder(
          com.google.cloud.dialogflow.cx.v3.Experiment.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Experiment.Builder addExperimentsBuilder(
        int index) {
      return getExperimentsFieldBuilder().addBuilder(
          index, com.google.cloud.dialogflow.cx.v3.Experiment.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of experiments. There will be a maximum number of items
     * returned based on the page_size field in the request. The list may in some
     * cases be empty or contain fewer entries than page_size even if this isn't
     * the last page.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Experiment experiments = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3.Experiment.Builder> 
         getExperimentsBuilderList() {
      return getExperimentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3.Experiment, com.google.cloud.dialogflow.cx.v3.Experiment.Builder, com.google.cloud.dialogflow.cx.v3.ExperimentOrBuilder> 
        getExperimentsFieldBuilder() {
      if (experimentsBuilder_ == null) {
        experimentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.Experiment, com.google.cloud.dialogflow.cx.v3.Experiment.Builder, com.google.cloud.dialogflow.cx.v3.ExperimentOrBuilder>(
                experiments_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        experiments_ = null;
      }
      return experimentsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.ListExperimentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.ListExperimentsResponse)
  private static final com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse();
  }

  public static com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListExperimentsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListExperimentsResponse>() {
    @java.lang.Override
    public ListExperimentsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListExperimentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListExperimentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.ListExperimentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

