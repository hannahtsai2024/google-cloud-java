// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.Accelerators}
 */
public final class Accelerators extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.Accelerators)
    AcceleratorsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Accelerators.newBuilder() to construct.
  private Accelerators(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Accelerators() {
    guestAcceleratorType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Accelerators();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Accelerators_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Accelerators_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.Accelerators.class, com.google.cloud.compute.v1.Accelerators.Builder.class);
  }

  private int bitField0_;
  public static final int GUEST_ACCELERATOR_COUNT_FIELD_NUMBER = 479079316;
  private int guestAcceleratorCount_ = 0;
  /**
   * <pre>
   * Number of accelerator cards exposed to the guest.
   * </pre>
   *
   * <code>optional int32 guest_accelerator_count = 479079316;</code>
   * @return Whether the guestAcceleratorCount field is set.
   */
  @java.lang.Override
  public boolean hasGuestAcceleratorCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Number of accelerator cards exposed to the guest.
   * </pre>
   *
   * <code>optional int32 guest_accelerator_count = 479079316;</code>
   * @return The guestAcceleratorCount.
   */
  @java.lang.Override
  public int getGuestAcceleratorCount() {
    return guestAcceleratorCount_;
  }

  public static final int GUEST_ACCELERATOR_TYPE_FIELD_NUMBER = 293064725;
  @SuppressWarnings("serial")
  private volatile java.lang.Object guestAcceleratorType_ = "";
  /**
   * <pre>
   * The accelerator type resource name, not a full URL, e.g. 'nvidia-tesla-k80'.
   * </pre>
   *
   * <code>optional string guest_accelerator_type = 293064725;</code>
   * @return Whether the guestAcceleratorType field is set.
   */
  @java.lang.Override
  public boolean hasGuestAcceleratorType() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The accelerator type resource name, not a full URL, e.g. 'nvidia-tesla-k80'.
   * </pre>
   *
   * <code>optional string guest_accelerator_type = 293064725;</code>
   * @return The guestAcceleratorType.
   */
  @java.lang.Override
  public java.lang.String getGuestAcceleratorType() {
    java.lang.Object ref = guestAcceleratorType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      guestAcceleratorType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The accelerator type resource name, not a full URL, e.g. 'nvidia-tesla-k80'.
   * </pre>
   *
   * <code>optional string guest_accelerator_type = 293064725;</code>
   * @return The bytes for guestAcceleratorType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGuestAcceleratorTypeBytes() {
    java.lang.Object ref = guestAcceleratorType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      guestAcceleratorType_ = b;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 293064725, guestAcceleratorType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(479079316, guestAcceleratorCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(293064725, guestAcceleratorType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(479079316, guestAcceleratorCount_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.Accelerators)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.Accelerators other = (com.google.cloud.compute.v1.Accelerators) obj;

    if (hasGuestAcceleratorCount() != other.hasGuestAcceleratorCount()) return false;
    if (hasGuestAcceleratorCount()) {
      if (getGuestAcceleratorCount()
          != other.getGuestAcceleratorCount()) return false;
    }
    if (hasGuestAcceleratorType() != other.hasGuestAcceleratorType()) return false;
    if (hasGuestAcceleratorType()) {
      if (!getGuestAcceleratorType()
          .equals(other.getGuestAcceleratorType())) return false;
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
    if (hasGuestAcceleratorCount()) {
      hash = (37 * hash) + GUEST_ACCELERATOR_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getGuestAcceleratorCount();
    }
    if (hasGuestAcceleratorType()) {
      hash = (37 * hash) + GUEST_ACCELERATOR_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getGuestAcceleratorType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.Accelerators parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.Accelerators parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Accelerators parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.Accelerators parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Accelerators parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.Accelerators parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Accelerators parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.Accelerators parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Accelerators parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Accelerators parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Accelerators parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.Accelerators parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.Accelerators prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.Accelerators}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.Accelerators)
      com.google.cloud.compute.v1.AcceleratorsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Accelerators_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Accelerators_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.Accelerators.class, com.google.cloud.compute.v1.Accelerators.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.Accelerators.newBuilder()
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
      guestAcceleratorCount_ = 0;
      guestAcceleratorType_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Accelerators_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Accelerators getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.Accelerators.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Accelerators build() {
      com.google.cloud.compute.v1.Accelerators result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Accelerators buildPartial() {
      com.google.cloud.compute.v1.Accelerators result = new com.google.cloud.compute.v1.Accelerators(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.Accelerators result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.guestAcceleratorCount_ = guestAcceleratorCount_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.guestAcceleratorType_ = guestAcceleratorType_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.Accelerators) {
        return mergeFrom((com.google.cloud.compute.v1.Accelerators)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.Accelerators other) {
      if (other == com.google.cloud.compute.v1.Accelerators.getDefaultInstance()) return this;
      if (other.hasGuestAcceleratorCount()) {
        setGuestAcceleratorCount(other.getGuestAcceleratorCount());
      }
      if (other.hasGuestAcceleratorType()) {
        guestAcceleratorType_ = other.guestAcceleratorType_;
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
            case -1950449494: {
              guestAcceleratorType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case -1950449494
            case -462332768: {
              guestAcceleratorCount_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case -462332768
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

    private int guestAcceleratorCount_ ;
    /**
     * <pre>
     * Number of accelerator cards exposed to the guest.
     * </pre>
     *
     * <code>optional int32 guest_accelerator_count = 479079316;</code>
     * @return Whether the guestAcceleratorCount field is set.
     */
    @java.lang.Override
    public boolean hasGuestAcceleratorCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Number of accelerator cards exposed to the guest.
     * </pre>
     *
     * <code>optional int32 guest_accelerator_count = 479079316;</code>
     * @return The guestAcceleratorCount.
     */
    @java.lang.Override
    public int getGuestAcceleratorCount() {
      return guestAcceleratorCount_;
    }
    /**
     * <pre>
     * Number of accelerator cards exposed to the guest.
     * </pre>
     *
     * <code>optional int32 guest_accelerator_count = 479079316;</code>
     * @param value The guestAcceleratorCount to set.
     * @return This builder for chaining.
     */
    public Builder setGuestAcceleratorCount(int value) {

      guestAcceleratorCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of accelerator cards exposed to the guest.
     * </pre>
     *
     * <code>optional int32 guest_accelerator_count = 479079316;</code>
     * @return This builder for chaining.
     */
    public Builder clearGuestAcceleratorCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      guestAcceleratorCount_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object guestAcceleratorType_ = "";
    /**
     * <pre>
     * The accelerator type resource name, not a full URL, e.g. 'nvidia-tesla-k80'.
     * </pre>
     *
     * <code>optional string guest_accelerator_type = 293064725;</code>
     * @return Whether the guestAcceleratorType field is set.
     */
    public boolean hasGuestAcceleratorType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The accelerator type resource name, not a full URL, e.g. 'nvidia-tesla-k80'.
     * </pre>
     *
     * <code>optional string guest_accelerator_type = 293064725;</code>
     * @return The guestAcceleratorType.
     */
    public java.lang.String getGuestAcceleratorType() {
      java.lang.Object ref = guestAcceleratorType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        guestAcceleratorType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The accelerator type resource name, not a full URL, e.g. 'nvidia-tesla-k80'.
     * </pre>
     *
     * <code>optional string guest_accelerator_type = 293064725;</code>
     * @return The bytes for guestAcceleratorType.
     */
    public com.google.protobuf.ByteString
        getGuestAcceleratorTypeBytes() {
      java.lang.Object ref = guestAcceleratorType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        guestAcceleratorType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The accelerator type resource name, not a full URL, e.g. 'nvidia-tesla-k80'.
     * </pre>
     *
     * <code>optional string guest_accelerator_type = 293064725;</code>
     * @param value The guestAcceleratorType to set.
     * @return This builder for chaining.
     */
    public Builder setGuestAcceleratorType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      guestAcceleratorType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The accelerator type resource name, not a full URL, e.g. 'nvidia-tesla-k80'.
     * </pre>
     *
     * <code>optional string guest_accelerator_type = 293064725;</code>
     * @return This builder for chaining.
     */
    public Builder clearGuestAcceleratorType() {
      guestAcceleratorType_ = getDefaultInstance().getGuestAcceleratorType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The accelerator type resource name, not a full URL, e.g. 'nvidia-tesla-k80'.
     * </pre>
     *
     * <code>optional string guest_accelerator_type = 293064725;</code>
     * @param value The bytes for guestAcceleratorType to set.
     * @return This builder for chaining.
     */
    public Builder setGuestAcceleratorTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      guestAcceleratorType_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.Accelerators)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.Accelerators)
  private static final com.google.cloud.compute.v1.Accelerators DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.Accelerators();
  }

  public static com.google.cloud.compute.v1.Accelerators getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Accelerators>
      PARSER = new com.google.protobuf.AbstractParser<Accelerators>() {
    @java.lang.Override
    public Accelerators parsePartialFrom(
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

  public static com.google.protobuf.Parser<Accelerators> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Accelerators> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.Accelerators getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

