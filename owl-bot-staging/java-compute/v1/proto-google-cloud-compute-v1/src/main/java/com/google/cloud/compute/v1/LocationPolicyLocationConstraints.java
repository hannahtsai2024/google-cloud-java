// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * Per-zone constraints on location policy for this zone.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.LocationPolicyLocationConstraints}
 */
public final class LocationPolicyLocationConstraints extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.LocationPolicyLocationConstraints)
    LocationPolicyLocationConstraintsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LocationPolicyLocationConstraints.newBuilder() to construct.
  private LocationPolicyLocationConstraints(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocationPolicyLocationConstraints() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LocationPolicyLocationConstraints();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LocationPolicyLocationConstraints_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LocationPolicyLocationConstraints_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.LocationPolicyLocationConstraints.class, com.google.cloud.compute.v1.LocationPolicyLocationConstraints.Builder.class);
  }

  private int bitField0_;
  public static final int MAX_COUNT_FIELD_NUMBER = 287620724;
  private int maxCount_ = 0;
  /**
   * <pre>
   * Maximum number of items that are allowed to be placed in this zone. The value must be non-negative.
   * </pre>
   *
   * <code>optional int32 max_count = 287620724;</code>
   * @return Whether the maxCount field is set.
   */
  @java.lang.Override
  public boolean hasMaxCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Maximum number of items that are allowed to be placed in this zone. The value must be non-negative.
   * </pre>
   *
   * <code>optional int32 max_count = 287620724;</code>
   * @return The maxCount.
   */
  @java.lang.Override
  public int getMaxCount() {
    return maxCount_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(287620724, maxCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(287620724, maxCount_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.LocationPolicyLocationConstraints)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.LocationPolicyLocationConstraints other = (com.google.cloud.compute.v1.LocationPolicyLocationConstraints) obj;

    if (hasMaxCount() != other.hasMaxCount()) return false;
    if (hasMaxCount()) {
      if (getMaxCount()
          != other.getMaxCount()) return false;
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
    if (hasMaxCount()) {
      hash = (37 * hash) + MAX_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMaxCount();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocationConstraints parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.LocationPolicyLocationConstraints parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LocationPolicyLocationConstraints parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.LocationPolicyLocationConstraints parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LocationPolicyLocationConstraints parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.LocationPolicyLocationConstraints parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LocationPolicyLocationConstraints parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.LocationPolicyLocationConstraints parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocationConstraints parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocationConstraints parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LocationPolicyLocationConstraints parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.LocationPolicyLocationConstraints parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.LocationPolicyLocationConstraints prototype) {
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
   * Per-zone constraints on location policy for this zone.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.LocationPolicyLocationConstraints}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.LocationPolicyLocationConstraints)
      com.google.cloud.compute.v1.LocationPolicyLocationConstraintsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LocationPolicyLocationConstraints_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LocationPolicyLocationConstraints_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.LocationPolicyLocationConstraints.class, com.google.cloud.compute.v1.LocationPolicyLocationConstraints.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.LocationPolicyLocationConstraints.newBuilder()
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
      maxCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LocationPolicyLocationConstraints_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LocationPolicyLocationConstraints getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.LocationPolicyLocationConstraints.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LocationPolicyLocationConstraints build() {
      com.google.cloud.compute.v1.LocationPolicyLocationConstraints result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LocationPolicyLocationConstraints buildPartial() {
      com.google.cloud.compute.v1.LocationPolicyLocationConstraints result = new com.google.cloud.compute.v1.LocationPolicyLocationConstraints(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.LocationPolicyLocationConstraints result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxCount_ = maxCount_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.LocationPolicyLocationConstraints) {
        return mergeFrom((com.google.cloud.compute.v1.LocationPolicyLocationConstraints)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.LocationPolicyLocationConstraints other) {
      if (other == com.google.cloud.compute.v1.LocationPolicyLocationConstraints.getDefaultInstance()) return this;
      if (other.hasMaxCount()) {
        setMaxCount(other.getMaxCount());
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
            case -1994001504: {
              maxCount_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case -1994001504
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

    private int maxCount_ ;
    /**
     * <pre>
     * Maximum number of items that are allowed to be placed in this zone. The value must be non-negative.
     * </pre>
     *
     * <code>optional int32 max_count = 287620724;</code>
     * @return Whether the maxCount field is set.
     */
    @java.lang.Override
    public boolean hasMaxCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Maximum number of items that are allowed to be placed in this zone. The value must be non-negative.
     * </pre>
     *
     * <code>optional int32 max_count = 287620724;</code>
     * @return The maxCount.
     */
    @java.lang.Override
    public int getMaxCount() {
      return maxCount_;
    }
    /**
     * <pre>
     * Maximum number of items that are allowed to be placed in this zone. The value must be non-negative.
     * </pre>
     *
     * <code>optional int32 max_count = 287620724;</code>
     * @param value The maxCount to set.
     * @return This builder for chaining.
     */
    public Builder setMaxCount(int value) {

      maxCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of items that are allowed to be placed in this zone. The value must be non-negative.
     * </pre>
     *
     * <code>optional int32 max_count = 287620724;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.LocationPolicyLocationConstraints)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.LocationPolicyLocationConstraints)
  private static final com.google.cloud.compute.v1.LocationPolicyLocationConstraints DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.LocationPolicyLocationConstraints();
  }

  public static com.google.cloud.compute.v1.LocationPolicyLocationConstraints getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocationPolicyLocationConstraints>
      PARSER = new com.google.protobuf.AbstractParser<LocationPolicyLocationConstraints>() {
    @java.lang.Override
    public LocationPolicyLocationConstraints parsePartialFrom(
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

  public static com.google.protobuf.Parser<LocationPolicyLocationConstraints> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocationPolicyLocationConstraints> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.LocationPolicyLocationConstraints getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

