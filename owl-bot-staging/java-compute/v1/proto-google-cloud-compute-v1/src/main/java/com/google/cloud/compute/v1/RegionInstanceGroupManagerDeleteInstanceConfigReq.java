// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * RegionInstanceGroupManagers.deletePerInstanceConfigs
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq}
 */
public final class RegionInstanceGroupManagerDeleteInstanceConfigReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq)
    RegionInstanceGroupManagerDeleteInstanceConfigReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegionInstanceGroupManagerDeleteInstanceConfigReq.newBuilder() to construct.
  private RegionInstanceGroupManagerDeleteInstanceConfigReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegionInstanceGroupManagerDeleteInstanceConfigReq() {
    names_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegionInstanceGroupManagerDeleteInstanceConfigReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagerDeleteInstanceConfigReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagerDeleteInstanceConfigReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq.class, com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq.Builder.class);
  }

  public static final int NAMES_FIELD_NUMBER = 104585032;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList names_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * The list of instance names for which we want to delete per-instance configs on this managed instance group.
   * </pre>
   *
   * <code>repeated string names = 104585032;</code>
   * @return A list containing the names.
   */
  public com.google.protobuf.ProtocolStringList
      getNamesList() {
    return names_;
  }
  /**
   * <pre>
   * The list of instance names for which we want to delete per-instance configs on this managed instance group.
   * </pre>
   *
   * <code>repeated string names = 104585032;</code>
   * @return The count of names.
   */
  public int getNamesCount() {
    return names_.size();
  }
  /**
   * <pre>
   * The list of instance names for which we want to delete per-instance configs on this managed instance group.
   * </pre>
   *
   * <code>repeated string names = 104585032;</code>
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  public java.lang.String getNames(int index) {
    return names_.get(index);
  }
  /**
   * <pre>
   * The list of instance names for which we want to delete per-instance configs on this managed instance group.
   * </pre>
   *
   * <code>repeated string names = 104585032;</code>
   * @param index The index of the value to return.
   * @return The bytes of the names at the given index.
   */
  public com.google.protobuf.ByteString
      getNamesBytes(int index) {
    return names_.getByteString(index);
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
    for (int i = 0; i < names_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 104585032, names_.getRaw(i));
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
      for (int i = 0; i < names_.size(); i++) {
        dataSize += computeStringSizeNoTag(names_.getRaw(i));
      }
      size += dataSize;
      size += 5 * getNamesList().size();
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
    if (!(obj instanceof com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq other = (com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq) obj;

    if (!getNamesList()
        .equals(other.getNamesList())) return false;
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
    if (getNamesCount() > 0) {
      hash = (37 * hash) + NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getNamesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq prototype) {
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
   * RegionInstanceGroupManagers.deletePerInstanceConfigs
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq)
      com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagerDeleteInstanceConfigReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagerDeleteInstanceConfigReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq.class, com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq.newBuilder()
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
      names_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_RegionInstanceGroupManagerDeleteInstanceConfigReq_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq build() {
      com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq buildPartial() {
      com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq result = new com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        names_.makeImmutable();
        result.names_ = names_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq) {
        return mergeFrom((com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq other) {
      if (other == com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq.getDefaultInstance()) return this;
      if (!other.names_.isEmpty()) {
        if (names_.isEmpty()) {
          names_ = other.names_;
          bitField0_ |= 0x00000001;
        } else {
          ensureNamesIsMutable();
          names_.addAll(other.names_);
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
            case 836680258: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureNamesIsMutable();
              names_.add(s);
              break;
            } // case 836680258
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

    private com.google.protobuf.LazyStringArrayList names_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureNamesIsMutable() {
      if (!names_.isModifiable()) {
        names_ = new com.google.protobuf.LazyStringArrayList(names_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * The list of instance names for which we want to delete per-instance configs on this managed instance group.
     * </pre>
     *
     * <code>repeated string names = 104585032;</code>
     * @return A list containing the names.
     */
    public com.google.protobuf.ProtocolStringList
        getNamesList() {
      names_.makeImmutable();
      return names_;
    }
    /**
     * <pre>
     * The list of instance names for which we want to delete per-instance configs on this managed instance group.
     * </pre>
     *
     * <code>repeated string names = 104585032;</code>
     * @return The count of names.
     */
    public int getNamesCount() {
      return names_.size();
    }
    /**
     * <pre>
     * The list of instance names for which we want to delete per-instance configs on this managed instance group.
     * </pre>
     *
     * <code>repeated string names = 104585032;</code>
     * @param index The index of the element to return.
     * @return The names at the given index.
     */
    public java.lang.String getNames(int index) {
      return names_.get(index);
    }
    /**
     * <pre>
     * The list of instance names for which we want to delete per-instance configs on this managed instance group.
     * </pre>
     *
     * <code>repeated string names = 104585032;</code>
     * @param index The index of the value to return.
     * @return The bytes of the names at the given index.
     */
    public com.google.protobuf.ByteString
        getNamesBytes(int index) {
      return names_.getByteString(index);
    }
    /**
     * <pre>
     * The list of instance names for which we want to delete per-instance configs on this managed instance group.
     * </pre>
     *
     * <code>repeated string names = 104585032;</code>
     * @param index The index to set the value at.
     * @param value The names to set.
     * @return This builder for chaining.
     */
    public Builder setNames(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureNamesIsMutable();
      names_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of instance names for which we want to delete per-instance configs on this managed instance group.
     * </pre>
     *
     * <code>repeated string names = 104585032;</code>
     * @param value The names to add.
     * @return This builder for chaining.
     */
    public Builder addNames(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureNamesIsMutable();
      names_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of instance names for which we want to delete per-instance configs on this managed instance group.
     * </pre>
     *
     * <code>repeated string names = 104585032;</code>
     * @param values The names to add.
     * @return This builder for chaining.
     */
    public Builder addAllNames(
        java.lang.Iterable<java.lang.String> values) {
      ensureNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, names_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of instance names for which we want to delete per-instance configs on this managed instance group.
     * </pre>
     *
     * <code>repeated string names = 104585032;</code>
     * @return This builder for chaining.
     */
    public Builder clearNames() {
      names_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of instance names for which we want to delete per-instance configs on this managed instance group.
     * </pre>
     *
     * <code>repeated string names = 104585032;</code>
     * @param value The bytes of the names to add.
     * @return This builder for chaining.
     */
    public Builder addNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureNamesIsMutable();
      names_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq)
  private static final com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq();
  }

  public static com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegionInstanceGroupManagerDeleteInstanceConfigReq>
      PARSER = new com.google.protobuf.AbstractParser<RegionInstanceGroupManagerDeleteInstanceConfigReq>() {
    @java.lang.Override
    public RegionInstanceGroupManagerDeleteInstanceConfigReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegionInstanceGroupManagerDeleteInstanceConfigReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegionInstanceGroupManagerDeleteInstanceConfigReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.RegionInstanceGroupManagerDeleteInstanceConfigReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

