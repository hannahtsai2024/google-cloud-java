// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * Represents a reference to a resource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.Reference}
 */
public final class Reference extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.Reference)
    ReferenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Reference.newBuilder() to construct.
  private Reference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Reference() {
    kind_ = "";
    referenceType_ = "";
    referrer_ = "";
    target_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Reference();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Reference_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Reference_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.Reference.class, com.google.cloud.compute.v1.Reference.Builder.class);
  }

  private int bitField0_;
  public static final int KIND_FIELD_NUMBER = 3292052;
  @SuppressWarnings("serial")
  private volatile java.lang.Object kind_ = "";
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#reference for references.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return Whether the kind field is set.
   */
  @java.lang.Override
  public boolean hasKind() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#reference for references.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The kind.
   */
  @java.lang.Override
  public java.lang.String getKind() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kind_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#reference for references.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The bytes for kind.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKindBytes() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kind_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REFERENCE_TYPE_FIELD_NUMBER = 247521198;
  @SuppressWarnings("serial")
  private volatile java.lang.Object referenceType_ = "";
  /**
   * <pre>
   * A description of the reference type with no implied semantics. Possible values include: 1. MEMBER_OF 
   * </pre>
   *
   * <code>optional string reference_type = 247521198;</code>
   * @return Whether the referenceType field is set.
   */
  @java.lang.Override
  public boolean hasReferenceType() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * A description of the reference type with no implied semantics. Possible values include: 1. MEMBER_OF 
   * </pre>
   *
   * <code>optional string reference_type = 247521198;</code>
   * @return The referenceType.
   */
  @java.lang.Override
  public java.lang.String getReferenceType() {
    java.lang.Object ref = referenceType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      referenceType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A description of the reference type with no implied semantics. Possible values include: 1. MEMBER_OF 
   * </pre>
   *
   * <code>optional string reference_type = 247521198;</code>
   * @return The bytes for referenceType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReferenceTypeBytes() {
    java.lang.Object ref = referenceType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      referenceType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REFERRER_FIELD_NUMBER = 351173663;
  @SuppressWarnings("serial")
  private volatile java.lang.Object referrer_ = "";
  /**
   * <pre>
   * URL of the resource which refers to the target.
   * </pre>
   *
   * <code>optional string referrer = 351173663;</code>
   * @return Whether the referrer field is set.
   */
  @java.lang.Override
  public boolean hasReferrer() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * URL of the resource which refers to the target.
   * </pre>
   *
   * <code>optional string referrer = 351173663;</code>
   * @return The referrer.
   */
  @java.lang.Override
  public java.lang.String getReferrer() {
    java.lang.Object ref = referrer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      referrer_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * URL of the resource which refers to the target.
   * </pre>
   *
   * <code>optional string referrer = 351173663;</code>
   * @return The bytes for referrer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReferrerBytes() {
    java.lang.Object ref = referrer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      referrer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_FIELD_NUMBER = 192835985;
  @SuppressWarnings("serial")
  private volatile java.lang.Object target_ = "";
  /**
   * <pre>
   * URL of the resource to which this reference points.
   * </pre>
   *
   * <code>optional string target = 192835985;</code>
   * @return Whether the target field is set.
   */
  @java.lang.Override
  public boolean hasTarget() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * URL of the resource to which this reference points.
   * </pre>
   *
   * <code>optional string target = 192835985;</code>
   * @return The target.
   */
  @java.lang.Override
  public java.lang.String getTarget() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      target_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * URL of the resource to which this reference points.
   * </pre>
   *
   * <code>optional string target = 192835985;</code>
   * @return The bytes for target.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTargetBytes() {
    java.lang.Object ref = target_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      target_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3292052, kind_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 192835985, target_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 247521198, referenceType_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 351173663, referrer_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3292052, kind_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(192835985, target_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(247521198, referenceType_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(351173663, referrer_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.Reference)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.Reference other = (com.google.cloud.compute.v1.Reference) obj;

    if (hasKind() != other.hasKind()) return false;
    if (hasKind()) {
      if (!getKind()
          .equals(other.getKind())) return false;
    }
    if (hasReferenceType() != other.hasReferenceType()) return false;
    if (hasReferenceType()) {
      if (!getReferenceType()
          .equals(other.getReferenceType())) return false;
    }
    if (hasReferrer() != other.hasReferrer()) return false;
    if (hasReferrer()) {
      if (!getReferrer()
          .equals(other.getReferrer())) return false;
    }
    if (hasTarget() != other.hasTarget()) return false;
    if (hasTarget()) {
      if (!getTarget()
          .equals(other.getTarget())) return false;
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
    if (hasKind()) {
      hash = (37 * hash) + KIND_FIELD_NUMBER;
      hash = (53 * hash) + getKind().hashCode();
    }
    if (hasReferenceType()) {
      hash = (37 * hash) + REFERENCE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getReferenceType().hashCode();
    }
    if (hasReferrer()) {
      hash = (37 * hash) + REFERRER_FIELD_NUMBER;
      hash = (53 * hash) + getReferrer().hashCode();
    }
    if (hasTarget()) {
      hash = (37 * hash) + TARGET_FIELD_NUMBER;
      hash = (53 * hash) + getTarget().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.Reference parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.Reference parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Reference parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.Reference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Reference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.Reference parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Reference parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.Reference parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Reference parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Reference parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.Reference parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.Reference parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.Reference prototype) {
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
   * Represents a reference to a resource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.Reference}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.Reference)
      com.google.cloud.compute.v1.ReferenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Reference_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Reference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.Reference.class, com.google.cloud.compute.v1.Reference.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.Reference.newBuilder()
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
      kind_ = "";
      referenceType_ = "";
      referrer_ = "";
      target_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_Reference_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Reference getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.Reference.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Reference build() {
      com.google.cloud.compute.v1.Reference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Reference buildPartial() {
      com.google.cloud.compute.v1.Reference result = new com.google.cloud.compute.v1.Reference(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.Reference result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.kind_ = kind_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.referenceType_ = referenceType_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.referrer_ = referrer_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.target_ = target_;
        to_bitField0_ |= 0x00000008;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.Reference) {
        return mergeFrom((com.google.cloud.compute.v1.Reference)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.Reference other) {
      if (other == com.google.cloud.compute.v1.Reference.getDefaultInstance()) return this;
      if (other.hasKind()) {
        kind_ = other.kind_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasReferenceType()) {
        referenceType_ = other.referenceType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasReferrer()) {
        referrer_ = other.referrer_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasTarget()) {
        target_ = other.target_;
        bitField0_ |= 0x00000008;
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
            case 26336418: {
              kind_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26336418
            case 1542687882: {
              target_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 1542687882
            case 1980169586: {
              referenceType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 1980169586
            case -1485577990: {
              referrer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case -1485577990
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

    private java.lang.Object kind_ = "";
    /**
     * <pre>
     * [Output Only] Type of the resource. Always compute#reference for references.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     * @return Whether the kind field is set.
     */
    public boolean hasKind() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * [Output Only] Type of the resource. Always compute#reference for references.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     * @return The kind.
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kind_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * [Output Only] Type of the resource. Always compute#reference for references.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     * @return The bytes for kind.
     */
    public com.google.protobuf.ByteString
        getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * [Output Only] Type of the resource. Always compute#reference for references.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      kind_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Type of the resource. Always compute#reference for references.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      kind_ = getDefaultInstance().getKind();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output Only] Type of the resource. Always compute#reference for references.
     * </pre>
     *
     * <code>optional string kind = 3292052;</code>
     * @param value The bytes for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      kind_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object referenceType_ = "";
    /**
     * <pre>
     * A description of the reference type with no implied semantics. Possible values include: 1. MEMBER_OF 
     * </pre>
     *
     * <code>optional string reference_type = 247521198;</code>
     * @return Whether the referenceType field is set.
     */
    public boolean hasReferenceType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * A description of the reference type with no implied semantics. Possible values include: 1. MEMBER_OF 
     * </pre>
     *
     * <code>optional string reference_type = 247521198;</code>
     * @return The referenceType.
     */
    public java.lang.String getReferenceType() {
      java.lang.Object ref = referenceType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        referenceType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A description of the reference type with no implied semantics. Possible values include: 1. MEMBER_OF 
     * </pre>
     *
     * <code>optional string reference_type = 247521198;</code>
     * @return The bytes for referenceType.
     */
    public com.google.protobuf.ByteString
        getReferenceTypeBytes() {
      java.lang.Object ref = referenceType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        referenceType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A description of the reference type with no implied semantics. Possible values include: 1. MEMBER_OF 
     * </pre>
     *
     * <code>optional string reference_type = 247521198;</code>
     * @param value The referenceType to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      referenceType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A description of the reference type with no implied semantics. Possible values include: 1. MEMBER_OF 
     * </pre>
     *
     * <code>optional string reference_type = 247521198;</code>
     * @return This builder for chaining.
     */
    public Builder clearReferenceType() {
      referenceType_ = getDefaultInstance().getReferenceType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A description of the reference type with no implied semantics. Possible values include: 1. MEMBER_OF 
     * </pre>
     *
     * <code>optional string reference_type = 247521198;</code>
     * @param value The bytes for referenceType to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      referenceType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object referrer_ = "";
    /**
     * <pre>
     * URL of the resource which refers to the target.
     * </pre>
     *
     * <code>optional string referrer = 351173663;</code>
     * @return Whether the referrer field is set.
     */
    public boolean hasReferrer() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * URL of the resource which refers to the target.
     * </pre>
     *
     * <code>optional string referrer = 351173663;</code>
     * @return The referrer.
     */
    public java.lang.String getReferrer() {
      java.lang.Object ref = referrer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        referrer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * URL of the resource which refers to the target.
     * </pre>
     *
     * <code>optional string referrer = 351173663;</code>
     * @return The bytes for referrer.
     */
    public com.google.protobuf.ByteString
        getReferrerBytes() {
      java.lang.Object ref = referrer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        referrer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * URL of the resource which refers to the target.
     * </pre>
     *
     * <code>optional string referrer = 351173663;</code>
     * @param value The referrer to set.
     * @return This builder for chaining.
     */
    public Builder setReferrer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      referrer_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL of the resource which refers to the target.
     * </pre>
     *
     * <code>optional string referrer = 351173663;</code>
     * @return This builder for chaining.
     */
    public Builder clearReferrer() {
      referrer_ = getDefaultInstance().getReferrer();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL of the resource which refers to the target.
     * </pre>
     *
     * <code>optional string referrer = 351173663;</code>
     * @param value The bytes for referrer to set.
     * @return This builder for chaining.
     */
    public Builder setReferrerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      referrer_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object target_ = "";
    /**
     * <pre>
     * URL of the resource to which this reference points.
     * </pre>
     *
     * <code>optional string target = 192835985;</code>
     * @return Whether the target field is set.
     */
    public boolean hasTarget() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * URL of the resource to which this reference points.
     * </pre>
     *
     * <code>optional string target = 192835985;</code>
     * @return The target.
     */
    public java.lang.String getTarget() {
      java.lang.Object ref = target_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        target_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * URL of the resource to which this reference points.
     * </pre>
     *
     * <code>optional string target = 192835985;</code>
     * @return The bytes for target.
     */
    public com.google.protobuf.ByteString
        getTargetBytes() {
      java.lang.Object ref = target_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        target_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * URL of the resource to which this reference points.
     * </pre>
     *
     * <code>optional string target = 192835985;</code>
     * @param value The target to set.
     * @return This builder for chaining.
     */
    public Builder setTarget(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      target_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL of the resource to which this reference points.
     * </pre>
     *
     * <code>optional string target = 192835985;</code>
     * @return This builder for chaining.
     */
    public Builder clearTarget() {
      target_ = getDefaultInstance().getTarget();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL of the resource to which this reference points.
     * </pre>
     *
     * <code>optional string target = 192835985;</code>
     * @param value The bytes for target to set.
     * @return This builder for chaining.
     */
    public Builder setTargetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      target_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.Reference)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.Reference)
  private static final com.google.cloud.compute.v1.Reference DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.Reference();
  }

  public static com.google.cloud.compute.v1.Reference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Reference>
      PARSER = new com.google.protobuf.AbstractParser<Reference>() {
    @java.lang.Override
    public Reference parsePartialFrom(
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

  public static com.google.protobuf.Parser<Reference> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Reference> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.Reference getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

