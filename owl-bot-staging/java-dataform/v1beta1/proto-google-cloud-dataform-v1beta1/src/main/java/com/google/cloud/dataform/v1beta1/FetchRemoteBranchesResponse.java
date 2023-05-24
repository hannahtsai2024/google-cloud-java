// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1beta1/dataform.proto

package com.google.cloud.dataform.v1beta1;

/**
 * <pre>
 * `FetchRemoteBranches` response message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse}
 */
public final class FetchRemoteBranchesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse)
    FetchRemoteBranchesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FetchRemoteBranchesResponse.newBuilder() to construct.
  private FetchRemoteBranchesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FetchRemoteBranchesResponse() {
    branches_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FetchRemoteBranchesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataform.v1beta1.DataformProto.internal_static_google_cloud_dataform_v1beta1_FetchRemoteBranchesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataform.v1beta1.DataformProto.internal_static_google_cloud_dataform_v1beta1_FetchRemoteBranchesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse.class, com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse.Builder.class);
  }

  public static final int BRANCHES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList branches_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * The remote repository's branch names.
   * </pre>
   *
   * <code>repeated string branches = 1;</code>
   * @return A list containing the branches.
   */
  public com.google.protobuf.ProtocolStringList
      getBranchesList() {
    return branches_;
  }
  /**
   * <pre>
   * The remote repository's branch names.
   * </pre>
   *
   * <code>repeated string branches = 1;</code>
   * @return The count of branches.
   */
  public int getBranchesCount() {
    return branches_.size();
  }
  /**
   * <pre>
   * The remote repository's branch names.
   * </pre>
   *
   * <code>repeated string branches = 1;</code>
   * @param index The index of the element to return.
   * @return The branches at the given index.
   */
  public java.lang.String getBranches(int index) {
    return branches_.get(index);
  }
  /**
   * <pre>
   * The remote repository's branch names.
   * </pre>
   *
   * <code>repeated string branches = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the branches at the given index.
   */
  public com.google.protobuf.ByteString
      getBranchesBytes(int index) {
    return branches_.getByteString(index);
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
    for (int i = 0; i < branches_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, branches_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < branches_.size(); i++) {
        dataSize += computeStringSizeNoTag(branches_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getBranchesList().size();
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
    if (!(obj instanceof com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse other = (com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse) obj;

    if (!getBranchesList()
        .equals(other.getBranchesList())) return false;
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
    if (getBranchesCount() > 0) {
      hash = (37 * hash) + BRANCHES_FIELD_NUMBER;
      hash = (53 * hash) + getBranchesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse prototype) {
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
   * `FetchRemoteBranches` response message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse)
      com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataform.v1beta1.DataformProto.internal_static_google_cloud_dataform_v1beta1_FetchRemoteBranchesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataform.v1beta1.DataformProto.internal_static_google_cloud_dataform_v1beta1_FetchRemoteBranchesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse.class, com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse.Builder.class);
    }

    // Construct using com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse.newBuilder()
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
      branches_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataform.v1beta1.DataformProto.internal_static_google_cloud_dataform_v1beta1_FetchRemoteBranchesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse getDefaultInstanceForType() {
      return com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse build() {
      com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse buildPartial() {
      com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse result = new com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        branches_.makeImmutable();
        result.branches_ = branches_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse) {
        return mergeFrom((com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse other) {
      if (other == com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse.getDefaultInstance()) return this;
      if (!other.branches_.isEmpty()) {
        if (branches_.isEmpty()) {
          branches_ = other.branches_;
          bitField0_ |= 0x00000001;
        } else {
          ensureBranchesIsMutable();
          branches_.addAll(other.branches_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureBranchesIsMutable();
              branches_.add(s);
              break;
            } // case 10
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

    private com.google.protobuf.LazyStringArrayList branches_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureBranchesIsMutable() {
      if (!branches_.isModifiable()) {
        branches_ = new com.google.protobuf.LazyStringArrayList(branches_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * The remote repository's branch names.
     * </pre>
     *
     * <code>repeated string branches = 1;</code>
     * @return A list containing the branches.
     */
    public com.google.protobuf.ProtocolStringList
        getBranchesList() {
      branches_.makeImmutable();
      return branches_;
    }
    /**
     * <pre>
     * The remote repository's branch names.
     * </pre>
     *
     * <code>repeated string branches = 1;</code>
     * @return The count of branches.
     */
    public int getBranchesCount() {
      return branches_.size();
    }
    /**
     * <pre>
     * The remote repository's branch names.
     * </pre>
     *
     * <code>repeated string branches = 1;</code>
     * @param index The index of the element to return.
     * @return The branches at the given index.
     */
    public java.lang.String getBranches(int index) {
      return branches_.get(index);
    }
    /**
     * <pre>
     * The remote repository's branch names.
     * </pre>
     *
     * <code>repeated string branches = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the branches at the given index.
     */
    public com.google.protobuf.ByteString
        getBranchesBytes(int index) {
      return branches_.getByteString(index);
    }
    /**
     * <pre>
     * The remote repository's branch names.
     * </pre>
     *
     * <code>repeated string branches = 1;</code>
     * @param index The index to set the value at.
     * @param value The branches to set.
     * @return This builder for chaining.
     */
    public Builder setBranches(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureBranchesIsMutable();
      branches_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The remote repository's branch names.
     * </pre>
     *
     * <code>repeated string branches = 1;</code>
     * @param value The branches to add.
     * @return This builder for chaining.
     */
    public Builder addBranches(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureBranchesIsMutable();
      branches_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The remote repository's branch names.
     * </pre>
     *
     * <code>repeated string branches = 1;</code>
     * @param values The branches to add.
     * @return This builder for chaining.
     */
    public Builder addAllBranches(
        java.lang.Iterable<java.lang.String> values) {
      ensureBranchesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, branches_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The remote repository's branch names.
     * </pre>
     *
     * <code>repeated string branches = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBranches() {
      branches_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The remote repository's branch names.
     * </pre>
     *
     * <code>repeated string branches = 1;</code>
     * @param value The bytes of the branches to add.
     * @return This builder for chaining.
     */
    public Builder addBranchesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureBranchesIsMutable();
      branches_.add(value);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse)
  private static final com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse();
  }

  public static com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchRemoteBranchesResponse>
      PARSER = new com.google.protobuf.AbstractParser<FetchRemoteBranchesResponse>() {
    @java.lang.Override
    public FetchRemoteBranchesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FetchRemoteBranchesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchRemoteBranchesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataform.v1beta1.FetchRemoteBranchesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

